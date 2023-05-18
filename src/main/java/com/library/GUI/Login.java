package main.java.com.library.GUI;

import java.util.Vector;
import main.java.com.library.GUI.forms.MainFrame;
import main.java.com.library.GUI.handle.Handle;
import main.java.com.library.BLL.AccountBUS;
import main.java.com.library.DTO.Account;

@SuppressWarnings("serial")

public class Login extends javax.swing.JFrame {
	/**
	 * Create the frame.
	 */
	public Login() {
		init();
	}

	@SuppressWarnings("unchecked")
	private void init() {
		// ----------Frame----------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - 396) / 2,
				(java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - 256) / 2, 396, 256);
		setIconImage(java.awt.Toolkit.getDefaultToolkit()
				.getImage(this.getClass().getResource("../../../resources/icons/sgu-logo.png")));
		setTitle("CHÀO MỪNG ĐẾN VỚI THƯ VIỆN SGU");

		contentPane = new javax.swing.JPanel();
		contentPane.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.setBorder(new javax.swing.border.EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// ----------Elements----------
		// Top Panel
		lblLogin = new javax.swing.JLabel("ĐĂNG NHẬP");
		lblLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lblLogin.setForeground(new java.awt.Color(0, 153, 0));
		lblLogin.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 20));
		contentPane.setLayout(new java.awt.BorderLayout(0, 0));
		contentPane.add(lblLogin, java.awt.BorderLayout.NORTH);

		// Main Panel
		mainPnl = new javax.swing.JPanel();
		mainPnl.setLayout(new java.awt.BorderLayout(0, 0));
		mainPnl.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(mainPnl, java.awt.BorderLayout.CENTER);

		javax.swing.JSeparator separator = new javax.swing.JSeparator();
		mainPnl.add(separator, java.awt.BorderLayout.NORTH);

		separator = new javax.swing.JSeparator();
		mainPnl.add(separator, java.awt.BorderLayout.SOUTH);

		// --Main Form Panel Center
		mainFormPnl = new javax.swing.JPanel();
		mainFormPnl.setBackground(new java.awt.Color(204, 255, 204));
		mainPnl.add(mainFormPnl, java.awt.BorderLayout.CENTER);

		lblUsername = new javax.swing.JLabel("Tên tài khoản");
		txtUsername = new javax.swing.JTextField(15);

		lblPwd = new javax.swing.JLabel("Mật khẩu");
		txtPwd = new javax.swing.JPasswordField(15);

		tglbtnShowHidePwd = new javax.swing.JToggleButton(
				new javax.swing.ImageIcon(this.getClass().getResource("../../../resources/icons/eye.png")));
		tglbtnShowHidePwd.setSelectedIcon(
				new javax.swing.ImageIcon(this.getClass().getResource("../../../resources/icons/hidden.png")));
		tglbtnShowHidePwd.setBackground(new java.awt.Color(204, 255, 204));

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(mainFormPnl);
		gl_details
				.setHorizontalGroup(
						gl_details.createSequentialGroup().addGap(0, 50, 50)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(lblUsername).addComponent(lblPwd))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtPwd).addComponent(txtUsername))
								.addGap(0, 50, 50));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(0, 40, 40)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblUsername).addComponent(txtUsername))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPwd).addComponent(txtPwd))
				.addGap(0, 40, 40));
		mainFormPnl.setLayout(gl_details);

		// Bottom Panel
		botPnl = new javax.swing.JPanel();
		botPnl.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(botPnl, java.awt.BorderLayout.SOUTH);

		btnLogin = new javax.swing.JButton("Đăng nhập");
		Handle.setColor(btnLogin);
		botPnl.add(btnLogin);

		btnReset = Handle.getReset(btnReset);
		botPnl.add(btnReset);

		// Action
		this.getRootPane().setDefaultButton(btnLogin);
		this.getRootPane().setExitButton();

		tglbtnShowHidePwd.addActionListener(e -> {
			if (tglbtnShowHidePwd.isSelected())
				txtPwd.setEchoChar((char) 0);
			else
				txtPwd.setEchoChar('•');
		});

		btnLogin.addActionListener(e -> {
			account.setUsername(txtUsername.getText());
			account.setPassword(new String(txtPwd.getPassword()));
			try {
				role = AccountBUS.login(account);
			} catch (Exception e1) {
				System.out.println(e1.getMessage());
				return;
			}
			StringBuilder sb = new StringBuilder();
			if (txtUsername.getText().equals(""))
				sb.append("Tên tài khoản không hợp lệ !\n");
			if (new String(txtPwd.getPassword()).equals(""))
				sb.append("Mật khẩu không hợp lệ !\n");
			if (role.get(0) == 0 && sb.length() == 0) {
				sb.append("Tên tài khoản hoặc mật khẩu không chính xác");
			}
			if (sb.length() > 0) {
				javax.swing.JOptionPane.showMessageDialog(this, sb.toString(), "ERROR",
						javax.swing.JOptionPane.ERROR_MESSAGE);
				return;
			} else {
				frame = new MainFrame();
				frame.setVisible(true);
				frame.setExtendedState(MAXIMIZED_BOTH);
				this.dispose();
			}
		});
		
		btnReset.addActionListener(e -> {
			txtUsername.setText("");
			txtPwd.setText("");
		});
	}

	// ----------private----------
	private javax.swing.JPanel contentPane;
	private javax.swing.JPanel mainPnl;
	private javax.swing.JPanel mainFormPnl;
	private javax.swing.JLabel lblUsername;
	private javax.swing.JLabel lblPwd;
	private javax.swing.JLabel lblLogin;
	private javax.swing.JTextField txtUsername;
	private javax.swing.JPasswordField txtPwd;
	private javax.swing.JToggleButton tglbtnShowHidePwd;
	private javax.swing.JPanel botPnl;
	private javax.swing.JButton btnLogin;
	private javax.swing.JButton btnReset;

	public static MainFrame frame;
	public static Vector<Integer> role;
	public static Account account = new Account();
}