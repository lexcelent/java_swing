import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JPanel implements ActionListener {
    JFrame frame;

    public Main(JFrame frame) {
        this.frame = frame;
    }

    public void paint(Graphics g) {
        g.drawLine(20, 20, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
