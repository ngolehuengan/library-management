package main.java.com.library;

import main.java.com.library.GUI.Login;

public class Application {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(() -> {
			try {
				new Login().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}