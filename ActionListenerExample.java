import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample extends Frame implements ActionListener {
    Button button;

    ActionListenerExample() {
        button = new Button("Click Me");
        button.addActionListener(this);
        add(button);

        setSize(300, 200);
        setLayout(new FlowLayout());
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked!");
    }

    public static void main(String[] args) {
        new ActionListenerExample();
    }
}