package main.java.com.library.GUI.forms.ManageUser;

import main.java.com.library.GUI.Login;

@SuppressWarnings("serial")
public class ChangePwd extends javax.swing.JFrame {
	public ChangePwd() {
		init();
	}

	private void init() {
		setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - 400) / 2,
				(java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - 250) / 2, 400, 250);
		setIconImage(java.awt.Toolkit.getDefaultToolkit()
				.getImage(this.getClass().getResource("../../../../../resources/icons/sgu-logo.png")));
		setTitle("THAY ĐỔI MẬT KHẨU - THƯ VIỆN SGU");
		contentPane = new javax.swing.JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		details = new javax.swing.JPanel();
		details.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(details, java.awt.BorderLayout.CENTER);

		lblPwd = new javax.swing.JLabel("Mật khẩu cũ");
		txtPwd = new javax.swing.JPasswordField(15);

		lblNewPwd = new javax.swing.JLabel("Mật khẩu mới");
		txtNewPwd = new javax.swing.JPasswordField(15);

		lblRepeatPwd = new javax.swing.JLabel("Nhập lại mật khẩu");
		txtRepeatPwd = new javax.swing.JPasswordField(15);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details
				.setHorizontalGroup(
						gl_details.createSequentialGroup().addGap(0, 50, 50)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(lblPwd).addComponent(lblNewPwd).addComponent(lblRepeatPwd))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtPwd).addComponent(txtRepeatPwd).addComponent(txtNewPwd))
								.addGap(0, 50, 50));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(0, 40, 40)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPwd).addComponent(txtPwd))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblNewPwd).addComponent(txtNewPwd))
				.addGap(24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblRepeatPwd).addComponent(txtRepeatPwd))
				.addGap(0, 40, 40));
		details.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(UserInfo.change);
		detailsHandle.add(UserInfo.reset);
		detailsHandle.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// Action
		UserInfo.change.addActionListener(e -> {
			StringBuilder sb = new StringBuilder();
			if (new String(txtPwd.getPassword()).equals(""))
				sb.append("Mật khẩu không hợp lệ !\n");
			if (new String(txtNewPwd.getPassword()).equals(""))
				sb.append("Mật khẩu không hợp lệ !\n");
			if (!new String(txtNewPwd.getPassword()).equalsIgnoreCase(new String(txtRepeatPwd.getPassword()))) {
				sb.append("Mật khẩu không trùng khớp !\n");
			}
			if (sb.length() > 0) {
				javax.swing.JOptionPane.showMessageDialog(this, sb.toString(), "ERROR",
						javax.swing.JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				new Login().setVisible(true);
				Login.frame.dispose();
				this.dispose();
			}
		});

		UserInfo.reset.addActionListener(e -> {
			if (txtPwd.isEnabled()) {
				txtPwd.setEnabled(true);
				txtNewPwd.setEnabled(true);
				txtRepeatPwd.setEnabled(true);

				txtPwd.setText("");
				txtNewPwd.setText("");
				txtRepeatPwd.setText("");
			}
		});
	}

	// Private
	private javax.swing.JPanel contentPane;
	private javax.swing.JPanel details;
	private javax.swing.JLabel lblPwd;
	private javax.swing.JPasswordField txtPwd;
	private javax.swing.JLabel lblNewPwd;
	private javax.swing.JPasswordField txtNewPwd;
	private javax.swing.JLabel lblRepeatPwd;
	private javax.swing.JPasswordField txtRepeatPwd;
	private javax.swing.JPanel detailsHandle;
}
