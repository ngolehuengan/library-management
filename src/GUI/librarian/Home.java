package GUI.librarian;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.EmptyBorder;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Home extends JFrame {
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		init();
	}

	private void init() {
		// ----------Frame----------
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1254, 555);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\sgu-logo.png"));
		setTitle("THƯ VIỆN SGU");

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		initMenuBar();
		initHeader();
	}

	// ----------Menu Bar----------
	private void initMenuBar() {
		menuBar = new JMenuBar();
		menuBar.setBackground(new Color(0, 153, 51));
		setJMenuBar(menuBar);

		mnInfo = new JMenu("Giới Thiệu");
		mnInfo.setForeground(new Color(255, 255, 255));
		mnInfo.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnInfo);

		mntmInfoRule = new JMenuItem("Nội Quy");
		mnInfo.add(mntmInfoRule);

		mntmInfoMap = new JMenuItem("Sơ Đồ Bố Trí");
		mnInfo.add(mntmInfoMap);

		mntmInfoService = new JMenuItem("Dịch Vụ Cung Cấp");
		mnInfo.add(mntmInfoService);

		mntmInfoNoti = new JMenuItem("Thông Báo");
		mnInfo.add(mntmInfoNoti);

		// ---------------------------------------------------
		mnBook = new JMenu("Quản Lý Tài Liệu");
		mnBook.setForeground(new Color(255, 255, 255));
		mnBook.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnBook);

		mntmNewMenuItem_1 = new JMenuItem("Tài Liệu");
		mnBook.add(mntmNewMenuItem_1);

		mntmNewMenuItem = new JMenuItem("Thanh Lý");
		mnBook.add(mntmNewMenuItem);

		// ---------------------------------------------------
		mnService = new JMenu("Quản Lý Mượn Trả");
		mnService.setForeground(new Color(255, 255, 255));
		mnService.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnService);

		mntmServiceOnl = new JMenuItem("Đọc Online");
		mnService.add(mntmServiceOnl);

		mntmServiceOff = new JMenuItem("Mượn Sách");
		mnService.add(mntmServiceOff);

		// ---------------------------------------------------
		mnNewMenu = new JMenu("Quản Lý Độc Giả");
		mnNewMenu.setBackground(new Color(0, 153, 51));
		mnNewMenu.setForeground(new Color(255, 255, 255));
		mnNewMenu.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnNewMenu);

		mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem_2);

		// ---------------------------------------------------
		mnNewMenu_1 = new JMenu("Thống Kê");
		mnNewMenu_1.setBackground(new Color(0, 153, 51));
		mnNewMenu_1.setForeground(new Color(255, 255, 255));
		mnNewMenu_1.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnNewMenu_1);

		mntmNewMenuItem_3 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_3);

		// ---------------------------------------------------
		mnUser = new JMenu("Tài Khoản");
		mnUser.setForeground(new Color(255, 255, 255));
		mnUser.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnUser);

		mntmUserInfo = new JMenuItem("Thông Tin Cá Nhân");
		mnUser.add(mntmUserInfo);

		mntmUserSetting = new JMenuItem("Cài Đặt");
		mnUser.add(mntmUserSetting);

		mntmUserLogout = new JMenuItem("Đăng Xuất");
		mnUser.add(mntmUserLogout);
	}

	// ----------Header----------
	private void initHeader() {
		header = new JPanel();
		header.setBackground(new Color(204, 255, 204));
		contentPane.add(header, BorderLayout.NORTH);

		logo = new JLabel("");
		logo.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\header-logo.png"));

		lblLinkWeb = new JLabel("Website-SGU");
		lblLinkWeb.setForeground(new Color(0, 51, 153));
		lblLinkWeb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://sgu.edu.vn/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		lblLinkTTDT = new JLabel("Thông Tin Đào Tạo");
		lblLinkTTDT.setForeground(new Color(0, 51, 153));
		lblLinkTTDT.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("http://thongtindaotao.sgu.edu.vn/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		lblLinkMail = new JLabel("Web-mail");
		lblLinkMail.setForeground(new Color(0, 51, 153));
		lblLinkMail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("http://mail.lib.sgu.edu.vn:3000/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		fbIcon = new JLabel("");
		fbIcon.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\facebook.png"));
		fbIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.facebook.com/trungtamhoclieusgu"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		mailIcon = new JLabel("");
		mailIcon.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\mail.png"));
		mailIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://mail.google.com/"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		ytbIcon = new JLabel("");
		ytbIcon.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\youtube.png"));
		ytbIcon.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().browse(new URI("https://www.youtube.com/@TuoitreaihocSaiGon"));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		// ----------Frame----------
		gl_header = new GroupLayout(header);
		gl_header.setHorizontalGroup(
				gl_header.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_header.createSequentialGroup()
								.addComponent(logo, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
								.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
										.addGroup(Alignment.TRAILING, gl_header.createSequentialGroup()
												.addComponent(lblLinkWeb, GroupLayout.PREFERRED_SIZE, 102,
														GroupLayout.PREFERRED_SIZE)
												.addGap(37)
												.addComponent(lblLinkTTDT, GroupLayout.PREFERRED_SIZE, 120,
														GroupLayout.PREFERRED_SIZE)
												.addGap(43)
												.addComponent(lblLinkMail, GroupLayout.PREFERRED_SIZE, 63,
														GroupLayout.PREFERRED_SIZE)
												.addGap(127))
										.addGroup(Alignment.TRAILING, gl_header.createSequentialGroup()
												.addComponent(fbIcon, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(36)
												.addComponent(mailIcon, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(38)
												.addComponent(ytbIcon, GroupLayout.PREFERRED_SIZE, 45,
														GroupLayout.PREFERRED_SIZE)
												.addGap(182)))));
		gl_header.setVerticalGroup(
				gl_header.createParallelGroup(Alignment.TRAILING)
						.addComponent(logo, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
						.addGroup(Alignment.LEADING, gl_header.createSequentialGroup()
								.addGap(22)
								.addGroup(gl_header.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblLinkTTDT)
										.addComponent(lblLinkMail)
										.addComponent(lblLinkWeb))
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
										.addComponent(fbIcon)
										.addComponent(ytbIcon)
										.addComponent(mailIcon))
								.addContainerGap(15, Short.MAX_VALUE)));
		header.setLayout(gl_header);
	}

	// ----------private----------
	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenu mnInfo;
	private JMenuItem mntmInfoRule;
	private JMenuItem mntmInfoMap;
	private JMenuItem mntmInfoService;

	private JMenu mnBook;

	private JMenu mnService;
	private JMenuItem mntmServiceOnl;
	private JMenuItem mntmServiceOff;

	private JMenu mnUser;
	private JMenuItem mntmUserInfo;
	private JMenuItem mntmUserSetting;
	private JMenuItem mntmUserLogout;
	private JMenuItem mntmInfoNoti;
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;

	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;

	private GroupLayout gl_header;
	private JPanel header;
	private JLabel logo;
	private JLabel lblLinkWeb;
	private JLabel lblLinkTTDT;
	private JLabel lblLinkMail;
	private JLabel fbIcon;
	private JLabel mailIcon;
	private JLabel ytbIcon;
}