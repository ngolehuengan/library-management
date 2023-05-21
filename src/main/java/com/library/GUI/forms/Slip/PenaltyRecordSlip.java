package main.java.com.library.GUI.forms.Slip;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;

public class PenaltyRecordSlip {
	@SuppressWarnings("serial")
	static void init(javax.swing.JComponent pnlCards) {
		// --Penalty Slip Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlPenalty");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết Phiếu Ghi",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblId = new javax.swing.JLabel("Mã biên bản");
		txtId = new javax.swing.JTextField();
		txtId.setEnabled(false);
		txtId.setColumns(20);

		lblReader = new javax.swing.JLabel("Độc giả");
		txtReader = new javax.swing.JTextField();
		txtReader.setEnabled(false);
		txtReader.setColumns(20);

		lblContent = new javax.swing.JLabel("Nội dung");
		txtContent = new javax.swing.JTextArea(6, 1);
		txtContent.setEnabled(false);
		txtContent.setColumns(20);

		lblWayHandle = new javax.swing.JLabel("Hướng xử lý");
		txtWayHandle = new javax.swing.JTextArea(6, 1);
		txtWayHandle.setEnabled(false);
		txtWayHandle.setColumns(20);

		lblDate = new javax.swing.JLabel("Ngày lập biên bản");
		txtDate = new javax.swing.JTextField();
		txtDate.setEnabled(false);
		txtDate.setColumns(20);

<<<<<<< HEAD
		lblPenalty = new javax.swing.JLabel("Tiền phạt");
		txtPenalty = new javax.swing.JTextField(20);
		txtPenalty.setEnabled(false);
=======
<<<<<<< HEAD
		lblPenalty = new javax.swing.JLabel("Tiền phạt");
		txtPenalty = new javax.swing.JTextField(20);
		txtPenalty.setEnabled(false);
=======
		lblValue = new javax.swing.JLabel("Tiền phạt");
		txtValue = new javax.swing.JTextField(20);
		txtValue.setEnabled(false);
>>>>>>> parent of 83dfa60 (dcm)
>>>>>>> parent of e06cbe3 (.)

		lblPerson = new javax.swing.JLabel("Người tiếp nhận");
		txtPerson = new javax.swing.JTextField();
		txtPerson.setEnabled(false);
		txtPerson.setColumns(20);

		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtContent);

		javax.swing.JScrollPane scrollPane_1 = new javax.swing.JScrollPane();
		scrollPane_1.setViewportView(txtWayHandle);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblPerson).addComponent(lblId).addComponent(lblReader).addComponent(lblContent)
						.addComponent(lblWayHandle).addComponent(lblDate).addComponent(lblPenalty))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPerson).addComponent(txtId).addComponent(txtReader).addComponent(scrollPane)
						.addComponent(scrollPane_1).addComponent(txtDate).addComponent(txtPenalty))
				.addGap(0, 80, 80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblId)
						.addComponent(txtId))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblReader).addComponent(txtReader))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
						.addComponent(lblContent).addComponent(scrollPane))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
						.addComponent(lblWayHandle).addComponent(scrollPane_1))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate).addComponent(txtDate))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPenalty).addComponent(txtPenalty))
				.addGap(24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPerson).addComponent(txtPerson)));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(Slip.delete);
		details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// ---Table
		tablePnl = new javax.swing.JPanel();
		splitPane.setRightComponent(tablePnl);
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(
				new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.penaltyRecord()) {
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
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JLabel lblId;
	private static javax.swing.JTextField txtId;
	private static javax.swing.JLabel lblReader;
	private static javax.swing.JTextField txtReader;
	private static javax.swing.JLabel lblContent;
	private static javax.swing.JTextArea txtContent;
	private static javax.swing.JLabel lblWayHandle;
	private static javax.swing.JTextArea txtWayHandle;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JLabel lblPenalty;
	private static javax.swing.JTextField txtPenalty;
	private static javax.swing.JLabel lblPerson;
	private static javax.swing.JTextField txtPerson;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
}
