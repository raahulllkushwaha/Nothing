import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ItemListenerExample extends JFrame implements ItemListener {
    private JComboBox<String> comboBox;
    private JLabel label;

    public ItemListenerExample() {
        // Set up the frame
        setTitle("Item Listener Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a combo box with options
        String[] items = {"Apple", "Banana", "Cherry"};
        comboBox = new JComboBox<>(items);
        comboBox.addItemListener(this);

        // Label to display the selected item
        label = new JLabel("Select an item");

        // Add components to the frame
        add(comboBox);
        add(label);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
            label.setText("Selected: " + e.getItem());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ItemListenerExample().setVisible(true);
        });
    }
}
