package main.java.com.library;

import main.java.com.library.GUI.Login;
import java.awt.EventQueue;

public class Application {
    public static void main(String[] args) {
    	EventQueue.invokeLater(() -> {
			try {
				new Login().setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
    }
}
