import java.awt.*;
import java.awt.event.*;

public class AdapterExample extends Frame {
    AdapterExample() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closing");
                dispose();
            }
        });

        setSize(300, 200);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdapterExample();
    }
}