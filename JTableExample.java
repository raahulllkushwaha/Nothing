import javax.swing.*;
import java.awt.*;

  public class JTableExample extends JFrame {
    public JTableExample() {
        // Set up the frame
        setTitle("JTable Example");
        setSize(500, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Data for the table
        String[][] data = {
            {"1", "Anuj", "20"},
            {"2", "Rahul", "20"},
            {"3", "Ajay", "22"}
        };

        // Column names
        String[] columnNames = {"ID", "Name", "Age"};

        // Create JTable
        JTable table = new JTable(data, columnNames);

        // Add table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JTableExample().setVisible(true);
        });
    }
}
