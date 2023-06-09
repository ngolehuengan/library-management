package main.java.com.library.GUI.forms.ManageRole;

import java.util.ArrayList;

import main.java.com.library.BLL.AccountBUS;
import main.java.com.library.BLL.PersonalInfoBUS;
import main.java.com.library.BLL.librarianBUS;
import main.java.com.library.DTO.Account;
import main.java.com.library.DTO.PersonalInfo;
import main.java.com.library.GUI.handle.Handle;

public class ManageLibrarian {
	@SuppressWarnings({ "serial" })
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		ManageLibrarianTab = new javax.swing.JPanel();
		ManageLibrarianTab.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Quản Lý Thủ Thư", null, ManageLibrarianTab, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		ManageLibrarianTab.add(handle, java.awt.BorderLayout.NORTH);
		ManageLibrarianTab.add(splitPane, java.awt.BorderLayout.CENTER);

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

		lblUser = new javax.swing.JLabel("Tên tài khoản");
		txtUser = new javax.swing.JTextField(20);
		txtUser.setEnabled(false);

		lblPwd = new javax.swing.JLabel("Mật khẩu");
		restore.setEnabled(false);

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

		lblGender = new javax.swing.JLabel("Giới tính");
		male = new javax.swing.JRadioButton("Nam");
		male.setEnabled(false);
		female = new javax.swing.JRadioButton("Nữ");
		female.setEnabled(false);
		btnGroup = new javax.swing.ButtonGroup();
		btnGroup.add(male);
		btnGroup.add(female);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80)
				.addGroup(gl_details
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(lblPhone)
						.addComponent(lblName).addComponent(lblCmnd).addComponent(lblDate).addComponent(lblAddress)
						.addComponent(lblEmail).addComponent(lblGender).addComponent(lblUser).addComponent(lblPwd))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPhone).addComponent(txtName).addComponent(txtCmnd).addComponent(txtDate)
						.addComponent(txtAddress).addComponent(txtEmail).addComponent(txtUser).addComponent(restore)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(male))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(female))))
				.addGap(10, 80, 80));
		gl_details
				.setVerticalGroup(
						gl_details.createSequentialGroup().addGap(10, 80, 80)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblName).addComponent(txtName))
								.addGap(5, 15, 24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblUser).addComponent(txtUser))
								.addGap(5, 15, 24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblPwd).addComponent(restore))
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
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "STT", "MÃ THỦ THƯ", "HỌ TÊN", "TÊN TÀI KHOẢN", "CMND/CCCD", "NGÀY TẠO TK" }) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		tableHandle = new javax.swing.JPanel();
		tableHandle.add(view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
		new String[] { "STT", "MÃ THỦ THƯ", "HỌ TÊN", "TÊN TÀI KHOẢN", "CMND/CCCD", "Email" }) {
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return false;
	}
});

		// Action
		add.addActionListener(e -> {
			txtName.setEnabled(true);
			txtUser.setEnabled(true);
			restore.setEnabled(false);
			txtCmnd.setEnabled(true);
			txtDate.setEnabled(true);
			txtAddress.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			male.setEnabled(true);
			female.setEnabled(true);




			txtName.setText("");
			txtUser.setText("");
			btnGroup.clearSelection();
			txtCmnd.setText("");
			txtDate.setText("");
			txtAddress.setText("");
			txtEmail.setText("");
			txtPhone.setText("");
		});

		edit.addActionListener(e -> {
			txtName.setEnabled(true);
			txtUser.setEnabled(true);
			restore.setEnabled(true);
			txtCmnd.setEnabled(true);
			txtDate.setEnabled(true);
			txtAddress.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			male.setEnabled(true);
			female.setEnabled(true);
		});

		delete.addActionListener(e -> {
			txtName.setEnabled(false);
			txtUser.setEnabled(false);
			restore.setEnabled(false);
			txtCmnd.setEnabled(false);
			txtDate.setEnabled(false);
			txtAddress.setEnabled(false);
			txtEmail.setEnabled(false);
			txtPhone.setEnabled(false);
			male.setEnabled(false);
			female.setEnabled(false);

			txtName.setText("");
			txtUser.setText("");
			btnGroup.clearSelection();
			txtCmnd.setText("");
			txtDate.setText("");
			txtAddress.setText("");
			txtEmail.setText("");
			txtPhone.setText("");
		});

		save.addActionListener(e -> {

			if (txtName.isEnabled()) {
				txtCmnd.setBorder(Handle.colorDisabled());
				txtName.setBorder(Handle.colorDisabled());
				txtDate.setBorder(Handle.colorDisabled());
				txtPhone.setBorder(Handle.colorDisabled());
				txtAddress.setBorder(Handle.colorDisabled());
				txtEmail.setBorder(Handle.colorDisabled());
				txtUser.setBorder(Handle.colorDisabled());

				String name = txtName.getText();
				String userName = txtUser.getText();
				String citizenID = txtCmnd.getText();
				String birthday = txtDate.getText();
				String address = txtAddress.getText();
				String email = txtEmail.getText();
				String phone = txtPhone.getText();
				boolean gender = male.isSelected();

				//  Biến boolean để lưu trạng thái của Border
				boolean hasError = false;
				ArrayList<Integer> errorInfo = new ArrayList<Integer>();
				ArrayList<Integer> errorAccount = new ArrayList<Integer>();
				PersonalInfo info = new PersonalInfo() ;
				Account account = new Account();
				
				errorInfo = PersonalInfoBUS.checkPersonalInfo(citizenID, name, birthday, Boolean.toString(gender), phone, address,email);
				try {
					errorAccount = AccountBUS.checkAccount(userName);
				} catch (Exception e1) {

					e1.printStackTrace();
				}
				 
				if(errorAccount.contains(1)){
					txtUser.setBorder(Handle.colorError());
					hasError = true;
				}
				if (errorAccount.contains(2)){
					StringBuilder sb =new  StringBuilder();
					sb.append("Tài khoản đã tồn tại vui lòng sử dụng tài khoản khác");
					javax.swing.JOptionPane.showMessageDialog(null, sb.toString(), "ERROR",
					javax.swing.JOptionPane.ERROR_MESSAGE);
					hasError = true;
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
				if (errorAccount.size() == 0 && errorInfo.size() == 0 ){
					info = new PersonalInfo(citizenID, name, birthday, Boolean.toString(gender), phone, address, email);
					account = new Account(userName, userName, 2);
					try {
						System.out.println("vao roi");
						librarianBUS.insertLibrarian(account, info);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}

			}

			txtName.setEnabled(false);
			txtUser.setEnabled(false);
			restore.setEnabled(false);
			txtCmnd.setEnabled(false);
			txtDate.setEnabled(false);
			txtAddress.setEnabled(false);
			txtEmail.setEnabled(false);
			txtPhone.setEnabled(false);
			male.setEnabled(false);
			female.setEnabled(false);
		});

		reset.addActionListener(e -> {
			if (txtName.isEnabled()) {
				txtName.setEnabled(true);
				txtUser.setEnabled(true);
				txtCmnd.setEnabled(true);
				txtDate.setEnabled(true);
				txtAddress.setEnabled(true);
				txtEmail.setEnabled(true);
				txtPhone.setEnabled(true);
				male.setEnabled(true);
				female.setEnabled(true);

				txtName.setText("");
				txtUser.setText("");
				btnGroup.clearSelection();
				txtCmnd.setText("");
				txtDate.setText("");
				txtAddress.setText("");
				txtEmail.setText("");
				txtPhone.setText("");
			}
		});
	}

	// Handle
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

		handleBase.add(add);
		handleBase.add(edit);
		handleBase.add(delete);

		handleOpt = new javax.swing.JPanel();
		handleOpt.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		print = Handle.getPrint(print);
		download = Handle.getDownload(download);

		handleOpt.add(download);
		handleOpt.add(print);

		save = Handle.getSave(save);
		reset = Handle.getReset(reset);
		view = Handle.getView(view);

		restore = new javax.swing.JButton("Khôi phục mặc định");
		Handle.setColor(restore);
	}

	// Private
	private static javax.swing.JPanel ManageLibrarianTab;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JLabel lblName;
	private static javax.swing.JTextField txtName;
	private static javax.swing.JLabel lblUser;
	private static javax.swing.JTextField txtUser;
	private static javax.swing.JLabel lblPwd;
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
	private static javax.swing.JLabel lblGender;
	private static javax.swing.ButtonGroup btnGroup;
	private static javax.swing.JRadioButton male;
	private static javax.swing.JRadioButton female;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleOpt;
	private static javax.swing.JButton add;
	private static javax.swing.JButton edit;
	private static javax.swing.JButton delete;
	private static javax.swing.JButton download;
	private static javax.swing.JButton print;
	private static javax.swing.JButton save;
	private static javax.swing.JButton reset;
	private static javax.swing.JButton view;
	private static javax.swing.JButton restore;
}
