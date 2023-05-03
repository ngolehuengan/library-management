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
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.Component;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

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
		setBounds(0, 0, 1264, 650);
		setIconImage(Toolkit.getDefaultToolkit().getImage(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\sgu-logo.png"));
		setTitle("THƯ VIỆN SGU");

		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		initHeader();
		initTab();
	}

	// ----------Header----------
	private void initHeader() {
		header = new JPanel();
		header.setBackground(new Color(204, 255, 204));
		contentPane.add(header, BorderLayout.NORTH);

		logo = new JLabel(new ImageIcon(
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

		mailIcon = new JLabel(new ImageIcon(
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

		ytbIcon = new JLabel(new ImageIcon(
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

		GroupLayout gl_header = new GroupLayout(header);
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

	// ----------Tab----------
	private void initTab() {
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(new Color(0, 153, 51));
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		// ----------General----------
		generalTab = new JPanel();
		tabbedPane.addTab("Chung", null, generalTab, null);

		initManageBook();
		initManageService();
		initManageReader();

		statisticalTab = new JPanel();
		tabbedPane.addTab("Thống Kê", null, statisticalTab, null);

		userTab = new JPanel();
		tabbedPane.addTab("Thông Tin Tài Khoản", null, userTab, null);

		JPanel panel = new JPanel();
		GroupLayout gl_userTab = new GroupLayout(userTab);
		gl_userTab.setHorizontalGroup(
				gl_userTab.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_userTab.createSequentialGroup()
								.addGap(111)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 1022, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(102, Short.MAX_VALUE)));
		gl_userTab.setVerticalGroup(
				gl_userTab.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_userTab.createSequentialGroup()
								.addGap(146)
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 199, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(165, Short.MAX_VALUE)));
		panel.setLayout(new CardLayout(0, 0));
		userTab.setLayout(gl_userTab);
	}

	private void handle() {
		handle = new JPanel();
		handle.setBorder(new TitledBorder(null, "Xử Lý", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		add = new JButton("Thêm");
		add.setForeground(new Color(255, 255, 255));
		add.setBackground(new Color(0, 153, 51));

		edit = new JButton("Chỉnh sửa");
		edit.setBackground(new Color(0, 153, 51));
		edit.setForeground(new Color(255, 255, 255));

		delete = new JButton("Xóa");
		delete.setForeground(new Color(255, 255, 255));
		delete.setBackground(new Color(0, 153, 51));

		search = new JButton("Tìm kiếm");
		search.setBackground(new Color(0, 153, 51));
		search.setForeground(new Color(255, 255, 255));
		searchField = new JTextField();
		searchField.setColumns(10);

		print = new JButton("  In");
		print.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\printing.png"));
		print.setBackground(new Color(0, 153, 51));
		print.setForeground(new Color(255, 255, 255));

		upload = new JButton("  Đăng tải");
		upload.setBackground(new Color(0, 153, 51));
		upload.setForeground(new Color(255, 255, 255));
		upload.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\upload.png"));

		download = new JButton("  Tải xuống");
		download.setIcon(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\downloads.png"));
		download.setForeground(new Color(255, 255, 255));
		download.setBackground(new Color(0, 153, 51));

		GroupLayout gl_handle = new GroupLayout(handle);
		gl_handle.setHorizontalGroup(
				gl_handle.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_handle.createSequentialGroup()
								.addContainerGap()
								.addComponent(add)
								.addGap(18)
								.addComponent(edit)
								.addGap(18)
								.addComponent(delete)
								.addGap(18)
								.addComponent(searchField, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(search)
								.addPreferredGap(ComponentPlacement.RELATED, 312, Short.MAX_VALUE)
								.addComponent(download)
								.addGap(18)
								.addComponent(upload)
								.addGap(18)
								.addComponent(print)
								.addContainerGap()));
		gl_handle.setVerticalGroup(
				gl_handle.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_handle.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_handle.createParallelGroup(Alignment.BASELINE)
										.addComponent(add)
										.addComponent(edit)
										.addComponent(delete)
										.addComponent(print)
										.addComponent(search)
										.addComponent(searchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(upload)
										.addComponent(download))
								.addContainerGap(20, Short.MAX_VALUE)));
		handle.setLayout(gl_handle);
	}

	// ----------Manage----------
	// ----------Manage Book----------
	private void initManageBook() {
		manageBookTab = new JPanel();
		manageBookTab.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Quản Lý Tài Liệu", null, manageBookTab, null);
		handle();
		
		JSplitPane splitPane = new JSplitPane();

		gl_table = new GroupLayout(manageBookTab);
		gl_table.setHorizontalGroup(
				gl_table.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_table.createParallelGroup(Alignment.TRAILING)
										.addComponent(handle, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 1225,
												Short.MAX_VALUE)
										.addComponent(splitPane, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 1215,
												Short.MAX_VALUE))
								.addGap(10)));
		gl_table.setVerticalGroup(
				gl_table.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addComponent(handle, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(splitPane, GroupLayout.PREFERRED_SIZE, 417, Short.MAX_VALUE)
								.addContainerGap()));
		//Menu Side
		JPanel menuSide = new JPanel();
		menuSide.setBackground(new Color(0, 153, 51));
		splitPane.setLeftComponent(menuSide);

		JButton btnAll = new JButton("TẤT CẢ");
		btnAll.setForeground(new Color(255, 255, 255));
		btnAll.setBackground(new Color(0, 153, 51));

		JButton btnBook = new JButton("SÁCH");
		btnBook.setForeground(new Color(255, 255, 255));
		btnBook.setBackground(new Color(0, 153, 51));

		JButton btnPhoto = new JButton("TÀI LIỆU PHOTO");
		btnPhoto.setForeground(new Color(255, 255, 255));
		btnPhoto.setBackground(new Color(0, 153, 51));

		JButton btnKltn = new JButton("LUẬN ÁN/ LUẬN VĂN/ KHÓA LUẬN TN");
		btnKltn.setForeground(new Color(255, 255, 255));
		btnKltn.setBackground(new Color(0, 153, 51));

		JButton btnOther = new JButton("KHÁC");
		btnOther.setForeground(new Color(255, 255, 255));
		btnOther.setBackground(new Color(0, 153, 51));
		
		GroupLayout gl_menuSide = new GroupLayout(menuSide);
		gl_menuSide.setHorizontalGroup(
			gl_menuSide.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuSide.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_menuSide.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBook, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnPhoto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnKltn, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnOther, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
						.addComponent(btnAll, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_menuSide.setVerticalGroup(
			gl_menuSide.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_menuSide.createSequentialGroup()
					.addGap(130)
					.addComponent(btnAll)
					.addGap(18)
					.addComponent(btnBook)
					.addGap(18)
					.addComponent(btnPhoto)
					.addGap(18)
					.addComponent(btnKltn)
					.addGap(18)
					.addComponent(btnOther)
					.addGap(108))
		);
		menuSide.setLayout(gl_menuSide);

		// Panels
		JPanel pnlCards = new JPanel();
		splitPane.setRightComponent(pnlCards);
		pnlCards.setLayout(new CardLayout(0, 0));
		JPanel bookDetail;
		GroupLayout gl_bookDetail;
		GroupLayout gl_pnlDefault;
		
		// Default Panels
		JPanel pnlDefault = new JPanel();
		pnlDefault.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnlDefault, "pnlDefault");

		bookDetail = new JPanel();
		bookDetail.setBorder(new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));

		gl_bookDetail = new GroupLayout(bookDetail);
		gl_bookDetail.setHorizontalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGap(0, 502, Short.MAX_VALUE)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(206)
								.addComponent(save, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(217, Short.MAX_VALUE)));
		gl_bookDetail.setVerticalGroup(
				gl_bookDetail.createParallelGroup(Alignment.TRAILING)
						.addGap(0, 179, Short.MAX_VALUE)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addContainerGap(116, Short.MAX_VALUE)
								.addComponent(save)
								.addGap(21)));
		bookDetail.setLayout(gl_bookDetail);

		scrollPane = new JScrollPane((Component) null);
		gl_pnlDefault = new GroupLayout(pnlDefault);
		gl_pnlDefault.setHorizontalGroup(
			gl_pnlDefault.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDefault.createSequentialGroup()
					.addComponent(bookDetail, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_pnlDefault.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDefault.createSequentialGroup()
							.addGap(235)
							.addComponent(view, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
							.addGap(228))
						.addGroup(gl_pnlDefault.createSequentialGroup()
							.addGap(6)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))))
		);
		gl_pnlDefault.setVerticalGroup(
			gl_pnlDefault.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlDefault.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(view)
					.addContainerGap())
				.addComponent(bookDetail, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
		);
		pnlDefault.setLayout(gl_pnlDefault);
		manageBookTab.setLayout(gl_table);
		
		// All Panels
		JPanel pnlAll = new JPanel();
		pnlAll.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnlAll, "pnlAll");

		bookDetail = new JPanel();
		bookDetail.setBorder(new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		save_1 = new JButton("Lưu");
		save_1.setBackground(new Color(0, 153, 51));
		save_1.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 204));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		JLabel lblNewLabel_12 = new JLabel("Nhan đề");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Loại tài liệu");
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Mã tài liệu");
		
		JLabel lblNewLabel_15 = new JLabel("Giá trị");
		
		JLabel lblNewLabel_16 = new JLabel("Số lượng");
		
		JLabel lblNewLabel_17 = new JLabel("Số có sẵn");
		
		JLabel lblNewLabel_18 = new JLabel("Cho phép mượn");
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);

		gl_bookDetail_1 = new GroupLayout(bookDetail);
		gl_bookDetail_1.setHorizontalGroup(
			gl_bookDetail_1.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_bookDetail_1.createSequentialGroup()
					.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail_1.createSequentialGroup()
							.addGap(208)
							.addComponent(save_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_bookDetail_1.createSequentialGroup()
							.addGap(81)
							.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_bookDetail_1.createSequentialGroup()
									.addComponent(panel, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_14, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_12, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_13))
									.addGap(18)
									.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.LEADING)
										.addComponent(textField)
										.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
										.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE)))
								.addGroup(gl_bookDetail_1.createSequentialGroup()
									.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_16, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_17, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblNewLabel_18, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
									.addGap(18)
									.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.LEADING)
										.addComponent(textField_6, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
										.addComponent(textField_5, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
										.addComponent(textField_4, GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
										.addComponent(textField_3))))))
					.addContainerGap(79, Short.MAX_VALUE))
		);
		gl_bookDetail_1.setVerticalGroup(
			gl_bookDetail_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_bookDetail_1.createSequentialGroup()
					.addGap(59)
					.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_bookDetail_1.createSequentialGroup()
							.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_14)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_13)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(24)
							.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_12)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_15)
						.addComponent(textField_6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_16)
						.addComponent(textField_5, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_17)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_bookDetail_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_18)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(199)
					.addComponent(save_1)
					.addGap(24))
		);
		
		JLabel lblNewLabel_11 = new JLabel("");
		lblNewLabel_11.setIcon(new ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addComponent(lblNewLabel_11, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
					.addGap(0))
		);
		panel.setLayout(gl_panel);
		bookDetail.setLayout(gl_bookDetail_1);

		scrollPane = new JScrollPane((Component) null);
		gl_pnlDefault = new GroupLayout(pnlAll);
		gl_pnlDefault.setHorizontalGroup(
			gl_pnlDefault.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlDefault.createSequentialGroup()
					.addComponent(bookDetail, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_pnlDefault.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnlDefault.createSequentialGroup()
							.addGap(235)
							.addComponent(view, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
							.addGap(228))
						.addGroup(gl_pnlDefault.createSequentialGroup()
							.addGap(6)
							.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))))
		);
		gl_pnlDefault.setVerticalGroup(
			gl_pnlDefault.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnlDefault.createSequentialGroup()
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(view)
					.addContainerGap())
				.addComponent(bookDetail, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
		);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table);
		pnlAll.setLayout(gl_pnlDefault);
		manageBookTab.setLayout(gl_table);
		
		// Change Tab
		cardLayout = new CardLayout();
		btnAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pnlCards, "pnlAll");
			}
		});
		btnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pnlCards, "pnlAll");
			}
		});
		cardLayout = (CardLayout)pnlCards.getLayout();
	}

	// ----------Manage Service----------
	private void initManageService() {
		manageServiceTab = new JPanel();
		manageServiceTab.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Quản Lý Mượn Trả", null, manageServiceTab, null);
		handle();

		// ----------Details----------
		JPanel bookDetail = new JPanel();
		bookDetail.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JLabel lblNewLabel = new JLabel("Mã độc giả");
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		JLabel lblNewLabel_2 = new JLabel("CMND/CCCD");
		JLabel lblNewLabel_3 = new JLabel("Ngày sinh");
		JLabel lblNewLabel_4 = new JLabel("Địa chỉ");
		JLabel lblNewLabel_5 = new JLabel("Email");
		JLabel lblNewLabel_6 = new JLabel("Khoa");
		JLabel lblNewLabel_7 = new JLabel("Loại độc giả");
		JLabel lblNewLabel_8 = new JLabel("MSSV/CBGV");

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		JLabel lblNewLabel_9 = new JLabel("Người lập");

		JLabel lblNewLabel_10 = new JLabel("Ngày lập thẻ");

		GroupLayout gl_bookDetail = new GroupLayout(bookDetail);
		gl_bookDetail.setHorizontalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(212)
								.addComponent(save)
								.addContainerGap(220, Short.MAX_VALUE))
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_bookDetail.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap(388, Short.MAX_VALUE)));
		gl_bookDetail.setVerticalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(43)
								.addComponent(lblNewLabel)
								.addGap(18)
								.addComponent(lblNewLabel_1)
								.addGap(18)
								.addComponent(lblNewLabel_2)
								.addGap(18)
								.addComponent(lblNewLabel_3)
								.addGap(18)
								.addComponent(lblNewLabel_4)
								.addGap(18)
								.addComponent(lblNewLabel_5)
								.addGap(18)
								.addComponent(lblNewLabel_7)
								.addGap(18)
								.addComponent(lblNewLabel_8)
								.addGap(18)
								.addComponent(lblNewLabel_6)
								.addGap(18)
								.addComponent(lblNewLabel_9)
								.addGap(18)
								.addComponent(lblNewLabel_10)
								.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
								.addComponent(save)
								.addContainerGap()));
		bookDetail.setLayout(gl_bookDetail);

		// ----------Table----------
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null }
				},
				new String[] {
						"STT", "CMND", "About"
				}));
		scrollPane = new JScrollPane(table);
		gl_table = new GroupLayout(manageServiceTab);
		gl_table.setHorizontalGroup(
				gl_table.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_table.createParallelGroup(Alignment.LEADING)
										.addComponent(handle, GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
										.addGroup(Alignment.TRAILING, gl_table.createSequentialGroup()
												.addComponent(bookDetail, GroupLayout.PREFERRED_SIZE, 502,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 695,
														Short.MAX_VALUE)))
								.addContainerGap()));
		gl_table.setVerticalGroup(
				gl_table.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addComponent(handle, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_table.createParallelGroup(Alignment.TRAILING)
										.addComponent(bookDetail, 0, 0, Short.MAX_VALUE)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
								.addContainerGap()));
		manageServiceTab.setLayout(gl_table);
	}

	// ----------Manage Reader----------
	private void initManageReader() {
		manageReaderTab = new JPanel();
		manageReaderTab.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Quản Lý Độc Giả", null, manageReaderTab, null);
		handle();

		// ----------Details----------
		JPanel bookDetail = new JPanel();
		bookDetail.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JLabel lblNewLabel = new JLabel("Mã độc giả");
		JLabel lblNewLabel_1 = new JLabel("Họ và tên");
		JLabel lblNewLabel_2 = new JLabel("CMND/CCCD");
		JLabel lblNewLabel_3 = new JLabel("Ngày sinh");
		JLabel lblNewLabel_4 = new JLabel("Địa chỉ");
		JLabel lblNewLabel_5 = new JLabel("Email");
		JLabel lblNewLabel_6 = new JLabel("Khoa");
		JLabel lblNewLabel_7 = new JLabel("Loại độc giả");
		JLabel lblNewLabel_8 = new JLabel("MSSV/CBGV");

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		JLabel lblNewLabel_9 = new JLabel("Người lập");

		JLabel lblNewLabel_10 = new JLabel("Ngày lập thẻ");

		GroupLayout gl_bookDetail = new GroupLayout(bookDetail);
		gl_bookDetail.setHorizontalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(212)
								.addComponent(save)
								.addContainerGap(220, Short.MAX_VALUE))
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_bookDetail.createParallelGroup(Alignment.LEADING, false)
										.addComponent(lblNewLabel_8, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_9, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(lblNewLabel_10, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addContainerGap(388, Short.MAX_VALUE)));
		gl_bookDetail.setVerticalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(43)
								.addComponent(lblNewLabel)
								.addGap(18)
								.addComponent(lblNewLabel_1)
								.addGap(18)
								.addComponent(lblNewLabel_2)
								.addGap(18)
								.addComponent(lblNewLabel_3)
								.addGap(18)
								.addComponent(lblNewLabel_4)
								.addGap(18)
								.addComponent(lblNewLabel_5)
								.addGap(18)
								.addComponent(lblNewLabel_7)
								.addGap(18)
								.addComponent(lblNewLabel_8)
								.addGap(18)
								.addComponent(lblNewLabel_6)
								.addGap(18)
								.addComponent(lblNewLabel_9)
								.addGap(18)
								.addComponent(lblNewLabel_10)
								.addPreferredGap(ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
								.addComponent(save)
								.addContainerGap()));
		bookDetail.setLayout(gl_bookDetail);

		// ----------Table----------
		table = new JTable();
		table.setModel(new DefaultTableModel(
				new Object[][] {
						{ null, null, null },
						{ null, null, null },
						{ null, null, null },
						{ null, null, null }
				},
				new String[] {
						"STT", "CMND", "About"
				}));
		scrollPane = new JScrollPane(table);
		gl_table = new GroupLayout(manageReaderTab);
		gl_table.setHorizontalGroup(
				gl_table.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_table.createParallelGroup(Alignment.LEADING)
										.addComponent(handle, GroupLayout.DEFAULT_SIZE, 1215, Short.MAX_VALUE)
										.addGroup(Alignment.TRAILING, gl_table.createSequentialGroup()
												.addComponent(bookDetail, GroupLayout.PREFERRED_SIZE, 502,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 695,
														Short.MAX_VALUE)))
								.addContainerGap()));
		gl_table.setVerticalGroup(
				gl_table.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addComponent(handle, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(gl_table.createParallelGroup(Alignment.TRAILING)
										.addComponent(bookDetail, 0, 0, Short.MAX_VALUE)
										.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
								.addContainerGap()));
		manageReaderTab.setLayout(gl_table);
	}

	// ----------private----------
	private JPanel contentPane;
	private JPanel header;
	private JLabel logo;
	private JLabel lblLinkWeb;
	private JLabel lblLinkTTDT;
	private JLabel lblLinkMail;
	private JLabel fbIcon;
	private JLabel mailIcon;
	private JLabel ytbIcon;

	private JTabbedPane tabbedPane;
	private JPanel generalTab;
	private JPanel manageBookTab;
	private JPanel manageServiceTab;
	private JPanel manageReaderTab;
	private JPanel statisticalTab;
	private JPanel userTab;

	private GroupLayout gl_table;
	private JScrollPane scrollPane;
	private JTable table;
	private JPanel handle;
	private JButton add;
	private JButton edit;
	private JButton delete;
	private JButton search;
	private JTextField searchField;
	private JButton download;
	private JButton upload;
	private JButton print;
	private JButton save;
	private JButton save_1;
	private JButton view;
	
	private CardLayout cardLayout;
	private GroupLayout gl_bookDetail_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
}