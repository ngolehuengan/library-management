package main.java.com.library.GUI.forms.ManageBook;

import main.java.com.library.GUI.handle.Handle;

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
		Handle.setColor(btnAll);
		btnAll.setBackground(new java.awt.Color(0, 102, 0));

		btnBook = new javax.swing.JButton("SÁCH");
		Handle.setColor(btnBook);

		btnPhoto = new javax.swing.JButton("TÀI LIỆU PHOTO");
		Handle.setColor(btnPhoto);

		btnTheses = new javax.swing.JButton("LUẬN");
		Handle.setColor(btnTheses);

		btnOther = new javax.swing.JButton("KHÁC");
		Handle.setColor(btnOther);

		menuSide.add(btnAll);
		menuSide.add(btnBook);
		menuSide.add(btnPhoto);
		menuSide.add(btnTheses);
		menuSide.add(btnOther);

		// MenuSide Tabs - Right
		pnlCards = new javax.swing.JPanel();
		splitPane.setRightComponent(pnlCards);
		cardLayout = new java.awt.CardLayout();
		pnlCards.setLayout(cardLayout);

		ManageBookAll.init(pnlCards);

		// Action Changed Tab
		btnAll.addActionListener(e -> {
			ManageBookAll.init(pnlCards);
			btnAll.setBackground(new java.awt.Color(0, 102, 0));
			btnBook.setBackground(new java.awt.Color(0, 153, 51));
			btnPhoto.setBackground(new java.awt.Color(0, 153, 51));
			btnTheses.setBackground(new java.awt.Color(0, 153, 51));
			btnOther.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlAll");
		});

		btnBook.addActionListener(e -> {
			ManageBookBook.init(pnlCards);
			btnAll.setBackground(new java.awt.Color(0, 153, 51));
			btnBook.setBackground(new java.awt.Color(0, 102, 0));
			btnPhoto.setBackground(new java.awt.Color(0, 153, 51));
			btnTheses.setBackground(new java.awt.Color(0, 153, 51));
			btnOther.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlBook");
		});

		btnPhoto.addActionListener(e -> {
			ManageBookPhoto.init(pnlCards);
			btnAll.setBackground(new java.awt.Color(0, 153, 51));
			btnBook.setBackground(new java.awt.Color(0, 153, 51));
			btnPhoto.setBackground(new java.awt.Color(0, 102, 0));
			btnTheses.setBackground(new java.awt.Color(0, 153, 51));
			btnOther.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlPhoto");
		});

		btnTheses.addActionListener(e -> {
			ManageBookTheses.init(pnlCards);
			btnAll.setBackground(new java.awt.Color(0, 153, 51));
			btnBook.setBackground(new java.awt.Color(0, 153, 51));
			btnPhoto.setBackground(new java.awt.Color(0, 153, 51));
			btnTheses.setBackground(new java.awt.Color(0, 102, 0));
			btnOther.setBackground(new java.awt.Color(0, 153, 51));
			cardLayout.show(pnlCards, "pnlTheses");
		});

		btnOther.addActionListener(e -> {
			ManageBookOther.init(pnlCards);
			btnAll.setBackground(new java.awt.Color(0, 153, 51));
			btnBook.setBackground(new java.awt.Color(0, 153, 51));
			btnPhoto.setBackground(new java.awt.Color(0, 153, 51));
			btnTheses.setBackground(new java.awt.Color(0, 153, 51));
			btnOther.setBackground(new java.awt.Color(0, 102, 0));
			cardLayout.show(pnlCards, "pnlOther");
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
		edit = Handle.getEdit(edit);
		delete = Handle.getDelete(delete);
		search = Handle.getSearch(search);
		searchField = new javax.swing.JTextField(15);

		handleBase.add(add);
		handleBase.add(edit);
		handleBase.add(delete);
		handleBase.add(searchField);
		handleBase.add(search);

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
	}

	// Private
	private static javax.swing.JPanel manageBookTab;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel menuSide;
	private static javax.swing.JButton btnAll;
	private static javax.swing.JButton btnBook;
	private static javax.swing.JButton btnPhoto;
	private static javax.swing.JButton btnTheses;
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