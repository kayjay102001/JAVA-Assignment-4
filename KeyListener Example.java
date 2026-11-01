import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KeyListenerExample {
    public static void main(String[] args) {
        JFrame f = new JFrame("KeyListener Example");

        JLabel l = new JLabel("Press any key");

        f.add(l);
        f.setSize(400, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                char key = e.getKeyChar();

                l.setText("Key Pressed: " +
                        Character.toUpperCase(key));
            }
        });

        f.setFocusable(true);
        f.setVisible(true);
        f.requestFocusInWindow();
    }
}