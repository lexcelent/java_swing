import javax.swing.*;

public class Display {
    public static void main(String[] args) {
        JFrame frame = new JFrame("POKA");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(720, 480);
        frame.setResizable(false);
        frame.add(new Main(frame));
        frame.setVisible(true);
    }
}
