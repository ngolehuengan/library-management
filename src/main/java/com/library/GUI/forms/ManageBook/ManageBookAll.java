package main.java.com.library.GUI.forms.ManageBook;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookAll {
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public static void init(javax.swing.JComponent manageBookTab, javax.swing.JComponent pnlCards) {
		// --All Documents Tab = Details + Table
		pnl = new javax.swing.JPanel();
		pnl.setBackground(new java.awt.Color(204, 255, 204));
		pnlCards.add(pnl, "pnlAll");

		// ----Details
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
		lblIdAll = new javax.swing.JLabel("Mã tài liệu");
		txtIdAll = new javax.swing.JTextField();
		txtIdAll.setEnabled(false);
		txtIdAll.setColumns(10);

		lblCateAll = new javax.swing.JLabel("Loại tài liệu");
		cbbCateAll = new javax.swing.JComboBox();
		cbbCateAll.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
		cbbCateAll.setEnabled(false);

		lblTitleAll = new javax.swing.JLabel("Nhan đề");
		txtTitleAll = new javax.swing.JTextField();
		txtTitleAll.setEnabled(false);
		txtTitleAll.setColumns(10);

		lblValueAll = new javax.swing.JLabel("Giá trị");
		txtValueAll = new javax.swing.JTextField();
		txtValueAll.setEnabled(false);
		txtValueAll.setColumns(10);

		lblCountAll = new javax.swing.JLabel("Số lượng");
		txtCountAll = new javax.swing.JTextField();
		txtCountAll.setEnabled(false);
		txtCountAll.setColumns(10);

		lblNumberAll = new javax.swing.JLabel("Số có sẵn");
		txtNumberAll = new javax.swing.JTextField();
		txtNumberAll.setEnabled(false);
		txtNumberAll.setColumns(10);

		chckbxInvalidAll = new javax.swing.JCheckBox("Cho phép mượn");
		chckbxInvalidAll.setEnabled(false);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(gl_details.createSequentialGroup()
												.addGap(81)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(imgPnl,
																		javax.swing.GroupLayout.PREFERRED_SIZE,
																		87, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(lblIdAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblTitleAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCateAll))
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(cbbCateAll, 0, 145,
																				Short.MAX_VALUE)
																		.addComponent(txtTitleAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				141,
																				Short.MAX_VALUE)
																		.addComponent(txtIdAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				145,
																				Short.MAX_VALUE)))
														.addGroup(gl_details.createSequentialGroup()
																.addGroup(gl_details
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(lblValueAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCountAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblNumberAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(txtValueAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				180,
																				Short.MAX_VALUE)
																		.addComponent(txtCountAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				180,
																				Short.MAX_VALUE)
																		.addComponent(txtNumberAll,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				180,
																				Short.MAX_VALUE)))
														.addComponent(chckbxInvalidAll,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGap(174)
												.addComponent(ManageBook.save, javax.swing.GroupLayout.PREFERRED_SIZE,
														58,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(ManageBook.reset)))
								.addContainerGap(90, Short.MAX_VALUE)));
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
														.addComponent(lblIdAll)
														.addComponent(txtIdAll, javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCateAll)
														.addComponent(cbbCateAll,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblTitleAll)
														.addComponent(txtTitleAll,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblValueAll)
										.addComponent(txtValueAll, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblCountAll)
										.addComponent(txtCountAll, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblNumberAll)
										.addComponent(txtNumberAll, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addComponent(chckbxInvalidAll)
								.addGap(198)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(ManageBook.save)
										.addComponent(ManageBook.reset))
								.addGap(73)));
		details.setLayout(gl_details);

		// ---Table
		scrollPane = new javax.swing.JScrollPane();
		javax.swing.GroupLayout gl_pnl = new javax.swing.GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, javax.swing.GroupLayout.PREFERRED_SIZE, 512,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gl_pnl
												.createSequentialGroup()
												.addGap(261)
												.addComponent(ManageBook.view, javax.swing.GroupLayout.PREFERRED_SIZE,
														0, Short.MAX_VALUE)
												.addGap(231)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addGroup(javax.swing.GroupLayout.Alignment.LEADING, gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 528,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(ManageBook.view)
								.addContainerGap(62, Short.MAX_VALUE))
						.addComponent(details, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		pnl.setLayout(gl_pnl);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "LOẠI TÀI LIỆU", "MÃ TÀI LIỆU", "NHAN ĐỀ", "GIÁ TRỊ", "SỐ LƯỢNG", "SỐ CÓ SẴN",
						"MƯỢN ĐƯỢC"
				}) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		scrollPane.setViewportView(table);

		// Action
		ManageBook.add.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			chckbxInvalidAll.setEnabled(false);
		});

		ManageBook.edit.addActionListener(e -> {
			Handle.addImageBook(imgPnl, img);
			chckbxInvalidAll.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			chckbxInvalidAll.setEnabled(false);
			if (txtCountAll.getText().equals("0")) {
				img.setIcon(new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));
				txtIdAll.setText("");
				cbbCateAll.setSelectedIndex(0);
				txtTitleAll.setText("");
				txtValueAll.setText("");
				txtCountAll.setText("");
				txtNumberAll.setText("");
				chckbxInvalidAll.setSelected(false);
			}
		});

		ManageBook.save.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			chckbxInvalidAll.setEnabled(false);
		});

		ManageBook.reset.addActionListener(e -> {
			if (chckbxInvalidAll.isEnabled()) {
				img.setIcon(new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));
				chckbxInvalidAll.setSelected(false);
			}
		});
	}

	// Private
	private static javax.swing.JPanel pnl;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblIdAll;
	private static javax.swing.JTextField txtIdAll;
	private static javax.swing.JLabel lblCateAll;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbCateAll;
	private static javax.swing.JLabel lblTitleAll;
	private static javax.swing.JTextField txtTitleAll;
	private static javax.swing.JLabel lblValueAll;
	private static javax.swing.JTextField txtValueAll;
	private static javax.swing.JLabel lblCountAll;
	private static javax.swing.JTextField txtCountAll;
	private static javax.swing.JLabel lblNumberAll;
	private static javax.swing.JTextField txtNumberAll;
	private static javax.swing.JCheckBox chckbxInvalidAll;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
}