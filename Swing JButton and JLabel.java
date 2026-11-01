import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonLabelExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("Button and Label");

        JLabel l = new JLabel("Welcome");
        JButton b = new JButton("Click Me");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l.setText("Button Pressed");
            }
        });

        f.setLayout(new FlowLayout());

        f.add(l);
        f.add(b);

        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}