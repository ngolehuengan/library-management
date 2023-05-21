package main.java.com.library.GUI.forms.ManageInventory;

import main.java.com.library.GUI.handle.Handle;

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
		Handle.setColor(btnImport);
		btnImport.setBackground(new java.awt.Color(0, 102, 0));

		btnLiquidate = new javax.swing.JButton("THANH LÝ");
		Handle.setColor(btnLiquidate);

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
			btnLiquidate.setBackground(new java.awt.Color(0, 153, 51));
			btnImport.setBackground(new java.awt.Color(0, 102, 0));
			cardLayout.show(pnlCards, "pnlImport");
		});

		btnLiquidate.addActionListener(e -> {
			ManageInventoryLiquidate.init(pnlCards);
			btnImport.setBackground(new java.awt.Color(0, 153, 51));
			btnLiquidate.setBackground(new java.awt.Color(0, 102, 0));
			cardLayout.show(pnlCards, "pnlLiquidate");
		});
	}

	// Handle
	private static void handle() {
		handle = new javax.swing.JPanel();
		handle.setBorder(new javax.swing.border.TitledBorder(null, "Xử Lý", javax.swing.border.TitledBorder.LEADING,
				javax.swing.border.TitledBorder.TOP, null, null));
		handle.setBackground(new java.awt.Color(204, 255, 204));
		handle.setLayout(new java.awt.BorderLayout(0, 0));

		handleBase = new javax.swing.JPanel();
		handleBase.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleBase, java.awt.BorderLayout.WEST);

		add = Handle.getAdd(add);
		delete = Handle.getDelete(delete);

		handleBase.add(add);
		handleBase.add(delete);

		handleOpt = new javax.swing.JPanel();
		handleOpt.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		print = Handle.getPrint(print);
		upload = Handle.getUpload(upload);
		download = Handle.getDownload(download);

		handleOpt.add(upload);
		handleOpt.add(download);
		handleOpt.add(print);

		save = Handle.getSave(save);
		reset = Handle.getReset(reset);
		view = Handle.getView(view);

		addCthd = new javax.swing.JButton("Thêm CTHĐ");
		Handle.setColor(addCthd);

		deleteCthd = new javax.swing.JButton("Xóa CTHĐ");
		Handle.setColor(deleteCthd);
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
	public static javax.swing.JButton download;
	public static javax.swing.JButton upload;
	public static javax.swing.JButton print;
	public static javax.swing.JButton save;
	public static javax.swing.JButton reset;
	public static javax.swing.JButton view;
	public static javax.swing.JButton addCthd;
	public static javax.swing.JButton deleteCthd;
}