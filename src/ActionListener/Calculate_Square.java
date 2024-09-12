package ActionListener;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculate_Square implements ActionListener {
    JLabel l1,l2;
    JTextField t1, t2;
    JButton b1; 
    Calculate_Square()
    {
        Frame f = new Frame();  
        l1 = new JLabel("Enter Number:");
        l1.setBounds(20, 100, 150, 20);     //x, y, width, height      
        t1 = new JTextField();      
        t1.setBounds(200, 100, 100, 20);     
        l2 = new JLabel("Square of Entered Number:");
        l2.setBounds(20, 160, 200, 20); 
        t2 = new JTextField();      
        t2.setBounds(200, 160, 100, 20);      
        b1 = new JButton("Calculate Square");      
        b1.setBounds(80, 130, 131, 20);         
        b1.addActionListener(this);
        f.add(l1);
        f.add(l2);      
        f.add(t1);      
        f.add(t2);      
        f.add(b1);        
        f.setSize(400,300);
        f.setLayout(null);      
        f.setVisible(true);     
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1){
            int num1 = Integer.parseInt(t1.getText());    
            int square = num1 * num1;    
            t2.setText(String.valueOf(square));    
       }
    } 
    public static void main(String[] args) {
        new Calculate_Square();
    }
}
