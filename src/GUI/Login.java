package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Login extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Login().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		init();
	}

	private void init() {
		// ----------Frame----------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(550, 250, 439, 293);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\sgu-logo.png"));
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

		chckbxRememberMe = new JCheckBox("Nhớ mật khẩu ?");
		chckbxRememberMe.setBackground(new Color(204, 255, 204));

		btnLogin = new JButton("Đăng nhập");
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setBackground(new Color(0, 153, 51));
		btnReset = new JButton("Xóa");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				username.setText("");
				password.setText("");
				password.setEchoChar('•');
			}
		});
		btnReset.setBackground(new Color(0, 153, 51));
		btnReset.setForeground(new Color(255, 255, 255));

		JLabel showPwdIcon = new JLabel("");
		showPwdIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				password.setEchoChar((char) 0);
			}
		});
		showPwdIcon.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\eye.png"));

		GroupLayout groupLayout = new GroupLayout(contentPane);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(97)
					.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
					.addGap(26)
					.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
					.addGap(104))
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(58)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
									.addGap(19))
								.addComponent(lblUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addGap(58)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(username)
								.addComponent(password, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
								.addComponent(chckbxRememberMe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(showPwdIcon, GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(36)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(separator, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
								.addComponent(separator_1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE))))
					.addGap(43))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(141)
					.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(152))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblLogin, GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
					.addGap(10)
					.addComponent(separator, GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
					.addGap(2)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(2)
									.addComponent(username))
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblUsername, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
							.addGap(34)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addComponent(password)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(3)
									.addComponent(lblPassword, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
						.addComponent(showPwdIcon))
					.addGap(18)
					.addComponent(chckbxRememberMe)
					.addGap(17)
					.addComponent(separator_1, GroupLayout.PREFERRED_SIZE, 6, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnLogin, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(18))
		);
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
	private JCheckBox chckbxRememberMe;
	private JButton btnLogin;
	private JButton btnReset;
}