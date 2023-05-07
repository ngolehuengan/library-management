package main.java.com.library.GUI.components;

import main.java.com.library.GUI.librarian.ManageBook.ManageBook;

public class Menu {
	public static void init(javax.swing.JComponent contentPane) {
		tabbedPane = new javax.swing.JTabbedPane(javax.swing.SwingConstants.TOP);
		tabbedPane.setForeground(new java.awt.Color(255, 255, 255));
		tabbedPane.setBackground(new java.awt.Color(0, 153, 51));
		contentPane.add(tabbedPane, java.awt.BorderLayout.CENTER);

		// Tabs
		ManageBook.init(tabbedPane);

		statisticalTab = new javax.swing.JPanel();
		tabbedPane.addTab("Thống Kê", null, statisticalTab, null);

		userTab = new javax.swing.JPanel();
		tabbedPane.addTab("Thông Tin Tài Khoản", null, userTab, null);
	}

	// Private
	private static javax.swing.JTabbedPane tabbedPane;
	private static javax.swing.JPanel statisticalTab;
	private static javax.swing.JPanel userTab;
}