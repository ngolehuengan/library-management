package main.java.com.library.GUI.forms.ManageBook;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;
import main.java.com.library.GUI.handle.Handle;

public class ManageBookAll {
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public static void init(javax.swing.JComponent pnlCards) {
		// --All Documents Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlAll");

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
		lblId = new javax.swing.JLabel("Mã tài liệu");
		txtId = new javax.swing.JTextField(15);
		txtId.setEnabled(false);

		lblCate = new javax.swing.JLabel("Loại tài liệu");
		cbbCate = new javax.swing.JComboBox();
		cbbCate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "" }));
		cbbCate.setEnabled(false);

		lblTitle = new javax.swing.JLabel("Nhan đề");
		txtTitle = new javax.swing.JTextField(15);
		txtTitle.setEnabled(false);

		lblValue = new javax.swing.JLabel("Giá trị");
		txtValue = new javax.swing.JTextField(15);
		txtValue.setEnabled(false);

		lblNumber = new javax.swing.JLabel("Số lượng");
		txtNumber = new javax.swing.JTextField(15);
		txtNumber.setEnabled(false);

		lblExist = new javax.swing.JLabel("Số có sẵn");
		txtExist = new javax.swing.JTextField(15);
		txtExist.setEnabled(false);

		chckbxInvalid = new javax.swing.JCheckBox("Cho phép mượn");
		chckbxInvalid.setEnabled(false);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80).addGroup(gl_details
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_details.createSequentialGroup()
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblId).addComponent(lblTitle).addComponent(lblCate))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cbbCate).addComponent(txtTitle).addComponent(txtId)))
				.addGroup(gl_details.createSequentialGroup()
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblValue).addComponent(lblNumber).addComponent(lblExist))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtValue).addComponent(txtNumber).addComponent(txtExist)))
				.addComponent(chckbxInvalid)).addGap(10, 80, 80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblId).addComponent(txtId))
								.addGap(5, 15, 24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblCate).addComponent(cbbCate))
								.addGap(5, 15, 24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblTitle).addComponent(txtTitle))))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblValue).addComponent(txtValue))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblNumber).addComponent(txtNumber))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblExist).addComponent(txtExist))
				.addGap(5, 15, 24).addComponent(chckbxInvalid).addGap(10, 80, 80));
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
		table.setModel(new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.allDocument()) {
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
			Handle.removeClickListener(imgPnl);
			chckbxInvalid.setEnabled(false);
		});

		ManageBook.edit.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			chckbxInvalid.setEnabled(true);
		});

		ManageBook.delete.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			chckbxInvalid.setEnabled(false);
			if (txtNumber.getText().equals("0")) {
				img.setIcon(Handle.setDefaultImg());
				txtId.setText("");
				cbbCate.setSelectedIndex(0);
				txtTitle.setText("");
				txtValue.setText("");
				txtNumber.setText("");
				txtExist.setText("");
				chckbxInvalid.setSelected(false);
			}
		});

		ManageBook.save.addActionListener(e -> {
			Handle.removeClickListener(imgPnl);
			chckbxInvalid.setEnabled(false);
		});

		ManageBook.reset.addActionListener(e -> {
			if (chckbxInvalid.isEnabled()) {
				img.setIcon(Handle.setDefaultImg());
				chckbxInvalid.setSelected(false);
			}
		});
	}

	// Private
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JPanel imgPnl;
	private static javax.swing.JLabel img;
	private static javax.swing.JLabel lblId;
	private static javax.swing.JTextField txtId;
	private static javax.swing.JLabel lblCate;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox cbbCate;
	private static javax.swing.JLabel lblTitle;
	private static javax.swing.JTextField txtTitle;
	private static javax.swing.JLabel lblValue;
	private static javax.swing.JTextField txtValue;
	private static javax.swing.JLabel lblNumber;
	private static javax.swing.JTextField txtNumber;
	private static javax.swing.JLabel lblExist;
	private static javax.swing.JTextField txtExist;
	private static javax.swing.JCheckBox chckbxInvalid;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
}