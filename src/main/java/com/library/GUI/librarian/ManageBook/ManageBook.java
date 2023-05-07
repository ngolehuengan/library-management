package main.java.com.library.GUI.librarian.ManageBook;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.TitledBorder;

import main.java.com.library.GUI.handle.Handle;

public class ManageBook {
	public static void init(JTabbedPane tabbedPane) {
		manageBookTab = new JPanel();
		manageBookTab.setBackground(new Color(204, 255, 204));
		tabbedPane.addTab("Quản Lý Tài Liệu", null, manageBookTab, null);
		handle();
		splitPane = new JSplitPane();

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

		// MenuSide Tabs
		cardLayout = new CardLayout();
		pnlCards = new JPanel();
		splitPane.setRightComponent(pnlCards);
		pnlCards.setLayout(cardLayout);

		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlDefault");

		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(177)
								.addGap(18)
								.addContainerGap(179, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addContainerGap(513, Short.MAX_VALUE)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE))
								.addGap(29)));
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE)));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.TRAILING)
						.addComponent(details, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE)
						.addComponent(scrollPane, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 651, Short.MAX_VALUE));
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);

		// Action Changed Tab
		btnAll.addActionListener(e -> {
			ManageBookAll.init(manageBookTab, cardLayout, pnlCards, splitPane, add, edit, delete, save, reset, view);
			cardLayout.show(pnlCards, "pnlAll");
		});
		// btnBook.addActionListener(e -> {
		// ManageBookBook.init(manageBookTab);
		// cardLayout.show(pnlCards, "pnlBook");
		// });
		// btnPhoto.addActionListener(e -> {
		// ManageBookPhoto.init(manageBookTab);
		// cardLayout.show(pnlCards, "pnlPhoto");
		// });
		// btnKltn.addActionListener(e -> {
		// ManageBookKltn.init(manageBookTab);
		// cardLayout.show(pnlCards, "pnlKltn");
		// });
		// btnOther.addActionListener(e -> {
		// ManageBookOther.init(manageBookTab);
		// cardLayout.show(pnlCards, "pnlOther");
		// });
		// cardLayout = (CardLayout) pnlCards.getLayout();
	}
	
	private static void handle() {
		handle = new JPanel();
		handle.setBorder(new TitledBorder(null, "Xử Lý", TitledBorder.LEADING, TitledBorder.TOP, null, null));

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
		print.setIcon(new javax.swing.ImageIcon(Handle.class.getResource("../../../../resources/icons/printing.png")));
		print.setBackground(new java.awt.Color(0, 153, 51));
		print.setForeground(new java.awt.Color(255, 255, 255));

		upload = new javax.swing.JButton("  Đăng tải");
		upload.setBackground(new java.awt.Color(0, 153, 51));
		upload.setForeground(new java.awt.Color(255, 255, 255));
		upload.setIcon(new javax.swing.ImageIcon(Handle.class.getResource("../../../../resources/icons/upload.png")));

		download = new javax.swing.JButton("  Tải xuống");
		download.setIcon(
				new javax.swing.ImageIcon(Handle.class.getResource("../../../../resources/icons/downloads.png")));
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

		gl_handle = new javax.swing.GroupLayout(handle);
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
	private static JPanel manageBookTab;
	private static JPanel handle;
	private static JSplitPane splitPane;
	private static GroupLayout gl_table;
	private static JPanel pnl;
	private static GroupLayout gl_pnl;
	private static JPanel details;
	private static GroupLayout gl_details;
	private static JScrollPane scrollPane;
	private static CardLayout cardLayout;
	private static JPanel pnlCards;

	private static javax.swing.GroupLayout gl_handle;
	private static javax.swing.JButton add;
	private static javax.swing.JButton edit;
	private static javax.swing.JButton delete;
	private static javax.swing.JButton search;
	private static javax.swing.JTextField searchField;
	private static javax.swing.JButton download;
	private static javax.swing.JButton upload;
	private static javax.swing.JButton print;
	private static javax.swing.JButton save;
	private static javax.swing.JButton reset;
	private static javax.swing.JButton view;
}
