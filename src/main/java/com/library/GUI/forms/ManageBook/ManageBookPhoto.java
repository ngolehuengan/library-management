package main.java.com.library.GUI.forms.ManageBook;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookPhoto {
	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	static void init(javax.swing.JComponent managePhotoTab, javax.swing.JComponent pnlCards) {
		// --Photo Documents Tab = Details + Table
		pnl = new javax.swing.JPanel();
		pnl.setBackground(new java.awt.Color(204, 255, 204));
		pnlCards.add(pnl, "pnlPhoto");

		// ---Details
		details = new javax.swing.JPanel();
		details.setBorder(
				new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.LEADING,
						javax.swing.border.TitledBorder.TOP, null, null));

		// ----Details: Image
		imgPnl = new javax.swing.JPanel();
		imgPnl.setBackground(new java.awt.Color(204, 204, 204));
		imgPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
		img = new javax.swing.JLabel(new javax.swing.ImageIcon(
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
		lblTitlePhoto = new javax.swing.JLabel("Nhan đề");
		txtTitlePhoto = new javax.swing.JTextField();
		txtTitlePhoto.setEnabled(false);
		txtTitlePhoto.setColumns(10);

		lblCatePhoto = new javax.swing.JLabel("Thể loại");
		cbbCatePhoto = new javax.swing.JComboBox();
		cbbCatePhoto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCatePhoto.setEnabled(false);

		lblAuthorPhoto = new javax.swing.JLabel("Tác giả");
		txtAuthorPhoto = new javax.swing.JTextField();
		txtAuthorPhoto.setEnabled(false);
		txtAuthorPhoto.setColumns(10);

		lblYearPhoto = new javax.swing.JLabel("Năm xuất bản");
		cbbYearPhoto = new javax.swing.JComboBox();
		cbbYearPhoto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearPhoto.setEnabled(false);

		lblDescripPhoto = new javax.swing.JLabel("Mô tả");
		txtAreaDescripPhoto = new javax.swing.JTextArea();
		txtAreaDescripPhoto.setLineWrap(true);
		txtAreaDescripPhoto.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtAreaDescripPhoto);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(81)
								.addGroup(gl_details
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
										.addGroup(gl_details.createSequentialGroup()
												.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(lblTitlePhoto)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED))
														.addGroup(gl_details.createSequentialGroup()
																.addGroup(gl_details
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addComponent(lblAuthorPhoto,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCatePhoto,
																				javax.swing.GroupLayout.Alignment.LEADING,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				45,
																				Short.MAX_VALUE))
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(gl_details.createSequentialGroup()
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(txtAuthorPhoto,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				163,
																				Short.MAX_VALUE)
																		.addComponent(cbbCatePhoto, 0, 158,
																				Short.MAX_VALUE)))
														.addGroup(gl_details.createSequentialGroup()
																.addGap(19)
																.addComponent(txtTitlePhoto,
																		javax.swing.GroupLayout.DEFAULT_SIZE,
																		162, Short.MAX_VALUE))))
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblYearPhoto)
														.addComponent(lblDescripPhoto))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE,
																225,
																Short.MAX_VALUE)
														.addComponent(cbbYearPhoto, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(ManageBook.save,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 58,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(ManageBook.reset)))))
								.addContainerGap(79, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(63)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 101,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblTitlePhoto)
														.addComponent(txtTitlePhoto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCatePhoto)
														.addComponent(cbbCatePhoto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblAuthorPhoto)
														.addComponent(txtAuthorPhoto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblYearPhoto)
										.addComponent(cbbYearPhoto, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblDescripPhoto)
										.addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 118,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(184)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ManageBook.save)
										.addComponent(ManageBook.reset))
								.addGap(301)));
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
						"STT", "NHAN ĐỀ", "THỂ LOẠI", "TÁC GIẢ", "NĂM XB", "MÔ TẢ"
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

			txtTitlePhoto.setEnabled(true);
			cbbCatePhoto.setEnabled(true);
			txtAuthorPhoto.setEnabled(true);
			cbbYearPhoto.setEnabled(true);
			txtAreaDescripPhoto.setEnabled(true);

			txtTitlePhoto.setText("");
			cbbCatePhoto.setSelectedIndex(0);
			txtAuthorPhoto.setText("");
			cbbYearPhoto.setSelectedIndex(0);
			txtAreaDescripPhoto.setText("");
		});

		ManageBook.edit.addActionListener(e -> {
			Handle.addImageBook(imgPnl, img);

			txtTitlePhoto.setEnabled(true);
			cbbCatePhoto.setEnabled(true);
			txtAuthorPhoto.setEnabled(true);
			cbbYearPhoto.setEnabled(true);
			txtAreaDescripPhoto.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			img.setIcon(new javax.swing.ImageIcon(
					ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

			txtTitlePhoto.setEnabled(false);
			cbbCatePhoto.setEnabled(false);
			txtAuthorPhoto.setEnabled(false);
			cbbYearPhoto.setEnabled(false);
			txtAreaDescripPhoto.setEnabled(false);

			txtTitlePhoto.setText("");
			cbbCatePhoto.setSelectedIndex(0);
			txtAuthorPhoto.setText("");
			cbbYearPhoto.setSelectedIndex(0);
			txtAreaDescripPhoto.setText("");
		});

		ManageBook.save.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);

			txtTitlePhoto.setEnabled(false);
			cbbCatePhoto.setEnabled(false);
			txtAuthorPhoto.setEnabled(false);
			cbbYearPhoto.setEnabled(false);
			txtAreaDescripPhoto.setEnabled(false);
		});

		ManageBook.reset.addActionListener(e -> {
			if (txtTitlePhoto.isEnabled()) {
				img.setIcon(new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

				txtTitlePhoto.setText("");
				cbbCatePhoto.setSelectedIndex(0);
				txtAuthorPhoto.setText("");
				cbbYearPhoto.setSelectedIndex(0);
				txtAreaDescripPhoto.setText("");
			}
		});
	}

	// Private
	private static javax.swing.JPanel pnl;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblTitlePhoto;
	private static javax.swing.JTextField txtTitlePhoto;
	private static javax.swing.JLabel lblCatePhoto;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbCatePhoto;
	private static javax.swing.JLabel lblAuthorPhoto;
	private static javax.swing.JTextField txtAuthorPhoto;
	private static javax.swing.JLabel lblYearPhoto;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbYearPhoto;
	private static javax.swing.JLabel lblDescripPhoto;
	private static javax.swing.JTextArea txtAreaDescripPhoto;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
}
