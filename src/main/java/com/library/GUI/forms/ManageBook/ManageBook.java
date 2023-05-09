package main.java.com.library.GUI.forms.ManageBook;

public class ManageBook {
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		manageBookTab = new javax.swing.JPanel();
		manageBookTab.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Quản Lý Tài Liệu", null, manageBookTab, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		manageBookTab.add(handle, java.awt.BorderLayout.NORTH);
		manageBookTab.add(splitPane, java.awt.BorderLayout.CENTER);

		// Menu Side - Left
		menuSide = new javax.swing.JPanel();
		menuSide.setLayout(new java.awt.GridLayout(5, 1));
		splitPane.setLeftComponent(menuSide);

		btnAll = new javax.swing.JButton("TẤT CẢ");
		btnAll.setForeground(new java.awt.Color(255, 255, 255));
		btnAll.setBackground(new java.awt.Color(0, 153, 51));

		btnBook = new javax.swing.JButton("SÁCH");
		btnBook.setForeground(new java.awt.Color(255, 255, 255));
		btnBook.setBackground(new java.awt.Color(0, 153, 51));

		btnPhoto = new javax.swing.JButton("TÀI LIỆU PHOTO");
		btnPhoto.setForeground(new java.awt.Color(255, 255, 255));
		btnPhoto.setBackground(new java.awt.Color(0, 153, 51));

		btnKltn = new javax.swing.JButton("LUẬN ÁN/ LUẬN VĂN/ KHÓA LUẬN TN");
		btnKltn.setForeground(new java.awt.Color(255, 255, 255));
		btnKltn.setBackground(new java.awt.Color(0, 153, 51));

		btnOther = new javax.swing.JButton("KHÁC");
		btnOther.setForeground(new java.awt.Color(255, 255, 255));
		btnOther.setBackground(new java.awt.Color(0, 153, 51));

		menuSide.add(btnAll);
		menuSide.add(btnBook);
		menuSide.add(btnPhoto);
		menuSide.add(btnKltn);
		menuSide.add(btnOther);

		// MenuSide Tabs - Right
		cardLayout = new java.awt.CardLayout();
		pnlCards = new javax.swing.JPanel();
		pnlCards.setLayout(cardLayout);
		splitPane.setRightComponent(pnlCards);

		ManageBookAll.init(manageBookTab, pnlCards);

		// Action Changed Tab
		btnAll.addActionListener(e -> {
			ManageBookAll.init(manageBookTab, pnlCards);
			cardLayout.show(pnlCards, "pnlAll");
		});

		btnBook.addActionListener(e -> {
			ManageBookBook.init(manageBookTab, pnlCards);
			cardLayout.show(pnlCards, "pnlBook");
		});

		btnPhoto.addActionListener(e -> {
			ManageBookPhoto.init(manageBookTab, pnlCards);
			cardLayout.show(pnlCards, "pnlPhoto");
		});

		btnKltn.addActionListener(e -> {
			ManageBookKltn.init(manageBookTab, pnlCards);
			cardLayout.show(pnlCards, "pnlKltn");
		});

		btnOther.addActionListener(e -> {
			ManageBookOther.init(manageBookTab, pnlCards);
			cardLayout.show(pnlCards, "pnlOther");
		});
	}

	// Handle
	private static void handle() {
		handle = new javax.swing.JPanel();
		handle.setBorder(new javax.swing.border.TitledBorder(null, "Xử Lý", javax.swing.border.TitledBorder.LEADING,
				javax.swing.border.TitledBorder.TOP, null, null));
		handle.setLayout(new java.awt.BorderLayout(0, 0));

		handleBase = new javax.swing.JPanel();
		handle.add(handleBase, java.awt.BorderLayout.WEST);

		add = new javax.swing.JButton("Thêm");
		add.setForeground(new java.awt.Color(255, 255, 255));
		add.setBackground(new java.awt.Color(0, 153, 51));

		edit = new javax.swing.JButton("Chỉnh sửa");
		edit.setBackground(new java.awt.Color(0, 153, 51));
		edit.setForeground(new java.awt.Color(255, 255, 255));

		delete = new javax.swing.JButton("Xóa");
		delete.setForeground(new java.awt.Color(255, 255, 255));
		delete.setBackground(new java.awt.Color(0, 153, 51));

		search = new javax.swing.JButton("Tìm kiếm");
		search.setBackground(new java.awt.Color(0, 153, 51));
		search.setForeground(new java.awt.Color(255, 255, 255));
		searchField = new javax.swing.JTextField();
		searchField.setColumns(20);

		handleBase.add(add);
		handleBase.add(edit);
		handleBase.add(delete);
		handleBase.add(searchField);
		handleBase.add(search);

		handleOpt = new javax.swing.JPanel();
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		print = new javax.swing.JButton("  In");
		print.setIcon(
				new javax.swing.ImageIcon(ManageBook.class.getResource("../../../../../resources/icons/printing.png")));
		print.setBackground(new java.awt.Color(0, 153, 51));
		print.setForeground(new java.awt.Color(255, 255, 255));

		upload = new javax.swing.JButton("  Đăng tải");
		upload.setBackground(new java.awt.Color(0, 153, 51));
		upload.setForeground(new java.awt.Color(255, 255, 255));
		upload.setIcon(
				new javax.swing.ImageIcon(ManageBook.class.getResource("../../../../../resources/icons/upload.png")));

		download = new javax.swing.JButton("  Tải xuống");
		download.setIcon(
				new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/icons/downloads.png")));
		download.setForeground(new java.awt.Color(255, 255, 255));
		download.setBackground(new java.awt.Color(0, 153, 51));

		handleOpt.add(upload);
		handleOpt.add(download);
		handleOpt.add(print);

		save = new javax.swing.JButton("Lưu");
		save.setBackground(new java.awt.Color(0, 153, 51));
		save.setForeground(new java.awt.Color(255, 255, 255));

		reset = new javax.swing.JButton("Reset");
		reset.setBackground(new java.awt.Color(0, 153, 51));
		reset.setForeground(new java.awt.Color(255, 255, 255));

		view = new javax.swing.JButton("Xem");
		view.setForeground(new java.awt.Color(255, 255, 255));
		view.setBackground(new java.awt.Color(0, 153, 51));

	}

	// Private
	private static javax.swing.JPanel manageBookTab;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel menuSide;
	private static javax.swing.JButton btnAll;
	private static javax.swing.JButton btnBook;
	private static javax.swing.JButton btnPhoto;
	private static javax.swing.JButton btnKltn;
	private static javax.swing.JButton btnOther;
	private static java.awt.CardLayout cardLayout;
	private static javax.swing.JPanel pnlCards;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleOpt;
	public static javax.swing.JButton add;
	public static javax.swing.JButton edit;
	public static javax.swing.JButton delete;
	public static javax.swing.JButton search;
	public static javax.swing.JTextField searchField;
	public static javax.swing.JButton download;
	public static javax.swing.JButton upload;
	public static javax.swing.JButton print;
	public static javax.swing.JButton save;
	public static javax.swing.JButton reset;
	public static javax.swing.JButton view;
}