import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ActionListenerExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("ActionListener Example");

        JButton b = new JButton("Click Me");

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "Hello User");
            }
        });

        f.setLayout(new FlowLayout());
        f.add(b);

        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}