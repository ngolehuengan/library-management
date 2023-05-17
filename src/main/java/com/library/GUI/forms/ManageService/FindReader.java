package main.java.com.library.GUI.forms.ManageService;

@SuppressWarnings("serial")
public class FindReader extends javax.swing.JFrame {
	public FindReader() {
		init();
	}

	private void init() {
		setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - 900) / 2,
				(java.awt.Toolkit.getDefaultToolkit().getScreenSize().height - 500) / 2, 900, 500);
		setIconImage(java.awt.Toolkit.getDefaultToolkit()
				.getImage(this.getClass().getResource("../../../../../resources/icons/sgu-logo.png")));
		setTitle("TÌM KIẾM THÔNG TIN ĐỘC GIẢ - THƯ VIỆN SGU");
		contentPane = new javax.swing.JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new java.awt.BorderLayout(0, 0));

		tableSearch = new javax.swing.JPanel();
		tableSearch.add(ManageService.searchField);
		tableSearch.add(ManageService.search);
		tableSearch.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(tableSearch, java.awt.BorderLayout.NORTH);
		
		scrollPane = new javax.swing.JScrollPane();
		contentPane.add(scrollPane, java.awt.BorderLayout.CENTER);
		table = new javax.swing.JTable();
		table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {}, new String[] { "STT", "MÃ ĐỘC GIẢ",
				"HỌ TÊN", "LOẠI ĐỘC GIẢ", "MSSV/CBGV", "KHOA", "TỔNG NỢ", "NGÀY LẬP THẺ", "NGÀY HẾT HẠN" }) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);
		
		tableHandle = new javax.swing.JPanel();
		tableHandle.add(ManageService.choose);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(tableHandle, java.awt.BorderLayout.SOUTH);
	}

	// Private
	private javax.swing.JPanel contentPane;
	private javax.swing.JPanel tableSearch;
	private javax.swing.JScrollPane scrollPane;
	private javax.swing.JTable table;
	private javax.swing.JPanel tableHandle;
}
