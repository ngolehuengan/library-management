package main.java.com.library.GUI.forms.Slip;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;

public class LoanSlip {
	@SuppressWarnings("serial")
	static void init(javax.swing.JComponent pnlCards) {
		// --Loan Slip Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlLoan");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết Phiếu Ghi",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblId = new javax.swing.JLabel("Mã phiếu");
		txtId = new javax.swing.JTextField(20);
		txtId.setEnabled(false);

		lblReader = new javax.swing.JLabel("Độc giả");
		txtReader = new javax.swing.JTextField(20);
		txtReader.setEnabled(false);

		lblLoanDate = new javax.swing.JLabel("Ngày mượn");
		txtLoanDate = new javax.swing.JTextField(20);
		txtLoanDate.setEnabled(false);

		lblAppointDate = new javax.swing.JLabel("Ngày hẹn trả");
		txtAppointDate = new javax.swing.JTextField(20);
		txtAppointDate.setEnabled(false);

		lblQuantity = new javax.swing.JLabel("Tổng số lượng");
		txtQuantity = new javax.swing.JTextField(20);
		txtQuantity.setEnabled(false);

		lblReturned = new javax.swing.JLabel("Số đã trả");
		txtReturned = new javax.swing.JTextField(20);
		txtReturned.setEnabled(false);

		lblPerson = new javax.swing.JLabel("Người tiếp nhận");
		txtPerson = new javax.swing.JTextField(20);
		txtPerson.setEnabled(false);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblPerson).addComponent(lblId).addComponent(lblReader).addComponent(lblLoanDate)
						.addComponent(lblAppointDate).addComponent(lblQuantity).addComponent(lblReturned))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPerson).addComponent(txtId).addComponent(txtReader).addComponent(txtLoanDate)
						.addComponent(txtAppointDate).addComponent(txtQuantity).addComponent(txtReturned))
				.addGap(10, 80, 80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblId)
						.addComponent(txtId))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblReader).addComponent(txtReader))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblLoanDate).addComponent(txtLoanDate))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblAppointDate).addComponent(txtAppointDate))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblQuantity).addComponent(txtQuantity))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblReturned).addComponent(txtReturned))
				.addGap(5, 15, 24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPerson).addComponent(txtPerson)).addGap(10, 80, 80));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(Slip.delete);
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
		table.setModel(
				new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.loanSlip()) {
					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return false;
					}
				});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);

		tableHandle = new javax.swing.JPanel();
		tableHandle.add(Slip.view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

		// ----Table: Sub
		scrollPane = new javax.swing.JScrollPane();
		gridTablePnl.add(scrollPane);

		subTable = new javax.swing.JTable();
		subTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		subTable.setModel(new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.loanDetail()) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		subTable.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(subTable);
	}

	// Private
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JLabel lblId;
	private static javax.swing.JTextField txtId;
	private static javax.swing.JLabel lblReader;
	private static javax.swing.JTextField txtReader;
	private static javax.swing.JLabel lblLoanDate;
	private static javax.swing.JTextField txtLoanDate;
	private static javax.swing.JLabel lblAppointDate;
	private static javax.swing.JTextField txtAppointDate;
	private static javax.swing.JLabel lblQuantity;
	private static javax.swing.JTextField txtQuantity;
	private static javax.swing.JLabel lblReturned;
	private static javax.swing.JTextField txtReturned;
	private static javax.swing.JLabel lblPerson;
	private static javax.swing.JTextField txtPerson;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JPanel gridTablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
	private static javax.swing.JTable subTable;
}
