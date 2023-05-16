package main.java.com.library.GUI.forms.ManageService;

public class ManageServiceReturn {
	@SuppressWarnings("serial")
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
		txtReader = new javax.swing.JTextField();
		txtReader.setEnabled(false);
		txtReader.setColumns(20);

		lblName = new javax.swing.JLabel("Họ và tên");
		txtName = new javax.swing.JTextField();
		txtName.setEnabled(false);
		txtName.setColumns(20);

		lblMs = new javax.swing.JLabel("MSSV/CBGV");
		txtMs = new javax.swing.JTextField();
		txtMs.setEnabled(false);
		txtMs.setColumns(20);

		lblDate = new javax.swing.JLabel("Ngày");
		txtDate = new javax.swing.JTextField();
		txtDate.setEnabled(false);
		txtDate.setColumns(20);

		lblValue = new javax.swing.JLabel("Tiền phạt kỳ này");
		txtValue = new javax.swing.JTextField();
		txtValue.setColumns(20);

		lblPerson = new javax.swing.JLabel("Người tiếp nhận");
		txtPerson = new javax.swing.JTextField();
		txtPerson.setEnabled(false);
		txtPerson.setColumns(20);

		lblDebt = new javax.swing.JLabel("Nợ tồn");
		txtDebt = new javax.swing.JTextField();
		txtDebt.setEnabled(false);
		txtDebt.setColumns(20);

		lblAll = new javax.swing.JLabel("Tổng nợ");
		txtAll = new javax.swing.JTextField();
		txtAll.setEnabled(false);
		txtAll.setColumns(20);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblPerson).addComponent(lblName).addComponent(lblMs).addComponent(lblReader)
						.addComponent(lblDebt).addComponent(lblDate).addComponent(lblValue).addComponent(lblAll))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPerson).addComponent(txtName).addComponent(txtMs).addComponent(txtDebt)
						.addComponent(txtDate).addComponent(txtValue).addComponent(txtAll)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtReader))
								.addGap(5)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(ManageService.find))))
				.addGap(80));
		gl_details
				.setVerticalGroup(gl_details.createSequentialGroup().addGap(80)
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
								.addComponent(lblAll).addComponent(txtAll))
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
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] { "STT", "NGÀY MƯỢN",
				"NGÀY HẸN TRẢ", "NGƯỜI MƯỢN", "MÃ TÀI LIỆU", "NHAN ĐỀ", "ĐÃ GIA HẠN" }) {
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
		subTable.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "STT", "MÃ TÀI LIỆU", "NHAN ĐỀ", "SỐ NGÀY QUÁ HẠN", "TIỀN PHẠT" }) {
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
	private static javax.swing.JLabel lblAll;
	private static javax.swing.JTextField txtAll;
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
