import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExample {
    CardLayout card;
    JPanel panel;

    CardLayoutExample() {
        JFrame frame = new JFrame("CardLayout Example");
        card = new CardLayout();
        panel = new JPanel(card);

        Button b1 = new Button("Card 1");
        Button b2 = new Button("Card 2");

        panel.add(b1, "1");
        panel.add(b2, "2");

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

        b1.addActionListener(e -> card.next(panel));
        b2.addActionListener(e -> card.next(panel));
    }

    public static void main(String[] args) {
        new CardLayoutExample();
    }
}