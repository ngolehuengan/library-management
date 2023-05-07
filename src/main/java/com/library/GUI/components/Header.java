package main.java.com.library.GUI.components;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Header {
	// ----------Header----------
		@SuppressWarnings("unused")
		public static void init(JComponent contentPane) {
			header = new JPanel();
			header.setBackground(new Color(204, 255, 204));
			contentPane.add(header, BorderLayout.NORTH);

			JLabel logo = new JLabel(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\images\\header-logo.png"));

			JLabel lblLinkWeb = new JLabel("Website-SGU");
			lblLinkWeb.setForeground(new Color(0, 51, 153));
			lblLinkWeb.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("https://sgu.edu.vn/"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			JLabel lblLinkTTDT = new JLabel("Thông Tin Đào Tạo");
			lblLinkTTDT.setForeground(new Color(0, 51, 153));
			lblLinkTTDT.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("http://thongtindaotao.sgu.edu.vn/"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			JLabel lblLinkMail = new JLabel("Web-mail");
			lblLinkMail.setForeground(new Color(0, 51, 153));
			lblLinkMail.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("http://mail.lib.sgu.edu.vn:3000/"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			JLabel fbIcon = new JLabel(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\facebook.png"));
			fbIcon.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("https://www.facebook.com/trungtamhoclieusgu"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			JLabel mailIcon = new JLabel(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\mail.png"));
			mailIcon.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("https://mail.google.com/"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			JLabel ytbIcon = new JLabel(new ImageIcon(
					"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\icons\\youtube.png"));
			ytbIcon.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					try {
						Desktop.getDesktop().browse(new URI("https://www.youtube.com/@TuoitreaihocSaiGon"));
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (URISyntaxException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});

			GroupLayout gl_header = new GroupLayout(header);
			gl_header.setHorizontalGroup(
					gl_header.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_header.createSequentialGroup()
									.addComponent(logo, GroupLayout.PREFERRED_SIZE, 469, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
									.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
											.addGroup(Alignment.TRAILING, gl_header.createSequentialGroup()
													.addComponent(lblLinkWeb, GroupLayout.PREFERRED_SIZE, 102,
															GroupLayout.PREFERRED_SIZE)
													.addGap(37)
													.addComponent(lblLinkTTDT, GroupLayout.PREFERRED_SIZE, 120,
															GroupLayout.PREFERRED_SIZE)
													.addGap(43)
													.addComponent(lblLinkMail, GroupLayout.PREFERRED_SIZE, 63,
															GroupLayout.PREFERRED_SIZE)
													.addGap(127))
											.addGroup(Alignment.TRAILING, gl_header.createSequentialGroup()
													.addComponent(fbIcon, GroupLayout.PREFERRED_SIZE, 45,
															GroupLayout.PREFERRED_SIZE)
													.addGap(36)
													.addComponent(mailIcon, GroupLayout.PREFERRED_SIZE, 45,
															GroupLayout.PREFERRED_SIZE)
													.addGap(38)
													.addComponent(ytbIcon, GroupLayout.PREFERRED_SIZE, 45,
															GroupLayout.PREFERRED_SIZE)
													.addGap(182)))));
			gl_header.setVerticalGroup(
					gl_header.createParallelGroup(Alignment.TRAILING)
							.addComponent(logo, GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
							.addGroup(Alignment.LEADING, gl_header.createSequentialGroup()
									.addGap(22)
									.addGroup(gl_header.createParallelGroup(Alignment.BASELINE)
											.addComponent(lblLinkTTDT)
											.addComponent(lblLinkMail)
											.addComponent(lblLinkWeb))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_header.createParallelGroup(Alignment.LEADING)
											.addComponent(fbIcon)
											.addComponent(ytbIcon)
											.addComponent(mailIcon))
									.addContainerGap(15, Short.MAX_VALUE)));
			header.setLayout(gl_header);
		}
		
		//Private
		private static JPanel header;
}
