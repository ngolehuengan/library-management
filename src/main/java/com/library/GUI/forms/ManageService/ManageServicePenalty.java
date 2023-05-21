package main.java.com.library.GUI.forms.ManageService;

import main.java.com.library.GUI.handle.Handle;

@SuppressWarnings({ "serial" })
public class ManageServicePenalty extends javax.swing.JFrame {
	public ManageServicePenalty() {
		init();
	}

	private void init() {
		setBounds((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width - 560) / 2, 25, 560, 770);
		setIconImage(java.awt.Toolkit.getDefaultToolkit()
				.getImage(this.getClass().getResource("../../../../../resources/icons/sgu-logo.png")));
		setTitle("BIÊN BẢN PHẠT - THƯ VIỆN SGU");
		contentPane = new javax.swing.JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new java.awt.BorderLayout(0, 0));

		// Title
		titlePnl = new javax.swing.JPanel();
		titlePnl.setLayout(new java.awt.BorderLayout(0, 0));
		titlePnl.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(titlePnl, java.awt.BorderLayout.NORTH);
		title = new javax.swing.JLabel("BIÊN BẢN");
		title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		title.setForeground(new java.awt.Color(0, 102, 0));
		title.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 20));
		ManageService.print = Handle.getPrint(ManageService.print);
		titlePnl.add(ManageService.print, java.awt.BorderLayout.EAST);
		titlePnl.add(title, java.awt.BorderLayout.SOUTH);

		// ----Details: Info
		details = new javax.swing.JPanel();
		details.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(details, java.awt.BorderLayout.CENTER);

		lblId = new javax.swing.JLabel("Mã biên bản");
		txtId = new javax.swing.JTextField(20);
		txtId.setEnabled(false);

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

		lblContent = new javax.swing.JLabel("Nội dung phạt");
		txtContent = new javax.swing.JTextArea(4, 1);

		lblWayHandle = new javax.swing.JLabel("Hướng xử lý");
		txtWayHandle = new javax.swing.JTextArea(4, 1);

		lblDebt = new javax.swing.JLabel("Nợ tồn");
		txtDebt = new javax.swing.JTextField(20);
		txtDebt.setEnabled(false);

		lblTotal = new javax.swing.JLabel("Tổng nợ");
		txtTotal = new javax.swing.JTextField(20);
		txtTotal.setEnabled(false);

		scrollPane = new javax.swing.JScrollPane();
		scrollPane.setViewportView(txtContent);
		
		ManageService.find = Handle.getFind(ManageService.find);

		javax.swing.JScrollPane scrollPane_1 = new javax.swing.JScrollPane();
		scrollPane_1.setViewportView(txtWayHandle);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(0, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(lblPerson).addComponent(lblId).addComponent(lblReader).addComponent(lblName)
						.addComponent(lblMs).addComponent(lblDate).addComponent(lblValue).addComponent(lblDebt)
						.addComponent(lblTotal).addComponent(lblContent).addComponent(lblWayHandle))
				.addGap(24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(txtPerson).addComponent(txtId).addComponent(txtName).addComponent(txtMs)
						.addComponent(txtDate).addComponent(txtValue).addComponent(txtDebt).addComponent(txtTotal)
						.addComponent(scrollPane_1).addComponent(scrollPane)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(txtReader))
								.addGap(5)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(ManageService.find))))
				.addGap(0, 80, 80));
		gl_details
				.setVerticalGroup(gl_details.createSequentialGroup().addGap(40)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblId).addComponent(txtId))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblReader).addComponent(txtReader).addComponent(ManageService.find))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblName).addComponent(txtName))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(lblMs).addComponent(txtMs))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
								.addComponent(lblContent).addComponent(scrollPane))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
								.addComponent(lblWayHandle).addComponent(scrollPane_1))
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
								.addComponent(lblPerson).addComponent(txtPerson))
						.addGap(40));
		details.setLayout(gl_details);

		// -----Details: Handle
		detailsHandle = new javax.swing.JPanel();
		ManageService.save = Handle.getSave(ManageService.save);
		ManageService.reset = Handle.getReset(ManageService.reset);
		detailsHandle.add(ManageService.save);
		detailsHandle.add(ManageService.reset);
		detailsHandle.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(detailsHandle, java.awt.BorderLayout.SOUTH);
	}

	// Private
	private javax.swing.JPanel contentPane;
	private javax.swing.JPanel titlePnl;
	private javax.swing.JLabel title;
	private javax.swing.JPanel details;
	private javax.swing.JLabel lblId;
	private javax.swing.JTextField txtId;
	private javax.swing.JLabel lblReader;
	private javax.swing.JTextField txtReader;
	private javax.swing.JLabel lblName;
	private javax.swing.JTextField txtName;
	private javax.swing.JLabel lblMs;
	private javax.swing.JTextField txtMs;
	private javax.swing.JLabel lblDate;
	private javax.swing.JTextField txtDate;
	private javax.swing.JLabel lblValue;
	private javax.swing.JTextField txtValue;
	private javax.swing.JLabel lblPerson;
	private javax.swing.JTextField txtPerson;
	private javax.swing.JLabel lblDebt;
	private javax.swing.JTextField txtDebt;
	private javax.swing.JLabel lblTotal;
	private javax.swing.JTextField txtTotal;
	private javax.swing.JLabel lblContent;
	private javax.swing.JTextArea txtContent;
	private javax.swing.JLabel lblWayHandle;
	private javax.swing.JTextArea txtWayHandle;
	private javax.swing.JScrollPane scrollPane;
	private javax.swing.JPanel detailsHandle;
}
