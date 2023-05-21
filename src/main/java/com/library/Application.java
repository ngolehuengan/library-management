package main.java.com.library;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.formdev.flatlaf.themes.FlatMacLightLaf;

import main.java.com.library.GUI.Login;

public class Application {
	public static void main(String[] args) {
		java.awt.EventQueue.invokeLater(() -> {
		try {
			UIManager.setLookAndFeel(new FlatMacLightLaf());
		} catch (UnsupportedLookAndFeelException e) {
	
			e.printStackTrace();
		}
			try {
				new Login().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}
}
