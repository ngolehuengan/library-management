package main.java.com.library.GUI.forms.Statistic;

public class FavorStatistic {
	@SuppressWarnings("serial")
	static void init(javax.swing.JComponent pnlCards) {
		tablePnl = new javax.swing.JPanel();
		pnlCards.add(tablePnl, "pnlFavor");
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

		// ---Table
		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "STT", "TÊN THỂ LOẠI", "SỐ LƯỢT MƯỢN", "TỈ LỆ" }) {
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
		lblDate = new javax.swing.JLabel("Tháng: ");
		txtDate = new javax.swing.JTextField();
		txtDate.setColumns(10);
		tableDate.add(lblDate);
		tableDate.add(txtDate);
		
		tableBtn = new javax.swing.JPanel();
		tableBtn.setBackground(new java.awt.Color(204, 255, 204));
		tableHandle.add(tableBtn, java.awt.BorderLayout.CENTER);
		tableBtn.add(Statistic.view);
		
		tableSum = new javax.swing.JPanel();
		tableSum.setBackground(new java.awt.Color(204, 255, 204));
		tableHandle.add(tableSum, java.awt.BorderLayout.EAST);
		lblSum = new javax.swing.JLabel("Tổng số lượt mượn: ");
		txtSum = new javax.swing.JTextField();
		txtSum.setColumns(10);
		tableSum.add(lblSum);
		tableSum.add(txtSum);
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
	private static javax.swing.JPanel tableSum;
	private static javax.swing.JLabel lblSum;
	private static javax.swing.JTextField txtSum;
}
