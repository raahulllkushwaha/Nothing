import java.awt.*;
import java.awt.event.*;

public class FocusListenerExample extends Frame implements FocusListener {
    TextField textField;

    FocusListenerExample() {
        textField = new TextField(20);
        textField.addFocusListener(this);
        add(textField);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void focusGained(FocusEvent e) {
        textField.setBackground(Color.YELLOW);
    }

    public void focusLost(FocusEvent e) {
        textField.setBackground(Color.WHITE);
    }

    public static void main(String[] args) {
        new FocusListenerExample();
    }
}