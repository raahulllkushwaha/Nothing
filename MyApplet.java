import java.applet.Applet;
import java.awt.*;

// Extend Applet class
public class MyApplet extends Applet {
    
    // init() method - called when applet is initialized
    public void init() {
        setBackground(Color.cyan);
    }
    
    // paint() method - called whenever applet needs to be redrawn
    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Hello, This is a Java Applet!", 50, 50);
    }
}
