package main.java.com.library.GUI.components;

public class Header {
	public static void init(javax.swing.JComponent contentPane) {
		header = new javax.swing.JPanel();
		header.setBackground(new java.awt.Color(204, 255, 204));
		contentPane.add(header, java.awt.BorderLayout.NORTH);

		logo = new javax.swing.JLabel(
				new javax.swing.ImageIcon(Header.class.getResource("../../../../resources/images/header-logo.png")));

		lblLinkWeb = new javax.swing.JLabel("Website-SGU");
		lblLinkWeb.setForeground(new java.awt.Color(0, 51, 153));
		lblLinkWeb.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(new java.net.URI("https://sgu.edu.vn/"));
				} catch (java.io.IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (java.net.URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		lblLinkTTDT = new javax.swing.JLabel("Thông Tin Đào Tạo");
		lblLinkTTDT.setForeground(new java.awt.Color(0, 51, 153));
		lblLinkTTDT.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(new java.net.URI("http://thongtindaotao.sgu.edu.vn/"));
				} catch (java.io.IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (java.net.URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		lblLinkMail = new javax.swing.JLabel("Web-mail");
		lblLinkMail.setForeground(new java.awt.Color(0, 51, 153));
		lblLinkMail.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(new java.net.URI("http://mail.lib.sgu.edu.vn:3000/"));
				} catch (java.io.IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (java.net.URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		fbIcon = new javax.swing.JLabel(
				new javax.swing.ImageIcon(Header.class.getResource("../../../../resources/icons/facebook.png")));
		fbIcon.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				try {
					java.awt.Desktop.getDesktop()
							.browse(new java.net.URI("https://www.facebook.com/trungtamhoclieusgu"));
				} catch (java.io.IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (java.net.URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		mailIcon = new javax.swing.JLabel(
				new javax.swing.ImageIcon(Header.class.getResource("../../../../resources/icons/mail.png")));
		mailIcon.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				try {
					java.awt.Desktop.getDesktop().browse(new java.net.URI("https://mail.google.com/"));
				} catch (java.io.IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (java.net.URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		ytbIcon = new javax.swing.JLabel(
				new javax.swing.ImageIcon(Header.class.getResource("../../../../resources/icons/youtube.png")));
		ytbIcon.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent e) {
				try {
					java.awt.Desktop.getDesktop()
							.browse(new java.net.URI("https://www.youtube.com/@TuoitreaihocSaiGon"));
				} catch (java.io.IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (java.net.URISyntaxException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout gl_header = new javax.swing.GroupLayout(header);
		gl_header.setHorizontalGroup(gl_header.createSequentialGroup().addGap(50)
				.addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 279, Short.MAX_VALUE)
				.addGroup(gl_header.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								gl_header.createSequentialGroup()
										.addComponent(lblLinkWeb, javax.swing.GroupLayout.PREFERRED_SIZE, 102,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(43)
										.addComponent(lblLinkTTDT, javax.swing.GroupLayout.PREFERRED_SIZE, 120,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(43)
										.addComponent(lblLinkMail, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(127))
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								gl_header.createSequentialGroup()
										.addComponent(fbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(38)
										.addComponent(mailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(38).addComponent(ytbIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(195))));
		gl_header.setVerticalGroup(gl_header.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
				.addComponent(logo, 0, 76, Short.MAX_VALUE).addGroup(javax.swing.GroupLayout.Alignment.LEADING,
						gl_header.createSequentialGroup().addGap(22)
								.addGroup(gl_header.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblLinkTTDT).addComponent(lblLinkMail).addComponent(lblLinkWeb))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(gl_header.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(fbIcon).addComponent(ytbIcon).addComponent(mailIcon))
								.addContainerGap(22, Short.MAX_VALUE)));
		header.setLayout(gl_header);
	}

	// Private
	private static javax.swing.JPanel header;
	private static javax.swing.JLabel logo;
	private static javax.swing.JLabel lblLinkWeb;
	private static javax.swing.JLabel lblLinkTTDT;
	private static javax.swing.JLabel lblLinkMail;
	private static javax.swing.JLabel fbIcon;
	private static javax.swing.JLabel mailIcon;
	private static javax.swing.JLabel ytbIcon;
}
