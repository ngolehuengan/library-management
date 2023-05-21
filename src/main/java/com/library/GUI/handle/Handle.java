package main.java.com.library.GUI.handle;

import main.java.com.library.GUI.forms.ManageService.FindReader;

public class Handle {

    // -----------------------------------Dialog set get image----------------------------------------
    public static void addImage(javax.swing.JPanel imgPnl, javax.swing.JLabel img) {
        removeClickListener(imgPnl);
        imgPnl.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent e) {
                // Change image book using dialog
                imgChooser = new javax.swing.JFileChooser();
                imgFilter = new javax.swing.filechooser.FileNameExtensionFilter("image", "jpg", "png");
                imgChooser.setFileFilter(imgFilter);
                imgChooser.setMultiSelectionEnabled(false);

                if (imgChooser.showDialog(imgChooser, "Choose Image") == javax.swing.JFileChooser.APPROVE_OPTION) {
                    // lấy file
                    java.io.File f = imgChooser.getSelectedFile();
                    // hiển thị hình lên frame
                    img.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(f.getAbsolutePath()).getImage()
                            .getScaledInstance(125, 100, java.awt.Image.SCALE_DEFAULT)));
                }
            }
        });
    }

    public static void removeClickListener(javax.swing.JComponent jComponent) {
        java.awt.event.ComponentListener[] cls = jComponent.getComponentListeners();
        if (cls != null) {
            for (java.awt.event.ComponentListener cl : cls) {
                jComponent.removeComponentListener(cl);
            }
        }

        java.awt.event.MouseListener[] mls = jComponent.getMouseListeners();
        if (mls != null) {
            for (java.awt.event.MouseListener ml : mls) {
                jComponent.removeMouseListener(ml);
            }
        }
    }

    public static javax.swing.ImageIcon setDefaultImg() {
        return new javax.swing.ImageIcon(
                Handle.class.getResource("../../../../resources/images/image-gallery.png"));
    }

    // -----------------------------------Dialog confirm----------------------------------------
    public static boolean confirm() {
        int result = javax.swing.JOptionPane.showConfirmDialog(null,
                "Thao tác này không thể hoàn tác, chắc chắn chọn?", "XÁC NHẬN", javax.swing.JOptionPane.YES_NO_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE);
        if (result == javax.swing.JOptionPane.YES_OPTION) {
            return true;
        } else {
            return false;
        }
    }

    // -----------------------------------Set Button----------------------------------------
    public static void setColor(javax.swing.JComponent btn) {
        btn.setForeground(new java.awt.Color(255, 255, 255));
        btn.setBackground(new java.awt.Color(0, 153, 51));
    }

    public static javax.swing.JButton getAdd(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("Thêm");
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getEdit(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("Chỉnh sửa");
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getDelete(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("Xóa");
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getSearch(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("Tìm kiếm");
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getUpload(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("  Đăng tải");
        btn.setIcon(
                new javax.swing.ImageIcon(Handle.class.getResource("../../../../resources/icons/upload.png")));
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getDownload(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("  Tải xuống");
        btn.setIcon(new javax.swing.ImageIcon(
                Handle.class.getResource("../../../../resources/icons/downloads.png")));
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getPrint(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("  In");
        btn.setIcon(
                new javax.swing.ImageIcon(Handle.class.getResource("../../../../resources/icons/printing.png")));
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getView(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("Xem");
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getSave(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("Lưu");
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getReset(javax.swing.JButton btn) {
        btn = new javax.swing.JButton("Làm lại");
        setColor(btn);
        return btn;
    }

    public static javax.swing.JButton getFind(javax.swing.JButton btn) {
        btn = new javax.swing.JButton(new javax.swing.ImageIcon(Handle.class.getResource("../../../../resources/icons/find.png")));
        setColor(btn);
        btn.addActionListener(e -> {
            new FindReader().setVisible(true);
        });
        return btn;
    }

    // -----------------------------------Set Color----------------------------------------
    public static javax.swing.border.Border colorError() {
        return javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED);
    }

    public static javax.swing.border.Border colorEnabled() {
        return javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY);

    }

    public static javax.swing.border.Border colorDisabled() {
        return javax.swing.BorderFactory.createLineBorder(java.awt.SystemColor.inactiveCaption);
    }

    // -----------------------------------Private----------------------------------------
    private static javax.swing.JFileChooser imgChooser;
    private static javax.swing.filechooser.FileNameExtensionFilter imgFilter;
}
