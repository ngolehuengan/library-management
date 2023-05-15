package main.java.com.library.GUI.components;

import main.java.com.library.GUI.Login;
import main.java.com.library.GUI.forms.ManageBook.ManageBook;
import main.java.com.library.GUI.forms.ManageInventory.ManageInventory;
import main.java.com.library.GUI.forms.ManageRole.ManageLibrarian;
import main.java.com.library.GUI.forms.ManageRole.ManageReader;
import main.java.com.library.GUI.forms.ManageService.ManageService;
import main.java.com.library.GUI.forms.ManageUser.UserInfo;
import main.java.com.library.GUI.forms.Slip.Slip;

public class Menu {
	public static void init(javax.swing.JComponent contentPane) {
		tabbedPane = new javax.swing.JTabbedPane(javax.swing.SwingConstants.TOP);
		tabbedPane.setForeground(new java.awt.Color(255, 255, 255));
		tabbedPane.setBackground(new java.awt.Color(0, 153, 51));
		contentPane.add(tabbedPane, java.awt.BorderLayout.CENTER);

		// Tabs
		// statisticalTab = new javax.swing.JPanel();
		// tabbedPane.addTab("Quy Định", null, statisticalTab, null);

		ManageInventory.init(tabbedPane);
		ManageBook.init(tabbedPane);
		ManageService.init(tabbedPane);
		Slip.init(tabbedPane);
		ManageReader.init(tabbedPane);

		if (Login.role.get(1) == 1) { // check role
			ManageLibrarian.init(tabbedPane);
		}


		statisticalTab = new javax.swing.JPanel();
		tabbedPane.addTab("Thống Kê", null, statisticalTab, null);

		UserInfo.init(tabbedPane);
	}

	// Private
	private static javax.swing.JTabbedPane tabbedPane;
	private static javax.swing.JPanel statisticalTab;
}