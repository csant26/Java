import javax.swing.*;
public class JFrameButton {
    public static void main(String[] args) throws Exception{
        JFrame f = new JFrame();
        JButton b = new JButton("Click"); //create button
        b.setBounds(130,100,100,40);
        f.add(b);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
