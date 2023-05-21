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
				new String[] { "STT", "TÊN SÁCH", "SỐ NGÀY TRẢ TRỄ" }) {
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

		tableMonth = new javax.swing.JPanel();
		tableMonth.setBackground(new java.awt.Color(204, 255, 204));
		tableHandle.add(tableMonth, java.awt.BorderLayout.WEST);
		lblMonth = new javax.swing.JLabel("Tháng: ");
		txtMonth = new javax.swing.JTextField(2);
		lblYear = new javax.swing.JLabel("/");
		txtYear = new javax.swing.JTextField(4);
		tableMonth.add(lblMonth);
		tableMonth.add(txtMonth);
		tableMonth.add(lblYear);
		tableMonth.add(txtYear);
		
		tableBtn = new javax.swing.JPanel();
		tableBtn.setBackground(new java.awt.Color(204, 255, 204));
		tableHandle.add(tableBtn, java.awt.BorderLayout.CENTER);
		tableBtn.add(Statistic.view);
		
		tableTotal = new javax.swing.JPanel();
		tableTotal.setBackground(new java.awt.Color(204, 255, 204));
		tableHandle.add(tableTotal, java.awt.BorderLayout.EAST);
		lblTotal = new javax.swing.JLabel("Tổng số lượng: ");
		txtTotal = new javax.swing.JTextField();
		txtTotal.setColumns(10);
		tableTotal.add(lblTotal);
		tableTotal.add(txtTotal);
	}

	// Private
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
	private static javax.swing.JPanel tableMonth;
	private static javax.swing.JLabel lblMonth;
	private static javax.swing.JTextField txtMonth;
	private static javax.swing.JLabel lblYear;
	private static javax.swing.JTextField txtYear;
	private static javax.swing.JPanel tableBtn;
	private static javax.swing.JPanel tableTotal;
	private static javax.swing.JLabel lblTotal;
	private static javax.swing.JTextField txtTotal;
}
