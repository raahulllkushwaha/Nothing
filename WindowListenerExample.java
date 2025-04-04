import java.awt.*;
import java.awt.event.*;

public class WindowListenerExample extends Frame implements WindowListener {
    WindowListenerExample() {
        addWindowListener(this);
        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose();
    }

    public void windowOpened(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}

    public static void main(String[] args) {
        new WindowListenerExample();
    }
}