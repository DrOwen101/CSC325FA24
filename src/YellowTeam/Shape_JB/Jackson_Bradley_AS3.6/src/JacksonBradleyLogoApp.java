import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JacksonBradleyLogoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sunny Day");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);

            JPanel canvas = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g;

                    //sun
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(50, 50, 200, 200);

                    // sun rays
                    g2d.setColor(Color.BLUE);
                    int centerX = 150; // center of the sun (x)
                    int centerY = 150; // center of the sun (y)
                    int radius = 100; // radius of the sun
                    int rayLength = 50; // length of sun ray
                    for (int angle = 0; angle < 360; angle += 30) {
                        double radian = Math.toRadians(angle);
                        int x1 = centerX + (int) (Math.cos(radian) * radius);
                        int y1 = centerY + (int) (Math.sin(radian) * radius);
                        int x2 = centerX + (int) (Math.cos(radian) * (radius + rayLength));
                        int y2 = centerY + (int) (Math.sin(radian) * (radius + rayLength));
                        g2d.drawLine(x1, y1, x2, y2);                    }

                    
                    g2d.setColor(Color.BLACK);
                    g2d.fillOval(90, 110, 20, 20); // Left eye
                    g2d.fillOval(170, 110, 20, 20); // Right eye

                    // smile
                    g2d.drawArc(90, 140, 100, 50, 0, -180);

                    // house
                    g2d.setColor(Color.ORANGE);
                    g2d.fillRect(350, 300, 200, 200); 

                    // door
                    g2d.setColor(Color.RED);
                    g2d.fillRect(420, 400, 60, 100); 

                    // door outline
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(420, 400, 60, 100);

                    // windows
                    g2d.setColor(Color.WHITE);
                    g2d.fillRect(380, 330, 50, 50); 
                    g2d.fillRect(470, 330, 50, 50); 

                
                }
            };

            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}
