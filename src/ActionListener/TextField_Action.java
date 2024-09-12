package ActionListener;
import java.awt.*;
import java.awt.event.*;
public class TextField_Action implements ActionListener {
    TextField tf;
    Button b;
    TextField_Action(){
        Frame f = new Frame();
        tf = new TextField();
        tf.setBounds(50,50,150,20);
        b = new Button("Click here");
        b.setBounds(50,100,60,30);
        b.addActionListener(this);
        f.add(b);f.add(tf);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        tf.setText("Hello World");
    }
    public static void main(String[] args) throws Exception{
        new TextField_Action();
    }
}
