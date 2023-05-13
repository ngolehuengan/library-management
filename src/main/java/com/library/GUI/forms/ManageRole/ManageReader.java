package main.java.com.library.GUI.forms.ManageRole;

import main.java.com.library.GUI.forms.ManageService.ManageService;

public class ManageReader {
	@SuppressWarnings({ "serial", "rawtypes" })
	public static void init(javax.swing.JTabbedPane tabbedPane) {
		ManageReaderTab = new javax.swing.JPanel();
		ManageReaderTab.setLayout(new java.awt.BorderLayout(0, 0));
		tabbedPane.addTab("Quản Lý Độc Giả", null, ManageReaderTab, null);
		handle();

		// Main Frame = Handle + SplitPane (Menu Side + Tabs)
		splitPane = new javax.swing.JSplitPane();
		ManageReaderTab.add(handle, java.awt.BorderLayout.NORTH);
		ManageReaderTab.add(splitPane, java.awt.BorderLayout.CENTER);

		// --Reader Slip Tab = Details + Table
		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblName = new javax.swing.JLabel("Họ và tên");
		txtName = new javax.swing.JTextField();
		txtName.setEnabled(false);
		txtName.setColumns(20);

		lblRole = new javax.swing.JLabel("Loại độc giả");
		roleSv = new javax.swing.JRadioButton("Sinh Viên");
		roleCbgv = new javax.swing.JRadioButton("CBGV");
		btnGroup = new javax.swing.ButtonGroup();
		btnGroup.add(roleSv);
		btnGroup.add(roleCbgv);

		lblMs = new javax.swing.JLabel("MSSV/CBGV");
		txtMs = new javax.swing.JTextField();
		txtMs.setEnabled(false);
		txtMs.setColumns(20);

		lblDepart = new javax.swing.JLabel("Khoa");
		txtDepart = new javax.swing.JComboBox();
		txtDepart.setEnabled(false);

		lblClass = new javax.swing.JLabel("Lớp");
		txtClass = new javax.swing.JComboBox();
		txtClass.setEnabled(false);

		lblCmnd = new javax.swing.JLabel("CMND/CCCD");
		txtCmnd = new javax.swing.JTextField();
		txtCmnd.setEnabled(false);
		txtCmnd.setColumns(20);

		lblDate = new javax.swing.JLabel("Ngày sinh");
		txtDate = new javax.swing.JTextField();
		txtDate.setEnabled(false);
		txtDate.setColumns(20);

		lblAddress = new javax.swing.JLabel("Địa chỉ");
		txtAddress = new javax.swing.JTextField();
		txtAddress.setEnabled(false);
		txtAddress.setColumns(20);

		lblEmail = new javax.swing.JLabel("Email");
		txtEmail = new javax.swing.JTextField();
		txtEmail.setEnabled(false);
		txtEmail.setColumns(20);

		lblPhone = new javax.swing.JLabel("Số điện thoại");
		txtPhone = new javax.swing.JTextField();
		txtPhone.setEnabled(false);
		txtPhone.setColumns(20);

		lblPenalty = new javax.swing.JLabel("Tổng nợ");
		txtPenalty = new javax.swing.JTextField();
		txtPenalty.setEnabled(false);
		txtPenalty.setColumns(20);

		lblGender = new javax.swing.JLabel("Giới tính");
		txtGender = new javax.swing.JTextField();
		txtGender.setEnabled(false);
		txtGender.setColumns(20);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(lblPhone).addComponent(lblName).addComponent(lblRole).addComponent(lblCmnd)
						.addComponent(lblDate).addComponent(lblAddress).addComponent(lblEmail).addComponent(lblMs)
						.addComponent(lblDepart).addComponent(lblClass).addComponent(lblGender)
						.addComponent(lblPenalty))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPhone).addComponent(txtName).addComponent(txtCmnd).addComponent(txtDate)
						.addComponent(txtAddress).addComponent(txtPenalty).addComponent(txtMs).addComponent(txtDepart)
						.addComponent(txtClass).addComponent(txtGender).addComponent(txtEmail)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(roleSv))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(roleCbgv))))
				.addGap(80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(40)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblName).addComponent(txtName))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblRole).addComponent(roleSv).addComponent(roleCbgv))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblMs)
						.addComponent(txtMs))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDepart).addComponent(txtDepart))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblClass).addComponent(txtClass))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblCmnd).addComponent(txtCmnd))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate).addComponent(txtDate))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblGender).addComponent(txtGender))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblAddress).addComponent(txtAddress))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblEmail).addComponent(txtEmail))
				.addGap(20)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPhone).addComponent(txtPhone))
				.addGap(20).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPenalty).addComponent(txtPenalty))
				.addGap(20));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(save);
		detailsHandle.add(reset);
		details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

		// ---Table
		tablePnl = new javax.swing.JPanel();
		splitPane.setRightComponent(tablePnl);
		tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

		scrollPane = new javax.swing.JScrollPane();
		tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

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
		tableHandle.add(view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);
	}

	// Handle
	private static void handle() {
		handle = new javax.swing.JPanel();
		handle.setBorder(new javax.swing.border.TitledBorder(null, "Xử Lý", javax.swing.border.TitledBorder.LEADING,
				javax.swing.border.TitledBorder.TOP, null, null));
		handle.setBackground(new java.awt.Color(204, 255, 204));
		handle.setLayout(new java.awt.BorderLayout(0, 0));

		handleBase = new javax.swing.JPanel();
		handleBase.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleBase, java.awt.BorderLayout.WEST);

		add = new javax.swing.JButton("Thêm");
		add.setForeground(new java.awt.Color(255, 255, 255));
		add.setBackground(new java.awt.Color(0, 153, 51));

		edit = new javax.swing.JButton("Chỉnh sửa");
		edit.setBackground(new java.awt.Color(0, 153, 51));
		edit.setForeground(new java.awt.Color(255, 255, 255));

		delete = new javax.swing.JButton("Xóa");
		delete.setForeground(new java.awt.Color(255, 255, 255));
		delete.setBackground(new java.awt.Color(0, 153, 51));

		search = new javax.swing.JButton("Tìm kiếm");
		search.setBackground(new java.awt.Color(0, 153, 51));
		search.setForeground(new java.awt.Color(255, 255, 255));
		searchField = new javax.swing.JTextField();
		searchField.setColumns(20);

		handleBase.add(add);
		handleBase.add(edit);
		handleBase.add(delete);
		handleBase.add(searchField);
		handleBase.add(search);

		handleOpt = new javax.swing.JPanel();
		handleOpt.setBackground(new java.awt.Color(204, 255, 204));
		handle.add(handleOpt, java.awt.BorderLayout.EAST);

		print = new javax.swing.JButton("  In");
		print.setIcon(new javax.swing.ImageIcon(
				ManageReader.class.getResource("../../../../../resources/icons/printing.png")));
		print.setBackground(new java.awt.Color(0, 153, 51));
		print.setForeground(new java.awt.Color(255, 255, 255));

		upload = new javax.swing.JButton("  Đăng tải");
		upload.setBackground(new java.awt.Color(0, 153, 51));
		upload.setForeground(new java.awt.Color(255, 255, 255));
		upload.setIcon(
				new javax.swing.ImageIcon(ManageReader.class.getResource("../../../../../resources/icons/upload.png")));

		download = new javax.swing.JButton("  Tải xuống");
		download.setIcon(new javax.swing.ImageIcon(
				ManageReader.class.getResource("../../../../../resources/icons/downloads.png")));
		download.setForeground(new java.awt.Color(255, 255, 255));
		download.setBackground(new java.awt.Color(0, 153, 51));

		handleOpt.add(upload);
		handleOpt.add(download);
		handleOpt.add(print);

		save = new javax.swing.JButton("Lưu");
		save.setBackground(new java.awt.Color(0, 153, 51));
		save.setForeground(new java.awt.Color(255, 255, 255));

		reset = new javax.swing.JButton("Reset");
		reset.setBackground(new java.awt.Color(0, 153, 51));
		reset.setForeground(new java.awt.Color(255, 255, 255));

		view = new javax.swing.JButton("Xem");
		view.setForeground(new java.awt.Color(255, 255, 255));
		view.setBackground(new java.awt.Color(0, 153, 51));
	}

	// Private
	private static javax.swing.JPanel ManageReaderTab;
	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JLabel lblName;
	private static javax.swing.JTextField txtName;
	private static javax.swing.JLabel lblRole;
	private static javax.swing.JRadioButton roleSv;
	private static javax.swing.JRadioButton roleCbgv;
	private static javax.swing.ButtonGroup btnGroup;
	private static javax.swing.JLabel lblEmail;
	private static javax.swing.JTextField txtEmail;
	private static javax.swing.JLabel lblCmnd;
	private static javax.swing.JTextField txtCmnd;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JLabel lblPhone;
	private static javax.swing.JTextField txtPhone;
	private static javax.swing.JLabel lblAddress;
	private static javax.swing.JTextField txtAddress;
	private static javax.swing.JLabel lblPenalty;
	private static javax.swing.JTextField txtPenalty;
	private static javax.swing.JLabel lblMs;
	private static javax.swing.JTextField txtMs;
	private static javax.swing.JLabel lblDepart;
	private static javax.swing.JComboBox txtDepart;
	private static javax.swing.JLabel lblClass;
	private static javax.swing.JComboBox txtClass;
	private static javax.swing.JLabel lblGender;
	private static javax.swing.JTextField txtGender;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleOpt;
	public static javax.swing.JButton add;
	public static javax.swing.JButton edit;
	public static javax.swing.JButton delete;
	public static javax.swing.JButton search;
	public static javax.swing.JTextField searchField;
	public static javax.swing.JButton download;
	public static javax.swing.JButton upload;
	public static javax.swing.JButton print;
	public static javax.swing.JButton save;
	public static javax.swing.JButton reset;
	public static javax.swing.JButton view;
}
