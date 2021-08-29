package gui_java;

import javax.swing.*;
import java.awt.*;

public class about {
    public void main() {
        JFrame about = new JFrame("About this Software...");
        about.setSize(800, 150);
        about.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        about.setResizable(false);


        JPanel panel = new JPanel();
        about.add(panel);
        panel.setBackground(Color.white);
        about.setVisible(true);
        panel.setLayout(null);

        placeComponents(panel);



    }

    private void placeComponents(JPanel panel) {

        Font f1  = new Font(Font.DIALOG, Font.PLAIN,  30);
        Font  f2  = new Font(Font.MONOSPACED,  Font.PLAIN, 15);
        Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);


        panel.setLayout(null);
        JLabel page = new JLabel("About this Software..");
        page.setFont(f1);
        page.setBounds(215,12,385,28);
        panel.add(page);


        JLabel infol1 = new JLabel("SUIDS GUI STABLE VERSION 1.0");
        infol1.setFont(f2);
        infol1.setBounds(15,50,385,28);
        panel.add(infol1);

        JLabel infol2 = new JLabel("Created by: Shubham Prasad under the name Shubham Technologies.");
        infol2.setFont(f2);
        infol2.setBounds(15,70,600,28);
        panel.add(infol2);

        JLabel infol3 = new JLabel("Copyright (C) Shubham Prasad, all Rights Reserved.");
        infol3.setFont(f2);
        infol3.setBounds(15,89,600,28);
        panel.add(infol3);

    }
}
