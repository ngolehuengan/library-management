package main.java.com.library.GUI;

import main.java.com.library.GUI.librarian.MainFrame;

@SuppressWarnings("serial")
public class Login extends javax.swing.JFrame {
	/**
	 * Create the frame.
	 */
	public Login() {
		init();
	}

	private void init() {
		// ----------Frame----------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(550, 250, 439, 267);
		setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\sgu-logo.png"));
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
		javax.swing.JSeparator separator = new javax.swing.JSeparator();

		mainPnl = new javax.swing.JPanel();
		mainPnl.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(mainPnl, java.awt.BorderLayout.CENTER);

		lblUsername = new javax.swing.JLabel("Tên tài khoản");
		txtUsername = new javax.swing.JTextField();
		txtUsername.setColumns(10);

		lblPwd = new javax.swing.JLabel("Mật khẩu");
		txtPwd = new javax.swing.JPasswordField();

		tglbtnShowHidePwd = new javax.swing.JToggleButton(new javax.swing.ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\eye.png"));
		tglbtnShowHidePwd.setSelectedIcon(new javax.swing.ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\hidden.png"));
		tglbtnShowHidePwd.setBackground(new java.awt.Color(204, 255, 204));

		javax.swing.JSeparator separator_1 = new javax.swing.JSeparator();

		javax.swing.GroupLayout gl_mainPnl = new javax.swing.GroupLayout(mainPnl);
		gl_mainPnl.setHorizontalGroup(
				gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_mainPnl.createSequentialGroup()
								.addGap(68)
								.addGroup(gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addComponent(lblPwd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
								.addGap(38)
								.addGroup(gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 121,
												Short.MAX_VALUE)
										.addComponent(txtPwd, javax.swing.GroupLayout.Alignment.TRAILING))
								.addGap(18)
								.addComponent(tglbtnShowHidePwd, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(73))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_mainPnl.createSequentialGroup()
								.addGap(25)
								.addGroup(gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(separator_1, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
										.addComponent(separator, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE))
								.addGap(27)));
		gl_mainPnl.setVerticalGroup(
				gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_mainPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(24)
								.addGroup(gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblUsername)
										.addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(42)
								.addGroup(gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(gl_mainPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblPwd)
												.addComponent(txtPwd, javax.swing.GroupLayout.PREFERRED_SIZE,
														javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addComponent(tglbtnShowHidePwd))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
								.addComponent(separator_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap()));
		mainPnl.setLayout(gl_mainPnl);

		// Bottom Panel
		botPnl = new javax.swing.JPanel();
		botPnl.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(botPnl, java.awt.BorderLayout.SOUTH);

		btnLogin = new javax.swing.JButton("Đăng nhập");
		btnLogin.setForeground(new java.awt.Color(255, 255, 255));
		btnLogin.setBackground(new java.awt.Color(0, 153, 51));

		btnReset = new javax.swing.JButton("Reset");
		btnReset.setBackground(new java.awt.Color(0, 153, 51));
		btnReset.setForeground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout gl_botPnl = new javax.swing.GroupLayout(botPnl);
		gl_botPnl.setHorizontalGroup(
				gl_botPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_botPnl.createSequentialGroup()
								.addGap(128)
								.addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										Short.MAX_VALUE)
								.addGap(18)
								.addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
								.addGap(127)));
		gl_botPnl.setVerticalGroup(
				gl_botPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_botPnl.createSequentialGroup()
								.addGroup(gl_botPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(btnLogin)
										.addComponent(btnReset))
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		botPnl.setLayout(gl_botPnl);

		// Action
		tglbtnShowHidePwd.addActionListener(e -> {
			if (tglbtnShowHidePwd.isSelected())
				txtPwd.setEchoChar((char) 0);
			else
				txtPwd.setEchoChar('•');
		});

		btnLogin.addActionListener(e -> {
			MainFrame frame = new MainFrame();
			frame.setVisible(true);
			frame.setExtendedState(MAXIMIZED_BOTH);
			this.dispose();
		});

		btnReset.addActionListener(e -> {
			txtUsername.setText("");
			txtPwd.setText("");
		});
	}

	// ----------private----------
	private javax.swing.JPanel contentPane;
	private javax.swing.JPanel mainPnl;
	private javax.swing.JLabel lblUsername;
	private javax.swing.JLabel lblPwd;
	private javax.swing.JLabel lblLogin;
	private javax.swing.JTextField txtUsername;
	private javax.swing.JPasswordField txtPwd;
	private javax.swing.JToggleButton tglbtnShowHidePwd;
	private javax.swing.JPanel botPnl;
	private javax.swing.JButton btnLogin;
	private javax.swing.JButton btnReset;
}