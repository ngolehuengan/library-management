package main.java.com.library.GUI.forms.ManageRole;

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
		roleSv = new javax.swing.JRadioButton("Sinh viên");
		roleSv.setEnabled(false);
		roleCbgv = new javax.swing.JRadioButton("CBGV");
		roleCbgv.setEnabled(false);
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
		txtClass = new javax.swing.JTextField();
		txtClass.setEnabled(false);
		txtClass.setColumns(20);

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
		male = new javax.swing.JRadioButton("Nam");
		male.setEnabled(false);
		female = new javax.swing.JRadioButton("Nữ");
		female.setEnabled(false);
		btnGroupGd = new javax.swing.ButtonGroup();
		btnGroupGd.add(male);
		btnGroupGd.add(female);

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
						.addComponent(txtClass).addComponent(txtEmail)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(male))
								.addGap(24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(female)))
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
						.addComponent(lblGender).addComponent(male).addComponent(female))
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

		// Action
		add.addActionListener(e -> {
			txtName.setEnabled(true);
			roleSv.setEnabled(true);
			roleCbgv.setEnabled(true);
			txtMs.setEnabled(true);
			txtDepart.setEnabled(true);
			txtClass.setEnabled(true);
			txtCmnd.setEnabled(true);
			txtDate.setEnabled(true);
			txtAddress.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			male.setEnabled(true);
			female.setEnabled(true);

			txtName.setText("");
			btnGroup.clearSelection();
			btnGroupGd.clearSelection();
			txtMs.setText("");
			txtCmnd.setText("");
			txtDate.setText("");
			txtAddress.setText("");
			txtEmail.setText("");
			txtPhone.setText("");
			txtPenalty.setText("0");
		});

		edit.addActionListener(e -> {
			txtName.setEnabled(true);
			roleSv.setEnabled(true);
			roleCbgv.setEnabled(true);
			txtMs.setEnabled(true);
			txtDepart.setEnabled(true);
			txtClass.setEnabled(true);
			txtCmnd.setEnabled(true);
			txtDate.setEnabled(true);
			txtAddress.setEnabled(true);
			txtEmail.setEnabled(true);
			txtPhone.setEnabled(true);
			male.setEnabled(true);
			female.setEnabled(true);
		});

		delete.addActionListener(e -> {
			txtName.setEnabled(false);
			roleSv.setEnabled(false);
			roleCbgv.setEnabled(false);
			txtMs.setEnabled(false);
			txtDepart.setEnabled(false);
			txtClass.setEnabled(false);
			txtCmnd.setEnabled(false);
			txtDate.setEnabled(false);
			txtAddress.setEnabled(false);
			txtEmail.setEnabled(false);
			txtPhone.setEnabled(false);
			male.setEnabled(false);
			female.setEnabled(false);

			txtName.setText("");
			btnGroup.clearSelection();
			btnGroupGd.clearSelection();
			txtMs.setText("");
			txtCmnd.setText("");
			txtDate.setText("");
			txtAddress.setText("");
			txtEmail.setText("");
			txtPhone.setText("");
			txtPenalty.setText("0");
		});

		save.addActionListener(e -> {
			txtName.setEnabled(false);
			roleSv.setEnabled(false);
			roleCbgv.setEnabled(false);
			txtMs.setEnabled(false);
			txtDepart.setEnabled(false);
			txtClass.setEnabled(false);
			txtCmnd.setEnabled(false);
			txtDate.setEnabled(false);
			txtAddress.setEnabled(false);
			txtEmail.setEnabled(false);
			txtPhone.setEnabled(false);
			male.setEnabled(false);
			female.setEnabled(false);
		});

		reset.addActionListener(e -> {
			if (txtName.isEnabled()) {
				txtName.setEnabled(true);
				roleSv.setEnabled(true);
				roleCbgv.setEnabled(true);
				txtMs.setEnabled(true);
				txtDepart.setEnabled(true);
				txtClass.setEnabled(true);
				txtCmnd.setEnabled(true);
				txtDate.setEnabled(true);
				txtAddress.setEnabled(true);
				txtEmail.setEnabled(true);
				txtPhone.setEnabled(true);
				male.setEnabled(true);
				female.setEnabled(true);

				txtName.setText("");
				btnGroup.clearSelection();
				btnGroupGd.clearSelection();
				txtMs.setText("");
				txtCmnd.setText("");
				txtDate.setText("");
				txtAddress.setText("");
				txtEmail.setText("");
				txtPhone.setText("");
			}
		});
	}

	// Handle
	@SuppressWarnings({ "rawtypes", "unchecked" })
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

		handleFilter = new javax.swing.JPanel(new java.awt.GridLayout(1, 3));
		handle.add(handleFilter, java.awt.BorderLayout.CENTER);

		filterRole = new javax.swing.JPanel();
		filterRole.setBackground(new java.awt.Color(204, 255, 204));
		lblRoleHandle = new javax.swing.JLabel("Loại độc giả:");
		roleSvHandle = new javax.swing.JRadioButton("Sinh Viên");
		roleSvHandle.setBackground(new java.awt.Color(204, 255, 204));
		roleCbgvHandle = new javax.swing.JRadioButton("CBGV");
		roleCbgvHandle.setBackground(new java.awt.Color(204, 255, 204));
		btnGroup = new javax.swing.ButtonGroup();
		btnGroup.add(roleSvHandle);
		btnGroup.add(roleCbgvHandle);
		filterRole.add(lblRoleHandle);
		filterRole.add(roleSvHandle);
		filterRole.add(roleCbgvHandle);
		handleFilter.add(filterRole);

		filterDebt = new javax.swing.JPanel();
		filterDebt.setBackground(new java.awt.Color(204, 255, 204));
		lblDebtHandle = new javax.swing.JLabel("Nợ:");
		txtDebtHandle = new javax.swing.JRadioButton("Có");
		txtDebtHandle.setBackground(new java.awt.Color(204, 255, 204));
		txtUndebtHandle = new javax.swing.JRadioButton("Không");
		txtUndebtHandle.setBackground(new java.awt.Color(204, 255, 204));
		btnGroup = new javax.swing.ButtonGroup();
		btnGroup.add(txtDebtHandle);
		btnGroup.add(txtUndebtHandle);
		filterDebt.add(lblDebtHandle);
		filterDebt.add(txtDebtHandle);
		filterDebt.add(txtUndebtHandle);
		handleFilter.add(filterDebt);

		filterDepart = new javax.swing.JPanel();
		filterDepart.setBackground(new java.awt.Color(204, 255, 204));
		lblDepartHandle = new javax.swing.JLabel("Khoa:");
		txtDepartHandle = new javax.swing.JComboBox();
		txtDepartHandle.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Công Nghệ Thông Tin" }));
		filterDepart.add(lblDepartHandle);
		filterDepart.add(txtDepartHandle);
		handleFilter.add(filterDepart);

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
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox txtDepart;
	private static javax.swing.JLabel lblClass;
	private static javax.swing.JTextField txtClass;
	private static javax.swing.JLabel lblGender;
	private static javax.swing.ButtonGroup btnGroupGd;
	private static javax.swing.JRadioButton male;
	private static javax.swing.JRadioButton female;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;

	private static javax.swing.JPanel handle;
	private static javax.swing.JPanel handleBase;
	private static javax.swing.JPanel handleFilter;
	private static javax.swing.JPanel filterRole;
	private static javax.swing.JLabel lblRoleHandle;
	private static javax.swing.JRadioButton roleSvHandle;
	private static javax.swing.JRadioButton roleCbgvHandle;
	private static javax.swing.JPanel filterDebt;
	private static javax.swing.JLabel lblDebtHandle;
	private static javax.swing.JRadioButton txtDebtHandle;
	private static javax.swing.JRadioButton txtUndebtHandle;
	private static javax.swing.JPanel filterDepart;
	private static javax.swing.JLabel lblDepartHandle;
	@SuppressWarnings("rawtypes")
	private static javax.swing.JComboBox txtDepartHandle;
	private static javax.swing.JPanel handleOpt;
	private static javax.swing.JButton add;
	private static javax.swing.JButton edit;
	private static javax.swing.JButton delete;
	private static javax.swing.JButton search;
	private static javax.swing.JTextField searchField;
	private static javax.swing.JButton download;
	private static javax.swing.JButton upload;
	private static javax.swing.JButton print;
	private static javax.swing.JButton save;
	private static javax.swing.JButton reset;
	private static javax.swing.JButton view;
}