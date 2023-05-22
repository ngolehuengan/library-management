package main.java.com.library.BLL;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import main.java.com.library.DTO.Lecturer;
import main.java.com.library.DTO.PersonalInfo;
import main.java.com.library.DTO.Reader;
import main.java.com.library.DTO.Student;

public class ReadExcel {
    public static Map importReader(String path) throws IOException {
        FileInputStream file = new FileInputStream(path);
        ArrayList errorRow = new ArrayList<>();
        Map results = new HashMap<>();
        int complete = 0;
        try {
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet sheet = wb.getSheetAt(0);
            XSSFRow row;
            XSSFCell cell;
            int rows; // No of rows
            rows = sheet.getPhysicalNumberOfRows();
            int cols = 0; // No of columns
            int tmp = 0;

            // This trick ensures that we get the data properly even if it doesn't start
            // from first few rows
            for (int i = 0; i < 11 || i < rows; i++) {
                row = sheet.getRow(i);
                if (row != null) {
                    tmp = sheet.getRow(i).getPhysicalNumberOfCells();
                    if (tmp > cols)
                        cols = tmp;
                }
            }
            String name = "";
            boolean studentLogic = true;
            String ID = "";
            String departmentName = "";
            String className = "";
            String citizenID = "";
            String birthday = "";
            boolean gender = true;
            String address = "";
            String email = "";
            String phone = "";

            for (int r = 1; r < rows; r++) {
                row = sheet.getRow(r);
                if (row != null) {
                    name = (row.getCell(0)).getStringCellValue(); // String
                    String classify = (row.getCell(1)).getStringCellValue(); // boolean
                    if (classify.equals("Sinh Viên")) {
                        studentLogic = true;
                        row.getCell(2).setCellType(CellType.STRING);
                        ID = row.getCell(2).getStringCellValue();
                    } else if (classify.equals("Giảng Viên")) {
                        studentLogic = false;
                        row.getCell(2).setCellType(CellType.STRING);
                        ID = row.getCell(2).getStringCellValue();
                    } else {
                        errorRow.add(row);
                        continue;
                    }
                    departmentName = (row.getCell(3)).getStringCellValue();
                    try {
                        className = (row.getCell(4)).getStringCellValue();
                    } catch (Exception e) {

                    }

                    row.getCell(5).setCellType(CellType.STRING);
                    citizenID = row.getCell(5).getStringCellValue();
                    if (citizenID.length() == 8 || citizenID.length() == 11) {
                        citizenID = "0" + citizenID;
                    }
                    SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");

                    // Định dạng đầu ra
                    SimpleDateFormat outputDateFormat = new SimpleDateFormat("dd/MM/yyyy");
                    birthday = (row.getCell(6)).getLocalDateTimeCellValue().toString();
                    try {
                        // Chuyển đổi chuỗi đầu vào thành đối tượng Date
                        Date inputDate = inputDateFormat.parse(birthday);

                        // Định dạng lại đối tượng Date thành chuỗi đầu ra
                        birthday = outputDateFormat.format(inputDate);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    String genderText = (row.getCell(7)).getStringCellValue();
                    genderText = genderText.strip();
                    if (genderText.equals("Nam")) {
                        gender = true;
                    } else if (genderText.equals("Nữ")) {
                        gender = false;
                    } else {
                        errorRow.add(row);
                        continue;
                    }
                    address = (row.getCell(8)).getStringCellValue();
                    email = (row.getCell(9)).getStringCellValue();
                    row.getCell(10).setCellType(CellType.STRING);
                    phone = "0" + row.getCell(10).getStringCellValue();

                }
                ArrayList<Integer> errorInfo = new ArrayList<Integer>();
                Reader reader = new Reader();
                PersonalInfo info = new PersonalInfo();
                errorInfo = PersonalInfoBUS.checkPersonalInfo(citizenID, name, birthday, Boolean.toString(gender),
                        phone, address, email);
                if (errorInfo.size() == 0) {
                    info = new PersonalInfo(citizenID, name, birthday, Boolean.toString(gender), phone, address, email);
                } else {
                    errorRow.add(row);
                    continue;
                }

                if (studentLogic) {
                    ArrayList<Integer> ErrorStudent = new ArrayList<Integer>();
                    ErrorStudent = StudentBUS.checkStudent(ID, className, departmentName);
                    System.out.println(ErrorStudent.size());

                    if (ErrorStudent.size() == 0) {
                        try {
                            Student student = new Student(ID, className, departmentName);
                            reader.setReader(2, 1); // mac dinh gia tri the la 1 nam
                            ReaderBUS.insertReaderStudent(reader, info, student);
                            complete++;
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        errorRow.add(row);
                        continue;
                    }
                }

                if (studentLogic == false) {
                    ArrayList<Integer> ErrorLecturer = new ArrayList<Integer>();
                    ErrorLecturer = LecturerBUS.checkLecturer(ID, departmentName);
                    if (ErrorLecturer.size() == 0) {
                        try {
                            Lecturer lecturer = new Lecturer(ID, departmentName);
                            reader.setReader(1, 1); // mac dinh gia tri the la 1 nam
                            ReaderBUS.insertReaderLecturer(reader, info, lecturer);
                            complete ++;
                        } catch (Exception e1) {
                            e1.printStackTrace();
                        }
                    } else {
                        errorRow.add(row);
                        continue;
                    }
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                file.close();
            }
        }
        results.put(complete, results);
        return results;
    }
}
