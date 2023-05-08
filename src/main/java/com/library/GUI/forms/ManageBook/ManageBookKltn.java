package main.java.com.library.GUI.forms.ManageBook;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookKltn {
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	static void init(javax.swing.JComponent manageKltnTab, javax.swing.JComponent pnlCards) {
		// --KLTN Documents Tab = Details + Table
		pnl = new javax.swing.JPanel();
		pnl.setBackground(new java.awt.Color(204, 255, 204));
		pnlCards.add(pnl, "pnlKltn");

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
		lblTitleKltn = new javax.swing.JLabel("Nhan đề");
		txtTitleKltn = new javax.swing.JTextField();
		txtTitleKltn.setEnabled(false);
		txtTitleKltn.setColumns(10);

		lblCateKltn = new javax.swing.JLabel("Chuyên ngành");
		cbbCateKltn = new javax.swing.JComboBox();
		cbbCateKltn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCateKltn.setEnabled(false);

		lblAuthorKltn = new javax.swing.JLabel("Tác giả");
		txtAuthorKltn = new javax.swing.JTextField();
		txtAuthorKltn.setEnabled(false);
		txtAuthorKltn.setColumns(10);

		lblYearKltn = new javax.swing.JLabel("Năm bảo vệ");
		cbbYearKltn = new javax.swing.JComboBox();
		cbbYearKltn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearKltn.setEnabled(false);

		lblDescripKltn = new javax.swing.JLabel("Mô tả");
		txtAreaDescripKltn = new javax.swing.JTextArea();
		txtAreaDescripKltn.setLineWrap(true);
		txtAreaDescripKltn.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtAreaDescripKltn);

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
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(lblCateKltn, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblTitleKltn,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(lblAuthorKltn,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(19)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(txtAuthorKltn)
														.addComponent(txtTitleKltn,
																javax.swing.GroupLayout.DEFAULT_SIZE, 132,
																Short.MAX_VALUE)
														.addComponent(cbbCateKltn,
																javax.swing.GroupLayout.Alignment.TRAILING, 0,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(lblYearKltn)
														.addComponent(lblDescripKltn))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE,
																225,
																Short.MAX_VALUE)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(ManageBook.save,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 58,
																		javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addComponent(ManageBook.reset))
														.addComponent(cbbYearKltn, 0, 249, Short.MAX_VALUE))))
								.addContainerGap(89, Short.MAX_VALUE)));
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
														.addComponent(lblTitleKltn)
														.addComponent(txtTitleKltn,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblAuthorKltn)
														.addComponent(txtAuthorKltn,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGap(18)
												.addGroup(gl_details
														.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(lblCateKltn)
														.addComponent(cbbCateKltn,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblYearKltn)
										.addComponent(cbbYearKltn, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(lblDescripKltn)
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
						"STT", "MÃ TÀI LIỆU", "NHAN ĐỀ", "CHUYÊN NGÀNH", "NĂM BẢO VỆ", "MÔ TẢ"
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

			txtTitleKltn.setEnabled(true);
			txtAuthorKltn.setEnabled(true);
			cbbCateKltn.setEnabled(true);
			cbbYearKltn.setEnabled(true);
			txtAreaDescripKltn.setEnabled(true);

			txtTitleKltn.setText("");
			txtAuthorKltn.setText("");
			cbbCateKltn.setSelectedIndex(0);
			cbbYearKltn.setSelectedIndex(0);
			txtAreaDescripKltn.setText("");
		});

		ManageBook.edit.addActionListener(e -> {
			Handle.addImageBook(imgPnl, img);

			txtTitleKltn.setEnabled(true);
			txtAuthorKltn.setEnabled(true);
			cbbCateKltn.setEnabled(true);
			cbbYearKltn.setEnabled(true);
			txtAreaDescripKltn.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			img.setIcon(new javax.swing.ImageIcon(
					ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

			txtTitleKltn.setEnabled(false);
			txtAuthorKltn.setEnabled(false);
			cbbCateKltn.setEnabled(false);
			cbbYearKltn.setEnabled(false);
			txtAreaDescripKltn.setEnabled(false);

			txtTitleKltn.setText("");
			txtAuthorKltn.setText("");
			cbbCateKltn.setSelectedIndex(0);
			cbbYearKltn.setSelectedIndex(0);
			txtAreaDescripKltn.setText("");
		});

		ManageBook.save.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);

			txtTitleKltn.setEnabled(false);
			txtAuthorKltn.setEnabled(false);
			cbbCateKltn.setEnabled(false);
			cbbYearKltn.setEnabled(false);
			txtAreaDescripKltn.setEnabled(false);
		});

		ManageBook.reset.addActionListener(e -> {
			if (txtTitleKltn.isEnabled()) {
				img.setIcon(new javax.swing.ImageIcon(
						ManageBook.class.getResource("../../../../../resources/images/image-gallery.png")));

				txtTitleKltn.setText("");
				txtAuthorKltn.setText("");
				cbbCateKltn.setSelectedIndex(0);
				cbbYearKltn.setSelectedIndex(0);
				txtAreaDescripKltn.setText("");
			}
		});
	}

	// Private
	private static javax.swing.JPanel pnl;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblTitleKltn;
	private static javax.swing.JTextField txtTitleKltn;
	private static javax.swing.JLabel lblCateKltn;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbCateKltn;
	private static javax.swing.JLabel lblAuthorKltn;
	private static javax.swing.JTextField txtAuthorKltn;
	private static javax.swing.JLabel lblYearKltn;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbYearKltn;
	private static javax.swing.JLabel lblDescripKltn;
	private static javax.swing.JTextArea txtAreaDescripKltn;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
}
