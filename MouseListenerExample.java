import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseListenerExample extends JFrame implements MouseListener {
    JLabel label;

    MouseListenerExample() {
        label = new JLabel("Click anywhere!");
        add(label);
        addMouseListener(this);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        label.setText("Mouse Clicked at X: " + e.getX() + " Y: " + e.getY());
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseListenerExample();
    }
}