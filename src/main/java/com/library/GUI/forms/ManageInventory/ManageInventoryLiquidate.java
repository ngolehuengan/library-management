package main.java.com.library.GUI.forms.ManageInventory;

import java.util.Vector;
import main.java.com.library.BLL.ReleaseRecordBUS;

public class ManageInventoryLiquidate {
	@SuppressWarnings({ "serial" })
	static void init(javax.swing.JComponent pnlCards) {
		// --Liquidity Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlLiquidate");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết Hóa Đơn",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblPerson = new javax.swing.JLabel("Người tiếp nhận");
		txtPerson = new javax.swing.JTextField();
		txtPerson.setEnabled(false);
		txtPerson.setColumns(20);

		lblDate = new javax.swing.JLabel("Ngày");
		txtDate = new javax.swing.JTextField();
		txtDate.setEnabled(false);
		txtDate.setColumns(20);

		lblId = new javax.swing.JLabel("Mã hóa đơn");
		txtId = new javax.swing.JTextField();
		txtId.setEnabled(false);
		txtId.setColumns(20);

		lblSumCount = new javax.swing.JLabel("Tổng số lượng");
		txtSumCount = new javax.swing.JTextField();
		txtSumCount.setEnabled(false);
		txtSumCount.setColumns(20);

		lblDcmCode = new javax.swing.JLabel("Mã tài liệu");
		txtDcmCode = new javax.swing.JTextField();
		txtDcmCode.setEnabled(false);
		txtDcmCode.setColumns(20);

		lblCount = new javax.swing.JLabel("Số lượng");
		txtCount = new javax.swing.JTextField();
		txtCount.setEnabled(false);
		txtCount.setColumns(20);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(lblPerson).addComponent(lblDate).addComponent(lblId).addComponent(lblSumCount)
						.addComponent(lblDcmCode).addComponent(lblCount))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPerson).addComponent(txtDate).addComponent(txtId).addComponent(txtSumCount)
						.addComponent(txtDcmCode).addComponent(txtCount))
				.addGap(80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblId)
						.addComponent(txtId))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblSumCount).addComponent(txtSumCount))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDcmCode).addComponent(txtDcmCode))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblCount).addComponent(txtCount))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate).addComponent(txtDate))
				.addGap(24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPerson).addComponent(txtPerson)));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(ManageInventory.save);
		detailsHandle.add(ManageInventory.reset);
		details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// ---Table = Parent + Sub
		gridTablePnl = new javax.swing.JPanel();
		gridTablePnl.setLayout(new java.awt.GridLayout(2, 1));
		splitPane.setRightComponent(gridTablePnl);

		// ----Table: Parent
		tablePnl = new javax.swing.JPanel();
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));
		gridTablePnl.add(tablePnl);

		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new javax.swing.table.DefaultTableModel(new Vector(), new ReleaseRecordBUS().getHeader()) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);

		tableHandle = new javax.swing.JPanel();
		tableHandle.add(ManageInventory.view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

		// ----Table: Sub
		subTablePnl = new javax.swing.JPanel();
		subTablePnl.setLayout(new java.awt.BorderLayout(0, 0));
		gridTablePnl.add(subTablePnl);

		scrollPane = new javax.swing.JScrollPane();
		subTablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		subTable = new javax.swing.JTable();
		subTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		subTable.setModel(new javax.swing.table.DefaultTableModel(new Vector(),
				new ReleaseRecordBUS().getDetailHeader()) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		subTable.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(subTable);

		subTableHandle = new javax.swing.JPanel();
		subTableHandle.add(ManageInventory.addCthd);
		subTableHandle.add(ManageInventory.deleteCthd);
		subTableHandle.setBackground(new java.awt.Color(204, 255, 204));
		subTablePnl.add(subTableHandle, java.awt.BorderLayout.SOUTH);

		// Action
		// ManageInventory.add.addActionListener(e -> {
		// txtPerson.setEnabled(true);
		// txtDate.setEnabled(true);
		// txtId.setEnabled(true);
		// cbbYearPhoto.setEnabled(true);
		// txtAreaDescripPhoto.setEnabled(true);
		//
		// txtPerson.setText("");
		// txtDate.setSelectedIndex(0);
		// txtId.setText("");
		// cbbYearPhoto.setSelectedIndex(0);
		// txtAreaDescripPhoto.setText("");
		// });
		//
		// ManageInventory.delete.addActionListener(e -> {
		// txtPerson.setEnabled(false);
		// txtDate.setEnabled(false);
		// txtId.setEnabled(false);
		// cbbYearPhoto.setEnabled(false);
		// txtAreaDescripPhoto.setEnabled(false);
		//
		// txtPerson.setText("");
		// txtDate.setSelectedIndex(0);
		// txtId.setText("");
		// cbbYearPhoto.setSelectedIndex(0);
		// txtAreaDescripPhoto.setText("");
		// });
		//
		// ManageInventory.save.addActionListener(e -> {
		// txtPerson.setEnabled(false);
		// txtDate.setEnabled(false);
		// txtId.setEnabled(false);
		// cbbYearPhoto.setEnabled(false);
		// txtAreaDescripPhoto.setEnabled(false);
		// });
		//
		// ManageInventory.reset.addActionListener(e -> {
		// if (txtPerson.isEnabled()) {
		// txtPerson.setText("");
		// txtDate.setSelectedIndex(0);
		// txtId.setText("");
		// cbbYearPhoto.setSelectedIndex(0);
		// txtAreaDescripPhoto.setText("");
		// }
		// });
	}

	// Private
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JLabel lblPerson;
	private static javax.swing.JTextField txtPerson;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JLabel lblId;
	private static javax.swing.JTextField txtId;
	private static javax.swing.JLabel lblSumCount;
	private static javax.swing.JTextField txtSumCount;
	private static javax.swing.JLabel lblDcmCode;
	private static javax.swing.JTextField txtDcmCode;
	private static javax.swing.JLabel lblCount;
	private static javax.swing.JTextField txtCount;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel gridTablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JPanel subTablePnl;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
	private static javax.swing.JTable subTable;
	private static javax.swing.JPanel subTableHandle;
}