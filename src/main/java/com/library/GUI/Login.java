package main.java.com.library.GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JToggleButton;

public class Login extends JFrame {
	/**
	 * Create the frame.
	 */
	public Login() {
		init();
	}

	private void init() {
		// ----------Frame----------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(550, 250, 439, 293);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\sgu-logo.png"));
		setTitle("THƯ VIỆN SGU");

		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		// ----------Elements----------
		lblLogin = new JLabel("ĐĂNG NHẬP");
		lblLogin.setForeground(new Color(0, 153, 0));
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 20));

		lblUsername = new JLabel("Tên tài khoản");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		username = new JTextField();
		username.setColumns(10);

		lblPassword = new JLabel("Mật khẩu");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		password = new JPasswordField();

		btnLogin = new JButton("Đăng nhập");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 153, 51));
		btnReset = new JButton("Xóa");
		btnReset.addActionListener(e -> {
			username.setText("");
			password.setText("");
			password.setEchoChar('•');
		});
		btnReset.setBackground(new Color(0, 153, 51));
		btnReset.setForeground(new Color(255, 255, 255));

		JToggleButton showPwdIcon = new JToggleButton(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\eye.png"));
		showPwdIcon.setSelectedIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\hidden.png"));
		showPwdIcon.setBackground(new Color(204, 255, 204));

		showPwdIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (showPwdIcon.isSelected()) {
					password.setEchoChar((char) 0);
				} else {
					password.setEchoChar((char) '•');
				}
			}
		});

		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
				groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(97)
								.addComponent(btnLogin, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addGap(26)
								.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(104, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(2)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(58)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(lblUsername)
														.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 59,
																GroupLayout.PREFERRED_SIZE))
												.addGap(58)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addGroup(groupLayout.createSequentialGroup()
																.addComponent(password, GroupLayout.PREFERRED_SIZE, 158,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(6)
																.addComponent(showPwdIcon, GroupLayout.DEFAULT_SIZE,
																		GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
														.addComponent(username, GroupLayout.PREFERRED_SIZE, 158,
																GroupLayout.PREFERRED_SIZE)))
										.addGroup(groupLayout.createSequentialGroup()
												.addGap(36)
												.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
														.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 336,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(separator, GroupLayout.PREFERRED_SIZE, 336,
																GroupLayout.PREFERRED_SIZE))))
								.addContainerGap())
						.addGroup(groupLayout.createSequentialGroup()
								.addGap(141)
								.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
								.addGap(152)));
		groupLayout.setVerticalGroup(
				groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblLogin, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
								.addGap(10)
								.addComponent(separator, GroupLayout.PREFERRED_SIZE, 16, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblUsername, GroupLayout.PREFERRED_SIZE, 18,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(username, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
												.addComponent(password, GroupLayout.PREFERRED_SIZE,
														GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
												.addComponent(lblPassword))
										.addComponent(showPwdIcon))
								.addGap(18)
								.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE, false)
										.addComponent(btnLogin)
										.addComponent(btnReset))
								.addGap(18)));
		contentPane.setLayout(groupLayout);
	}

	// ----------private----------
	private JPanel contentPane;
	private JSeparator separator = new JSeparator();
	private JSeparator separator_1 = new JSeparator();
	private JLabel lblLogin;
	private JLabel lblUsername;
	private JTextField username;
	private JLabel lblPassword;
	private JPasswordField password;
	private JButton btnLogin;
	private JButton btnReset;
	// private ;
}