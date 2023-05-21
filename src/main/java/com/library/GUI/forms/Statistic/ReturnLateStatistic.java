package main.java.com.library.GUI.forms.Statistic;

public class ReturnLateStatistic {
	@SuppressWarnings("serial")
	static void init(javax.swing.JComponent pnlCards) {
		tablePnl = new javax.swing.JPanel();
		pnlCards.add(tablePnl, "pnlLate");
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

		// ---Table
		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "STT", "TÊN SÁCH", "NGÀY MƯỢN", "SỐ NGÀY TRẢ TRỄ" }) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);

		tableHandle = new javax.swing.JPanel(new java.awt.BorderLayout(0, 0));
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

		tableDate = new javax.swing.JPanel();
		tableDate.setBackground(new java.awt.Color(204, 255, 204));
		tableHandle.add(tableDate, java.awt.BorderLayout.WEST);
		lblDate = new javax.swing.JLabel("Ngày: ");
		txtDate = new javax.swing.JTextField(10);
		tableDate.add(lblDate);
		tableDate.add(txtDate);
		
		tableBtn = new javax.swing.JPanel();
		tableBtn.setBackground(new java.awt.Color(204, 255, 204));
		tableHandle.add(tableBtn, java.awt.BorderLayout.CENTER);
		tableBtn.add(Statistic.view);
	}

	// Private
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
	private static javax.swing.JPanel tableDate;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JPanel tableBtn;
}
