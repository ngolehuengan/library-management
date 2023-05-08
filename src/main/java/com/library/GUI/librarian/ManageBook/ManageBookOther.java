package main.java.com.library.GUI.librarian.ManageBook;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookOther {
	@SuppressWarnings("serial")
	static void init(javax.swing.JComponent ManageBookTab, javax.swing.JComponent pnlCards) {
		// --Other Documents Tab = Details + Table
		pnl = new javax.swing.JPanel();
		pnl.setBackground(new java.awt.Color(204, 255, 204));
		pnlCards.add(pnl, "pnlOther");

		// ---Details
		details = new javax.swing.JPanel();
		details.setBorder(
				new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.LEADING,
						javax.swing.border.TitledBorder.TOP, null, null));

		// ----Details: Image
		imgPnl = new javax.swing.JPanel();
		imgPnl.setBackground(new java.awt.Color(204, 204, 204));
		imgPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
		img = new javax.swing.JLabel(
				new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));
		img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

		javax.swing.GroupLayout gl_imgPnl = new javax.swing.GroupLayout(imgPnl);
		gl_imgPnl.setHorizontalGroup(
				gl_imgPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_imgPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addContainerGap()));
		gl_imgPnl.setVerticalGroup(
				gl_imgPnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_imgPnl.createSequentialGroup()
								.addComponent(img, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
								.addGap(0)));
		imgPnl.setLayout(gl_imgPnl);

		// ---Details: Info
		lblTitleOther = new javax.swing.JLabel("Nhan đề");
		txtTitleOther = new javax.swing.JTextField();
		txtTitleOther.setEnabled(false);
		txtTitleOther.setColumns(10);

		lblDescripOther = new javax.swing.JLabel("Mô tả");
		txtAreaDescripOther = new javax.swing.JTextArea();
		txtAreaDescripOther.setLineWrap(true);
		txtAreaDescripOther.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtAreaDescripOther);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(90)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(lblTitleOther, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 275,
												Short.MAX_VALUE)
										.addComponent(lblDescripOther, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 275,
												Short.MAX_VALUE)
										.addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												275, Short.MAX_VALUE)
										.addComponent(txtTitleOther, javax.swing.GroupLayout.Alignment.LEADING,
												javax.swing.GroupLayout.DEFAULT_SIZE, 275,
												Short.MAX_VALUE))
								.addGap(126))
						.addGroup(gl_details.createSequentialGroup()
								.addGap(161)
								.addComponent(ManageBook.save, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(ManageBook.reset)
								.addContainerGap(195, Short.MAX_VALUE))
						.addGroup(gl_details.createSequentialGroup()
								.addGap(187)
								.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addContainerGap(217, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(63)
								.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(lblTitleOther)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(txtTitleOther, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(26)
								.addComponent(lblDescripOther)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(127)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ManageBook.save)
										.addComponent(ManageBook.reset))
								.addGap(334)));
		details.setLayout(gl_details);

		// ---Table
		scrollPane = new javax.swing.JScrollPane();
		javax.swing.GroupLayout gl_pnl = new javax.swing.GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 512,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(260)
												.addComponent(ManageBook.view, javax.swing.GroupLayout.PREFERRED_SIZE,
														0, Short.MAX_VALUE)
												.addGap(245)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 536,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(ManageBook.view)
								.addContainerGap(188, Short.MAX_VALUE))
						.addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnl.setLayout(gl_pnl);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "MÃ TÀI LIỆU", "NHAN ĐỀ"
				}) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		scrollPane.setViewportView(table);

		// Action
		ManageBook.add.addActionListener(e -> {
			Handle.addImageBook(imgPnl, img);
			img.setIcon(
					new javax.swing.ImageIcon(
							ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

			txtTitleOther.setEnabled(true);
			txtAreaDescripOther.setEnabled(true);

			txtTitleOther.setText("");
			txtAreaDescripOther.setText("");
		});

		ManageBook.edit.addActionListener(e -> {
			Handle.addImageBook(imgPnl, img);

			txtTitleOther.setEnabled(true);
			txtAreaDescripOther.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			img.setIcon(
					new javax.swing.ImageIcon(
							ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

			txtTitleOther.setEnabled(false);
			txtAreaDescripOther.setEnabled(false);

			txtTitleOther.setText("");
			txtAreaDescripOther.setText("");
		});

		ManageBook.save.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);

			txtTitleOther.setEnabled(false);
			txtAreaDescripOther.setEnabled(false);
		});

		ManageBook.reset.addActionListener(e -> {
			if (txtTitleOther.isEnabled()) {
				img.setIcon(new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

				txtTitleOther.setText("");
				txtAreaDescripOther.setText("");
			}
		});
	}

	// Private
	private static javax.swing.JPanel pnl;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblTitleOther;
	private static javax.swing.JTextField txtTitleOther;
	private static javax.swing.JLabel lblDescripOther;
	private static javax.swing.JTextArea txtAreaDescripOther;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
}
