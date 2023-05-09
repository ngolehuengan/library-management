package main.java.com.library.GUI.forms.ManageBook;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookPhoto {
	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	static void init(javax.swing.JComponent managePhotoTab, javax.swing.JComponent pnlCards) {
		// --Photo Documents Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlPhoto");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(
				new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết", javax.swing.border.TitledBorder.LEADING,
						javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		// -----Details: Image
		imgPnl = new javax.swing.JPanel();
		imgPnl.setBackground(new java.awt.Color(204, 204, 204));
		imgPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
		imgPnl.setLayout(new java.awt.BorderLayout(0, 0));
		img = new javax.swing.JLabel(new javax.swing.ImageIcon(
				ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));
		imgPnl.add(img, java.awt.BorderLayout.CENTER);

		// -----Details: InfoForm
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

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(80)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(gl_details.createSequentialGroup()
												.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(lblTitlePhoto,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblAuthorPhoto,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblCatePhoto))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(cbbCatePhoto, 0, 145, Short.MAX_VALUE)
														.addComponent(txtTitlePhoto,
																javax.swing.GroupLayout.DEFAULT_SIZE, 145,
																Short.MAX_VALUE)
														.addComponent(txtAuthorPhoto,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																145,
																Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
														.addComponent(lblYearPhoto,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblDescripPhoto,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE,
																180,
																Short.MAX_VALUE)
														.addComponent(cbbYearPhoto, 0, 180, Short.MAX_VALUE))))
								.addGap(80)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(60)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
										.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblTitlePhoto)
														.addComponent(txtTitlePhoto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCatePhoto)
														.addComponent(cbbCatePhoto,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(24)
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
										.addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE))));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(ManageBook.save);
		detailsHandle.add(ManageBook.reset);
		details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// ---Table
		tablePnl = new javax.swing.JPanel();
		splitPane.setRightComponent(tablePnl);
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

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

		tableHandle = new javax.swing.JPanel();
		tableHandle.add(ManageBook.view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

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
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
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
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
}