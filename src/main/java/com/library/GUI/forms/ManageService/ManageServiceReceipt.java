package main.java.com.library.GUI.forms.ManageService;

public class ManageServiceReceipt {
        @SuppressWarnings("serial")
        static void init(javax.swing.JComponent pnlCards) {
                // --Receipt ManageService Tab = Details + Table
                splitPane = new javax.swing.JSplitPane();
                pnlCards.add(splitPane, "pnlReceipt");

                // ---Details
                details = new javax.swing.JPanel();
                splitPane.setLeftComponent(details);
                details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết",
                                                javax.swing.border.TitledBorder.LEADING,
                                                javax.swing.border.TitledBorder.TOP, null, null));
                details.setLayout(new java.awt.BorderLayout(0, 0));

                // ----Details: Info
                detailsInfo = new javax.swing.JPanel();
                details.add(detailsInfo, java.awt.BorderLayout.CENTER);

                lblId = new javax.swing.JLabel("Mã biên lai");
                txtId = new javax.swing.JTextField();
                txtId.setEnabled(false);
                txtId.setColumns(20);

                lblReader = new javax.swing.JLabel("Mã độc giả");
                txtReader = new javax.swing.JTextField();
                txtReader.setEnabled(false);
                txtReader.setColumns(20);

                lblDate = new javax.swing.JLabel("Ngày");
                txtDate = new javax.swing.JTextField();
                txtDate.setEnabled(false);
                txtDate.setColumns(20);

                lblValue = new javax.swing.JLabel("Tiền thu");
                txtValue = new javax.swing.JTextField();
                txtValue.setColumns(20);

                lblPerson = new javax.swing.JLabel("Người tiếp nhận");
                txtPerson = new javax.swing.JTextField();
                txtPerson.setEnabled(false);
                txtPerson.setColumns(20);

                lblDebt = new javax.swing.JLabel("Tiền nợ");
                txtDebt = new javax.swing.JTextField();
                txtDebt.setEnabled(false);
                txtDebt.setColumns(20);

                lblRest = new javax.swing.JLabel("Còn lại");
                txtRest = new javax.swing.JTextField();
                txtRest.setEnabled(false);
                txtRest.setColumns(20);

                javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
                gl_details.setHorizontalGroup(
                                gl_details.createSequentialGroup()
                                                .addGap(80)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(lblPerson)
                                                                .addComponent(lblId)
                                                                .addComponent(lblReader)
                                                                .addComponent(lblDate)
                                                                .addComponent(lblValue)
                                                                .addComponent(lblDebt)
                                                                .addComponent(lblRest))
                                                .addGap(24)
                                                .addGroup(gl_details
                                                                .createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txtPerson)
                                                                .addComponent(txtId)
                                                                .addComponent(txtReader)
                                                                .addComponent(txtDate)
                                                                .addComponent(txtValue)
                                                                .addComponent(txtDebt)
                                                                .addComponent(txtRest))
                                                .addGap(80));
                gl_details.setVerticalGroup(
                                gl_details.createSequentialGroup()
                                                .addGap(80)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblId)
                                                                .addComponent(txtId))
                                                .addGap(24)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblReader)
                                                                .addComponent(txtReader))
                                                .addGap(24)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblValue)
                                                                .addComponent(txtValue))
                                                .addGap(24)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblDebt)
                                                                .addComponent(txtDebt))
                                                .addGap(24)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblRest)
                                                                .addComponent(txtRest))
                                                .addGap(24)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblDate)
                                                                .addComponent(txtDate))
                                                .addGap(24)
                                                .addGroup(gl_details.createParallelGroup(
                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(lblPerson)
                                                                .addComponent(txtPerson)));
                detailsInfo.setLayout(gl_details);

                // -----Details: Handle
                detailsHandle = new javax.swing.JPanel();
                detailsHandle.add(ManageService.collect);
                detailsHandle.add(ManageService.reset);
                details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

                // ---Table
                tablePnl = new javax.swing.JPanel();
                splitPane.setRightComponent(tablePnl);
                tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

                scrollPane = new javax.swing.JScrollPane();
                tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

                table = new javax.swing.JTable();
                table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
                table.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {
                                },
                                new String[] {
                                                "STT", "ĐỘC GIẢ", "TIỀN NỢ"
                                }) {
                        @Override
                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return false;
                        }
                });
                table.setAutoCreateRowSorter(true);
                scrollPane.setViewportView(table);

                tableHandle = new javax.swing.JPanel();
                tableHandle.add(ManageService.view);
                tableHandle.setBackground(new java.awt.Color(204, 255, 204));
                tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);
        }

        // Private
        private static javax.swing.JSplitPane splitPane;
        private static javax.swing.JPanel details;
        private static javax.swing.JPanel detailsInfo;
        private static javax.swing.JLabel lblId;
        private static javax.swing.JTextField txtId;
        private static javax.swing.JLabel lblReader;
        private static javax.swing.JTextField txtReader;
        private static javax.swing.JLabel lblDate;
        private static javax.swing.JTextField txtDate;
        private static javax.swing.JLabel lblValue;
        private static javax.swing.JTextField txtValue;
        private static javax.swing.JLabel lblPerson;
        private static javax.swing.JTextField txtPerson;
        private static javax.swing.JLabel lblDebt;
        private static javax.swing.JTextField txtDebt;
        private static javax.swing.JLabel lblRest;
        private static javax.swing.JTextField txtRest;
        private static javax.swing.JPanel detailsHandle;
        private static javax.swing.JPanel tablePnl;
        private static javax.swing.JScrollPane scrollPane;
        private static javax.swing.JTable table;
        private static javax.swing.JPanel tableHandle;
}
