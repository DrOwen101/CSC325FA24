import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.SwingUtilities;
import java.awt.*;



public class App extends Canvas{

    public void paint(Graphics g) {
        g.drawOval(50, 50, 75, 75);
        g.drawLine(61, 61, 35, 35);
    }

    public static void main(String[] args) {
        App m = new App();
        JFrame f = new JFrame();
        f.add(m);
        f.setSize(400, 400);
        f.setVisible(true);
    }
}
