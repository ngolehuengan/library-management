package main.java.com.library.GUI.forms.ManageBook;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;
import main.java.com.library.GUI.handle.Handle;

public class ManageBookOther {
	@SuppressWarnings("serial")
	static void init(javax.swing.JComponent pnlCards) {
		// --Other Documents Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlOther");

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
		lblTitleOther = new javax.swing.JLabel("Nhan đề");
		txtTitleOther = new javax.swing.JTextField();
		txtTitleOther.setEnabled(false);
		txtTitleOther.setColumns(30);

		lblDescripOther = new javax.swing.JLabel("Mô tả");
		txtAreaDescripOther = new javax.swing.JTextArea(7, 1);
		txtAreaDescripOther.setLineWrap(true);
		txtAreaDescripOther.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtAreaDescripOther);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitleOther, javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblDescripOther, javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtTitleOther, javax.swing.GroupLayout.Alignment.LEADING))
				.addGap(0, 80, 80));
		gl_details.setVerticalGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
				.addGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24).addComponent(lblTitleOther)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(txtTitleOther).addGap(24).addComponent(lblDescripOther)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
		table.setModel(new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.other()) {
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

			txtTitleOther.setEnabled(true);
			txtAreaDescripOther.setEnabled(true);

			txtTitleOther.setText("");
			txtAreaDescripOther.setText("");
		});

		ManageBook.edit.addActionListener(e -> {
			Handle.addImage(imgPnl, img);

			txtTitleOther.setEnabled(true);
			txtAreaDescripOther.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			img.setIcon(new javax.swing.ImageIcon(
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
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblTitleOther;
	private static javax.swing.JTextField txtTitleOther;
	private static javax.swing.JLabel lblDescripOther;
	private static javax.swing.JTextArea txtAreaDescripOther;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JTable table;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JPanel tableHandle;
}
