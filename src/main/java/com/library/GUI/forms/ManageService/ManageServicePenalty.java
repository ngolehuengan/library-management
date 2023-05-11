package main.java.com.library.GUI.forms.ManageService;

import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings({ "serial" })
public class ManageServicePenalty extends JFrame {
	public ManageServicePenalty() {
		init();
	}
	
	private void init() {
		setBounds((Toolkit.getDefaultToolkit().getScreenSize().width - 500) / 2,
				(Toolkit.getDefaultToolkit().getScreenSize().height - 700) / 2, 500, 700);
		setIconImage(java.awt.Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("../../../../../resources/icons/sgu-logo.png")));
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
		titlePnl.add(ManageService.print, java.awt.BorderLayout.EAST);
		titlePnl.add(title, java.awt.BorderLayout.SOUTH);

        // ----Details: Info
        details = new javax.swing.JPanel();
        details.setBackground(new java.awt.Color(204, 255, 204));
        contentPane.add(details, java.awt.BorderLayout.CENTER);

        lblId = new javax.swing.JLabel("Mã biên bản");
        txtId = new javax.swing.JTextField();
        txtId.setEnabled(false);
        txtId.setColumns(20);

        lblReader = new javax.swing.JLabel("Mã độc giả");
        txtReader = new javax.swing.JTextField();
        txtReader.setColumns(20);

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
        
        lblContent = new javax.swing.JLabel("Nội dung phạt");
        txtContent = new javax.swing.JTextArea(5, 1);
        txtContent.setColumns(20);

        lblWayHandle = new javax.swing.JLabel("Hướng xử lý");
        txtWayHandle = new javax.swing.JTextArea(5, 1);
        txtWayHandle.setColumns(20);
        
        lblDebt = new javax.swing.JLabel("Nợ tồn");
        txtDebt = new javax.swing.JTextField();
        txtDebt.setEnabled(false);
        txtDebt.setColumns(20);
        
        lblAll = new javax.swing.JLabel("Tổng nợ");
        txtAll = new javax.swing.JTextField();
        txtAll.setEnabled(false);
        txtAll.setColumns(20);
        
        scrollPane = new javax.swing.JScrollPane();
        scrollPane.setViewportView(txtContent);

        javax.swing.JScrollPane scrollPane_1 = new javax.swing.JScrollPane();
        scrollPane_1.setViewportView(txtWayHandle);

        javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(details);
        gl_details.setHorizontalGroup(
                gl_details.createSequentialGroup()
                        .addGap(80)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblPerson)
                                .addComponent(lblId)
                                .addComponent(lblReader)
                                .addComponent(lblDate)
                                .addComponent(lblValue)
                                .addComponent(lblDebt)
                                .addComponent(lblAll)
                                .addComponent(lblContent)
                                .addComponent(lblWayHandle))
                        .addGap(24)
                        .addGroup(gl_details
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtPerson)
                                .addComponent(txtId)
                                .addComponent(txtReader)
                                .addComponent(txtDate)
                                .addComponent(txtValue)
                                .addComponent(txtDebt)
                                .addComponent(txtAll)
                                .addComponent(scrollPane_1)
                                .addComponent(scrollPane))
                        .addGap(80));
        gl_details.setVerticalGroup(
                gl_details.createSequentialGroup()
                		.addGap(40)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblId)
                                .addComponent(txtId))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblReader)
                                .addComponent(txtReader))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        		.addComponent(lblContent)
                        		.addComponent(scrollPane))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                        		.addComponent(lblWayHandle)
                        		.addComponent(scrollPane_1))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblValue)
                                .addComponent(txtValue))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblDebt)
                                .addComponent(txtDebt))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblAll)
                                .addComponent(txtAll))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        		.addComponent(lblDate)
                        		.addComponent(txtDate))
                        .addGap(24)
                        .addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPerson)
                                .addComponent(txtPerson))
                        .addGap(40));
        details.setLayout(gl_details);

        // -----Details: Handle
        detailsHandle = new javax.swing.JPanel();
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
    private javax.swing.JLabel lblDate;
    private javax.swing.JTextField txtDate;
    private javax.swing.JLabel lblValue;
    private javax.swing.JTextField txtValue;
    private javax.swing.JLabel lblPerson;
    private javax.swing.JTextField txtPerson;
    private javax.swing.JLabel lblDebt;
    private javax.swing.JTextField txtDebt;
    private javax.swing.JLabel lblAll;
    private javax.swing.JTextField txtAll;
    private javax.swing.JLabel lblContent;
    private javax.swing.JTextArea txtContent;
    private javax.swing.JLabel lblWayHandle;
    private javax.swing.JTextArea txtWayHandle;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JPanel detailsHandle;
}
