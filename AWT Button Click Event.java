import java.awt.*;
import java.awt.event.*;

public class AWTButtonExample {
    public static void main(String[] args) {
        Frame f = new Frame("Button Example");

        Button b = new Button("Click Me");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Button Clicked");
            }
        });

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(new FlowLayout());
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}