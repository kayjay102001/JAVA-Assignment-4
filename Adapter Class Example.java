import java.awt.*;
import java.awt.event.*;

public class WindowAdapterExample {
    public static void main(String[] args) {
        Frame f = new Frame("Window Adapter Example");

        f.setSize(400, 300);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Application terminates");
                System.exit(0);
            }
        });
    }
}