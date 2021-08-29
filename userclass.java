package gui_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userclass implements ActionListener {
    private static JLabel one;
    private static JButton b1;
    private static JButton b2;
    private static JButton b3;
    private static JButton b4;
    private static JButton b5;
    private static JLabel two;
    private static JLabel thr;


    public static void OtherMethod() {



        Font f1  = new Font(Font.SERIF, Font.PLAIN, 15);
        Font  f2  = new Font(Font.SERIF,  Font.PLAIN, 10);
        Font  f3  = new Font(Font.DIALOG,  Font.PLAIN, 15);

        JFrame guilog = new JFrame("Shubham");
        guilog.setSize(458, 450);
        guilog.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        guilog.setResizable(false);

        JPanel panel = new JPanel();
        panel.setBackground(Color.white);
        guilog.add(panel);


        guilog.setVisible(true);
        panel.setLayout(null);

        one = new JLabel("SUIDS GUI VERSION 1.0");
        one.setFont(f3);
        one.setBounds(148, 10, 210, 27);
        panel.add(one);

        two = new JLabel("Welcome, Shubham");
        two.setFont(f3);
        two.setBounds(165, 29, 210, 27);
        panel.add(two);


        b1 = new JButton("Help..");
        b1.setFont(f3);
        b1.setBounds(10, 60, 210, 25);
        b1.addActionListener(new userclass());
        panel.add(b1);

        b2 = new JButton("About this Software..");
        b2.setFont(f3);
        b2.setBounds(230, 60, 210, 25);
        b2.addActionListener(new userclass());
        panel.add(b2);

        b3 = new JButton("Calculator");
        b3.setFont(f3);
        b3.setBounds(10, 90, 210, 25);
        b3.addActionListener(new userclass());
        panel.add(b3);


        b4 = new JButton("Credits");
        b4.setFont(f3);
        b4.setBounds(230, 90, 210, 25);
        b4.addActionListener(new userclass());
        panel.add(b4);

        thr = new JLabel("Copyright (C) Shubham Technologies, All Rights Reserved.");
        thr.setFont(f3);
        thr.setBounds(11, 390, 410, 27);
        panel.add(thr);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton source = (JButton) e.getSource();
        if(source.equals(b1)){
            help helpObject =  new  help();
            helpObject.main();
            System.out.println("clicked b1");
        }
        else if (source.equals(b2)){
            about aboutObject =  new about();
            aboutObject.main();
            System.out.println("clicked b2");
        }

        else if (source.equals(b3)){
            // Here is the problem...:
            calc calcObject =  new calc();
            calcObject.main();
            System.out.println("clicked b2");
            // calling calc{} above.
        }



        else if (source.equals(b4)){
            cred credObject =  new cred();
            credObject.main();
            System.out.println("clicked b5");
        }

        else{}

    }
}
