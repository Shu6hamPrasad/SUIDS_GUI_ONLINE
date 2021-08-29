package gui_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class index implements ActionListener {
    private static JLabel userLabel;
    private static JPasswordField passwordText;
    private static JLabel passwordLabel;
    private static JButton loginButton;
    private static JTextField userText;
    private static JLabel sucess;
    public static void main(String[] args){
        JFrame guilog = new JFrame("Login");
        guilog.setSize(375, 165);
        guilog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        guilog.setResizable(false);


        JPanel panel = new JPanel();
        guilog.add(panel);
        placeComponents(panel);
        panel.setBackground(Color.white);

        guilog.setVisible(true);

    }

    public static void placeComponents(JPanel panel) {

        Font  f3  = new Font(Font.DIALOG,  Font.PLAIN, 15);

        panel.setLayout(null);
        userLabel = new JLabel("Username");
        userLabel.setBounds(10, 10, 80, 25);
        userLabel.setFont(f3);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);
        userText.setFont(f3);
        panel.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 95, 25);
        passwordLabel.setFont(f3);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);
        passwordText.setFont(f3);
        panel.add(passwordText);

        loginButton = new JButton("Login");
        loginButton.setBounds(10, 100, 95, 25);
        loginButton.setFont(f3);
        loginButton.addActionListener(new logingui());
        panel.add(loginButton);

        sucess = new JLabel ("");
        sucess.setBounds(10 , 70 , 350 , 25);
        panel.add(sucess);
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String usr = userText.getText();
        String pwd =passwordText.getText();
        System.out.println("clicked");

        if (usr.equalsIgnoreCase("Shubham") && pwd.equals("shubham")){
            Font  f3  = new Font(Font.DIALOG, Font.PLAIN,  10);
            sucess.setFont(f3);
            sucess.setText("Welcome, "+usr+" loading your profile....");
            userclass.OtherMethod();
        }
        else{
            Font  f3  = new Font(Font.DIALOG, Font.PLAIN,  10);
            sucess.setFont(f3);
            sucess.setText("Sorry! your Username or Password is incorrect. Please try again.");
        }

    }
}
