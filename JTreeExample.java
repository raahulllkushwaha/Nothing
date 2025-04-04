import javax.swing.*;
import javax.swing.tree.*;
import java.awt.*;

public class JTreeExample extends JFrame {
    public JTreeExample() {
        // Set up the frame
        setTitle("JTree Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create root node
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");
        
        // Create child nodes
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
        DefaultMutableTreeNode subChild1 = new DefaultMutableTreeNode("Sub Child 1");
        DefaultMutableTreeNode subChild2 = new DefaultMutableTreeNode("Sub Child 2");
        
        // Build the tree structure
        root.add(child1);
        root.add(child2);
        child1.add(subChild1);
        child2.add(subChild2);
        
        // Create JTree
        JTree tree = new JTree(root);
        
        // Add tree to a scroll pane
        JScrollPane scrollPane = new JScrollPane(tree);
        add(scrollPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new JTreeExample().setVisible(true);
        });
    }
}
