package main.java.com.library.GUI.librarian;

import static javax.swing.SwingConstants.TOP;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
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
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import java.awt.Component;
import java.awt.CardLayout;
import java.awt.event.ComponentListener;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

@SuppressWarnings("serial")
public class Home extends JFrame {
	/**
	 * Create the frame.
	 */
	public Home() {
		init();
	}

	private void init() {
		// ----------Frame----------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 1264, 810);
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

		JLabel logo = new JLabel(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\header-logo.png"));

		JLabel lblLinkWeb = new JLabel("Website-SGU");
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

		JLabel lblLinkTTDT = new JLabel("Thông Tin Đào Tạo");
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

		JLabel lblLinkMail = new JLabel("Web-mail");
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

		JLabel fbIcon = new JLabel(new ImageIcon(
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

		JLabel mailIcon = new JLabel(new ImageIcon(
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

		JLabel ytbIcon = new JLabel(new ImageIcon(
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
		tabbedPane = new JTabbedPane(TOP);
		tabbedPane.setForeground(new Color(255, 255, 255));
		tabbedPane.setBackground(new Color(0, 153, 51));
		contentPane.add(tabbedPane, BorderLayout.CENTER);

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

	private void addImageBook(JPanel imgPnl, JLabel img) {
		removeClickListener(imgPnl);
		imgPnl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Change image book using dialog
				imgChooser = new JFileChooser();
				imgFilter = new FileNameExtensionFilter("image", "jpg", "png");
				imgChooser.setFileFilter(imgFilter);
				imgChooser.setMultiSelectionEnabled(false);

				if (imgChooser.showDialog(imgChooser, "Choose Image") == JFileChooser.APPROVE_OPTION) {
					File f = imgChooser.getSelectedFile();
					img.setIcon(new ImageIcon(f.getAbsolutePath()));
				}
			}
		});
	}

	private void removeClickListener(JComponent jComponent) {
		ComponentListener[] cls = jComponent.getComponentListeners();
		if (cls != null)
			for (ComponentListener cl : cls)
				jComponent.removeComponentListener(cl);

		MouseListener[] mls = jComponent.getMouseListeners();
		if (mls != null)
			for (MouseListener ml : mls)
				jComponent.removeMouseListener(ml);
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
		// Menu Side
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
										.addComponent(btnBook, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 107,
												Short.MAX_VALUE)
										.addComponent(btnPhoto, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnKltn, GroupLayout.PREFERRED_SIZE, 107, Short.MAX_VALUE)
										.addComponent(btnOther, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
										.addComponent(btnAll, GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
								.addContainerGap()));
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
								.addGap(108)));
		menuSide.setLayout(gl_menuSide);

		pnlCards = new JPanel();
		splitPane.setRightComponent(pnlCards);
		pnlCards.setLayout(new CardLayout(0, 0));
		manageBookPanels();

		// Change Tab
		cardLayout = new CardLayout();
		btnAll.addActionListener(e -> {
			manageBookAll();
			cardLayout.show(pnlCards, "pnlAll");
		});
		btnBook.addActionListener(e -> {
			manageBookBook();
			cardLayout.show(pnlCards, "pnlBook");
		});
		btnPhoto.addActionListener(e -> {
			manageBookPhoto();
			cardLayout.show(pnlCards, "pnlPhoto");
		});
		btnKltn.addActionListener(e -> {
			manageBookKltn();
			cardLayout.show(pnlCards, "pnlKltn");
		});
		btnOther.addActionListener(e -> {
			manageBookOther();
			cardLayout.show(pnlCards, "pnlOther");
		});
		cardLayout = (CardLayout) pnlCards.getLayout();
	}

	// ----------Manage Book Panels----------
	private void manageBookPanels() {
		manageBookDefault();
		manageBookAll();
		manageBookBook();
		manageBookPhoto();
		manageBookKltn();
		manageBookOther();
	}

	// Default Panels
	private void manageBookDefault() {
		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlDefault");

		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		reset = new JButton("Reset");
		reset.setBackground(new Color(0, 153, 51));
		reset.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(177)
								.addComponent(save, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(reset)
								.addContainerGap(179, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addContainerGap(513, Short.MAX_VALUE)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(save)
										.addComponent(reset))
								.addGap(29)));
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(235)
												.addComponent(view, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
												.addGap(228))
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
								.addGap(18)
								.addComponent(view)
								.addContainerGap())
						.addComponent(details, GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE));
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);
	}

	// All Panels
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void manageBookAll() {
		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlAll");

		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		reset = new JButton("Reset");
		reset.setBackground(new Color(0, 153, 51));
		reset.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));

		JPanel imageAllPanel = new JPanel();
		imageAllPanel.setBackground(new Color(204, 204, 204));
		imageAllPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabel imgAll = new JLabel(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
		imgAll.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout gl_imgPnl = new GroupLayout(imageAllPanel);
		gl_imgPnl.setHorizontalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_imgPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(imgAll, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addContainerGap()));
		gl_imgPnl.setVerticalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_imgPnl.createSequentialGroup()
								.addComponent(imgAll, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
								.addGap(0)));
		imageAllPanel.setLayout(gl_imgPnl);

		JLabel lblIdAll = new JLabel("Mã tài liệu");
		JTextField txtIdAll = new JTextField();
		txtIdAll.setEnabled(false);
		txtIdAll.setColumns(10);

		JLabel lblCateAll = new JLabel("Loại tài liệu");
		JComboBox cbbCateAll = new JComboBox();
		cbbCateAll.setModel(new DefaultComboBoxModel(new String[] { "" }));
		cbbCateAll.setEnabled(false);

		JLabel lblTitleAll = new JLabel("Nhan đề");
		JTextField txtTitileAll = new JTextField();
		txtTitileAll.setEnabled(false);
		txtTitileAll.setColumns(10);

		JLabel lblValueAll = new JLabel("Giá trị");
		JTextField txtValueAll = new JTextField();
		txtValueAll.setEnabled(false);
		txtValueAll.setColumns(10);

		JLabel lblCountAll = new JLabel("Số lượng");
		JTextField txtCountAll = new JTextField();
		txtCountAll.setEnabled(false);
		txtCountAll.setColumns(10);

		JLabel lblNumberAll = new JLabel("Số có sẵn");
		JTextField txtNumberAll = new JTextField();
		txtNumberAll.setEnabled(false);
		txtNumberAll.setColumns(10);

		JCheckBox chckbxInvalidAll = new JCheckBox("Cho phép mượn");
		chckbxInvalidAll.setEnabled(false);

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_details.createSequentialGroup()
												.addGap(81)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(imageAllPanel, GroupLayout.PREFERRED_SIZE,
																		87, GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(lblIdAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblTitleAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCateAll))
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(cbbCateAll, 0, 145,
																				Short.MAX_VALUE)
																		.addComponent(txtTitileAll,
																				GroupLayout.DEFAULT_SIZE, 141,
																				Short.MAX_VALUE)
																		.addComponent(txtIdAll,
																				GroupLayout.DEFAULT_SIZE, 145,
																				Short.MAX_VALUE)))
														.addGroup(gl_details.createSequentialGroup()
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(lblValueAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCountAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblNumberAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(txtValueAll,
																				GroupLayout.DEFAULT_SIZE, 180,
																				Short.MAX_VALUE)
																		.addComponent(txtCountAll,
																				GroupLayout.DEFAULT_SIZE, 180,
																				Short.MAX_VALUE)
																		.addComponent(txtNumberAll,
																				GroupLayout.DEFAULT_SIZE, 180,
																				Short.MAX_VALUE)))
														.addComponent(chckbxInvalidAll, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGap(174)
												.addComponent(save, GroupLayout.PREFERRED_SIZE, 58,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(reset)))
								.addContainerGap(90, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(59)
								.addGroup(gl_details.createParallelGroup(Alignment.TRAILING)
										.addComponent(imageAllPanel, GroupLayout.PREFERRED_SIZE, 101,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblIdAll)
														.addComponent(txtIdAll, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblCateAll)
														.addComponent(cbbCateAll, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblTitleAll)
														.addComponent(txtTitileAll, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblValueAll)
										.addComponent(txtValueAll, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCountAll)
										.addComponent(txtCountAll, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNumberAll)
										.addComponent(txtNumberAll, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addComponent(chckbxInvalidAll)
								.addGap(198)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(save)
										.addComponent(reset))
								.addGap(73)));
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(Alignment.TRAILING, gl_pnl.createSequentialGroup()
												.addGap(261)
												.addComponent(view, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addGap(231)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(view)
								.addContainerGap(62, Short.MAX_VALUE))
						.addComponent(details, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "LOẠI TÀI LIỆU", "MÃ TÀI LIỆU", "NHAN ĐỀ", "GIÁ TRỊ", "SỐ LƯỢNG", "SỐ CÓ SẴN",
						"MƯỢN ĐƯỢC"
				}));
		scrollPane.setViewportView(table);
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);

		edit.addActionListener(e -> {
			addImageBook(imageAllPanel, imgAll);
			chckbxInvalidAll.setEnabled(true);
		});
		add.addActionListener(e -> {
			removeClickListener(imageAllPanel);
			chckbxInvalidAll.setEnabled(false);
		});
		delete.addActionListener(e -> {
			removeClickListener(imageAllPanel);
			chckbxInvalidAll.setEnabled(false);
			if (txtCountAll.getText().equals("0")) {
				imgAll.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
				txtIdAll.setText("");
				cbbCateAll.setSelectedIndex(0);
				txtTitileAll.setText("");
				txtValueAll.setText("");
				txtCountAll.setText("");
				txtNumberAll.setText("");
				chckbxInvalidAll.setSelected(false);
			}
		});
		save.addActionListener(e -> {
			removeClickListener(imageAllPanel);
			chckbxInvalidAll.setEnabled(false);
		});
		reset.addActionListener(e -> {
			if (chckbxInvalidAll.isEnabled()) {
				imgAll.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
				chckbxInvalidAll.setSelected(false);
			}
		});
	}

	// Book Panels
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void manageBookBook() {
		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlBook");

		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		reset = new JButton("Reset");
		reset.setBackground(new Color(0, 153, 51));
		reset.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));

		JPanel imgPnl = new JPanel();
		imgPnl.setBackground(new Color(204, 204, 204));
		imgPnl.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabel img = new JLabel(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
		img.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout gl_imgPnl = new GroupLayout(imgPnl);
		gl_imgPnl.setHorizontalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_imgPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addContainerGap()));
		gl_imgPnl.setVerticalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_imgPnl.createSequentialGroup()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
								.addGap(0)));
		imgPnl.setLayout(gl_imgPnl);

		JLabel lblIsbnBook = new JLabel("ISBN");
		JTextField txtIsbnBook = new JTextField();
		txtIsbnBook.setEnabled(false);
		txtIsbnBook.setColumns(10);

		JLabel lblTitleBook = new JLabel("Nhan đề");
		JTextField txtTitleBook = new JTextField();
		txtTitleBook.setEnabled(false);
		txtTitleBook.setColumns(10);

		JLabel lblCateBook = new JLabel("Thể loại");
		JComboBox cbbCateBook = new JComboBox();
		cbbCateBook.setModel(new DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCateBook.setEnabled(false);

		JLabel lblAuthorBook = new JLabel("Tác giả");
		JTextField txtAuthorBook = new JTextField();
		txtAuthorBook.setEnabled(false);
		txtAuthorBook.setColumns(10);

		JLabel lblNxbBook = new JLabel("Nhà xuất bản");
		JTextField txtNxbBook = new JTextField();
		txtNxbBook.setEnabled(false);
		txtNxbBook.setColumns(10);

		JLabel lblYearBook = new JLabel("Năm xuất bản");
		JComboBox cbbYearBook = new JComboBox();
		cbbYearBook.setModel(new DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearBook.setEnabled(false);

		JLabel lblDescripBook = new JLabel("Mô tả");
		JTextArea txtAreaDescripBook = new JTextArea();
		txtAreaDescripBook.setLineWrap(true);
		txtAreaDescripBook.setEnabled(false);
		JScrollPane scrollPaneDescrip = new JScrollPane();
		scrollPaneDescrip.setViewportView(txtAreaDescripBook);

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(81)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_details.createSequentialGroup()
												.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 87,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblIsbnBook, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblCateBook, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblTitleBook))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addComponent(cbbCateBook, 0, 145, Short.MAX_VALUE)
														.addComponent(txtTitleBook)
														.addComponent(txtIsbnBook, GroupLayout.DEFAULT_SIZE, 145,
																Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblAuthorBook, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblNxbBook, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblYearBook, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblDescripBook, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addComponent(scrollPaneDescrip, GroupLayout.DEFAULT_SIZE, 225,
																Short.MAX_VALUE)
														.addComponent(cbbYearBook, 0, 215, Short.MAX_VALUE)
														.addComponent(txtAuthorBook, GroupLayout.DEFAULT_SIZE, 180,
																Short.MAX_VALUE)
														.addComponent(txtNxbBook, GroupLayout.DEFAULT_SIZE, 180,
																Short.MAX_VALUE)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(save, GroupLayout.PREFERRED_SIZE, 58,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(reset)))))
								.addContainerGap(104, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(59)
								.addGroup(gl_details.createParallelGroup(Alignment.TRAILING)
										.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 101,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblIsbnBook)
														.addComponent(txtIsbnBook, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblTitleBook)
														.addComponent(txtTitleBook, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblCateBook)
														.addComponent(cbbCateBook, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblAuthorBook)
										.addComponent(txtAuthorBook, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNxbBook)
										.addComponent(txtNxbBook, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblYearBook)
										.addComponent(cbbYearBook, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDescripBook)
										.addComponent(scrollPaneDescrip, GroupLayout.PREFERRED_SIZE, 118,
												GroupLayout.PREFERRED_SIZE))
								.addGap(96)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(save)
										.addComponent(reset))
								.addGap(202)));
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(260)
												.addComponent(view, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addGap(245)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(view)
								.addContainerGap(188, Short.MAX_VALUE))
						.addComponent(details, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "ISBN", "NHAN ĐỀ", "THỂ LOẠI", "TÁC GIẢ", "NXB", "NĂM XB", "MÔ TẢ"
				}));
		scrollPane.setViewportView(table);
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);

		edit.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtIsbnBook.setEnabled(false);
			txtTitleBook.setEnabled(true);
			cbbCateBook.setEnabled(true);
			txtAuthorBook.setEnabled(true);
			txtNxbBook.setEnabled(true);
			cbbYearBook.setEnabled(true);
			txtAreaDescripBook.setEnabled(true);
		});
		add.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtIsbnBook.setEnabled(true);
			txtTitleBook.setEnabled(true);
			cbbCateBook.setEnabled(true);
			txtAuthorBook.setEnabled(true);
			txtNxbBook.setEnabled(true);
			cbbYearBook.setEnabled(true);
			txtAreaDescripBook.setEnabled(true);

			txtIsbnBook.setText("");
			txtTitleBook.setText("");
			cbbCateBook.setSelectedIndex(0);
			txtAuthorBook.setText("");
			txtNxbBook.setText("");
			cbbYearBook.setSelectedIndex(0);
			txtAreaDescripBook.setText("");
		});
		delete.addActionListener(e -> {
			removeClickListener(imgPnl);
			img.setIcon(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

			txtIsbnBook.setEnabled(false);
			txtTitleBook.setEnabled(false);
			cbbCateBook.setEnabled(false);
			txtAuthorBook.setEnabled(false);
			txtNxbBook.setEnabled(false);
			cbbYearBook.setEnabled(false);
			txtAreaDescripBook.setEnabled(false);

			txtIsbnBook.setText("");
			txtTitleBook.setText("");
			cbbCateBook.setSelectedIndex(0);
			txtAuthorBook.setText("");
			txtNxbBook.setText("");
			cbbYearBook.setSelectedIndex(0);
			txtAreaDescripBook.setText("");
		});
		save.addActionListener(e -> {
			removeClickListener(imgPnl);

			txtIsbnBook.setEnabled(false);
			txtTitleBook.setEnabled(false);
			cbbCateBook.setEnabled(false);
			txtAuthorBook.setEnabled(false);
			txtNxbBook.setEnabled(false);
			cbbYearBook.setEnabled(false);
			txtAreaDescripBook.setEnabled(false);
		});
		reset.addActionListener(e -> {
			if (txtIsbnBook.isEnabled()) {
				img.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

				txtIsbnBook.setText("");
				txtTitleBook.setText("");
				cbbCateBook.setSelectedIndex(0);
				txtAuthorBook.setText("");
				txtNxbBook.setText("");
				cbbYearBook.setSelectedIndex(0);
				txtAreaDescripBook.setText("");
			} else if (!txtIsbnBook.isEnabled() && txtTitleBook.isEnabled()) {
				img.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

				txtTitleBook.setText("");
				cbbCateBook.setSelectedIndex(0);
				txtAuthorBook.setText("");
				txtNxbBook.setText("");
				cbbYearBook.setSelectedIndex(0);
				txtAreaDescripBook.setText("");
			}
		});
	}

	// Photo Panels
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void manageBookPhoto() {
		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlPhoto");

		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		reset = new JButton("Reset");
		reset.setBackground(new Color(0, 153, 51));
		reset.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));

		JPanel imgPnl = new JPanel();
		imgPnl.setBackground(new Color(204, 204, 204));
		imgPnl.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabel img = new JLabel(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
		img.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout gl_imgPnl = new GroupLayout(imgPnl);
		gl_imgPnl.setHorizontalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_imgPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addContainerGap()));
		gl_imgPnl.setVerticalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_imgPnl.createSequentialGroup()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
								.addGap(0)));
		imgPnl.setLayout(gl_imgPnl);

		JLabel lblTitlePhoto = new JLabel("Nhan đề");
		JTextField txtTitlePhoto = new JTextField();
		txtTitlePhoto.setEnabled(false);
		txtTitlePhoto.setColumns(10);

		JLabel lblCatePhoto = new JLabel("Thể loại");
		JComboBox cbbCatePhoto = new JComboBox();
		cbbCatePhoto.setModel(new DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCatePhoto.setEnabled(false);

		JLabel lblAuthorPhoto = new JLabel("Tác giả");
		JTextField txtAuthorPhoto = new JTextField();
		txtAuthorPhoto.setEnabled(false);
		txtAuthorPhoto.setColumns(10);

		JLabel lblYearPhoto = new JLabel("Năm xuất bản");
		JComboBox cbbYearPhoto = new JComboBox();
		cbbYearPhoto.setModel(new DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearPhoto.setEnabled(false);

		JLabel lblDescripPhoto = new JLabel("Mô tả");
		JTextArea txtAreaDescripPhoto = new JTextArea();
		txtAreaDescripPhoto.setLineWrap(true);
		txtAreaDescripPhoto.setEnabled(false);
		JScrollPane scrollPaneDescrip = new JScrollPane();
		scrollPaneDescrip.setViewportView(txtAreaDescripPhoto);

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(81)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_details.createSequentialGroup()
												.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 87,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(lblTitlePhoto)
																.addPreferredGap(ComponentPlacement.RELATED))
														.addGroup(gl_details.createSequentialGroup()
																.addGroup(gl_details
																		.createParallelGroup(Alignment.TRAILING, false)
																		.addComponent(lblAuthorPhoto, Alignment.LEADING,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCatePhoto, Alignment.LEADING,
																				GroupLayout.DEFAULT_SIZE, 45,
																				Short.MAX_VALUE))
																.addPreferredGap(ComponentPlacement.RELATED)))
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_details.createSequentialGroup()
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(txtAuthorPhoto,
																				GroupLayout.DEFAULT_SIZE, 163,
																				Short.MAX_VALUE)
																		.addComponent(cbbCatePhoto, 0, 158,
																				Short.MAX_VALUE)))
														.addGroup(gl_details.createSequentialGroup()
																.addGap(19)
																.addComponent(txtTitlePhoto, GroupLayout.DEFAULT_SIZE,
																		162, Short.MAX_VALUE))))
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addComponent(lblYearPhoto)
														.addComponent(lblDescripPhoto))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addComponent(scrollPaneDescrip, GroupLayout.DEFAULT_SIZE, 225,
																Short.MAX_VALUE)
														.addComponent(cbbYearPhoto, 0, GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(save, GroupLayout.PREFERRED_SIZE, 58,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(reset)))))
								.addContainerGap(79, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(63)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
										.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 101,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblTitlePhoto)
														.addComponent(txtTitlePhoto, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblCatePhoto)
														.addComponent(cbbCatePhoto, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblAuthorPhoto)
														.addComponent(txtAuthorPhoto, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblYearPhoto)
										.addComponent(cbbYearPhoto, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDescripPhoto)
										.addComponent(scrollPaneDescrip, GroupLayout.PREFERRED_SIZE, 118,
												GroupLayout.PREFERRED_SIZE))
								.addGap(184)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(save)
										.addComponent(reset))
								.addGap(301)));
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(260)
												.addComponent(view, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addGap(245)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(view)
								.addContainerGap(188, Short.MAX_VALUE))
						.addComponent(details, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "NHAN ĐỀ", "THỂ LOẠI", "TÁC GIẢ", "NĂM XB", "MÔ TẢ"
				}));
		scrollPane.setViewportView(table);
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);

		edit.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtTitlePhoto.setEnabled(true);
			cbbCatePhoto.setEnabled(true);
			txtAuthorPhoto.setEnabled(true);
			cbbYearPhoto.setEnabled(true);
			txtAreaDescripPhoto.setEnabled(true);
		});
		add.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtTitlePhoto.setEnabled(true);
			cbbCatePhoto.setEnabled(true);
			txtAuthorPhoto.setEnabled(true);
			cbbYearPhoto.setEnabled(true);
			txtAreaDescripPhoto.setEnabled(true);

			txtTitlePhoto.setText("");
			cbbCatePhoto.setSelectedIndex(0);
			txtAuthorPhoto.setText("");
			cbbYearPhoto.setSelectedIndex(0);
			txtAreaDescripPhoto.setText("");
		});
		delete.addActionListener(e -> {
			removeClickListener(imgPnl);
			img.setIcon(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

			txtTitlePhoto.setEnabled(false);
			cbbCatePhoto.setEnabled(false);
			txtAuthorPhoto.setEnabled(false);
			cbbYearPhoto.setEnabled(false);
			txtAreaDescripPhoto.setEnabled(false);

			txtTitlePhoto.setText("");
			cbbCatePhoto.setSelectedIndex(0);
			txtAuthorPhoto.setText("");
			cbbYearPhoto.setSelectedIndex(0);
			txtAreaDescripPhoto.setText("");
		});
		save.addActionListener(e -> {
			removeClickListener(imgPnl);

			txtTitlePhoto.setEnabled(false);
			cbbCatePhoto.setEnabled(false);
			txtAuthorPhoto.setEnabled(false);
			cbbYearPhoto.setEnabled(false);
			txtAreaDescripPhoto.setEnabled(false);
		});
		reset.addActionListener(e -> {
			if (txtTitlePhoto.isEnabled()) {
				img.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

				txtTitlePhoto.setText("");
				cbbCatePhoto.setSelectedIndex(0);
				txtAuthorPhoto.setText("");
				cbbYearPhoto.setSelectedIndex(0);
				txtAreaDescripPhoto.setText("");
			}
		});
	}

	// KLTN Panels
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void manageBookKltn() {
		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlKltn");

		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		reset = new JButton("Reset");
		reset.setBackground(new Color(0, 153, 51));
		reset.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));

		JPanel imgPnl = new JPanel();
		imgPnl.setBackground(new Color(204, 204, 204));
		imgPnl.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabel img = new JLabel(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
		img.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout gl_imgPnl = new GroupLayout(imgPnl);
		gl_imgPnl.setHorizontalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_imgPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addContainerGap()));
		gl_imgPnl.setVerticalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_imgPnl.createSequentialGroup()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
								.addGap(0)));
		imgPnl.setLayout(gl_imgPnl);

		JLabel lblTitleKltn = new JLabel("Nhan đề");
		JTextField txtTitleKltn = new JTextField();
		txtTitleKltn.setEnabled(false);
		txtTitleKltn.setColumns(10);

		JLabel lblCateKltn = new JLabel("Chuyên ngành");
		JComboBox cbbCateKltn = new JComboBox();
		cbbCateKltn.setModel(new DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCateKltn.setEnabled(false);

		JLabel lblAuthorKltn = new JLabel("Tác giả");
		JTextField txtAuthorKltn = new JTextField();
		txtAuthorKltn.setEnabled(false);
		txtAuthorKltn.setColumns(10);

		JLabel lblYearKltn = new JLabel("Năm bảo vệ");
		JComboBox cbbYearKltn = new JComboBox();
		cbbYearKltn.setModel(new DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearKltn.setEnabled(false);

		JLabel lblDescripKltn = new JLabel("Mô tả");
		JTextArea txtAreaDescripKltn = new JTextArea();
		txtAreaDescripKltn.setLineWrap(true);
		txtAreaDescripKltn.setEnabled(false);
		JScrollPane scrollPaneDescrip = new JScrollPane();
		scrollPaneDescrip.setViewportView(txtAreaDescripKltn);

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(81)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
										.addGroup(gl_details.createSequentialGroup()
												.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 87,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
														.addComponent(lblCateKltn, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblTitleKltn, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblAuthorKltn, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(19)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
														.addComponent(txtAuthorKltn)
														.addComponent(txtTitleKltn, GroupLayout.DEFAULT_SIZE, 132,
																Short.MAX_VALUE)
														.addComponent(cbbCateKltn, Alignment.TRAILING, 0,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addComponent(lblYearKltn)
														.addComponent(lblDescripKltn))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
														.addComponent(scrollPaneDescrip, GroupLayout.DEFAULT_SIZE, 225,
																Short.MAX_VALUE)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(save, GroupLayout.PREFERRED_SIZE, 58,
																		GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(reset))
														.addComponent(cbbYearKltn, 0, 249, Short.MAX_VALUE))))
								.addContainerGap(89, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(63)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
										.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 101,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblTitleKltn)
														.addComponent(txtTitleKltn, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblAuthorKltn)
														.addComponent(txtAuthorKltn, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblCateKltn)
														.addComponent(cbbCateKltn, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblYearKltn)
										.addComponent(cbbYearKltn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDescripKltn)
										.addComponent(scrollPaneDescrip, GroupLayout.PREFERRED_SIZE, 118,
												GroupLayout.PREFERRED_SIZE))
								.addGap(184)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(save)
										.addComponent(reset))
								.addGap(301)));
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(260)
												.addComponent(view, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addGap(245)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(view)
								.addContainerGap(188, Short.MAX_VALUE))
						.addComponent(details, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "MÃ TÀI LIỆU", "NHAN ĐỀ", "CHUYÊN NGÀNH", "NĂM BẢO VỆ", "MÔ TẢ"
				}));
		scrollPane.setViewportView(table);
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);

		edit.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtTitleKltn.setEnabled(true);
			txtAuthorKltn.setEnabled(true);
			cbbCateKltn.setEnabled(true);
			cbbYearKltn.setEnabled(true);
			txtAreaDescripKltn.setEnabled(true);
		});
		add.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtTitleKltn.setEnabled(true);
			txtAuthorKltn.setEnabled(true);
			cbbCateKltn.setEnabled(true);
			cbbYearKltn.setEnabled(true);
			txtAreaDescripKltn.setEnabled(true);

			txtTitleKltn.setText("");
			txtAuthorKltn.setText("");
			cbbCateKltn.setSelectedIndex(0);
			cbbYearKltn.setSelectedIndex(0);
			txtAreaDescripKltn.setText("");
		});
		delete.addActionListener(e -> {
			removeClickListener(imgPnl);
			img.setIcon(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

			txtTitleKltn.setEnabled(false);
			txtAuthorKltn.setEnabled(false);
			cbbCateKltn.setEnabled(false);
			cbbYearKltn.setEnabled(false);
			txtAreaDescripKltn.setEnabled(false);

			txtTitleKltn.setText("");
			txtAuthorKltn.setText("");
			cbbCateKltn.setSelectedIndex(0);
			cbbYearKltn.setSelectedIndex(0);
			txtAreaDescripKltn.setText("");
		});
		save.addActionListener(e -> {
			removeClickListener(imgPnl);

			txtTitleKltn.setEnabled(false);
			txtAuthorKltn.setEnabled(false);
			cbbCateKltn.setEnabled(false);
			cbbYearKltn.setEnabled(false);
			txtAreaDescripKltn.setEnabled(false);
		});
		reset.addActionListener(e -> {
			if (txtTitleKltn.isEnabled()) {
				img.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

				txtTitleKltn.setText("");
				txtAuthorKltn.setText("");
				cbbCateKltn.setSelectedIndex(0);
				cbbYearKltn.setSelectedIndex(0);
				txtAreaDescripKltn.setText("");
			}
		});
	}

	// Other Panels
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void manageBookOther() {
		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlOther");

		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		save = new JButton("Lưu");
		save.setBackground(new Color(0, 153, 51));
		save.setForeground(new Color(255, 255, 255));

		reset = new JButton("Reset");
		reset.setBackground(new Color(0, 153, 51));
		reset.setForeground(new Color(255, 255, 255));

		view = new JButton("Xem");
		view.setForeground(new Color(255, 255, 255));
		view.setBackground(new Color(0, 153, 51));

		JPanel imgPnl = new JPanel();
		imgPnl.setBackground(new Color(204, 204, 204));
		imgPnl.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabel img = new JLabel(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));
		img.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout gl_imgPnl = new GroupLayout(imgPnl);
		gl_imgPnl.setHorizontalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_imgPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addContainerGap()));
		gl_imgPnl.setVerticalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_imgPnl.createSequentialGroup()
								.addComponent(img, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
								.addGap(0)));
		imgPnl.setLayout(gl_imgPnl);

		JLabel lblTitleOther = new JLabel("Nhan đề");
		JTextField txtTitleOther = new JTextField();
		txtTitleOther.setEnabled(false);
		txtTitleOther.setColumns(10);

		JLabel lblDescripOther = new JLabel("Mô tả");
		JTextArea txtAreaDescripOther = new JTextArea();
		txtAreaDescripOther.setLineWrap(true);
		txtAreaDescripOther.setEnabled(false);
		JScrollPane scrollPaneDescrip = new JScrollPane();
		scrollPaneDescrip.setViewportView(txtAreaDescripOther);

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
			gl_details.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_details.createSequentialGroup()
					.addGap(81)
					.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
						.addComponent(lblTitleOther)
						.addGroup(gl_details.createSequentialGroup()
							.addComponent(lblDescripOther)
							.addGap(46)
							.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
								.addComponent(scrollPaneDescrip)
								.addComponent(txtTitleOther, GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
					.addContainerGap(109, Short.MAX_VALUE))
				.addGroup(gl_details.createSequentialGroup()
					.addGap(185)
					.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(219, Short.MAX_VALUE))
				.addGroup(gl_details.createSequentialGroup()
					.addGap(176)
					.addComponent(save, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(reset)
					.addContainerGap(180, Short.MAX_VALUE))
		);
		gl_details.setVerticalGroup(
			gl_details.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_details.createSequentialGroup()
					.addGap(63)
					.addComponent(imgPnl, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTitleOther)
						.addComponent(txtTitleOther, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(24)
					.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescripOther)
						.addComponent(scrollPaneDescrip, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
					.addGap(183)
					.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
						.addComponent(save)
						.addComponent(reset))
					.addGap(320))
		);
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(260)
												.addComponent(view, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addGap(245)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 536, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(view)
								.addContainerGap(188, Short.MAX_VALUE))
						.addComponent(details, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "MÃ TÀI LIỆU", "NHAN ĐỀ"
				}));
		scrollPane.setViewportView(table);
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);

		edit.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtTitleOther.setEnabled(true);
			txtAreaDescripOther.setEnabled(true);
		});
		add.addActionListener(e -> {
			addImageBook(imgPnl, img);

			txtTitleOther.setEnabled(true);
			txtAreaDescripOther.setEnabled(true);

			txtTitleOther.setText("");
			txtAreaDescripOther.setText("");
		});
		delete.addActionListener(e -> {
			removeClickListener(imgPnl);
			img.setIcon(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

			txtTitleOther.setEnabled(false);
			txtAreaDescripOther.setEnabled(false);

			txtTitleOther.setText("");
			txtAreaDescripOther.setText("");
		});
		save.addActionListener(e -> {
			removeClickListener(imgPnl);

			txtTitleOther.setEnabled(false);
			txtAreaDescripOther.setEnabled(false);
		});
		reset.addActionListener(e -> {
			if (txtTitleOther.isEnabled()) {
				img.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\images\\image-gallery.png"));

				txtTitleOther.setText("");
				txtAreaDescripOther.setText("");
			}
		});
	}

	// ----------Manage Service----------
	private void initManageService() {

	}

	// ----------Manage Reader----------
	private void initManageReader() {

	}

	// ----------private----------
	private JPanel contentPane;
	private JPanel header;

	private JTabbedPane tabbedPane;
	private JPanel manageBookTab;
	// private JPanel manageServiceTab;
	// private JPanel manageReaderTab;
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
	private JButton reset;
	private JButton view;

	private CardLayout cardLayout;
	private JPanel pnlCards;
	private JPanel details;
	private JPanel pnl;
	private GroupLayout gl_details;
	private GroupLayout gl_pnl;

	private JFileChooser imgChooser;
	private FileNameExtensionFilter imgFilter;
}