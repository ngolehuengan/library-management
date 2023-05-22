package main.java.com.library.GUI.forms.ManageBook;

import java.util.Vector;
import main.java.com.library.BLL.BookBUS;
import main.java.com.library.BLL.DocumentBUS;
import main.java.com.library.DTO.Author;
import main.java.com.library.DTO.Book;
import main.java.com.library.DTO.Category;
import main.java.com.library.DTO.Publisher;
import main.java.com.library.GUI.components.TableHeader;
import main.java.com.library.GUI.handle.Handle;

public class ManageBookBook {

    @SuppressWarnings({"unchecked", "rawtypes", "serial"})
    public static void init(javax.swing.JComponent pnlCards) {
        // --Books Tab = Details + Table
        splitPane = new javax.swing.JSplitPane();
        pnlCards.add(splitPane, "pnlBook");

        // ---Details
        details = new javax.swing.JPanel();
        splitPane.setLeftComponent(details);
        details.setBorder(new javax.swing.border.TitledBorder(null, "Thông Tin Chi Tiết",
                javax.swing.border.TitledBorder.LEADING, javax.swing.border.TitledBorder.TOP, null, null));
        details.setLayout(new java.awt.BorderLayout(0, 0));

        // ----Details: Info
        detailsInfo = new javax.swing.JPanel();
        details.add(detailsInfo, java.awt.BorderLayout.CENTER);

        // -----Details: Image
        imgPnl = new javax.swing.JPanel();
        imgPnl.setBackground(new java.awt.Color(204, 204, 204));
        imgPnl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0)));
        imgPnl.setLayout(new java.awt.BorderLayout(0, 0));
        img = new javax.swing.JLabel(Handle.setDefaultImg());
        imgPnl.add(img, java.awt.BorderLayout.CENTER);

        // -----Details: InfoForm
        lblIsbn = new javax.swing.JLabel("ISBN");
        txtIsbn = new javax.swing.JTextField(15);
        txtIsbn.setEnabled(false);

        lblTitle = new javax.swing.JLabel("Nhan đề");
        txtTitle = new javax.swing.JTextField(15);
        txtTitle.setEnabled(false);

        lblCate = new javax.swing.JLabel("Thể loại");
        cbbCate = new javax.swing.JComboBox();
        cbbCate.setModel(new javax.swing.DefaultComboBoxModel(getCategoryCBB()));
        cbbCate.setEnabled(false);

        lblAuthor = new javax.swing.JLabel("Tác giả");
        txtAuthor = new javax.swing.JTextField(15);
        txtAuthor.setEnabled(false);

        lblNxb = new javax.swing.JLabel("Nhà xuất bản");
        cbbNxb = new javax.swing.JComboBox();
        cbbNxb.setModel(new javax.swing.DefaultComboBoxModel(getPublisherCBB()));
        cbbNxb.setEnabled(false);

        lblYear = new javax.swing.JLabel("Năm xuất bản");
        cbbYear = new javax.swing.JComboBox();
        cbbYear.setModel(new javax.swing.DefaultComboBoxModel(getYearCBB()));
        cbbYear.setEnabled(false);

		javax.swing.GroupLayout gl_details = new javax.swing.GroupLayout(detailsInfo);
		gl_details.setHorizontalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80).addGroup(gl_details
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(gl_details.createSequentialGroup()
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 87,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblIsbn).addComponent(lblCate).addComponent(lblTitle))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(cbbCate).addComponent(txtTitle).addComponent(txtIsbn)))
				.addGroup(gl_details.createSequentialGroup()
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
								.addComponent(lblAuthor).addComponent(lblNxb).addComponent(lblYear)
								.addComponent(lblDescript))
						.addGap(24)
						.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(scrollPane).addComponent(cbbYear).addComponent(txtAuthor)
								.addComponent(cbbNxb))))
				.addGap(10, 80, 80));
		gl_details.setVerticalGroup(gl_details.createSequentialGroup().addGap(10, 80, 80)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
						.addComponent(imgPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_details.createSequentialGroup()
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblIsbn).addComponent(txtIsbn))
								.addGap(5, 15, 24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblTitle).addComponent(txtTitle))
								.addGap(5, 15, 24)
								.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(lblCate).addComponent(cbbCate))))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblAuthor).addComponent(txtAuthor))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblNxb).addComponent(cbbNxb))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(lblYear).addComponent(cbbYear))
				.addGap(5, 15, 24)
				.addGroup(gl_details.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
						.addComponent(lblDescript).addComponent(scrollPane))
				.addGap(10, 80, 80));
		detailsInfo.setLayout(gl_details);

		// -----Details: Handle
        detailsHandle = new javax.swing.JPanel();
        detailsHandle.add(ManageBook.save);
        detailsHandle.add(ManageBook.reset);
        details.add(detailsHandle, java.awt.BorderLayout.SOUTH);

        // ---Table
        tablePnl = new javax.swing.JPanel();
        splitPane.setRightComponent(tablePnl);
        tablePnl.setLayout(new java.awt.BorderLayout(0, 0));

        scrollPane = new javax.swing.JScrollPane();
        tablePnl.add(scrollPane, java.awt.BorderLayout.CENTER);

        table = new javax.swing.JTable();
        table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        table.setModel(new javax.swing.table.DefaultTableModel(getVectorDisplay(vtDTO), TableHeader.book()) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
        table.setAutoCreateRowSorter(true);
        scrollPane.setViewportView(table);

        tableHandle = new javax.swing.JPanel();
        tableHandle.add(ManageBook.view);
        tableHandle.setBackground(new java.awt.Color(204, 255, 204));
        tablePnl.add(tableHandle, java.awt.BorderLayout.SOUTH);

        // Action
        ManageBook.add.addActionListener(e -> {
            Handle.addImage(imgPnl, img);
            img.setIcon(Handle.setDefaultImg());
            txtIsbn.setText("");
            txtTitle.setText("");
            cbbCate.setSelectedIndex(0);
            txtAuthor.setText("");
            cbbNxb.setSelectedIndex(0);
            cbbYear.setSelectedIndex(0);
            txtDescript.setText("");
            enableAll();
        });

        ManageBook.edit.addActionListener(e -> {
            Handle.addImage(imgPnl, img);
            enableAll();
            txtIsbn.setEnabled(false);
        });

        ManageBook.delete.addActionListener(e -> {
            removeBook();
        });

        ManageBook.save.addActionListener(e -> {
            if (txtIsbn.isEnabled()) {
                addBook();
            } else if (txtTitle.isEnabled()) {
                updateBook();
            }
        });

        ManageBook.reset.addActionListener(e -> {
            resetPage();
        });

        ManageBook.view.addActionListener(e -> {
            refreshTable();
        });

        table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                displayDetail(vtDTO.get(table.getSelectedRow()));
            }
        });

        txtIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                if (main.java.com.library.BLL.Check.isISBN(txtIsbn.getText())) {
                    txtIsbn.setBorder(Handle.colorEnabled());
                }
            }
        });

        txtTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                if (!txtTitle.getText().isBlank()) {
                    txtTitle.setBorder(Handle.colorEnabled());
                }
            }
        });

        txtAuthor.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent e) {
                if (!txtAuthor.getText().isBlank()) {
                    txtAuthor.setBorder(Handle.colorEnabled());
                }
            }
        });
    }

    // Private
    private static void disableAll() {
        Handle.removeClickListener(imgPnl);
        txtIsbn.setEnabled(false);
        txtTitle.setEnabled(false);
        cbbCate.setEnabled(false);
        txtAuthor.setEnabled(false);
        cbbNxb.setEnabled(false);
        cbbYear.setEnabled(false);
        txtDescript.setEnabled(false);
    }

    private static void enableAll() {
        txtIsbn.setEnabled(true);
        txtTitle.setEnabled(true);
        cbbCate.setEnabled(true);
        txtAuthor.setEnabled(true);
        cbbNxb.setEnabled(true);
        cbbYear.setEnabled(true);
        txtDescript.setEnabled(true);
    }

    private static void displayDetail(Book e) {
        txtIsbn.setText(e.getISBN());
        txtTitle.setText(e.getTitle());
        for (int i = 0; i < vtCate.size(); i++) {
            if (vtCate.get(i).getID() == e.getCategory().firstElement().getID()) {
                cbbCate.setSelectedIndex(i);
                break;
            }
        }
        txtAuthor.setText(e.getAuthor().firstElement().getName());
        for (int i = 0; i < vtNxb.size(); i++) {
            if (vtNxb.get(i).getID() == e.getPublisher().getID()) {
                cbbNxb.setSelectedIndex(i);
                break;
            }
        }
        cbbYear.setSelectedIndex(thisYear - e.getPublishingYear());
        txtDescript.setText(e.getDescription());
        disableAll();
    }

    @SuppressWarnings({ "unused", "unchecked", "rawtypes" })
	private static Vector getCategoryCBB() {
        Vector vt = new Vector();
        for (int i = 0; i < vtCate.size(); i++) {
            vt.add(vtCate.get(i).getName());
        }
        return vt;
    }

    @SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private static Vector getPublisherCBB() {
        Vector vt = new Vector();
        for (int i = 0; i < vtNxb.size(); i++) {
            vt.add(vtNxb.get(i).getName());
        }
        return vt;
    }

    @SuppressWarnings({ "rawtypes", "unused", "unchecked" })
	private static Vector getYearCBB() {
        Vector vt = new Vector();
        for (int i = thisYear; i > 1800; i--) {
            vt.add(i);
        }
        return vt;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private static Vector getVectorDisplay(Vector<Book> list) {
        Vector table = new Vector();
        for (int i = 0; i < list.size(); i++) {
            Book e = list.get(i);
            Vector row = new Vector();
            row.add(i + 1);
            row.add(e.getCode());
            row.add(e.getISBN());
            row.add(e.getTitle());
            row.add(e.getCategory().firstElement().getName());
            row.add(e.getAuthor().firstElement().getName());
            row.add(e.getPublisher().getName());
            row.add(e.getPublishingYear());
            row.add(e.getDescription());
            table.add(row);
        }
        return table;
    }

    @SuppressWarnings({ "serial", "unchecked" })
	private static void refreshTable() {
        vtDTO = new BookBUS().getTable();
        table.setModel(new javax.swing.table.DefaultTableModel(getVectorDisplay(vtDTO), TableHeader.book()) {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        });
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private static void addBook() {
        if (Handle.confirm()) {
            int bug = 0;

            if (!main.java.com.library.BLL.Check.isISBN(txtIsbn.getText())) {
                txtIsbn.setBorder(Handle.colorError());
                bug++;
            }
            if (txtTitle.getText().isBlank()) {
                txtTitle.setBorder(Handle.colorError());
                bug++;
            }
            if (txtAuthor.getText().isBlank()) {
                txtAuthor.setBorder(Handle.colorError());
                bug++;
            }

            if (bug != 0) { // nếu có lỗi thoát ra
                return;
            }

            String ISBN = txtIsbn.getText();
            String title = txtTitle.getText();
            Vector<Category> category = new Vector();
            category.add(vtCate.get(cbbCate.getSelectedIndex()));
            Vector<Author> author = new Vector();
            author.add(new Author(txtAuthor.getText()));
            Publisher publisher = vtNxb.get(cbbNxb.getSelectedIndex());
            int publishingYear = thisYear - cbbYear.getSelectedIndex();
            String description = txtDescript.getText();
            String image = "";

            Book obj = new Book(ISBN, title, category, author, publisher, publishingYear, description, image);

            new BookBUS().add(obj);
            disableAll();
            resetPage();
        }
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	private static void updateBook() {
        if (Handle.confirm()) {
            int bug = 0;
            if (txtTitle.getText().isBlank()) {
                txtTitle.setBorder(Handle.colorError());
                bug++;
            }
            if (txtAuthor.getText().isBlank()) {
                txtAuthor.setBorder(Handle.colorError());
                bug++;
            }

            if (bug != 0) { // nếu có lỗi thoát ra
                return;
            }

            Book obj = vtDTO.get(table.getSelectedRow());
            // nhan de
            obj.setTitle(txtTitle.getText());
            // the loai
            Vector ct = obj.getCategory();
            ct.set(0, vtCate.get(cbbCate.getSelectedIndex()));
            obj.setCategory(ct);
            // tac gia
            Vector at = obj.getAuthor();
            at.set(0, new Author(txtAuthor.getText()));
            obj.setAuthor(at);
            // nxb
            obj.setPublisher(vtNxb.get(cbbNxb.getSelectedIndex()));
            // nam xb
            obj.setPublishingYear(thisYear - cbbYear.getSelectedIndex());
            // mo ta
            obj.setDescription(txtDescript.getText());

            new BookBUS().edit(obj.getID(), obj);
            disableAll();
            resetPage();
        }
    }

    private static void removeBook() {
        if (Handle.confirm()) {
            new BookBUS().delete(vtDTO.get(table.getSelectedRow()));
            disableAll();
            resetPage();
        }
    }

    private static void resetPage() {
        if (txtIsbn.isEnabled()) { // dang o che do them
            img.setIcon(Handle.setDefaultImg());
            txtIsbn.setText("");
            txtTitle.setText("");
            cbbCate.setSelectedIndex(0);
            txtAuthor.setText("");
            cbbNxb.setSelectedIndex(0);
            cbbYear.setSelectedIndex(0);
            txtDescript.setText("");

            txtIsbn.setBorder(Handle.colorEnabled());
            txtTitle.setBorder(Handle.colorEnabled());
            cbbCate.setBorder(Handle.colorEnabled());
            txtAuthor.setBorder(Handle.colorEnabled());
            cbbNxb.setBorder(Handle.colorEnabled());
            cbbYear.setBorder(Handle.colorEnabled());
            txtDescript.setBorder(Handle.colorEnabled());
            refreshTable();

        } else if (txtTitle.isEnabled()) { // che do sua
            displayDetail(vtDTO.get(table.getSelectedRow()));
            enableAll();
            txtIsbn.setEnabled(false);

            txtIsbn.setBorder(Handle.colorEnabled());
            txtTitle.setBorder(Handle.colorEnabled());
            cbbCate.setBorder(Handle.colorEnabled());
            txtAuthor.setBorder(Handle.colorEnabled());
            cbbNxb.setBorder(Handle.colorEnabled());
            cbbYear.setBorder(Handle.colorEnabled());
            txtDescript.setBorder(Handle.colorEnabled());

        } else { // che do xem
            img.setIcon(Handle.setDefaultImg());
            txtIsbn.setText("");
            txtTitle.setText("");
            cbbCate.setSelectedIndex(0);
            txtAuthor.setText("");
            cbbNxb.setSelectedIndex(0);
            cbbYear.setSelectedIndex(0);
            txtDescript.setText("");

            txtIsbn.setBorder(Handle.colorDisabled());
            txtTitle.setBorder(Handle.colorDisabled());
            cbbCate.setBorder(Handle.colorDisabled());
            txtAuthor.setBorder(Handle.colorDisabled());
            cbbNxb.setBorder(Handle.colorDisabled());
            cbbYear.setBorder(Handle.colorDisabled());
            txtDescript.setBorder(Handle.colorDisabled());
            refreshTable();
        }
    }

    private static javax.swing.JSplitPane splitPane;
    private static javax.swing.JPanel details;
    private static javax.swing.JPanel detailsInfo;
    private static javax.swing.JPanel imgPnl;
    private static javax.swing.JLabel img;
    private static javax.swing.JLabel lblIsbn;
    private static javax.swing.JTextField txtIsbn;
    private static javax.swing.JLabel lblTitle;
    private static javax.swing.JTextField txtTitle;
    private static javax.swing.JLabel lblCate;
    @SuppressWarnings("rawtypes")
    private static javax.swing.JComboBox cbbCate;
    private static javax.swing.JLabel lblAuthor;
    private static javax.swing.JTextField txtAuthor;
    private static javax.swing.JLabel lblNxb;
    @SuppressWarnings("rawtypes")
    private static javax.swing.JComboBox cbbNxb;
    private static javax.swing.JLabel lblYear;
    @SuppressWarnings("rawtypes")
    private static javax.swing.JComboBox cbbYear;
    private static javax.swing.JLabel lblDescript;
    private static javax.swing.JTextArea txtDescript;
    private static javax.swing.JPanel detailsHandle;
    private static javax.swing.JPanel tablePnl;
    private static javax.swing.JScrollPane scrollPane;
    private static javax.swing.JTable table;
    private static javax.swing.JPanel tableHandle;
    @SuppressWarnings("unchecked")
	private static Vector<Category> vtCate = new DocumentBUS().getCategory();
    @SuppressWarnings("unchecked")
	private static Vector<Publisher> vtNxb = new DocumentBUS().getPublisher();
    @SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private static Vector<Integer> vtYear = new Vector();
    private static Vector<Book> vtDTO = new BookBUS().getTable();
    private static final int thisYear = 2023;
}
