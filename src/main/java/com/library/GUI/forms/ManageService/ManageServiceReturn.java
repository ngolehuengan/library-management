package main.java.com.library.GUI.forms.ManageService;

import java.util.Vector;
import main.java.com.library.GUI.components.TableHeader;

public class ManageServiceReturn {
	@SuppressWarnings({ "serial", "unchecked", "rawtypes" })
	static void init(javax.swing.JComponent pnlCards) {
		// --Return ManageService Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlReturn");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblReader = new javax.swing.JLabel("Mã độc giả");
		txtReader = new javax.swing.JTextField(20);
		txtReader.setEnabled(false);

		lblName = new javax.swing.JLabel("Họ và tên");
		txtName = new javax.swing.JTextField(20);
		txtName.setEnabled(false);

		lblMs = new javax.swing.JLabel("MSSV/CBGV");
		txtMs = new javax.swing.JTextField(20);
		txtMs.setEnabled(false);

		lblDate = new javax.swing.JLabel("Ngày");
		txtDate = new javax.swing.JTextField(20);
		txtDate.setEnabled(false);

		lblValue = new javax.swing.JLabel("Tiền phạt kỳ này");
		txtValue = new javax.swing.JTextField(20);

		lblPerson = new javax.swing.JLabel("Người tiếp nhận");
		txtPerson = new javax.swing.JTextField(20);
		txtPerson.setEnabled(false);

		lblDebt = new javax.swing.JLabel("Nợ tồn");
		txtDebt = new javax.swing.JTextField(20);
		txtDebt.setEnabled(false);

		lblTotal = new javax.swing.JLabel("Tổng nợ");
		txtTotal = new javax.swing.JTextField(20);
		txtTotal.setEnabled(false);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblPerson).addComponent(lblName).addComponent(lblMs).addComponent(lblReader)
						.addComponent(lblDebt).addComponent(lblDate).addComponent(lblValue).addComponent(lblTotal))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPerson).addComponent(txtName).addComponent(txtMs).addComponent(txtDebt)
						.addComponent(txtDate).addComponent(txtValue).addComponent(txtTotal)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtReader))
								.addGap(5)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(ManageService.find))))
				.addGap(0, 80, 80));
		gl_details
				.setVerticalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblReader).addComponent(txtReader).addComponent(ManageService.find))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblName).addComponent(txtName))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMs).addComponent(txtMs))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblValue).addComponent(txtValue))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblDebt).addComponent(txtDebt))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblTotal).addComponent(txtTotal))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblDate).addComponent(txtDate))
						.addGap(24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblPerson).addComponent(txtPerson)));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(ManageService.save);
		detailsHandle.add(ManageService.reset);
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
		table.setModel(new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.returnn()) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);

		tableHandle = new javax.swing.JPanel();
		tableHandle.add(ManageService.view);
		tableHandle.add(ManageService.add);
		tableHandle.add(ManageService.delete);
		tableHandle.add(ManageService.adjourn);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

		// ----Table: Sub
		scrollPane = new javax.swing.JScrollPane();
		gridTablePnl.add(scrollPane);

		subTable = new javax.swing.JTable();
		subTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		subTable.setModel(new javax.swing.table.DefaultTableModel(new Vector(), TableHeader.returnDetail()) {
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
	private static javax.swing.JLabel lblReader;
	private static javax.swing.JTextField txtReader;
	private static javax.swing.JLabel lblName;
	private static javax.swing.JTextField txtName;
	private static javax.swing.JLabel lblMs;
	private static javax.swing.JTextField txtMs;
	private static javax.swing.JLabel lblDebt;
	private static javax.swing.JTextField txtDebt;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JLabel lblValue;
	private static javax.swing.JTextField txtValue;
	private static javax.swing.JLabel lblTotal;
	private static javax.swing.JTextField txtTotal;
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
