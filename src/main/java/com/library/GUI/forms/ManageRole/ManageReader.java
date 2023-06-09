package main.java.com.library.GUI.forms.ManageRole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import main.java.com.library.BLL.LecturerBUS;
import main.java.com.library.BLL.PersonalInfoBUS;
import main.java.com.library.BLL.ReaderBUS;
import main.java.com.library.BLL.StudentBUS;
import main.java.com.library.DTO.Lecturer;
import main.java.com.library.DTO.PersonalInfo;
import main.java.com.library.DTO.Reader;
import main.java.com.library.DTO.Student;
import main.java.com.library.GUI.handle.Handle;

public class ManageReader {
	@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		ManageReaderTab = new javax.swing.JPanel();
		ManageReaderTab.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Quản Lý Độc Giả", null, ManageReaderTab, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		ManageReaderTab.add(handle, java.awt.BorderLayout.NORTH);
		ManageReaderTab.add(splitPane, java.awt.BorderLayout.CENTER);

		// --Reader Slip Tab = Details + Table
		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblName = new javax.swing.JLabel("Họ và tên");
		txtName = new javax.swing.JTextField(20);
		txtName.setEnabled(false);

		lblRole = new javax.swing.JLabel("Loại độc giả");
		roleSv = new javax.swing.JRadioButton("Sinh viên");
		roleSv.setEnabled(false);
		roleCbgv = new javax.swing.JRadioButton("CBGV");
		roleCbgv.setEnabled(false);
		btnGroup = new javax.swing.ButtonGroup();
		btnGroup.add(roleSv);
		btnGroup.add(roleCbgv);

		lblMs = new javax.swing.JLabel("MSSV/CBGV");
		txtMs = new javax.swing.JTextField(20);
		txtMs.setEnabled(false);

		lblDepart = new javax.swing.JLabel("Khoa");
		txtDepart = new javax.swing.JComboBox(ReaderBUS.showDepartment());
		txtDepart.setEnabled(false);

		lblClass = new javax.swing.JLabel("Lớp");
		txtClass = new javax.swing.JTextField(20);
		txtClass.setEnabled(false);

		lblCmnd = new javax.swing.JLabel("CMND/CCCD");
		txtCmnd = new javax.swing.JTextField(20);
		txtCmnd.setEnabled(false);

		lblDate = new javax.swing.JLabel("Ngày sinh");
		txtDate = new javax.swing.JTextField(20);
		txtDate.setEnabled(false);

		lblAddress = new javax.swing.JLabel("Địa chỉ");
		txtAddress = new javax.swing.JTextField(20);
		txtAddress.setEnabled(false);

		lblEmail = new javax.swing.JLabel("Email");
		txtEmail = new javax.swing.JTextField(20);
		txtEmail.setEnabled(false);

		lblPhone = new javax.swing.JLabel("Số điện thoại");
		txtPhone = new javax.swing.JTextField(20);
		txtPhone.setEnabled(false);

		lblPenalty = new javax.swing.JLabel("Tổng nợ");
		txtPenalty = new javax.swing.JTextField(20);
		txtPenalty.setEnabled(false);

