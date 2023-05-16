package main.java.com.library.GUI;

import java.util.Vector;

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

		java.awt.GridBagLayout gbl_mainFormPnl = new java.awt.GridBagLayout();
		mainFormPnl.setLayout(gbl_mainFormPnl);

		lblUsername = new javax.swing.JLabel("Tên tài khoản");
		lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		java.awt.GridBagConstraints gbc_lblUsername = new java.awt.GridBagConstraints();
		gbc_lblUsername.fill = java.awt.GridBagConstraints.BOTH;
		gbc_lblUsername.insets = new java.awt.Insets(0, 20, 20, 0);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 0;
		mainFormPnl.add(lblUsername, gbc_lblUsername);

		txtUsername = new javax.swing.JTextField();
		java.awt.GridBagConstraints gbc_txtUsername = new java.awt.GridBagConstraints();
		gbc_txtUsername.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.insets = new java.awt.Insets(0, 20, 20, 20);
		gbc_txtUsername.gridx = 1;
		gbc_txtUsername.gridy = 0;
		mainFormPnl.add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(15);

		lblPwd = new javax.swing.JLabel("Mật khẩu");
		lblPwd.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
		java.awt.GridBagConstraints gbc_lblPwd = new java.awt.GridBagConstraints();
		gbc_lblPwd.fill = java.awt.GridBagConstraints.BOTH;
		gbc_lblPwd.insets = new java.awt.Insets(0, 20, 0, 0);
		gbc_lblPwd.gridx = 0;
		gbc_lblPwd.gridy = 1;
		mainFormPnl.add(lblPwd, gbc_lblPwd);

		txtPwd = new javax.swing.JPasswordField();
		java.awt.GridBagConstraints gbc_txtPwd = new java.awt.GridBagConstraints();
		gbc_txtPwd.fill = java.awt.GridBagConstraints.HORIZONTAL;
		gbc_txtPwd.insets = new java.awt.Insets(0, 20, 0, 20);
		gbc_txtPwd.gridx = 1;
		gbc_txtPwd.gridy = 1;
		mainFormPnl.add(txtPwd, gbc_txtPwd);

		tglbtnShowHidePwd = new javax.swing.JToggleButton(
				new javax.swing.ImageIcon(this.getClass().getResource("../../../resources/icons/eye.png")));
		tglbtnShowHidePwd.setSelectedIcon(
				new javax.swing.ImageIcon(this.getClass().getResource("../../../resources/icons/hidden.png")));
		tglbtnShowHidePwd.setBackground(new java.awt.Color(204, 255, 204));
		java.awt.GridBagConstraints gbc_tglbtnShowHidePwd = new java.awt.GridBagConstraints();
		gbc_tglbtnShowHidePwd.gridx = 2;
		gbc_tglbtnShowHidePwd.gridy = 1;
		mainFormPnl.add(tglbtnShowHidePwd, gbc_tglbtnShowHidePwd);

		// Bottom Panel
		botPnl = new javax.swing.JPanel();
		botPnl.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(botPnl, java.awt.BorderLayout.SOUTH);

		btnLogin = new javax.swing.JButton("Đăng nhập");
		btnLogin.setForeground(new java.awt.Color(255, 255, 255));
		btnLogin.setBackground(new java.awt.Color(0, 153, 51));
		botPnl.add(btnLogin);

		btnReset = new javax.swing.JButton("Reset");
		btnReset.setBackground(new java.awt.Color(0, 153, 51));
		btnReset.setForeground(new java.awt.Color(255, 255, 255));
		botPnl.add(btnReset);

		// Action
		this.getRootPane().setDefaultButton(btnLogin);

		tglbtnShowHidePwd.addActionListener(e -> {
			if (tglbtnShowHidePwd.isSelected())
				txtPwd.setEchoChar((char) 0);
			else
				txtPwd.setEchoChar('•');
		});

		btnLogin.addActionListener(e -> {
//			StringBuilder sb = new StringBuilder();
//			if (txtUsername.getText().equals(""))
//				sb.append("Tên tài khoản không hợp lệ !\n");
//			if (new String(txtPwd.getPassword()).equals(""))
//				sb.append("Mật khẩu không hợp lệ !\n");
//			if (sb.length() > 0) {
//				javax.swing.JOptionPane.showMessageDialog(this, sb.toString(), "ERROR",
//						javax.swing.JOptionPane.ERROR_MESSAGE);
//				return;
//			} 
//                        else {
//				// check role
//				Account account = new Account();
//				account.setUsername(txtUsername.getText());
//				account.setPassword(new String(txtPwd.getPassword()));
//                                
//				
//                                try{
//                                    role = AccountBUS.login(account);
//                                    
//                                } 
//                                catch(Exception exception){
//                                    
//                                }
//
//				
//
//				if (role.get(0) == 0){
//					javax.swing.JOptionPane.showMessageDialog(this, "Tên tài khoản hoặc mật khẩu không chính xác", "ERROR",
//					javax.swing.JOptionPane.ERROR_MESSAGE);
//				return;
//				}
//				if(role.get(1) == 1){
					frame = new main.java.com.library.GUI.role.admin.MainFrame();
					frame.setVisible(true);
					frame.setExtendedState(MAXIMIZED_BOTH);
					this.dispose();
//				}
//				else {
//					frame1 = new main.java.com.library.GUI.role.librarian.MainFrame();
//					frame1.setVisible(true);
//					frame1.setExtendedState(MAXIMIZED_BOTH);
//					this.dispose();
//				}
//
//
//			}
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
	
	public static main.java.com.library.GUI.role.admin.MainFrame frame;
	public static main.java.com.library.GUI.role.librarian.MainFrame frame1;
	public static Vector<Integer> role ;
}