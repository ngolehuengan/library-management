package main.java.com.library.GUI.forms.Slip;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;

public class HistorySlip {
	@SuppressWarnings("serial")
	static void init(javax.swing.JComponent pnlCards) {
		// --History Slip Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlHistory");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết Phiếu Ghi",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));

		lblId = new javax.swing.JLabel("Mã phiếu");
		txtId = new javax.swing.JTextField();
		txtId.setEnabled(false);
		txtId.setColumns(20);

		lblDcmCode = new javax.swing.JLabel("Mã tài liệu");
		txtDcmCode = new javax.swing.JTextField();
		txtDcmCode.setEnabled(false);
		txtDcmCode.setColumns(20);

		lblTitle = new javax.swing.JLabel("Nhan đề");
		txtTitle = new javax.swing.JTextField();
		txtTitle.setEnabled(false);
		txtTitle.setColumns(20);

		lblLoanPerson = new javax.swing.JLabel("Người mượn");
		txtLoanPerson = new javax.swing.JTextField();
		txtLoanPerson.setEnabled(false);
		txtLoanPerson.setColumns(20);

		lblLoanDate = new javax.swing.JLabel("Ngày mượn");
		txtLoanDate = new javax.swing.JTextField();
		txtLoanDate.setEnabled(false);
		txtLoanDate.setColumns(20);

		lblAppointDate = new javax.swing.JLabel("Ngày hẹn trả");
		txtAppointDate = new javax.swing.JTextField();
		txtAppointDate.setEnabled(false);
		txtAppointDate.setColumns(20);

		lblDate = new javax.swing.JLabel("Ngày trả");
		txtDate = new javax.swing.JTextField();
		txtDate.setEnabled(false);
		txtDate.setColumns(20);

		lblPenalty = new javax.swing.JLabel("Tiền phạt");
		txtPenalty = new javax.swing.JTextField();
		txtPenalty.setEnabled(false);
		txtPenalty.setColumns(20);

		lblPerson = new javax.swing.JLabel("Người tiếp nhận");
		txtPerson = new javax.swing.JTextField();
		txtPerson.setEnabled(false);
		txtPerson.setColumns(20);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details
				.setHorizontalGroup(gl_details.createSequentialGroup().addGap(80)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblPerson).addComponent(lblDate).addComponent(lblId)
								.addComponent(lblDcmCode).addComponent(lblLoanPerson).addComponent(lblLoanDate)
								.addComponent(lblAppointDate).addComponent(lblTitle).addComponent(lblPenalty))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtPerson).addComponent(txtDate).addComponent(txtId)
								.addComponent(txtDcmCode).addComponent(txtLoanPerson).addComponent(txtLoanDate)
								.addComponent(txtAppointDate).addComponent(txtPenalty).addComponent(txtTitle))
						.addGap(80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblId)
						.addComponent(txtId))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDcmCode).addComponent(txtDcmCode))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblTitle).addComponent(txtTitle))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblLoanPerson).addComponent(txtLoanPerson))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblLoanDate).addComponent(txtLoanDate))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblAppointDate).addComponent(txtAppointDate))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate).addComponent(txtDate))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPenalty).addComponent(txtPenalty))
				.addGap(24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPerson).addComponent(txtPerson)));
		details.setLayout(gl_details);

		// ---Table
		tablePnl = new javax.swing.JPanel();
		splitPane.setRightComponent(tablePnl);
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.borrowHistory()) {
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
	}

	// Private
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JLabel lblId;
	private static javax.swing.JTextField txtId;
	private static javax.swing.JLabel lblDcmCode;
	private static javax.swing.JTextField txtDcmCode;
	private static javax.swing.JLabel lblTitle;
	private static javax.swing.JTextField txtTitle;
	private static javax.swing.JLabel lblLoanPerson;
	private static javax.swing.JTextField txtLoanPerson;
	private static javax.swing.JLabel lblLoanDate;
	private static javax.swing.JTextField txtLoanDate;
	private static javax.swing.JLabel lblAppointDate;
	private static javax.swing.JTextField txtAppointDate;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JLabel lblPenalty;
	private static javax.swing.JTextField txtPenalty;
	private static javax.swing.JLabel lblPerson;
	private static javax.swing.JTextField txtPerson;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
}