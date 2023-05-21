package main.java.com.library.GUI.forms.ManageBook;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;
import main.java.com.library.GUI.handle.Handle;

public class ManageBookOther {
	@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
	static void init(javax.swing.JComponent pnlCards) {
		// -- Documents Tab = Details + Table
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
		img = new javax.swing.JLabel(Handle.setDefaultImg());
		imgPnl.add(img, java.awt.BorderLayout.CENTER);

		// -----Details: InfoForm
		lblTitle = new javax.swing.JLabel("Nhan đề");
		txtTitle = new javax.swing.JTextField(30);
		txtTitle.setEnabled(false);

		lblDescript = new javax.swing.JLabel("Mô tả");
		txtDescript = new javax.swing.JTextArea(7, 1);
		txtDescript.setLineWrap(true);
		txtDescript.setEnabled(false);
		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtDescript);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblDescript, javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(scrollPane, javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtTitle, javax.swing.GroupLayout.Alignment.LEADING))
				.addGap(0, 80, 80));
		gl_details.setVerticalGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
				.addGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24).addComponent(lblTitle)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(txtTitle).addGap(24).addComponent(lblDescript)
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
			img.setIcon(Handle.setDefaultImg());

			txtTitle.setEnabled(true);
			txtDescript.setEnabled(true);

			txtTitle.setText("");
			txtDescript.setText("");
		});

		ManageBook.edit.addActionListener(e -> {
			Handle.addImage(imgPnl, img);

			txtTitle.setEnabled(true);
			txtDescript.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			img.setIcon(Handle.setDefaultImg());

			txtTitle.setEnabled(false);
			txtDescript.setEnabled(false);

			txtTitle.setText("");
			txtDescript.setText("");
		});

		ManageBook.save.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);

			txtTitle.setEnabled(false);
			txtDescript.setEnabled(false);
		});

		ManageBook.reset.addActionListener(e -> {
			if (txtTitle.isEnabled()) {
				img.setIcon(Handle.setDefaultImg());

				txtTitle.setText("");
				txtDescript.setText("");
			}
		});
	}

	// Private
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblTitle;
	private static javax.swing.JTextField txtTitle;
	private static javax.swing.JLabel lblDescript;
	private static javax.swing.JTextArea txtDescript;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JTable table;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JPanel tableHandle;
}
