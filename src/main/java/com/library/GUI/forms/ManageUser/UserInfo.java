package main.java.com.library.GUI.forms.ManageUser;

import main.java.com.library.GUI.Login;

public class UserInfo {
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		ManageUser = new javax.swing.JPanel();
		ManageUser.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Thông Tin Tài Khoản", null, ManageUser, null);
		handle();

		// --Reader Slip Tab = Details + Table
		// ---Details
		details = new javax.swing.JPanel();
		details.setBorder(new javax.swing.border.TitledBorder(null, "Hồ Sơ Cá Nhân",
				javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));
		details.setBackground(new java.awt.Color(204, 255, 204));

		ManageUser.add(handle, java.awt.BorderLayout.NORTH);
		ManageUser.add(details, java.awt.BorderLayout.CENTER);

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		detailsInfo.setBackground(new java.awt.Color(204, 255, 204));
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblName = new javax.swing.JLabel("Họ và tên");
		txtName = new javax.swing.JTextField();
		txtName.setEnabled(false);
		txtName.setColumns(20);

		lblUser = new javax.swing.JLabel("Tên tài khoản");
		txtUser = new javax.swing.JTextField();
		txtUser.setEnabled(false);
		txtUser.setColumns(20);

		lblPwd = new javax.swing.JLabel("Mật khẩu");
		password.setEnabled(false);

		lblCmnd = new javax.swing.JLabel("CMND/CCCD");
		txtCmnd = new javax.swing.JTextField();
		txtCmnd.setEnabled(false);
		txtCmnd.setColumns(20);

		lblDate = new javax.swing.JLabel("Ngày sinh");
		txtDate = new javax.swing.JTextField();
		txtDate.setEnabled(false);
		txtDate.setColumns(20);

		lblAddress = new javax.swing.JLabel("Địa chỉ");
		txtAddress = new javax.swing.JTextField();
		txtAddress.setEnabled(false);
		txtAddress.setColumns(20);

		lblEmail = new javax.swing.JLabel("Email");
		txtEmail = new javax.swing.JTextField();
		txtEmail.setEnabled(false);
		txtEmail.setColumns(20);

		lblPhone = new javax.swing.JLabel("Số điện thoại");
		txtPhone = new javax.swing.JTextField();
		txtPhone.setEnabled(false);
		txtPhone.setColumns(20);

		lblGender = new javax.swing.JLabel("Giới tính");
		male = new javax.swing.JRadioButton("Nam");
		male.setBackground(new java.awt.Color(204, 255, 204));
		male.setEnabled(false);
		female = new javax.swing.JRadioButton("Nữ");
		female.setBackground(new java.awt.Color(204, 255, 204));
		female.setEnabled(false);
		btnGroup = new javax.swing.ButtonGroup();
		btnGroup.add(male);
		btnGroup.add(female);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 0, 600)
				.addGroup(gl_details
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false).addComponent(lblPhone)
						.addComponent(lblName).addComponent(lblCmnd).addComponent(lblDate).addComponent(lblAddress)
						.addComponent(lblEmail).addComponent(lblGender).addComponent(lblUser).addComponent(lblPwd))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPhone).addComponent(txtName).addComponent(txtCmnd).addComponent(txtDate)
						.addComponent(txtAddress).addComponent(txtEmail).addComponent(txtUser).addComponent(password)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(male))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(female))))
				.addGap(0, 0, 600));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblName).addComponent(txtName))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblUser).addComponent(txtUser))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPwd).addComponent(password))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblCmnd).addComponent(txtCmnd))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate).addComponent(txtDate))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblGender).addComponent(male).addComponent(female))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblAddress).addComponent(txtAddress))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblEmail).addComponent(txtEmail))
				.addGap(20).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPhone).addComponent(txtPhone))
				.addGap(20));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.setBackground(new java.awt.Color(204, 255, 204));
		detailsHandle.add(save);
		detailsHandle.add(reset);
		details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// Action
		edit.addActionListener(e -> {
			txtName.setEnabled(true);
			txtUser.setEnabled(true);
			password.setEnabled(true);
			txtCmnd.setEnabled(true);
			txtDate.setEnabled(true);
			txtAddress.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			male.setEnabled(true);
			female.setEnabled(true);
		});

		save.addActionListener(e -> {
			txtName.setEnabled(false);
			txtUser.setEnabled(false);
			password.setEnabled(false);
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
				password.setEnabled(true);
				txtCmnd.setEnabled(true);
				txtDate.setEnabled(true);
				txtAddress.setEnabled(true);
				txtEmail.setEnabled(true);
				txtPhone.setEnabled(true);
				male.setEnabled(true);
				female.setEnabled(true);

				txtName.setText("");
				txtUser.setText("");
				password.setText("");
				btnGroup.clearSelection();
				txtCmnd.setText("");
				txtDate.setText("");
				txtAddress.setText("");
				txtEmail.setText("");
				txtPhone.setText("");
			}
		});

		password.addActionListener(e -> {
			new ChangePwd().setVisible(true);
		});

		logout.addActionListener(e -> {
			new Login().setVisible(true);
			Login.frame.dispose();
		});
	}

	// Handle
	private static void handle() {
		handle = new javax.swing.JPanel();
		handle.setBorder(new javax.swing.border.TitledBorder(null, "Cài đặt tài khoản",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		handle.setBackground(new java.awt.Color(204, 255, 204));
		handle.setLayout(new java.awt.BorderLayout(0, 0));

		handleBase = new javax.swing.JPanel();
		handleBase.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleBase, java.awt.BorderLayout.WEST);

		edit = new javax.swing.JButton("Chỉnh sửa thông tin cá nhân");
		edit.setBackground(new java.awt.Color(0, 153, 51));
		edit.setForeground(new java.awt.Color(255, 255, 255));

		handleBase.add(edit);

		handleOpt = new javax.swing.JPanel();
		handleOpt.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		logout = new javax.swing.JButton(" Đăng xuất");
		logout.setIcon(
				new javax.swing.ImageIcon(UserInfo.class.getResource("../../../../../resources/icons/power.png")));
		logout.setForeground(new java.awt.Color(255, 255, 255));
		logout.setBackground(new java.awt.Color(248, 3, 10));

		handleOpt.add(logout);

		save = new javax.swing.JButton("Lưu");
		save.setBackground(new java.awt.Color(0, 153, 51));
		save.setForeground(new java.awt.Color(255, 255, 255));

		change = new javax.swing.JButton("Thay đổi");
		change.setBackground(new java.awt.Color(0, 153, 51));
		change.setForeground(new java.awt.Color(255, 255, 255));

		reset = new javax.swing.JButton("Reset");
		reset.setBackground(new java.awt.Color(0, 153, 51));
		reset.setForeground(new java.awt.Color(255, 255, 255));

		password = new javax.swing.JButton("Thay đổi mật khẩu");
		password.setBackground(new java.awt.Color(0, 153, 51));
		password.setForeground(new java.awt.Color(255, 255, 255));
	}

	// Private
	private static javax.swing.JPanel ManageUser;
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

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleOpt;
	private static javax.swing.JButton edit;
	private static javax.swing.JButton logout;
	private static javax.swing.JButton save;
	public static javax.swing.JButton reset;
	public static javax.swing.JButton change;
	private static javax.swing.JButton password;
}
