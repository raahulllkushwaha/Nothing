import javax.swing.*;
import java.awt.*;

public class JTabbedPaneExample extends JFrame {
    public JTabbedPaneExample() {
        // Set up the frame
        setTitle("JTabbedPane Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a tabbed pane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create panels for tabs
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel("This is Tab 1"));
        
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("This is Tab 2"));
        
        JPanel panel3 = new JPanel();
        panel3.add(new JLabel("This is Tab 3"));

        // Add tabs to tabbed pane
        tabbedPane.addTab("Tab 1", panel1);
        tabbedPane.addTab("Tab 2", panel2);
        tabbedPane.addTab("Tab 3", panel3);

        // Add tabbed pane to frame
        add(tabbedPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JTabbedPaneExample().setVisible(true);
        });
    }
}
