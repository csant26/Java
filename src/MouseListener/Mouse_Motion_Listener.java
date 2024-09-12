package MouseListener;
import java.awt.*;
import java.awt.event.*;

public class Mouse_Motion_Listener implements MouseMotionListener {
    Frame f;
    Mouse_Motion_Listener(){
        f = new Frame();
        f.addMouseMotionListener(this);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics g = f.getGraphics();
        g.setColor(Color.BLUE);
        g.fillOval(e.getX(),e.getY(),20,20);

    }
    @Override
    public void mouseMoved(MouseEvent e) {}
    public static void main(String[] args) throws Exception{
        new Mouse_Motion_Listener();
    }
}
