package main.java.com.library.GUI.handle;

public class Handle {
    public static void addImageBook(javax.swing.JPanel imgPnl, javax.swing.JLabel img) {
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
                    java.io.File f = imgChooser.getSelectedFile();
                    img.setIcon(new javax.swing.ImageIcon(f.getAbsolutePath()));
                }
            }
        });
    }

    public static void removeClickListener(javax.swing.JComponent jComponent) {
        java.awt.event.ComponentListener[] cls = jComponent.getComponentListeners();
        if (cls != null)
            for (java.awt.event.ComponentListener cl : cls)
                jComponent.removeComponentListener(cl);

        java.awt.event.MouseListener[] mls = jComponent.getMouseListeners();
        if (mls != null)
            for (java.awt.event.MouseListener ml : mls)
                jComponent.removeMouseListener(ml);
    }

    // Private
    private static javax.swing.JFileChooser imgChooser;
    private static javax.swing.filechooser.FileNameExtensionFilter imgFilter;
}