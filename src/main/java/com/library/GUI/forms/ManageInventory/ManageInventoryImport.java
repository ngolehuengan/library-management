package main.java.com.library.GUI.forms.ManageInventory;

import java.util.Vector;
import main.java.com.library.BLL.ImportRecordBUS;
import main.java.com.library.DTO.IPDetail;
import main.java.com.library.DTO.ImportRecord;
import main.java.com.library.GUI.components.TableHeader;
import main.java.com.library.GUI.handle.Handle;

public class ManageInventoryImport {

	@SuppressWarnings({ "serial", "unchecked" })
	static void init(javax.swing.JComponent pnlCards) {
		// --Import Tab = Details + Table
		splitPane = new javax.swing.JSplitPane();
		pnlCards.add(splitPane, "pnlImport");

		// ---Details
		details = new javax.swing.JPanel();
		splitPane.setLeftComponent(details);
		details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết Hóa Đơn",
				javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
		details.setLayout(new java.awt.BorderLayout(0, 0));

		// ----Details: Info
		detailsInfo = new javax.swing.JPanel();
		details.add(detailsInfo, java.awt.BorderLayout.CENTER);

		lblPerson = new javax.swing.JLabel("Người tiếp nhận");
		txtPerson = new javax.swing.JTextField(20);
		txtPerson.setEnabled(false);

		lblDate = new javax.swing.JLabel("Ngày");
		txtDate = new javax.swing.JTextField(20);
		txtDate.setEnabled(false);

		lblId = new javax.swing.JLabel("Mã hóa đơn");
		txtId = new javax.swing.JTextField(20);
		txtId.setEnabled(false);

		lblTotal = new javax.swing.JLabel("Tổng giá trị");
		txtTotal = new javax.swing.JTextField(20);
		txtTotal.setEnabled(false);

		lblDcmCode = new javax.swing.JLabel("Mã tài liệu");
		txtDcmCode = new javax.swing.JTextField(20);
		txtDcmCode.setEnabled(false);

		lblValue = new javax.swing.JLabel("Giá trị đơn");
		txtValue = new javax.swing.JTextField(20);
		txtValue.setEnabled(false);

		lblNumber = new javax.swing.JLabel("Số lượng");
		txtNumber = new javax.swing.JTextField(20);
		txtNumber.setEnabled(false);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
						.addComponent(lblPerson).addComponent(lblDate).addComponent(lblId).addComponent(lblTotal)
						.addComponent(lblDcmCode).addComponent(lblValue).addComponent(lblNumber))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPerson).addComponent(txtDate).addComponent(txtId).addComponent(txtTotal)
						.addComponent(txtDcmCode).addComponent(txtValue).addComponent(txtNumber))
				.addGap(0, 80, 80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblId)
						.addComponent(txtId))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblTotal).addComponent(txtTotal))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDcmCode).addComponent(txtDcmCode))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblValue).addComponent(txtValue))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblNumber).addComponent(txtNumber))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblDate).addComponent(txtDate))
				.addGap(24).addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblPerson).addComponent(txtPerson)));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		detailsHandle.add(ManageInventory.save);
		detailsHandle.add(ManageInventory.reset);
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
		table.setModel(new javax.swing.table.DefaultTableModel(getDisplay(vtDTO), TableHeader.importRecord()) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		table.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(table);

		tableHandle = new javax.swing.JPanel();
		tableHandle.add(ManageInventory.view);
		tableHandle.setBackground(new java.awt.Color(204, 255, 204));
		tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

		// ----Table: Sub
		subTablePnl = new javax.swing.JPanel();
		subTablePnl.setLayout(new java.awt.BorderLayout(0, 0));
		gridTablePnl.add(subTablePnl);

		scrollPane = new javax.swing.JScrollPane();
		subTablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

		subTable = new javax.swing.JTable();
		subTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		subTable.setModel(
				new javax.swing.table.DefaultTableModel(getDetailDisplay(vtDetail), TableHeader.importDetail()) {
					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return false;
					}
				});
		subTable.setAutoCreateRowSorter(true);
		scrollPane.setViewportView(subTable);

		subTableHandle = new javax.swing.JPanel();
		subTableHandle.add(ManageInventory.addCthd);
		subTableHandle.add(ManageInventory.deleteCthd);
		subTableHandle.setBackground(new java.awt.Color(204, 255, 204));
		subTablePnl.add(subTableHandle, java.awt.BorderLayout.SOUTH);

		// Action
		// Thêm hoá đơn
		ManageInventory.add.addActionListener(e -> {
			txtDate.setEnabled(true);
			txtDcmCode.setEnabled(true);
			txtValue.setEnabled(true);
			txtNumber.setEnabled(true);

			txtPerson.setText("This login");
			totalPrice = 0;
			txtTotal.setText(Double.toString(totalPrice));
			txtId.setText("Auto");
			txtDate.setText(new java.sql.Date(System.currentTimeMillis()).toString());
			txtDcmCode.setText("");
			txtValue.setText("");
			txtNumber.setText("");
			clearDetailTable();
		});

		// Thêm chi tiết
		ManageInventory.addCthd.addActionListener(e -> {
			if (txtDcmCode.isEnabled()) {
				addDetail();
			}
		});

		// Xoá chi tiết
		ManageInventory.deleteCthd.addActionListener(e -> {
			if (txtDcmCode.isEnabled()) {
				removeDetail();
			}
		});

		// Lưu hoá đơn
		ManageInventory.save.addActionListener(e -> {
			if (txtDcmCode.isEnabled()) {
				addRecord();
			}
		});

		// Clear nội dung
		ManageInventory.reset.addActionListener(e -> {
			resetPage();
		});

		// Xoá hoá đơn
		ManageInventory.delete.addActionListener(e -> {
			if (table.getSelectedRow() != -1) {
				removeRecord();
			}
		});

		ManageInventory.view.addActionListener(e -> {
			refreshTable();
		});

		// Chọn 1 dòng trong bảng hiển thị chi tiết
		table.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				rowIndex = table.getSelectedRow();
				displayDetail(vtDTO.get(rowIndex));
			}
		});

		// Gõ mã tài liệu tới khi đúng
		txtDcmCode.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				if (main.java.com.library.BLL.Check.isDcmCode(txtDcmCode.getText())) {
					txtDcmCode.setBorder(Handle.colorEnabled());
				}
			}
		});

		// Gõ đơn giá tới khi đúng
		txtValue.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				if (main.java.com.library.BLL.Check.isDouble(txtValue.getText())) {
					txtValue.setBorder(Handle.colorEnabled());
				}
			}
		});

		// Gõ số lượng tới khi đúng
		txtNumber.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				if (main.java.com.library.BLL.Check.isInteger(txtNumber.getText())) {
					txtNumber.setBorder(Handle.colorEnabled());
				}
			}
		});

		// Gõ ngày tới khi đúng
		txtDate.addKeyListener(new java.awt.event.KeyAdapter() {
			@Override
			public void keyReleased(java.awt.event.KeyEvent e) {
				if (main.java.com.library.BLL.Check.isDate(txtDate.getText())) {
					txtDate.setBorder(Handle.colorEnabled());
				}
			}
		});

	}

	// Private
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static void clearDetailTable() {
		vtDetail = new Vector();
		totalPrice = 0;
		refreshDetailTable();
	}

	@SuppressWarnings({ "serial", "unchecked" })
	private static void refreshDetailTable() {
		subTable.setModel(
				new javax.swing.table.DefaultTableModel(getDetailDisplay(vtDetail), TableHeader.importDetail()) {
					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return false;
					}
				});
	}

	@SuppressWarnings({ "unchecked", "serial" })
	private static void displayDetail(ImportRecord e) {
		txtPerson.setText(Integer.toString(e.getLibrarianID()));
		txtDate.setText(e.getDate().toString());
		txtId.setText(e.getCode());
		totalPrice = e.getTotalPrice();
		txtTotal.setText(Double.toString(totalPrice));
		txtDcmCode.setText("");
		txtDcmCode.setBorder(Handle.colorDisabled());
		txtValue.setText("");
		txtValue.setBorder(Handle.colorDisabled());
		txtNumber.setText("");
		txtNumber.setBorder(Handle.colorDisabled());
		subTable.setModel(
				new javax.swing.table.DefaultTableModel(getDetailDisplay(e.getDetails()), TableHeader.importDetail()) {
					@Override
					public boolean isCellEditable(int rowIndex, int columnIndex) {
						return false;
					}
				});
		txtDate.setEnabled(false);
		txtDcmCode.setEnabled(false);
		txtValue.setEnabled(false);
		txtNumber.setEnabled(false);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Vector getDisplay(Vector<ImportRecord> list) {
		Vector table = new Vector();
		for (int i = 0; i < list.size(); i++) {
			ImportRecord e = list.get(i);
			Vector row = new Vector();
			row.add(i + 1);
			row.add(e.getDate());
			row.add(e.getCode());
			row.add(e.getTotalPrice());
			row.add(e.getTotalQuantity());
			row.add(e.getLibrarianID());
			table.add(row);
		}
		return table;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private static Vector getDetailDisplay(Vector<IPDetail> list) {
		Vector table = new Vector();
		for (int i = 0; i < list.size(); i++) {
			IPDetail e = list.get(i);
			Vector row = new Vector();
			row.add(i + 1);
			row.add(e.getDcmCode());
			row.add(e.getTitle());
			row.add(e.getPrice());
			row.add(e.getQuantity());
			table.add(row);
		}
		return table;
	}

	// nút Xem - view
	@SuppressWarnings({ "serial", "unchecked" })
	private static void refreshTable() {
		vtDTO = new ImportRecordBUS().getTable();
		table.setModel(new javax.swing.table.DefaultTableModel(getDisplay(vtDTO), TableHeader.importRecord()) {
			@Override
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		clearDetailTable();
	}

	// nút Thêm CTHĐ
	private static void addDetail() {
		String code = "";
		double price = -1;
		int quantity = -1;

		if (main.java.com.library.BLL.Check.isDcmCode(txtDcmCode.getText())) {
			code = txtDcmCode.getText();
		} else {
			txtDcmCode.setBorder(Handle.colorError());
		}
		if (main.java.com.library.BLL.Check.isDouble(txtValue.getText())) {
			price = Double.parseDouble(txtValue.getText());
		} else {
			txtValue.setBorder(Handle.colorError());
		}
		if (main.java.com.library.BLL.Check.isInteger(txtNumber.getText())) {
			quantity = Integer.parseInt(txtNumber.getText());
		} else {
			txtNumber.setBorder(Handle.colorError());
		}

		if (code.isBlank() || price < 0 || quantity < 0) {
			return;
		}

		for (int i = 0; i < vtDetail.size(); i++) {
			IPDetail e = vtDetail.get(i);
			if (e.getDcmCode().equalsIgnoreCase(code)) {
				totalPrice -= e.getPrice() * e.getQuantity();
				e.setPrice(price);
				e.setQuantity(e.getQuantity() + quantity);
				vtDetail.set(i, e);
				totalPrice += e.getPrice() * e.getQuantity();
				refreshDetailTable();
				txtTotal.setText(Double.toString(totalPrice));
				txtDcmCode.setText("");
				txtValue.setText("");
				txtNumber.setText("");
				return;
			}
		}

		IPDetail dt = new IPDetail(code, price, quantity);
		dt = new ImportRecordBUS().handleDetail(dt);
		if (dt != null) {
			vtDetail.add(dt);
			refreshDetailTable();
			totalPrice += price * quantity;
			txtTotal.setText(Double.toString(totalPrice));
			txtDcmCode.setText("");
			txtValue.setText("");
			txtNumber.setText("");
		} else {
			javax.swing.JOptionPane.showMessageDialog(null, "Mã tài liệu mới!\nVui lòng thêm ở Quản lý tài liệu");
			txtDcmCode.setBorder(Handle.colorError());
		}
	}

	// nút Xoá CTHĐ
	private static void removeDetail() {
		IPDetail dt = vtDetail.get(subTable.getSelectedRow());
		totalPrice -= dt.getPrice() * dt.getQuantity();
		txtTotal.setText(Double.toString(totalPrice));
		vtDetail.remove(subTable.getSelectedRow());
		refreshDetailTable();
		txtDcmCode.setText("");
		txtValue.setText("");
		txtNumber.setText("");
	}

	// nút Lưu
	private static void addRecord() {
		if (Handle.confirm()) {
			java.sql.Date date = null;

			if (main.java.com.library.BLL.Check.isDate(txtDate.getText())) {
				date = java.sql.Date.valueOf(txtDate.getText());
			} else {
				txtDate.setBorder(Handle.colorError());
			}
			if (vtDetail.isEmpty()) {
				txtDcmCode.setBorder(Handle.colorError());
				txtValue.setBorder(Handle.colorError());
				txtNumber.setBorder(Handle.colorError());
			}
			if (date == null || vtDetail.isEmpty()) {
				return;
			}

			ImportRecord rc = new ImportRecord(date, librarianID);
			rc.setDetails(vtDetail);
			new ImportRecordBUS().add(rc);
			txtDcmCode.setEnabled(false);
			resetPage();
		}
	}

	// nút Xoá
	private static void removeRecord() {
		if (Handle.confirm()) {
			new ImportRecordBUS().delete(vtDTO.get(table.getSelectedRow()));
			resetPage();
		}
	}

	// nút Reset
	private static void resetPage() {
		if (txtDcmCode.isEnabled()) {
			txtDate.setEnabled(true);
			txtDcmCode.setEnabled(true);
			txtValue.setEnabled(true);
			txtNumber.setEnabled(true);

			clearDetailTable();
			txtTotal.setText(Double.toString(totalPrice));
			txtDate.setText(new java.sql.Date(System.currentTimeMillis()).toString());
			txtDcmCode.setText("");
			txtDcmCode.setBorder(Handle.colorDisabled());
			txtValue.setText("");
			txtValue.setBorder(Handle.colorDisabled());
			txtNumber.setText("");
			txtNumber.setBorder(Handle.colorDisabled());
		} else {
			clearDetailTable();
			refreshTable();
			txtPerson.setText("");
			txtTotal.setText("");
			txtId.setText("");
			txtDate.setText("");
			txtDcmCode.setText("");
			txtDcmCode.setBorder(Handle.colorDisabled());
			txtValue.setText("");
			txtValue.setBorder(Handle.colorDisabled());
			txtNumber.setText("");
			txtNumber.setBorder(Handle.colorDisabled());

			txtDate.setEnabled(false);
			txtDcmCode.setEnabled(false);
			txtValue.setEnabled(false);
			txtNumber.setEnabled(false);
		}
	}

	private static javax.swing.JSplitPane splitPane;
	private static javax.swing.JPanel details;
	private static javax.swing.JPanel detailsInfo;
	private static javax.swing.JLabel lblPerson;
	private static javax.swing.JTextField txtPerson;
	private static javax.swing.JLabel lblDate;
	private static javax.swing.JTextField txtDate;
	private static javax.swing.JLabel lblId;
	private static javax.swing.JTextField txtId;
	private static javax.swing.JLabel lblTotal;
	private static javax.swing.JTextField txtTotal;
	private static javax.swing.JLabel lblDcmCode;
	private static javax.swing.JTextField txtDcmCode;
	private static javax.swing.JLabel lblValue;
	private static javax.swing.JTextField txtValue;
	private static javax.swing.JLabel lblNumber;
	private static javax.swing.JTextField txtNumber;
	private static javax.swing.JPanel detailsHandle;
	private static javax.swing.JPanel gridTablePnl;
	private static javax.swing.JScrollPane scrollPane;
	private static javax.swing.JPanel tablePnl;
	private static javax.swing.JPanel subTablePnl;
	private static javax.swing.JTable table;
	private static javax.swing.JPanel tableHandle;
	private static javax.swing.JTable subTable;
	private static javax.swing.JPanel subTableHandle;
	@SuppressWarnings("unused")
	private static javax.swing.JLabel lblNotice;

	private static Vector<ImportRecord> vtDTO = new ImportRecordBUS().getTable();
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static Vector<IPDetail> vtDetail = new Vector();
	private static int rowIndex;
	private static double totalPrice = 0;
	private static final int librarianID = main.java.com.library.GUI.Login.role.get(0);
}
