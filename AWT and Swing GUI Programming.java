import java.awt.*;
import java.awt.event.*;

public class AWTFrameExample {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");

        Label l = new Label("Welcome to Java GUI");

        f.add(l);
        f.setSize(400, 300);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}