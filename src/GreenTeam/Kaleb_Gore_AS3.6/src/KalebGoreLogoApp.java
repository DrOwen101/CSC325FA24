import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class KalebGoreLogoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Kaleb Gore AS3.6 2D Graphics");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 800);

            JPanel canvas = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g;

                    // Draw lines behind sun
                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(100, 100, 200, 200);

                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(200, 50, 200, 200);

                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(300, 100, 200, 200);

                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(350, 200, 200, 200);

                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(50, 200, 200, 200);

                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(100, 300, 200, 200);

                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(200, 350, 200, 200);

                    g2d.setColor(Color.BLACK);
                    g2d.drawLine(300, 300, 200, 200);

                    // Draw sun
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(100, 100, 200, 200);

                    // Draw eyes of sun
                    g2d.setColor(Color.BLACK);
                    g2d.fillOval(150, 150, 25, 25);

                    g2d.setColor(Color.BLACK);
                    g2d.fillOval(225, 150, 25, 25);

                    // Draw mouth of sun
                    g2d.setColor(Color.BLACK);
                    g2d.fillOval(150, 225, 100, 25);

                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(150, 223, 100, 25);


                    // Draw house
                    g2d.setColor(Color.ORANGE);
                    g2d.fillRect(550, 350, 200, 200);

                    // Draw door of house
                    g2d.setColor(Color.RED);
                    g2d.fillRect(600, 450, 100, 100);

                    // Draw outline of red door
                    g2d.setColor(Color.BLACK);  
                    g2d.drawRect(600, 450, 100, 100);
                }
            };
            
            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}
