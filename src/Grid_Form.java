//Create a simple form using GridLayout in Java.

import javax.swing.*;
import java.awt.*;

public class Grid_Form {
    private JFrame f;
    private JLabel userLabel, passwordLabel;
    private JTextField userText;
    private JPasswordField passwordText;
    private JButton loginButton, resetButton;

    Grid_Form(){
        f = new JFrame();
        f.setTitle("Login Form");
        f.setLayout(new GridLayout(4,2,10,10));

        userLabel = new JLabel("Username");
        userLabel.setHorizontalAlignment(JLabel.CENTER); //Optional
        f.add(userLabel);

        userText = new JTextField();
        f.add(userText);

        passwordLabel = new JLabel("Password");
        passwordLabel.setHorizontalAlignment(JLabel.CENTER); //Optional
        f.add(passwordLabel);

        passwordText = new JPasswordField();
        f.add(passwordText);

        loginButton = new JButton("Login");
        f.add(loginButton);

        resetButton = new JButton("Reset");
        f.add(resetButton);

        f.setSize(300,300);
        f.setVisible(true);

    }
    public static void main(String[] args) throws Exception{
        new Grid_Form();
    }
}
