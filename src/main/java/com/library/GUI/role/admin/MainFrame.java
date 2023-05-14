package main.java.com.library.GUI.role.admin;

import main.java.com.library.GUI.components.Header;
import main.java.com.library.GUI.components.Menu;

@SuppressWarnings("serial")
public class MainFrame extends javax.swing.JFrame {
	/**
	 * Create the frame.
	 */
	public MainFrame() {
		init();
	}

	private void init() {
		// ----------Frame----------
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(0, 0, 1264, 810);
		setIconImage(java.awt.Toolkit.getDefaultToolkit()
				.getImage(this.getClass().getResource("../../../../../resources/icons/sgu-logo.png")));
		setTitle("THƯ VIỆN SGU");

		contentPane = new javax.swing.JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(new java.awt.BorderLayout(0, 0));

		Header.init(contentPane);
		Menu.init(contentPane);
	}

	// ----------private----------
	private javax.swing.JPanel contentPane;
}