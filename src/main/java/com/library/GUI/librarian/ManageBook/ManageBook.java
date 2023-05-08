package main.java.com.library.GUI.librarian.ManageBook;

public class ManageBook {
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		manageBookTab = new javax.swing.JPanel();
		manageBookTab.setBackground(new java.awt.Color(204, 255, 204));
		tabbedPane.addTab("Quản Lý Tài Liệu", null, manageBookTab, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		javax.swing.GroupLayout gl_table = new javax.swing.GroupLayout(manageBookTab);
		gl_table.setHorizontalGroup(
				gl_table.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_table.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(handle, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 1225,
												Short.MAX_VALUE)
										.addComponent(splitPane, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.PREFERRED_SIZE, 1215,
												Short.MAX_VALUE))
								.addGap(10)));
		gl_table.setVerticalGroup(
				gl_table.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_table.createSequentialGroup()
								.addContainerGap()
								.addComponent(handle, javax.swing.GroupLayout.PREFERRED_SIZE, 67,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(splitPane, javax.swing.GroupLayout.PREFERRED_SIZE, 417, Short.MAX_VALUE)
								.addContainerGap()));
		manageBookTab.setLayout(gl_table);

		// Menu Side - Left
		menuSide = new javax.swing.JPanel();
		menuSide.setBackground(new java.awt.Color(0, 153, 51));
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

		javax.swing.GroupLayout gl_menuSide = new javax.swing.GroupLayout(menuSide);
		gl_menuSide.setHorizontalGroup(
				gl_menuSide.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_menuSide.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_menuSide.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(btnBook, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 107,
												Short.MAX_VALUE)
										.addComponent(btnPhoto, javax.swing.GroupLayout.Alignment.TRAILING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnKltn, javax.swing.GroupLayout.PREFERRED_SIZE, 107,
												Short.MAX_VALUE)
										.addComponent(btnOther, javax.swing.GroupLayout.DEFAULT_SIZE, 107,
												Short.MAX_VALUE)
										.addComponent(btnAll, javax.swing.GroupLayout.DEFAULT_SIZE, 107,
												Short.MAX_VALUE))
								.addContainerGap()));
		gl_menuSide.setVerticalGroup(
				gl_menuSide.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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

		// MenuSide Tabs - Right
		cardLayout = new java.awt.CardLayout();
		pnlCards = new javax.swing.JPanel();
		splitPane.setRightComponent(pnlCards);
		pnlCards.setLayout(cardLayout);

		// --Default Tab = Details + Table
		pnl = new javax.swing.JPanel();
		pnl.setBackground(new java.awt.Color(204, 255, 204));
		pnlCards.add(pnl, "pnlDefault");

		// ---Details
		details = new javax.swing.JPanel();
		details.setBorder(
				new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.LEADING,
						javax.swing.border.TitledBorder.TOP, null, null));

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(177)
								.addGap(18)
								.addContainerGap(179, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addContainerGap(513, Short.MAX_VALUE)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE))
								.addGap(29)));
		details.setLayout(gl_details);

		// ---Table
		scrollPane = new javax.swing.JScrollPane();
		javax.swing.GroupLayout gl_pnl = new javax.swing.GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 512,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
						.addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING,
								javax.swing.GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE));
		pnl.setLayout(gl_pnl);

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
		searchField.setColumns(10);

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

		save = new javax.swing.JButton("Lưu");
		save.setBackground(new java.awt.Color(0, 153, 51));
		save.setForeground(new java.awt.Color(255, 255, 255));

		reset = new javax.swing.JButton("Reset");
		reset.setBackground(new java.awt.Color(0, 153, 51));
		reset.setForeground(new java.awt.Color(255, 255, 255));

		view = new javax.swing.JButton("Xem");
		view.setForeground(new java.awt.Color(255, 255, 255));
		view.setBackground(new java.awt.Color(0, 153, 51));

		javax.swing.GroupLayout gl_handle = new javax.swing.GroupLayout(handle);
		gl_handle.setHorizontalGroup(
				gl_handle.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_handle.createSequentialGroup()
								.addContainerGap()
								.addComponent(add)
								.addGap(18)
								.addComponent(edit)
								.addGap(18)
								.addComponent(delete)
								.addGap(18)
								.addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 262,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(search)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 312,
										Short.MAX_VALUE)
								.addComponent(download)
								.addGap(18)
								.addComponent(upload)
								.addGap(18)
								.addComponent(print)
								.addContainerGap()));
		gl_handle.setVerticalGroup(
				gl_handle.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_handle.createSequentialGroup()
								.addContainerGap()
								.addGroup(gl_handle.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(add)
										.addComponent(edit)
										.addComponent(delete)
										.addComponent(print)
										.addComponent(search)
										.addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(upload)
										.addComponent(download))
								.addContainerGap(20, Short.MAX_VALUE)));
		handle.setLayout(gl_handle);
	}

	// Private
	private static javax.swing.JPanel manageBookTab;
	private static javax.swing.JPanel handle;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel menuSide;
	private static javax.swing.JButton btnAll;
	private static javax.swing.JButton btnBook;
	private static javax.swing.JButton btnPhoto;
	private static javax.swing.JButton btnKltn;
	private static javax.swing.JButton btnOther;
	private static java.awt.CardLayout cardLayout;
	private static javax.swing.JPanel pnlCards;
	private static javax.swing.JPanel pnl;
	private static javax.swing.JPanel details;
	private static javax.swing.JScrollPane scrollPane;

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