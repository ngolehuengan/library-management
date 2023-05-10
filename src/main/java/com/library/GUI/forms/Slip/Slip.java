package main.java.com.library.GUI.forms.Slip;

public class Slip {
    public static void init(javax.swing.JTabbedPane tabbedPane) {
        slit = new javax.swing.JPanel();
        slit.setLayout(new java.awt.BorderLayout(0, 0));
        tabbedPane.addTab("Phiếu", null, slit, null);
        handle();

        // Main Frame = Handle + SplitPane (Menu Side + Tabs)
        splitPane = new javax.swing.JSplitPane();
        slit.add(splitPane, java.awt.BorderLayout.CENTER);

        // Menu Side - Left
        menuSide = new javax.swing.JPanel();
        menuSide.setLayout(new java.awt.GridLayout(4, 1));
        splitPane.setLeftComponent(menuSide);

        btnHistory = new javax.swing.JButton("LỊCH SỬ MƯỢN TRẢ");
        btnHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnHistory.setBackground(new java.awt.Color(0, 102, 0));

        btnLoan = new javax.swing.JButton("PHIẾU MƯỢN");
        btnLoan.setForeground(new java.awt.Color(255, 255, 255));
        btnLoan.setBackground(new java.awt.Color(0, 153, 51));

        btnPenalty = new javax.swing.JButton("PHIẾU PHẠT");
        btnPenalty.setForeground(new java.awt.Color(255, 255, 255));
        btnPenalty.setBackground(new java.awt.Color(0, 153, 51));

        btnReceipt = new javax.swing.JButton("PHIẾU THU TIỀN");
        btnReceipt.setForeground(new java.awt.Color(255, 255, 255));
        btnReceipt.setBackground(new java.awt.Color(0, 153, 51));

        menuSide.add(btnHistory);
        menuSide.add(btnLoan);
        menuSide.add(btnPenalty);
        menuSide.add(btnReceipt);

        // MenuSide Tabs - Right
        pnlCards = new javax.swing.JPanel();
        splitPane.setRightComponent(pnlCards);
        cardLayout = new java.awt.CardLayout();
        pnlCards.setLayout(cardLayout);

        HistorySlip.init(pnlCards);

        // Action Changed Tab
        btnHistory.addActionListener(e -> {
            HistorySlip.init(pnlCards);
            btnHistory.setBackground(new java.awt.Color(0, 102, 0));
            btnLoan.setBackground(new java.awt.Color(0, 153, 51));
            btnPenalty.setBackground(new java.awt.Color(0, 153, 51));
            btnReceipt.setBackground(new java.awt.Color(0, 153, 51));
            cardLayout.show(pnlCards, "pnlHistory");
        });

        btnLoan.addActionListener(e -> {
            LoanSlip.init(pnlCards);
            btnHistory.setBackground(new java.awt.Color(0, 153, 51));
            btnLoan.setBackground(new java.awt.Color(0, 102, 0));
            btnPenalty.setBackground(new java.awt.Color(0, 153, 51));
            btnReceipt.setBackground(new java.awt.Color(0, 153, 51));
            cardLayout.show(pnlCards, "pnlLoan");
        });

        btnPenalty.addActionListener(e -> {
            PenaltyRecordSlip.init(pnlCards);
            btnHistory.setBackground(new java.awt.Color(0, 153, 51));
            btnLoan.setBackground(new java.awt.Color(0, 153, 51));
            btnPenalty.setBackground(new java.awt.Color(0, 102, 0));
            btnReceipt.setBackground(new java.awt.Color(0, 153, 51));
            cardLayout.show(pnlCards, "pnlPenalty");
        });

        btnReceipt.addActionListener(e -> {
            ReceiptSlip.init(pnlCards);
            btnHistory.setBackground(new java.awt.Color(0, 153, 51));
            btnLoan.setBackground(new java.awt.Color(0, 153, 51));
            btnPenalty.setBackground(new java.awt.Color(0, 153, 51));
            btnReceipt.setBackground(new java.awt.Color(0, 102, 0));
            cardLayout.show(pnlCards, "pnlReceipt");
        });
    }

    // Handle
    private static void handle() {
        delete = new javax.swing.JButton("Xóa");
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setBackground(new java.awt.Color(0, 153, 51));

        view = new javax.swing.JButton("Xem");
        view.setForeground(new java.awt.Color(255, 255, 255));
        view.setBackground(new java.awt.Color(0, 153, 51));
    }

    // Private
    private static javax.swing.JPanel slit;
    private static javax.swing.JSplitPane splitPane;
    private static javax.swing.JPanel menuSide;
    private static javax.swing.JButton btnHistory;
    private static javax.swing.JButton btnLoan;
    private static javax.swing.JButton btnPenalty;
    private static javax.swing.JButton btnReceipt;
    private static java.awt.CardLayout cardLayout;
    private static javax.swing.JPanel pnlCards;

    public static javax.swing.JButton delete;
    public static javax.swing.JButton view;
}