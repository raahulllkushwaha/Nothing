import java.awt.*;
import java.awt.event.*;

public class AWTMenuExample extends Frame {
    AWTMenuExample() {
        MenuBar menuBar = new MenuBar();
        Menu file = new Menu("File");
        MenuItem open = new MenuItem("Open");
        MenuItem exit = new MenuItem("Exit");

        file.add(open);
        file.add(exit);
        menuBar.add(file);

        setMenuBar(menuBar);

        exit.addActionListener(e -> System.exit(0));

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AWTMenuExample();
    }
}