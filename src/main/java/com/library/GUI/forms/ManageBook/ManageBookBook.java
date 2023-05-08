package main.java.com.library.GUI.forms.ManageBook;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookBook {
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public static void init(javax.swing.JComponent manageBookTab, javax.swing.JComponent pnlCards) {
		// --Books Tab = Details + Table
		pnl = new javax.swing.JPanel();
		pnl.setBackground(new java.awt.Color(204, 255, 204));
		pnlCards.add(pnl, "pnlBook");

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

		// ----Details: Info
		lblIsbnBook = new javax.swing.JLabel("ISBN");
		txtIsbnBook = new javax.swing.JTextField();
		txtIsbnBook.setEnabled(false);
		txtIsbnBook.setColumns(10);

		lblTitleBook = new javax.swing.JLabel("Nhan đề");
		txtTitleBook = new javax.swing.JTextField();
		txtTitleBook.setEnabled(false);
		txtTitleBook.setColumns(10);

		lblCateBook = new javax.swing.JLabel("Thể loại");
		cbbCateBook = new javax.swing.JComboBox();
		cbbCateBook.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCateBook.setEnabled(false);

		lblAuthorBook = new javax.swing.JLabel("Tác giả");
		txtAuthorBook = new javax.swing.JTextField();
		txtAuthorBook.setEnabled(false);
		txtAuthorBook.setColumns(10);

		lblNxbBook = new javax.swing.JLabel("Nhà xuất bản");
		txtNxbBook = new javax.swing.JTextField();
		txtNxbBook.setEnabled(false);
		txtNxbBook.setColumns(10);

		lblYearBook = new javax.swing.JLabel("Năm xuất bản");
		cbbYearBook = new javax.swing.JComboBox();
		cbbYearBook.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearBook.setEnabled(false);

		lblDescripBook = new javax.swing.JLabel("Mô tả");
		txtAreaDescripBook = new javax.swing.JTextArea();
		txtAreaDescripBook.setLineWrap(true);
		txtAreaDescripBook.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtAreaDescripBook);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(81)
								.addGroup(gl_details
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(gl_details.createSequentialGroup()
												.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE,
														87,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(lblIsbnBook, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblCateBook, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblTitleBook))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(cbbCateBook, 0, 145, Short.MAX_VALUE)
														.addComponent(txtTitleBook)
														.addComponent(txtIsbnBook, javax.swing.GroupLayout.DEFAULT_SIZE,
																145,
																Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(lblAuthorBook,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblNxbBook, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblYearBook, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblDescripBook,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE,
																225,
																Short.MAX_VALUE)
														.addComponent(cbbYearBook, 0, 215, Short.MAX_VALUE)
														.addComponent(txtAuthorBook,
																javax.swing.GroupLayout.DEFAULT_SIZE, 180,
																Short.MAX_VALUE)
														.addComponent(txtNxbBook, javax.swing.GroupLayout.DEFAULT_SIZE,
																180,
																Short.MAX_VALUE)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(ManageBook.save,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 58,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(ManageBook.reset)))))
								.addContainerGap(104, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(59)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblIsbnBook)
														.addComponent(txtIsbnBook,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblTitleBook)
														.addComponent(txtTitleBook,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCateBook)
														.addComponent(cbbCateBook,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblAuthorBook)
										.addComponent(txtAuthorBook, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblNxbBook)
										.addComponent(txtNxbBook, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblYearBook)
										.addComponent(cbbYearBook, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblDescripBook)
										.addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(96)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ManageBook.save)
										.addComponent(ManageBook.reset))
								.addGap(202)));
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
														0,
														Short.MAX_VALUE)
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
						"STT", "ISBN", "NHAN ĐỀ", "THỂ LOẠI", "TÁC GIẢ", "NXB", "NĂM XB", "MÔ TẢ"
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
			img.setIcon(new javax.swing.ImageIcon(
					ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

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

		ManageBook.edit.addActionListener(e -> {
			Handle.addImageBook(imgPnl, img);

			txtIsbnBook.setEnabled(false);
			txtTitleBook.setEnabled(true);
			cbbCateBook.setEnabled(true);
			txtAuthorBook.setEnabled(true);
			txtNxbBook.setEnabled(true);
			cbbYearBook.setEnabled(true);
			txtAreaDescripBook.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			img.setIcon(new javax.swing.ImageIcon(
					ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

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

		ManageBook.save.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);

			txtIsbnBook.setEnabled(false);
			txtTitleBook.setEnabled(false);
			cbbCateBook.setEnabled(false);
			txtAuthorBook.setEnabled(false);
			txtNxbBook.setEnabled(false);
			cbbYearBook.setEnabled(false);
			txtAreaDescripBook.setEnabled(false);
		});

		ManageBook.reset.addActionListener(e -> {
			if (txtIsbnBook.isEnabled()) {
				img.setIcon(new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

				txtIsbnBook.setText("");
				txtTitleBook.setText("");
				cbbCateBook.setSelectedIndex(0);
				txtAuthorBook.setText("");
				txtNxbBook.setText("");
				cbbYearBook.setSelectedIndex(0);
				txtAreaDescripBook.setText("");
			} else if (!txtIsbnBook.isEnabled() && txtTitleBook.isEnabled()) {
				img.setIcon(new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

				txtTitleBook.setText("");
				cbbCateBook.setSelectedIndex(0);
				txtAuthorBook.setText("");
				txtNxbBook.setText("");
				cbbYearBook.setSelectedIndex(0);
				txtAreaDescripBook.setText("");
			}
		});
	}

	// Private
	private static javax.swing.JPanel pnl;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblIsbnBook;
	private static javax.swing.JTextField txtIsbnBook;
	private static javax.swing.JLabel lblTitleBook;
	private static javax.swing.JTextField txtTitleBook;
	private static javax.swing.JLabel lblCateBook;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbCateBook;
	private static javax.swing.JLabel lblAuthorBook;
	private static javax.swing.JTextField txtAuthorBook;
	private static javax.swing.JLabel lblNxbBook;
	private static javax.swing.JTextField txtNxbBook;
	private static javax.swing.JLabel lblYearBook;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbYearBook;
	private static javax.swing.JLabel lblDescripBook;
	private static javax.swing.JTextArea txtAreaDescripBook;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
}
