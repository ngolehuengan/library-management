package GUI.reader;

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
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Home extends JFrame {
	// ----------private----------
	private JPanel contentPane;

	private JMenuBar menuBar;
	private JMenu mnInfo;
	private JMenuItem mntmInfoRule;
	private JMenuItem mntmInfoMap;
	private JMenuItem mntmInfoService;
	private JMenuItem mntmInfoNoti;

	private JMenu mnBook;
	private JMenuItem mntmBookAll;
	private JMenuItem mntmBookTop;
	private JMenuItem mntmBookNew;
	private JMenuItem mntmBookDocument;
	private JMenuItem mntmBookSpecial;
	private JMenuItem mntmBookSearch;

	private JMenu mnService;
	private JMenuItem mntmServiceOnl;
	private JMenuItem mntmServiceOff;

	private JMenu mnUser;
	private JMenuItem mntmUserInfo;
	private JMenuItem mntmUserSetting;
	private JMenuItem mntmUserLogout;

	private GroupLayout gl_header;
	private JPanel header;
	private JLabel logo;
	private JLabel lblLinkWeb;
	private JLabel lblLinkTTDT;
	private JLabel lblLinkMail;

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

		// ----------Menu Bar----------
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
		mnBook = new JMenu("Tài Liệu");
		mnBook.setForeground(new Color(255, 255, 255));
		mnBook.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnBook);

		mntmBookAll = new JMenuItem("Tất Cả");
		mnBook.add(mntmBookAll);

		mntmBookTop = new JMenuItem("Đề Xuất");
		mnBook.add(mntmBookTop);

		mntmBookNew = new JMenuItem("Mới");
		mnBook.add(mntmBookNew);

		mnBook.addSeparator();

		mntmBookDocument = new JMenuItem("Luận Văn - Luận Án - Đề Tài NCKH");
		mnBook.add(mntmBookDocument);

		mntmBookSpecial = new JMenuItem("Phân Loại Môn - Ngành");
		mnBook.add(mntmBookSpecial);

		mnBook.addSeparator();

		mntmBookSearch = new JMenuItem("Tra Cứu");
		mnBook.add(mntmBookSearch);

		// ---------------------------------------------------
		mnService = new JMenu("Dịch Vụ");
		mnService.setForeground(new Color(255, 255, 255));
		mnService.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnService);

		mntmServiceOnl = new JMenuItem("Đọc Online");
		mnService.add(mntmServiceOnl);

		mntmServiceOff = new JMenuItem("Mượn Sách");
		mnService.add(mntmServiceOff);

		// ---------------------------------------------------
		mnUser = new JMenu("Tài Khoản");
		mnUser.setForeground(new Color(255, 255, 255));
		mnUser.setBorder(new EmptyBorder(5, 25, 5, 25));
		menuBar.add(mnUser);

		mntmUserInfo = new JMenuItem("Thông Tin Tài Khoản");
		mnUser.add(mntmUserInfo);

		mntmUserSetting = new JMenuItem("Cài Đặt");
		mnUser.add(mntmUserSetting);

		mntmUserLogout = new JMenuItem("Đăng Xuất");
		mnUser.add(mntmUserLogout);

		// ----------Header----------
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

		// ----------Frame----------
		gl_header = new GroupLayout(header);
		gl_header.setHorizontalGroup(
				gl_header.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_header.createSequentialGroup()
								.addComponent(logo, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
								.addComponent(lblLinkWeb, GroupLayout.PREFERRED_SIZE, 102, GroupLayout.PREFERRED_SIZE)
								.addGap(39)
								.addComponent(lblLinkTTDT, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
								.addGap(49)
								.addComponent(lblLinkMail, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
								.addGap(119)));
		gl_header.setVerticalGroup(
				gl_header.createParallelGroup(Alignment.TRAILING)
						.addComponent(logo, GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
						.addGroup(gl_header.createSequentialGroup()
								.addContainerGap(32, Short.MAX_VALUE)
								.addGroup(gl_header.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblLinkMail)
										.addComponent(lblLinkWeb)
										.addComponent(lblLinkTTDT))
								.addGap(28)));
		header.setLayout(gl_header);
	}
}