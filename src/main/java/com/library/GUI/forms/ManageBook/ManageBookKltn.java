package main.java.com.library.GUI.forms.ManageBook;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookKltn {
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	static void init(javax.swing.JComponent pnlCards) {
		// --KLTN Documents Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlKltn");

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
		lblTitleKltn = new javax.swing.JLabel("Nhan đề");
		txtTitleKltn = new javax.swing.JTextField();
		txtTitleKltn.setEnabled(false);
		txtTitleKltn.setColumns(15);

		lblCateKltn = new javax.swing.JLabel("Chuyên ngành");
		cbbCateKltn = new javax.swing.JComboBox();
		cbbCateKltn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCateKltn.setEnabled(false);

		lblAuthorKltn = new javax.swing.JLabel("Tác giả");
		txtAuthorKltn = new javax.swing.JTextField();
		txtAuthorKltn.setEnabled(false);
		txtAuthorKltn.setColumns(15);

		lblYearKltn = new javax.swing.JLabel("Năm bảo vệ");
		cbbYearKltn = new javax.swing.JComboBox();
		cbbYearKltn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearKltn.setEnabled(false);

		lblDescripKltn = new javax.swing.JLabel("Mô tả");
		txtAreaDescripKltn = new javax.swing.JTextArea(7, 1);
		txtAreaDescripKltn.setLineWrap(true);
		txtAreaDescripKltn.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtAreaDescripKltn);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(
				gl_details.createSequentialGroup()
						.addGap(80)
						.addGroup(gl_details
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(gl_details.createSequentialGroup()
										.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(24)
										.addGroup(gl_details
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(lblCateKltn)
												.addComponent(lblTitleKltn)
												.addComponent(lblAuthorKltn))
										.addGap(24)
										.addGroup(gl_details
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(txtAuthorKltn)
												.addComponent(txtTitleKltn)
												.addComponent(cbbCateKltn)))
								.addGroup(gl_details.createSequentialGroup()
										.addGroup(gl_details
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
												.addComponent(lblYearKltn)
												.addComponent(lblDescripKltn))
										.addGap(24)
										.addGroup(gl_details
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(scrollPane)
												.addComponent(cbbYearKltn))))
						.addGap(80));
		gl_details.setVerticalGroup(
				gl_details.createSequentialGroup()
						.addGap(80)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_details.createSequentialGroup()
										.addGroup(gl_details
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblTitleKltn)
												.addComponent(txtTitleKltn))
										.addGap(24)
										.addGroup(gl_details
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblAuthorKltn)
												.addComponent(txtAuthorKltn))
										.addGap(24)
										.addGroup(gl_details
												.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
												.addComponent(lblCateKltn)
												.addComponent(cbbCateKltn))))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblYearKltn)
								.addComponent(cbbYearKltn))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
								.addComponent(lblDescripKltn)
								.addComponent(scrollPane)));
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
						"STT", "MÃ TÀI LIỆU", "NHAN ĐỀ", "CHUYÊN NGÀNH", "NĂM BẢO VỆ", "MÔ TẢ"
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
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
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
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
}
