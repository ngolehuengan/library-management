package main.java.com.library.GUI.forms.ManageUser;

import java.util.Vector;

import main.java.com.library.BLL.AccountBUS;
import main.java.com.library.DTO.Account;
import main.java.com.library.GUI.handle.Handle;

@SuppressWarnings("serial")
public class ChangePwd extends javax.swing.JFrame {
	public ChangePwd() {
		init();
	}

	@SuppressWarnings({ "unchecked" })
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
		UserInfo.save = Handle.getSave(UserInfo.save);
		UserInfo.save.setText("Thay đổi");
		UserInfo.reset = Handle.getReset(UserInfo.reset);
		detailsHandle.add(UserInfo.save);
		detailsHandle.add(UserInfo.reset);
		detailsHandle.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// Action
		this.getRootPane().setDefaultButton(UserInfo.save);
		UserInfo.save.addActionListener(e -> {
			Account account = new Account();
			account.setUsername(main.java.com.library.GUI.Login.txtUsername.getText());
			account.setPassword(new String(txtPwd.getPassword()));
			Vector<Integer> role;
			try {
				role = AccountBUS.login(account);
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
				return;
			}
			StringBuilder sb = new StringBuilder();
			if (main.java.com.library.GUI.Login.role.get(0) != role.get(0))
				sb.append("Mật khẩu hiện tại không đúng !\n");
			if (new String(txtNewPwd.getPassword()).equals(""))
				sb.append("Mật khẩu mới không hợp lệ !\n");
			if (!new String(txtNewPwd.getPassword()).equalsIgnoreCase(new String(txtRepeatPwd.getPassword()))) {
				sb.append("Mật khẩu nhập lại không trùng khớp !\n");
			}
			if (sb.length() > 0) {
				javax.swing.JOptionPane.showMessageDialog(this, sb.toString(), "ERROR",
						javax.swing.JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				new main.java.com.library.GUI.Login().setVisible(true);
				main.java.com.library.GUI.Login.frame.dispose();
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
