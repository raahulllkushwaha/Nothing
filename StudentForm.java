package ABB;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class StudentForm extends JFrame {
    private JTextField idField, nameField, marksField;
    private JButton submitButton, updateButton, deleteButton;

    public StudentForm() {
        setTitle("Student Management System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        // Creating form fields
        add(new JLabel("Roll number:"));
        idField = new JTextField();
        add(idField);

        add(new JLabel("Name:"));
        nameField = new JTextField();
        add(nameField);

        add(new JLabel("Marks:"));
        marksField = new JTextField();
        add(marksField);

        submitButton = new JButton("Insert");
        updateButton = new JButton("Update");
        deleteButton = new JButton("Delete");

        add(submitButton);
        add(updateButton);
        add(deleteButton);

        // Action Listeners
        submitButton.addActionListener(e -> insertData());
        updateButton.addActionListener(e -> updateData());
        deleteButton.addActionListener(e -> deleteData());

        setVisible(true);
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "123");
    }

    private void insertData() {
        if (idField.getText().isEmpty() || nameField.getText().isEmpty() || marksField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        int rollno = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        int marks = Integer.parseInt(marksField.getText());

        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement("INSERT INTO student (rollno, name, marks) VALUES (?, ?, ?)")) {

            pst.setInt(1, rollno);
            pst.setString(2, name);
            pst.setInt(3, marks);

            int rowsInserted = pst.executeUpdate();
            JOptionPane.showMessageDialog(this, (rowsInserted > 0) ? "Record Inserted Successfully!" : "Insertion Failed");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void updateData() {
        if (idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Roll Number to update!");
            return;
        }

        int rollno = Integer.parseInt(idField.getText());
        String name = nameField.getText();
        String marksText = marksField.getText();

        String updateQuery = "UPDATE student SET ";
        if (!name.isEmpty()) updateQuery += "name = ?, ";
        if (!marksText.isEmpty()) updateQuery += "marks = ? ";
        updateQuery = updateQuery.replaceAll(", $", " "); // Remove last comma
        updateQuery += "WHERE rollno = ?";

        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement(updateQuery)) {

            int paramIndex = 1;
            if (!name.isEmpty()) pst.setString(paramIndex++, name);
            if (!marksText.isEmpty()) pst.setInt(paramIndex++, Integer.parseInt(marksText));
            pst.setInt(paramIndex, rollno);

            int rowsUpdated = pst.executeUpdate();
            JOptionPane.showMessageDialog(this, (rowsUpdated > 0) ? "Record Updated Successfully!" : "Update Failed");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    private void deleteData() {
        if (idField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter Roll Number to delete!");
            return;
        }

        int rollno = Integer.parseInt(idField.getText());

        int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        try (Connection con = getConnection();
             PreparedStatement pst = con.prepareStatement("DELETE FROM student WHERE rollno = ?")) {

            pst.setInt(1, rollno);
            int rowsDeleted = pst.executeUpdate();
            JOptionPane.showMessageDialog(this, (rowsDeleted > 0) ? "Record Deleted Successfully!" : "No record found!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            new StudentForm();
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Oracle JDBC Driver not found!");
        }
    }
}
