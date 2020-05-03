package com.rk.fdm;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {
    public FormUtama() {
        super("Memposisikan Form Ke Tengah");
        Inisialisasi_Komponen();
        AturFormKeTengah();
    }

    public void Inisialisasi_Komponen() {
        setPreferredSize(new Dimension(800, 600));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void AturFormKeTengah() {
        Dimension ukuranLayar = Toolkit.getDefaultToolkit().getScreenSize();
        int W, H, X, Y;
        W = getSize().width;
        H = getSize().height;
        X = (ukuranLayar.width - W) / 2;
        Y = (ukuranLayar.height - H) / 2;
        setLocation(X, Y);
    }

}
