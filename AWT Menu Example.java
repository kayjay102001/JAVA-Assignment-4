import java.awt.*;
import java.awt.event.*;

public class AWTMenuExample {
    public static void main(String[] args) {
        Frame f = new Frame("Menu Example");

        MenuBar mb = new MenuBar();

        Menu file = new Menu("File");
        Menu edit = new Menu("Edit");

        file.add(new MenuItem("New"));
        file.add(new MenuItem("Open"));
        file.add(new MenuItem("Save"));

        edit.add(new MenuItem("Cut"));
        edit.add(new MenuItem("Copy"));
        edit.add(new MenuItem("Paste"));

        mb.add(file);
        mb.add(edit);

        f.setMenuBar(mb);

        f.setSize(400, 300);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }
}