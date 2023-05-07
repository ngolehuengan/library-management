package main.java.com.library.GUI.librarian.ManageBook;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import main.java.com.library.GUI.handle.Handle;

public class ManageBookAll {	
	public static void init(JComponent manageBookTab,CardLayout cardLayout, JComponent pnlCards, JSplitPane splitPane, JButton add, JButton edit, JButton delete, JButton save, JButton reset, JButton view) {
		pnlCards = new JPanel();
		splitPane.setRightComponent(pnlCards);
		pnlCards.setLayout(new CardLayout(0, 0));
		
		pnl = new JPanel();
		pnl.setBackground(new Color(204, 255, 204));
		pnlCards.add(pnl, "pnlAll");
		
		details = new JPanel();
		details.setBorder(
				new TitledBorder(null, "Thông Tin Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, null));

		JPanel imageAllPanel = new JPanel();
		imageAllPanel.setBackground(new Color(204, 204, 204));
		imageAllPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		JLabel imgAll = new JLabel(new ImageIcon(
				"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\images\\image-gallery.png"));
		imgAll.setHorizontalAlignment(SwingConstants.CENTER);

		GroupLayout gl_imgPnl = new GroupLayout(imageAllPanel);
		gl_imgPnl.setHorizontalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_imgPnl.createSequentialGroup()
								.addContainerGap()
								.addComponent(imgAll, GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
								.addContainerGap()));
		gl_imgPnl.setVerticalGroup(
				gl_imgPnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_imgPnl.createSequentialGroup()
								.addComponent(imgAll, GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
								.addGap(0)));
		imageAllPanel.setLayout(gl_imgPnl);

		JLabel lblIdAll = new JLabel("Mã tài liệu");
		JTextField txtIdAll = new JTextField();
		txtIdAll.setEnabled(false);
		txtIdAll.setColumns(10);

		JLabel lblCateAll = new JLabel("Loại tài liệu");
		JComboBox cbbCateAll = new JComboBox();
		cbbCateAll.setModel(new DefaultComboBoxModel(new String[] { "" }));
		cbbCateAll.setEnabled(false);

		JLabel lblTitleAll = new JLabel("Nhan đề");
		JTextField txtTitileAll = new JTextField();
		txtTitileAll.setEnabled(false);
		txtTitileAll.setColumns(10);

		JLabel lblValueAll = new JLabel("Giá trị");
		JTextField txtValueAll = new JTextField();
		txtValueAll.setEnabled(false);
		txtValueAll.setColumns(10);

		JLabel lblCountAll = new JLabel("Số lượng");
		JTextField txtCountAll = new JTextField();
		txtCountAll.setEnabled(false);
		txtCountAll.setColumns(10);

		JLabel lblNumberAll = new JLabel("Số có sẵn");
		JTextField txtNumberAll = new JTextField();
		txtNumberAll.setEnabled(false);
		txtNumberAll.setColumns(10);

		JCheckBox chckbxInvalidAll = new JCheckBox("Cho phép mượn");
		chckbxInvalidAll.setEnabled(false);

		gl_details = new GroupLayout(details);
		gl_details.setHorizontalGroup(
				gl_details.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_details.createSequentialGroup()
												.addGap(81)
												.addGroup(gl_details.createParallelGroup(Alignment.LEADING, false)
														.addGroup(gl_details.createSequentialGroup()
																.addComponent(imageAllPanel, GroupLayout.PREFERRED_SIZE,
																		87, GroupLayout.PREFERRED_SIZE)
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(lblIdAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblTitleAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCateAll))
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(cbbCateAll, 0, 145,
																				Short.MAX_VALUE)
																		.addComponent(txtTitileAll,
																				GroupLayout.DEFAULT_SIZE, 141,
																				Short.MAX_VALUE)
																		.addComponent(txtIdAll,
																				GroupLayout.DEFAULT_SIZE, 145,
																				Short.MAX_VALUE)))
														.addGroup(gl_details.createSequentialGroup()
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING, false)
																		.addComponent(lblValueAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblCountAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(lblNumberAll,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
																.addGap(18)
																.addGroup(gl_details
																		.createParallelGroup(Alignment.LEADING)
																		.addComponent(txtValueAll,
																				GroupLayout.DEFAULT_SIZE, 180,
																				Short.MAX_VALUE)
																		.addComponent(txtCountAll,
																				GroupLayout.DEFAULT_SIZE, 180,
																				Short.MAX_VALUE)
																		.addComponent(txtNumberAll,
																				GroupLayout.DEFAULT_SIZE, 180,
																				Short.MAX_VALUE)))
														.addComponent(chckbxInvalidAll, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
										.addGroup(gl_details.createSequentialGroup()
												.addGap(174)
												.addComponent(save, GroupLayout.PREFERRED_SIZE, 58,
														GroupLayout.PREFERRED_SIZE)
												.addGap(18)
												.addComponent(reset)))
								.addContainerGap(90, Short.MAX_VALUE)));
		gl_details.setVerticalGroup(
				gl_details.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_details.createSequentialGroup()
								.addGap(59)
								.addGroup(gl_details.createParallelGroup(Alignment.TRAILING)
										.addComponent(imageAllPanel, GroupLayout.PREFERRED_SIZE, 101,
												GroupLayout.PREFERRED_SIZE)
										.addGroup(gl_details.createSequentialGroup()
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblIdAll)
														.addComponent(txtIdAll, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblCateAll)
														.addComponent(cbbCateAll, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
												.addGap(24)
												.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblTitleAll)
														.addComponent(txtTitileAll, GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblValueAll)
										.addComponent(txtValueAll, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblCountAll)
										.addComponent(txtCountAll, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(lblNumberAll)
										.addComponent(txtNumberAll, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
								.addGap(18)
								.addComponent(chckbxInvalidAll)
								.addGap(198)
								.addGroup(gl_details.createParallelGroup(Alignment.BASELINE)
										.addComponent(save)
										.addComponent(reset))
								.addGap(73)));
		details.setLayout(gl_details);

		scrollPane = new JScrollPane((Component) null);
		gl_pnl = new GroupLayout(pnl);
		gl_pnl.setHorizontalGroup(
				gl_pnl.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnl.createSequentialGroup()
								.addComponent(details, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_pnl.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_pnl.createSequentialGroup()
												.addGap(6)
												.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 573,
														Short.MAX_VALUE))
										.addGroup(Alignment.TRAILING, gl_pnl.createSequentialGroup()
												.addGap(261)
												.addComponent(view, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
												.addGap(231)))));
		gl_pnl.setVerticalGroup(
				gl_pnl.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_pnl.createSequentialGroup()
								.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 528, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(view)
								.addContainerGap(62, Short.MAX_VALUE))
						.addComponent(details, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"STT", "LOẠI TÀI LIỆU", "MÃ TÀI LIỆU", "NHAN ĐỀ", "GIÁ TRỊ", "SỐ LƯỢNG", "SỐ CÓ SẴN",
						"MƯỢN ĐƯỢC"
				}) {
			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return false;
			}
		});
		scrollPane.setViewportView(table);
		pnl.setLayout(gl_pnl);
		manageBookTab.setLayout(gl_table);

		edit.addActionListener(e -> {
			Handle.addImageBook(imageAllPanel, imgAll);
			chckbxInvalidAll.setEnabled(true);
		});
		add.addActionListener(e -> {
			Handle.removeClickListener(imageAllPanel);
			chckbxInvalidAll.setEnabled(false);
		});
		delete.addActionListener(e -> {
			Handle.removeClickListener(imageAllPanel);
			chckbxInvalidAll.setEnabled(false);
			if (txtCountAll.getText().equals("0")) {
				imgAll.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\images\\image-gallery.png"));
				txtIdAll.setText("");
				cbbCateAll.setSelectedIndex(0);
				txtTitileAll.setText("");
				txtValueAll.setText("");
				txtCountAll.setText("");
				txtNumberAll.setText("");
				chckbxInvalidAll.setSelected(false);
			}
		});
		save.addActionListener(e -> {
			Handle.removeClickListener(imageAllPanel);
			chckbxInvalidAll.setEnabled(false);
		});
		reset.addActionListener(e -> {
			if (chckbxInvalidAll.isEnabled()) {
				imgAll.setIcon(new ImageIcon(
						"C:\\Users\\ADMIN\\OneDrive\\Documents\\GitHub\\library-management\\src\\main\\java\\resources\\images\\image-gallery.png"));
				chckbxInvalidAll.setSelected(false);
			}
		});
	}
	
	// Private
	private static JPanel pnl;
	private static GroupLayout gl_pnl;
	private static JPanel details;
	private static GroupLayout gl_details;
	private static JScrollPane scrollPane;
	private static JTable table;
	private static GroupLayout gl_table;
}
