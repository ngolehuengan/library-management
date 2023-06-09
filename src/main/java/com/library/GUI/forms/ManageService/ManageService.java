package main.java.com.library.GUI.forms.ManageService;

import main.java.com.library.GUI.handle.Handle;

public class ManageService {
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		service = new javax.swing.JPanel();
		service.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Quản Lý Dịch Vụ", null, service, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		service.add(handle, java.awt.BorderLayout.NORTH);
		service.add(splitPane, java.awt.BorderLayout.CENTER);

		// Menu Side - Left
		menuSide = new javax.swing.JPanel();
		menuSide.setLayout(new java.awt.GridLayout(3, 1));
		splitPane.setLeftComponent(menuSide);

		btnBorrow = new javax.swing.JButton("MƯỢN");
		Handle.setColor(btnBorrow);
		btnBorrow.setBackground(new java.awt.Color(0, 102, 0));

		btnReturn = new javax.swing.JButton("TRẢ");
		Handle.setColor(btnReturn);

		btnReceipt = new javax.swing.JButton("THU TIỀN");
		Handle.setColor(btnReceipt);

		menuSide.add(btnBorrow);
		menuSide.add(btnReturn);
		menuSide.add(btnReceipt);

		// MenuSide Tabs - Right
		pnlCards = new javax.swing.JPanel();
		splitPane.setRightComponent(pnlCards);
		cardLayout = new java.awt.CardLayout();
		pnlCards.setLayout(cardLayout);

		ManageServiceBorrow.init(pnlCards);

		// Action Changed Tab
		btnBorrow.addActionListener(e -> {
			ManageServiceBorrow.init(pnlCards);
			btnBorrow.setBackground(new java.awt.Color(0, 102, 0));
			btnReturn.setBackground(new java.awt.Color(0, 153, 51));
			btnReceipt.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlBorrow");
		});

		btnReturn.addActionListener(e -> {
			ManageServiceReturn.init(pnlCards);
			btnBorrow.setBackground(new java.awt.Color(0, 153, 51));
			btnReturn.setBackground(new java.awt.Color(0, 102, 0));
			btnReceipt.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlReturn");
		});

		btnReceipt.addActionListener(e -> {
			ManageServiceReceipt.init(pnlCards);
			btnBorrow.setBackground(new java.awt.Color(0, 153, 51));
			btnReturn.setBackground(new java.awt.Color(0, 153, 51));
			btnReceipt.setBackground(new java.awt.Color(0, 102, 0));
			cardLayout.show(pnlCards, "pnlReceipt");
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
		handle.add(handleBase, java.awt.BorderLayout.CENTER);

		add = Handle.getAdd(add);
		delete = Handle.getDelete(delete);
		search = Handle.getSearch(search);
		searchField = new javax.swing.JTextField(15);

		save = Handle.getSave(save);
		reset = Handle.getReset(reset);
		view = Handle.getView(view);

		penalty = new javax.swing.JButton("Tạo Biên Bản Phạt");
		Handle.setColor(penalty);
		penalty.addActionListener(e -> {
			new ManageServicePenalty().setVisible(true);
		});

		handleBase.add(penalty);
		handleBase.add(searchField);
		handleBase.add(search);

		handleOpt = new javax.swing.JPanel();
		handleOpt.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		print = Handle.getPrint(print);

		adjourn = new javax.swing.JButton("Gia Hạn");
		Handle.setColor(adjourn);

		find = Handle.getFind(find);

		handleOpt.add(print);
	}

	// Private
	private static javax.swing.JPanel service;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel menuSide;
	private static javax.swing.JButton btnBorrow;
	private static javax.swing.JButton btnReturn;
	private static javax.swing.JButton btnReceipt;
	private static java.awt.CardLayout cardLayout;
	private static javax.swing.JPanel pnlCards;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleOpt;
	public static javax.swing.JButton add;
	public static javax.swing.JButton delete;
	public static javax.swing.JButton search;
	public static javax.swing.JTextField searchField;
	public static javax.swing.JButton print;
	public static javax.swing.JButton save;
	public static javax.swing.JButton reset;
	public static javax.swing.JButton view;
	public static javax.swing.JButton penalty;
	public static javax.swing.JButton adjourn;
	public static javax.swing.JButton find;
}