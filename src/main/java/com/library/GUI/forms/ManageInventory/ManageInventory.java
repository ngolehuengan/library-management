package main.java.com.library.GUI.forms.ManageInventory;

import main.java.com.library.GUI.forms.ManageBook.ManageBook;

public class ManageInventory {
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		manageInventory = new javax.swing.JPanel();
		manageInventory.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Quản Lý Kho", null, manageInventory, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		manageInventory.add(handle, java.awt.BorderLayout.NORTH);
		manageInventory.add(splitPane, java.awt.BorderLayout.CENTER);

		// Menu Side - Left
		menuSide = new javax.swing.JPanel();
		menuSide.setLayout(new java.awt.GridLayout(2, 1));
		splitPane.setLeftComponent(menuSide);

		btnImport = new javax.swing.JButton("NHẬP");
		btnImport.setForeground(new java.awt.Color(255, 255, 255));
		btnImport.setBackground(new java.awt.Color(0, 153, 51));

		btnLiquidate = new javax.swing.JButton("THANH LÝ");
		btnLiquidate.setForeground(new java.awt.Color(255, 255, 255));
		btnLiquidate.setBackground(new java.awt.Color(0, 153, 51));

		menuSide.add(btnImport);
		menuSide.add(btnLiquidate);

		// MenuSide Tabs - Right
		pnlCards = new javax.swing.JPanel();
		splitPane.setRightComponent(pnlCards);
		cardLayout = new java.awt.CardLayout();
		pnlCards.setLayout(cardLayout);

		ManageInventoryImport.init(pnlCards);

		// Action Changed Tab
		btnImport.addActionListener(e -> {
			ManageInventoryImport.init(pnlCards);
			cardLayout.show(pnlCards, "pnlImport");
		});

		btnLiquidate.addActionListener(e -> {
			ManageInventoryLiquidate.init(pnlCards);
			cardLayout.show(pnlCards, "pnlLiquidate");
		});
	}

	// Handle
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

		delete = new javax.swing.JButton("Xóa");
		delete.setForeground(new java.awt.Color(255, 255, 255));
		delete.setBackground(new java.awt.Color(0, 153, 51));

		search = new javax.swing.JButton("Tìm kiếm");
		search.setBackground(new java.awt.Color(0, 153, 51));
		search.setForeground(new java.awt.Color(255, 255, 255));
		searchField = new javax.swing.JTextField();
		searchField.setColumns(20);

		handleBase.add(add);
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
		
		addCthd = new javax.swing.JButton("Thêm CTHĐ");
		addCthd.setBackground(new java.awt.Color(0, 153, 51));
		addCthd.setForeground(new java.awt.Color(255, 255, 255));

		deleteCthd = new javax.swing.JButton("Xóa CTHĐ");
		deleteCthd.setForeground(new java.awt.Color(255, 255, 255));
		deleteCthd.setBackground(new java.awt.Color(0, 153, 51));
	}

	// Private
	private static javax.swing.JPanel manageInventory;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel menuSide;
	private static javax.swing.JButton btnImport;
	private static javax.swing.JButton btnLiquidate;
	private static java.awt.CardLayout cardLayout;
	private static javax.swing.JPanel pnlCards;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleOpt;
	public static javax.swing.JButton add;
	public static javax.swing.JButton delete;
	public static javax.swing.JButton search;
	public static javax.swing.JTextField searchField;
	public static javax.swing.JButton download;
	public static javax.swing.JButton upload;
	public static javax.swing.JButton print;
	public static javax.swing.JButton save;
	public static javax.swing.JButton reset;
	public static javax.swing.JButton view;
	public static javax.swing.JButton addCthd;
	public static javax.swing.JButton deleteCthd;
}