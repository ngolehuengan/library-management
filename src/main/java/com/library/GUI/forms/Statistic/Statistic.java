package main.java.com.library.GUI.forms.Statistic;

import main.java.com.library.GUI.handle.Handle;

public class Statistic {
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		statistic = new javax.swing.JPanel();
		statistic.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Thống Kê", null, statistic, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		statistic.add(handle, java.awt.BorderLayout.NORTH);
		statistic.add(splitPane, java.awt.BorderLayout.CENTER);

		// Menu Side - Left
		menuSide = new javax.swing.JPanel();
		menuSide.setLayout(new java.awt.GridLayout(3, 1));
		splitPane.setLeftComponent(menuSide);

		btnBorrow = new javax.swing.JButton("THỂ LOẠI YÊU THÍCH");
		Handle.setColor(btnBorrow);
		btnBorrow.setBackground(new java.awt.Color(0, 102, 0));

		btnReturn = new javax.swing.JButton("TÀI LIỆU TRẢ TRỄ");
		Handle.setColor(btnReturn);

		btnReceipt = new javax.swing.JButton("ĐỘC GIẢ NỢ TIỀN");
		Handle.setColor(btnReceipt);

		menuSide.add(btnBorrow);
		menuSide.add(btnReturn);
		menuSide.add(btnReceipt);

		// MenuSide Tabs - Right
		pnlCards = new javax.swing.JPanel();
		splitPane.setRightComponent(pnlCards);
		cardLayout = new java.awt.CardLayout();
		pnlCards.setLayout(cardLayout);

		FavorStatistic.init(pnlCards);

		// Action Changed Tab
		btnBorrow.addActionListener(e -> {
			FavorStatistic.init(pnlCards);
			btnBorrow.setBackground(new java.awt.Color(0, 102, 0));
			btnReturn.setBackground(new java.awt.Color(0, 153, 51));
			btnReceipt.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlFavor");
		});

		btnReturn.addActionListener(e -> {
			ReturnLateStatistic.init(pnlCards);
			btnBorrow.setBackground(new java.awt.Color(0, 153, 51));
			btnReturn.setBackground(new java.awt.Color(0, 102, 0));
			btnReceipt.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlLate");
		});

		btnReceipt.addActionListener(e -> {
			DebtStatistic.init(pnlCards);
			btnBorrow.setBackground(new java.awt.Color(0, 153, 51));
			btnReturn.setBackground(new java.awt.Color(0, 153, 51));
			btnReceipt.setBackground(new java.awt.Color(0, 102, 0));
			cardLayout.show(pnlCards, "pnlDebt");
		});
	}

	// Handle
	private static void handle() {
		handle = new javax.swing.JPanel();
		handle.setBorder(new javax.swing.border.TitledBorder(null, "Xử Lý", javax.swing.border.TitledBorder.LEADING,
				javax.swing.border.TitledBorder.TOP, null, null));
		handle.setBackground(new java.awt.Color(204, 255, 204));
		handle.setLayout(new java.awt.BorderLayout(0, 0));

		handleOpt = new javax.swing.JPanel();
		handleOpt.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		print = Handle.getPrint(print);
		handleOpt.add(print);
		
		view = Handle.getView(view);
	}

	// Private
	private static javax.swing.JPanel statistic;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel menuSide;
	private static javax.swing.JButton btnBorrow;
	private static javax.swing.JButton btnReturn;
	private static javax.swing.JButton btnReceipt;
	private static java.awt.CardLayout cardLayout;
	private static javax.swing.JPanel pnlCards;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleOpt;
	public static javax.swing.JButton print;
	public static javax.swing.JButton view;
	public static javax.swing.JButton find;
}