		lblGender = new javax.swing.JLabel("Giới tính");
		male = new javax.swing.JRadioButton("Nam");
		male.setEnabled(false);
		female = new javax.swing.JRadioButton("Nữ");
		female.setEnabled(false);
		btnGroupGd = new javax.swing.ButtonGroup();
		btnGroupGd.add(male);
		btnGroupGd.add(female);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(lblPhone).addComponent(lblName).addComponent(lblRole).addComponent(lblCmnd)
						.addComponent(lblDate).addComponent(lblAddress).addComponent(lblEmail).addComponent(lblMs)
						.addComponent(lblDepart).addComponent(lblClass).addComponent(lblGender)
						.addComponent(lblPenalty))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPhone).addComponent(txtName).addComponent(txtCmnd).addComponent(txtDate)
						.addComponent(txtAddress).addComponent(txtPenalty).addComponent(txtMs).addComponent(txtDepart)
						.addComponent(txtClass).addComponent(txtEmail)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(male))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(female)))
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(roleSv))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(roleCbgv))))
				.addGap(10, 80, 80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblName).addComponent(txtName))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblRole).addComponent(roleSv).addComponent(roleCbgv))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblMs)
						.addComponent(txtMs))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDepart).addComponent(txtDepart))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblClass).addComponent(txtClass))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblCmnd).addComponent(txtCmnd))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate).addComponent(txtDate))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblGender).addComponent(male).addComponent(female))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblAddress).addComponent(txtAddress))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblEmail).addComponent(txtEmail))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPhone).addComponent(txtPhone))
				.addGap(5, 15, 24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPenalty).addComponent(txtPenalty))
				.addGap(10, 80, 80));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(save);
		detailsHandle.add(reset);
		details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// ---Table
		tablePnl = new javax.swing.JPanel();
		splitPane.setRightComponent(tablePnl);
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);

		tableHandle = new javax.swing.JPanel();
		tableHandle.add(view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

		// Action
		add.addActionListener(e -> {
			selectRow = -1;
			txtName.setEnabled(true);
			roleSv.setEnabled(true);
			roleCbgv.setEnabled(true);
			txtMs.setEnabled(true);
			txtDepart.setEnabled(true);
			txtClass.setEnabled(true);
			txtCmnd.setEnabled(true);
			txtDate.setEnabled(true);
			txtAddress.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			male.setEnabled(true);
			female.setEnabled(true);

			txtName.setText("");
			btnGroup.clearSelection();
			btnGroupGd.clearSelection();
			txtMs.setText("");
			txtCmnd.setText("");
			txtDate.setText("");
			txtAddress.setText("");
			txtEmail.setText("");
			txtPhone.setText("");
			txtPenalty.setText("0");
		});

		edit.addActionListener(e -> {
			txtName.setEnabled(true);
			roleSv.setEnabled(true);
			roleCbgv.setEnabled(true);
			txtMs.setEnabled(true);
			txtDepart.setEnabled(true);
			txtClass.setEnabled(true);
			txtCmnd.setEnabled(false);
			txtDate.setEnabled(true);
			txtAddress.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			male.setEnabled(true);
			female.setEnabled(true);
		});

		delete.addActionListener(e -> {
			 {	
				Reader reader = new Reader();
				reader.setID(selectRow);
				ReaderBUS.hideReader(reader);
				System.out.println(selectRow);

				txtName.setEnabled(false);
				roleSv.setEnabled(false);
				roleCbgv.setEnabled(false);
				txtMs.setEnabled(false);
				txtDepart.setEnabled(false);
				txtClass.setEnabled(false);
				txtCmnd.setEnabled(false);
				txtDate.setEnabled(false);
				txtAddress.setEnabled(false);
				txtEmail.setEnabled(false);
				txtPhone.setEnabled(false);
				male.setEnabled(false);
				female.setEnabled(false);
				
				txtName.setText("");
				btnGroup.clearSelection();
				btnGroupGd.clearSelection();
				txtMs.setText("");
				txtCmnd.setText("");
				txtDate.setText("");
				txtAddress.setText("");
				txtEmail.setText("");
				txtPhone.setText("");
				txtPenalty.setText("0");
			}
		});

		save.addActionListener(e -> {
			if (txtName.isEnabled()) {
				txtCmnd.setBorder(Handle.colorDisabled());
				txtName.setBorder(Handle.colorDisabled());
				txtDate.setBorder(Handle.colorDisabled());
				txtPhone.setBorder(Handle.colorDisabled());
				txtAddress.setBorder(Handle.colorDisabled());
				txtEmail.setBorder(Handle.colorDisabled());
				txtMs.setBorder(Handle.colorDisabled());
				txtClass.setBorder(Handle.colorDisabled());

				String name = txtName.getText();
				Boolean studentLogic = roleSv.isSelected(); // "Sinh viên" : "Cán bộ giảng viên";
				String ID = txtMs.getText();
				String departmentName = txtDepart.getSelectedItem().toString();
				String className = txtClass.getText();
				String citizenID = txtCmnd.getText();
				String birthday = txtDate.getText();
				String address = txtAddress.getText();
				String email = txtEmail.getText();
				String phone = txtPhone.getText();
				boolean gender = male.isSelected();

				// Biến boolean để lưu trạng thái của Border
				boolean hasError = false;
				ArrayList<Integer> errorInfo = new ArrayList<Integer>();
				Reader reader = new Reader();
				PersonalInfo info = new PersonalInfo();
				errorInfo = PersonalInfoBUS.checkPersonalInfo(citizenID, name, birthday, Boolean.toString(gender), phone, address,email);
				if (errorInfo.size() == 0){
					info = new PersonalInfo(citizenID, name, birthday, Boolean.toString(gender), phone, address, email);
				}
				if (errorInfo.contains(1)) {
					txtCmnd.setBorder(Handle.colorError());
					hasError = true;
				}
				if (errorInfo.contains(2)) {
					txtName.setBorder(Handle.colorError());
					hasError = true;
				}
				if (errorInfo.contains(3)) {
					txtDate.setBorder(Handle.colorError());
					hasError = true;
				}
				if (errorInfo.contains(4)) {
					txtPhone.setBorder(Handle.colorError());
					hasError = true;
				}
				if (errorInfo.contains(5)) {
					txtAddress.setBorder(Handle.colorError());
					hasError = true;
				}
				if (errorInfo.contains(6)) {
					txtEmail.setBorder(Handle.colorError());
					hasError = true;
				}

				if (studentLogic ) {
					ArrayList<Integer> ErrorStudent = new ArrayList<Integer>();
					ErrorStudent = StudentBUS.checkStudent(ID, className, departmentName);
					if (ErrorStudent.size() == 0 && hasError == false && selectRow == -1) {
						try {
							Student student = new Student(ID, className, departmentName);
							reader.setReader(2, 1); // mac dinh gia tri the la 1 nam
							ReaderBUS.insertReaderStudent(reader,info, student);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					if (ErrorStudent.size() == 0 && hasError == false && selectRow != -1){
						try {
							Student student = new Student(ID, className, departmentName);
							reader.setReader(2, 1); // mac dinh gia tri the la 1 nam
							reader.setID(selectRow);
							ReaderBUS.updateReaderStudent(reader, info, student);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					if (ErrorStudent.contains(1)) {
						txtMs.setBorder(Handle.colorError());
						hasError = true;
					}
					if (ErrorStudent.contains(2)) {
						txtClass.setBorder(Handle.colorError());
						hasError = true;
					}
				}
				if (studentLogic == false ) {
					ArrayList<Integer> ErrorLecturer = new ArrayList<Integer>();
					ErrorLecturer = LecturerBUS.checkLecturer(ID,departmentName);
					if (ErrorLecturer.size() == 0 && hasError == false && selectRow == -1) {
						try{
							Lecturer lecturer = new Lecturer(ID, departmentName);
							reader.setReader(1, 1); // mac dinh gia tri the la 1 nam
							ReaderBUS.insertReaderLecturer(reader, info, lecturer);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
					if (ErrorLecturer.size() == 0 && hasError == false && selectRow != -1){
						try {
							Lecturer lecturer = new Lecturer(ID, departmentName);
							reader.setReader(2, 1); // mac dinh gia tri the la 1 nam
							reader.setID(selectRow);
							ReaderBUS.updateReaderLecturer(reader, info, lecturer);
						} catch (Exception e1) {
							e1.printStackTrace();
						}
					}
		
					if (ErrorLecturer.contains(1)) {
						txtMs.setBorder(Handle.colorError());
						hasError = true;
					}
				}
				if (hasError) {
					return;
				}

				// Nếu không có lỗi, disable các JTextField
				txtName.setText("");
				btnGroup.clearSelection();
				btnGroupGd.clearSelection();
				txtMs.setText("");
				txtCmnd.setText("");
				txtDate.setText("");
				txtAddress.setText("");
				txtEmail.setText("");
				txtPhone.setText("");
				txtPenalty.setText("0");

				txtName.setEnabled(false);
				roleSv.setEnabled(false);
				roleCbgv.setEnabled(false);
				txtMs.setEnabled(false);
				txtDepart.setEnabled(false);
				txtClass.setEnabled(false);
				txtCmnd.setEnabled(false);
				txtDate.setEnabled(false);
				txtAddress.setEnabled(false);
				txtEmail.setEnabled(false);
				txtPhone.setEnabled(false);
				male.setEnabled(false);
				female.setEnabled(false);
				
				txtCmnd.setBorder(Handle.colorDisabled());
				txtName.setBorder(Handle.colorDisabled());
				txtDate.setBorder(Handle.colorDisabled());
				txtPhone.setBorder(Handle.colorDisabled());
				txtAddress.setBorder(Handle.colorDisabled());
				txtEmail.setBorder(Handle.colorDisabled());
				txtMs.setBorder(Handle.colorDisabled());
				txtClass.setBorder(Handle.colorDisabled());
			}
		});

		reset.addActionListener(e -> {
			if (txtName.isEnabled()) {
				txtName.setEnabled(true);
				roleSv.setEnabled(true);
				roleCbgv.setEnabled(true);
				txtMs.setEnabled(true);
				txtDepart.setEnabled(true);
				txtClass.setEnabled(true);
				txtCmnd.setEnabled(true);
				txtDate.setEnabled(true);
				txtAddress.setEnabled(true);
				txtEmail.setEnabled(true);
				txtPhone.setEnabled(true);
				male.setEnabled(true);
				female.setEnabled(true);

				txtName.setText("");
				btnGroup.clearSelection();
				btnGroupGd.clearSelection();
				txtMs.setText("");
				txtCmnd.setText("");
				txtDate.setText("");
				txtAddress.setText("");
				txtEmail.setText("");
				txtPhone.setText("");
			}
		});
		
		view.addActionListener(e -> {
			tableMap = ReaderBUS.showTableReader(null);
			results = showTableReader(tableMap);
			filterresults = results;
			storeFilter = filterresults;
			table.setModel(new javax.swing.table.DefaultTableModel(results,
					new String[] { "STT", "MÃ ĐỘC GIẢ", "HỌ TÊN", "LOẠI ĐỘC GIẢ", "MSSV/CBGV", "KHOA", "TỔNG NỢ",
							"NGÀY LẬP THẺ", "NGÀY HẾT HẠN" }) {
				@Override
				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return false;
				}
				
			});
			btnGroup.clearSelection();
			txtDepartHandle.setModel(new javax.swing.DefaultComboBoxModel(ReaderBUS.showDepartment()));
		});

		search.addActionListener(e -> {
			String condition = searchField.getText();
			// if (condition.isEmpty()) condition = null;
			tableMap = ReaderBUS.showTableReader("\"" + condition + "\"");
			results = showTableReader(tableMap);
			filterresults = results;
			storeFilter = filterresults;
			table.setModel(new javax.swing.table.DefaultTableModel(results,
					new String[]{"STT", "MÃ ĐỘC GIẢ", "HỌ TÊN", "LOẠI ĐỘC GIẢ", "MSSV/CBGV", "KHOA", "TỔNG NỢ",
							"NGÀY LẬP THẺ", "NGÀY HẾT HẠN"}) {
				@Override
				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return false;
				}
			}); 
			// <-- added closing brace here
			btnGroup.clearSelection();
			txtDepartHandle.setModel(new javax.swing.DefaultComboBoxModel(ReaderBUS.showDepartment()));
		});
	
		txtDepartHandle.addActionListener(new ActionListener() {  
			@Override
			public void actionPerformed(ActionEvent e) {
				String deparmentName = txtDepartHandle.getSelectedItem().toString();
				String classify; 
				if(roleSvHandle.isSelected()){
					classify = "Sinh Viên";
				}
				if (roleCbgvHandle.isSelected()){
					classify = "Giảng Viên";
				}
				else {
					classify = "";
				}
				filterresults = filterResult(filterresults, classify, deparmentName);

				table.setModel(new javax.swing.table.DefaultTableModel(filterresults,
				new String[] { "STT", "MÃ ĐỘC GIẢ", "HỌ TÊN", "LOẠI ĐỘC GIẢ", "MSSV/CBGV", "KHOA", "TỔNG NỢ",
						"NGÀY LẬP THẺ", "NGÀY HẾT HẠN" }) {
			@Override
				public boolean isCellEditable(int rowIndex, int columnIndex) {
					return false;
			}
			});
			storeFilter = filterresults;
			filterresults = results;
		  }
		});
		
		roleSvHandle.addActionListener(e->{
			String classify = "Sinh Viên";
			String departmentName = txtDepartHandle.getSelectedItem().toString();
			filterresults = filterResult(filterresults, classify, departmentName);
			table.setModel(new javax.swing.table.DefaultTableModel(filterresults,
			new String[] { "STT", "MÃ ĐỘC GIẢ", "HỌ TÊN", "LOẠI ĐỘC GIẢ", "MSSV/CBGV", "KHOA", "TỔNG NỢ",
					"NGÀY LẬP THẺ", "NGÀY HẾT HẠN" }){
		@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
		}
		});
		storeFilter = filterresults;
		filterresults = results;
		}
		);
		
		roleCbgvHandle.addActionListener(e->{
			String classify = "Giảng Viên";
			String departmentName = txtDepartHandle.getSelectedItem().toString();
			filterresults = filterResult(filterresults, classify, departmentName);
			table.setModel(new javax.swing.table.DefaultTableModel(filterresults,
			new String[] { "STT", "MÃ ĐỘC GIẢ", "HỌ TÊN", "LOẠI ĐỘC GIẢ", "MSSV/CBGV", "KHOA", "TỔNG NỢ",
					"NGÀY LẬP THẺ", "NGÀY HẾT HẠN" }) {
		@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
		}
		});
		storeFilter = filterresults;
		filterresults = results;
		}
		);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int rowIndex = table.getSelectedRow();
					showRow(rowIndex,tableMap);

				}
			}
		});
		upload.addActionListener(e->{
			Handle.uploadReader(upload);
		});

}
	

	// Handle
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void handle() {
		handle = new javax.swing.JPanel();
		handle.setBorder(new javax.swing.border.TitledBorder(null, "Xử Lý", javax.swing.border.TitledBorder.LEADING,
				javax.swing.border.TitledBorder.TOP, null, null));
		handle.setBackground(new java.awt.Color(204, 255, 204));
		handle.setLayout(new java.awt.BorderLayout(0, 0));

		handleBase = new javax.swing.JPanel();
		handleBase.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleBase, java.awt.BorderLayout.WEST);

		add = Handle.getAdd(add);
		edit = Handle.getEdit(edit);
		delete = Handle.getDelete(delete);
		search = Handle.getSearch(search);
		searchField = new javax.swing.JTextField(15);

		handleBase.add(add);
		handleBase.add(edit);
		handleBase.add(delete);
		handleBase.add(searchField);
		handleBase.add(search);

		handleFilter = new javax.swing.JPanel(new java.awt.GridLayout(1, 2));
		handle.add(handleFilter, java.awt.BorderLayout.CENTER);

		filterRole = new javax.swing.JPanel();
		filterRole.setBackground(new java.awt.Color(204, 255, 204));
		lblRoleHandle = new javax.swing.JLabel("Loại độc giả:");
		roleSvHandle = new javax.swing.JRadioButton("Sinh Viên");
		roleSvHandle.setBackground(new java.awt.Color(204, 255, 204));
		roleCbgvHandle = new javax.swing.JRadioButton("CBGV");
		roleCbgvHandle.setBackground(new java.awt.Color(204, 255, 204));
		btnGroup = new javax.swing.ButtonGroup();
		btnGroup.add(roleSvHandle);
		btnGroup.add(roleCbgvHandle);
		filterRole.add(lblRoleHandle);
		filterRole.add(roleSvHandle);
		filterRole.add(roleCbgvHandle);
		handleFilter.add(filterRole);

		filterDepart = new javax.swing.JPanel();
		filterDepart.setBackground(new java.awt.Color(204, 255, 204));
		lblDepartHandle = new javax.swing.JLabel("Khoa:");
		txtDepartHandle = new javax.swing.JComboBox();
		txtDepartHandle.setModel(new javax.swing.DefaultComboBoxModel(ReaderBUS.showDepartment()));
		filterDepart.add(lblDepartHandle);
		filterDepart.add(txtDepartHandle);
		handleFilter.add(filterDepart);

		handleOpt = new javax.swing.JPanel();
		handleOpt.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		print = Handle.getPrint(print);
		upload = Handle.getUpload(upload);
		download = Handle.getDownload(download);

		handleOpt.add(upload);
		handleOpt.add(download);
		handleOpt.add(print);

		save = Handle.getSave(save);
		reset = Handle.getReset(reset);
		view = Handle.getView(view);
	}

	// function
	private static String[][] showTableReader(Map<Integer, ArrayList<Object>> table) {
		int lenStringList = table.size();
		String[][] stringList = new String[lenStringList][9];
		int key = 0;
		ArrayList<Object> obj = new ArrayList<>();

		for (Map.Entry<Integer, ArrayList<Object>> entry : table.entrySet()) {
			obj = entry.getValue();
			stringList[entry.getKey()][0] = Integer.toString(entry.getKey()+1);
			stringList[entry.getKey()][1] = Integer.toString(((Reader)obj.get(key)).getID());
			stringList[entry.getKey()][2] = ((PersonalInfo)obj.get(key+1)).getFullName();
			if (((Reader)obj.get(key)).getClassify() == 1) {
				stringList[entry.getKey()][3] = "Giảng Viên";
				stringList[entry.getKey()][4] = ((Lecturer)obj.get(key +2)).getLecturerID();
				stringList[entry.getKey()][5] = ((Lecturer)obj.get(key+2)).getDepartmentName();
			}
			else {
				stringList[entry.getKey()][3] = "Sinh Viên";
				stringList[entry.getKey()][4] = ((Student)obj.get(key+2)).getStudentID();
				stringList[entry.getKey()][5] = ((Student)obj.get(key+2)).getDepartmentName();
			} 
			stringList[entry.getKey()][6] = Double.toString(((Reader)obj.get(key)).getTotal_debt());
			stringList[entry.getKey()][7] = ((Reader)obj.get(key)).getRegistrationDate();
			stringList[entry.getKey()][8] = ((Reader)obj.get(key)).getExpirationDate();
			key = key +3;
		}
		return stringList;
	}
	private static void showRow(int rowIndex,Map<Integer, ArrayList<Object>> table){
		txtName.setText("");
		btnGroup.clearSelection();
		btnGroupGd.clearSelection();
		txtMs.setText("");
		txtCmnd.setText("");
		txtDate.setText("");
		txtAddress.setText("");
		txtEmail.setText("");
		txtPhone.setText("");
		txtPenalty.setText("0");

		int reader_id = Integer.parseInt(storeFilter[rowIndex][1]);
		ArrayList<Object> obj = new ArrayList<>();
		int key = 0;
		for (Map.Entry<Integer, ArrayList<Object>> entry : table.entrySet()) {
			obj = entry.getValue();
			if(((Reader)obj.get(key)).getID() == reader_id) break;
			key = key +3;
		}
		selectRow = reader_id;
		txtName.setText(((PersonalInfo)obj.get(key+1)).getFullName());

		if (((Reader)obj.get(key)).getClassify() == 1){
			txtMs.setText(((Lecturer)obj.get(key +2)).getLecturerID());
			roleCbgv.setSelected(true);
			txtDepart.setSelectedItem(((Lecturer)obj.get(key+2)).getDepartmentName());
		}
		else {
			txtMs.setText(((Student)obj.get(key+2)).getStudentID());
			roleSv.setSelected(true);
			txtDepart.setSelectedItem(((Student)obj.get(key+2)).getDepartmentName());
			txtClass.setText(((Student)obj.get(key+2)).getClassName());
		}
		if(((PersonalInfo)obj.get(key+1)).getisMale()) male.setSelected(true);
		else female.setSelected(true);
		
		txtCmnd.setText(((PersonalInfo)obj.get(key+1)).getCitizenID());
		txtDate.setText(((PersonalInfo)obj.get(key+1)).getBirthday());
		txtAddress.setText(((PersonalInfo)obj.get(key+1)).getAddress());
		txtEmail.setText(((PersonalInfo)obj.get(key+1)).getEmail());
		txtPhone.setText(((PersonalInfo)obj.get(key+1)).getPhoneNumber());
		txtPenalty.setText(Double.toString(((Reader)obj.get(key)).getTotal_debt()));

		txtName.setEnabled(false);
		roleSv.setEnabled(false);
		roleCbgv.setEnabled(false);
		txtMs.setEnabled(false);
		txtDepart.setEnabled(false);
		txtClass.setEnabled(false);
		txtCmnd.setEnabled(false);
		txtDate.setEnabled(false);
		txtAddress.setEnabled(false);
		txtEmail.setEnabled(false);
		txtPhone.setEnabled(false);
		male.setEnabled(false);
		female.setEnabled(false);
	}
	public static String[][] filterResult(String[][] result,String classify, String departmentName) {
        ArrayList<String[]> listItem = new ArrayList<String[]>();
        int index = 1;
        if(result.length == 0) return result;
        if (departmentName.isEmpty()){
            for(int i = 0;i<result.length;i++){
                if(result[i][3].equals(classify)){
                    result[i][0] = Integer.toString(index);
                    index++;
                    listItem.add(result[i]);
                }
            }
        }
        else if (classify.isEmpty()){
            for(int i = 0;i<result.length;i++){
                if(result[i][5].equals(departmentName)){
                    result[i][0] = Integer.toString(index);
                    index++;
                    listItem.add(result[i]);
                }
            }
        }
        else {
            for(int i = 0;i<result.length;i++){
                if(result[i][5].equals(departmentName) && result[i][3].equals(classify)){
                    result[i][0] = Integer.toString(index);
                    index++;
                    listItem.add(result[i]);
                }
            }
        }
        result = new String [listItem.size()][9];
        for (int i =0;i<listItem.size();i++){
            result[i] = listItem.get(i);

        }
        return result;
    }



	// Private
	private static javax.swing.JPanel ManageReaderTab;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JLabel lblName;
	private static javax.swing.JTextField txtName;
	private static javax.swing.JLabel lblRole;
	private static javax.swing.JRadioButton roleSv;
	private static javax.swing.JRadioButton roleCbgv;
	private static javax.swing.ButtonGroup btnGroup;
	private static javax.swing.JLabel lblEmail;
	private static javax.swing.JTextField txtEmail;
	private static javax.swing.JLabel lblCmnd;
	private static javax.swing.JTextField txtCmnd;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JLabel lblPhone;
	private static javax.swing.JTextField txtPhone;
	private static javax.swing.JLabel lblAddress;
	private static javax.swing.JTextField txtAddress;
	private static javax.swing.JLabel lblPenalty;
	private static javax.swing.JTextField txtPenalty;
	private static javax.swing.JLabel lblMs;
	private static javax.swing.JTextField txtMs;
	private static javax.swing.JLabel lblDepart;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox txtDepart;
	private static javax.swing.JLabel lblClass;
	private static javax.swing.JTextField txtClass;
	private static javax.swing.JLabel lblGender;
	private static javax.swing.ButtonGroup btnGroupGd;
	private static javax.swing.JRadioButton male;
	private static javax.swing.JRadioButton female;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleFilter;
	private static javax.swing.JPanel filterRole;
	private static javax.swing.JLabel lblRoleHandle;
	private static javax.swing.JRadioButton roleSvHandle;
	private static javax.swing.JRadioButton roleCbgvHandle;
	private static javax.swing.JPanel filterDepart;
	private static javax.swing.JLabel lblDepartHandle;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox txtDepartHandle;
	private static javax.swing.JPanel handleOpt;
	private static javax.swing.JButton add;
	private static javax.swing.JButton edit;
	private static javax.swing.JButton delete;
	private static javax.swing.JButton search;
	private static javax.swing.JTextField searchField;
	private static javax.swing.JButton download;
	private static javax.swing.JButton upload;
	private static javax.swing.JButton print;
	private static javax.swing.JButton save;
	private static javax.swing.JButton reset;
	private static javax.swing.JButton view;

	private static String[][] results = new String[0][0];
	private static String[][] filterresults = new String[0][0];
	private static String[][] storeFilter = new String[0][0];
	@SuppressWarnings("rawtypes")
	private static Map tableMap = new HashMap();
	private static int selectRow = -1;

}
