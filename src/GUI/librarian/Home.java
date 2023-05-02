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
		setBounds(0, 0, 1254, 650);
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
		upload.setIcon(new ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\upload.png"));
		
		download = new JButton("  Tải xuống");
		download.setIcon(new ImageIcon("C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\downloads.png"));
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
					.addContainerGap())
		);
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
						.addComponent(searchField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(upload)
						.addComponent(download))
					.addContainerGap(20, Short.MAX_VALUE))
		);
		handle.setLayout(gl_handle);
	}

	// ----------Manage----------
	// ----------Manage Book----------
	private void initManageBook() {
		manageBookTab = new JPanel();
		manageBookTab.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Quản Lý Tài Liệu", null, manageBookTab, null);
		handle();

		// ----------Details----------
		JPanel bookDetail = new JPanel();
		bookDetail.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JLabel lblNewLabel = new JLabel("ISBN: ");
		JLabel lblNewLabel_1 = new JLabel("Tên sách:");
		JLabel lblNewLabel_2 = new JLabel("Thể loại:");
		JLabel lblNewLabel_3 = new JLabel("Tác giả:");
		JLabel lblNewLabel_4 = new JLabel("Năm xuất bản:");
		JLabel lblNewLabel_5 = new JLabel("Nhà xuất bản:");
		JLabel lblNewLabel_6 = new JLabel("Người tiếp nhận:");
		JLabel lblNewLabel_7 = new JLabel("Ngày nhập:");
		JLabel lblNewLabel_8 = new JLabel("Trị giá:");

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		GroupLayout gl_bookDetail = new GroupLayout(bookDetail);
		gl_bookDetail.setHorizontalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_bookDetail.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(gl_bookDetail.createSequentialGroup()
												.addGroup(gl_bookDetail.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel_7, Alignment.LEADING)
														.addComponent(lblNewLabel_8, Alignment.LEADING))
												.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
								.addGap(316))
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(212)
								.addComponent(save)
								.addContainerGap(220, Short.MAX_VALUE)));
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
								.addPreferredGap(ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
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
						"STT", "ID", "About"
				}));
		scrollPane = new JScrollPane(table);

		gl_table = new GroupLayout(manageBookTab);
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
		manageBookTab.setLayout(gl_table);
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
		JLabel lblNewLabel = new JLabel("ISBN: ");
		JLabel lblNewLabel_1 = new JLabel("Tên sách:");
		JLabel lblNewLabel_2 = new JLabel("Thể loại:");
		JLabel lblNewLabel_3 = new JLabel("Tác giả:");
		JLabel lblNewLabel_4 = new JLabel("Năm xuất bản:");
		JLabel lblNewLabel_5 = new JLabel("Nhà xuất bản:");
		JLabel lblNewLabel_6 = new JLabel("Người tiếp nhận:");
		JLabel lblNewLabel_7 = new JLabel("Ngày nhập:");
		JLabel lblNewLabel_8 = new JLabel("Trị giá:");

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		GroupLayout gl_bookDetail = new GroupLayout(bookDetail);
		gl_bookDetail.setHorizontalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_bookDetail.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(gl_bookDetail.createSequentialGroup()
												.addGroup(gl_bookDetail.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel_7, Alignment.LEADING)
														.addComponent(lblNewLabel_8, Alignment.LEADING))
												.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
								.addGap(316))
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(212)
								.addComponent(save)
								.addContainerGap(220, Short.MAX_VALUE)));
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
								.addPreferredGap(ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
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

	// ----------Manage Service----------
	private void initManageReader() {
		manageReaderTab = new JPanel();
		manageReaderTab.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Quản Lý Độc Giả", null, manageReaderTab, null);
		handle();

		// ----------Details----------
		JPanel bookDetail = new JPanel();
		bookDetail.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		JLabel lblNewLabel = new JLabel("ISBN: ");
		JLabel lblNewLabel_1 = new JLabel("Tên sách:");
		JLabel lblNewLabel_2 = new JLabel("Thể loại:");
		JLabel lblNewLabel_3 = new JLabel("Tác giả:");
		JLabel lblNewLabel_4 = new JLabel("Năm xuất bản:");
		JLabel lblNewLabel_5 = new JLabel("Nhà xuất bản:");
		JLabel lblNewLabel_6 = new JLabel("Người tiếp nhận:");
		JLabel lblNewLabel_7 = new JLabel("Ngày nhập:");
		JLabel lblNewLabel_8 = new JLabel("Trị giá:");

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		GroupLayout gl_bookDetail = new GroupLayout(bookDetail);
		gl_bookDetail.setHorizontalGroup(
				gl_bookDetail.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(33)
								.addGroup(gl_bookDetail.createParallelGroup(Alignment.LEADING)
										.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_5, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
										.addComponent(lblNewLabel_6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(gl_bookDetail.createSequentialGroup()
												.addGroup(gl_bookDetail.createParallelGroup(Alignment.TRAILING)
														.addComponent(lblNewLabel_7, Alignment.LEADING)
														.addComponent(lblNewLabel_8, Alignment.LEADING))
												.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE))
										.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
								.addGap(316))
						.addGroup(gl_bookDetail.createSequentialGroup()
								.addGap(212)
								.addComponent(save)
								.addContainerGap(220, Short.MAX_VALUE)));
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
								.addPreferredGap(ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
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
	private JButton download;
	private JButton upload;
	private JButton print;
	private JButton save;
	private JTextField searchField;

}