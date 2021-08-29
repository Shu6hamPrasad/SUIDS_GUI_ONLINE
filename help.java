package gui_java;

import javax.swing.*;
import java.awt.*;

public class help {

    public void main() {
        JFrame help = new JFrame("Help");
        help.setSize(800, 600);
        help.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        help.setResizable(false);

        JPanel panel = new JPanel();
        help.add(panel);
        panel.setBackground(Color.white);

        help.setVisible(true);
        panel.setLayout(null);
        placeContents(panel);



    }

    private void placeContents(JPanel panel) {

        Font f1  = new Font(Font.DIALOG, Font.BOLD,  30);
        Font  f2  = new Font(Font.SERIF,  Font.PLAIN, 15);
        Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);

        panel.setLayout(null);
        JLabel page = new JLabel("Help");
        page.setFont(f1);
        page.setBounds(360,12,350,28);
        panel.add(page);
    }

}
