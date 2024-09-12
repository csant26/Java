package ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculate_Sum implements ActionListener {
    JLabel l1, l2;
    JTextField t1, t2, t3;
    JButton b1; 
    Calculate_Sum()
    {
        Frame f = new Frame();  
        l1 = new JLabel("First Number:");
        l1.setBounds(20, 100, 100, 20);     //x, y, width, height      
        t1 = new JTextField();      
        t1.setBounds(120, 100, 100, 20);      
        l2 = new JLabel("Second Number:");      
        l2.setBounds(20, 140, 100, 20);
        t2 = new JTextField();      
        t2.setBounds(120, 140, 100, 20);      
        b1 = new JButton("Sum");      
        b1.setBounds(20, 170, 80, 20);      
        t3 = new JTextField();      
        t3.setBounds(120, 170, 100, 20);      
        b1.addActionListener(this);
        f.add(l1);      
        f.add(t1);      
        f.add(l2);      
        f.add(t2);      
        f.add(b1);      
        f.add(t3);       
        f.setSize(400,300);
        f.setLayout(null);      
        f.setVisible(true);     
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int num1 = Integer.parseInt(t1.getText());    
            int num2 = Integer.parseInt(t2.getText());    
            int sum = num1 + num2;    
            t3.setText(String.valueOf(sum));    
       }
    } 
    public static void main(String[] args) {
        new Calculate_Sum();
    }
}
