package main.java.com.library.GUI.forms.ManageBook;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;
import main.java.com.library.GUI.handle.Handle;

public class ManageBookBook {
	@SuppressWarnings({ "unchecked", "rawtypes", "serial" })
	public static void init(javax.swing.JComponent pnlCards) {
		// --Books Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlBook");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
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
		lblIsbnBook = new javax.swing.JLabel("ISBN");
		txtIsbnBook = new javax.swing.JTextField();
		txtIsbnBook.setEnabled(false);
		txtIsbnBook.setColumns(15);

		lblTitleBook = new javax.swing.JLabel("Nhan đề");
		txtTitleBook = new javax.swing.JTextField();
		txtTitleBook.setEnabled(false);
		txtTitleBook.setColumns(15);

		lblCateBook = new javax.swing.JLabel("Thể loại");
		cbbCateBook = new javax.swing.JComboBox();
		cbbCateBook.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbCateBook.setEnabled(false);

		lblAuthorBook = new javax.swing.JLabel("Tác giả");
		txtAuthorBook = new javax.swing.JTextField();
		txtAuthorBook.setEnabled(false);
		txtAuthorBook.setColumns(15);

		lblNxbBook = new javax.swing.JLabel("Nhà xuất bản");
		txtNxbBook = new javax.swing.JTextField();
		txtNxbBook.setEnabled(false);
		txtNxbBook.setColumns(15);

		lblYearBook = new javax.swing.JLabel("Năm xuất bản");
		cbbYearBook = new javax.swing.JComboBox();
		cbbYearBook.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "test" }));
		cbbYearBook.setEnabled(false);

		lblDescripBook = new javax.swing.JLabel("Mô tả");
		txtAreaDescripBook = new javax.swing.JTextArea(7, 1);
		txtAreaDescripBook.setLineWrap(true);
		txtAreaDescripBook.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtAreaDescripBook);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80).addGroup(gl_details
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_details.createSequentialGroup()
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblIsbnBook).addComponent(lblCateBook).addComponent(lblTitleBook))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cbbCateBook).addComponent(txtTitleBook).addComponent(txtIsbnBook)))
				.addGroup(gl_details.createSequentialGroup()
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblAuthorBook).addComponent(lblNxbBook).addComponent(lblYearBook)
								.addComponent(lblDescripBook))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(scrollPane).addComponent(cbbYearBook).addComponent(txtAuthorBook)
								.addComponent(txtNxbBook))))
				.addGap(0, 80, 80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblIsbnBook).addComponent(txtIsbnBook))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblTitleBook).addComponent(txtTitleBook))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblCateBook).addComponent(cbbCateBook))))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblAuthorBook).addComponent(txtAuthorBook))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblNxbBook).addComponent(txtNxbBook))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblYearBook).addComponent(cbbYearBook))
				.addGap(24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
						.addComponent(lblDescripBook).addComponent(scrollPane)));
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
		table.setModel(new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.book()) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);

		tableHandle = new javax.swing.JPanel();
		tableHandle.add(ManageBook.view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

		// Action
		ManageBook.add.addActionListener(e -> {
			Handle.addImage(imgPnl, img);
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
			Handle.addImage(imgPnl, img);

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
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
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
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
}
