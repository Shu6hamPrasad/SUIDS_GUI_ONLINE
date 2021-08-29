package gui_java;

import javax.swing.*;
import java.awt.*;

public class cred {
    public void main() {
        JFrame cred = new JFrame("Credits");
        cred.setSize(1200, 150);
        cred.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        cred.setResizable(false);


        JPanel panel = new JPanel();
        cred.add(panel);
        panel.setBackground(Color.white);

        cred.setVisible(true);
        panel.setLayout(null);

        placeComponents(panel);


    }

    private void placeComponents(JPanel panel) {

        Font f1  = new Font(Font.DIALOG, Font.PLAIN,  30);
        Font  f2  = new Font(Font.MONOSPACED,  Font.PLAIN, 15);
        Font  f3  = new Font(Font.DIALOG,  Font.BOLD, 15);

        panel.setLayout(null);
        JLabel page = new JLabel("Credits");
        page.setFont(f1);
        page.setBounds(537,12,300,28);
        panel.add(page);

        JLabel cred1 = new JLabel("Login Page: Alex Loren Lee (https://youtu.be/iE8tZ0hn2Ws)");
        cred1.setFont(f2);
        cred1.setBounds(11,52,1000,28);
        panel.add(cred1);

        JLabel cred2 = new JLabel("Calculator: Stack Overflow (https://stackoverflow.com/questions/4298716/simple-gui-java-calculator) and Akash Kumar.");
        cred2.setFont(f2);
        cred2.setBounds(11,74,1100,28);
        panel.add(cred2);
    }
}
