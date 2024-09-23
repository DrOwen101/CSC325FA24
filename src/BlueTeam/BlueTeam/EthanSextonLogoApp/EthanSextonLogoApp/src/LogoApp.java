import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class LogoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel canvas = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    Graphics2D g2d = (Graphics2D) g;

                    // Draw sky
                    g2d.setColor(Color.CYAN);
                    g2d.fillRect(0, 0, 400, 250);

                    // Draw sun
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(50, 50, 100, 100);
                    // Draw sun rays
                    g2d.setColor(Color.BLUE);
                    for (int i = 0; i < 360; i += 45) {
                        double radian = Math.toRadians(i);
                        int x1 = 100 + (int) (Math.cos(radian) * 50);
                        int y1 = 100 + (int) (Math.sin(radian) * 50);
                        int x2 = 100 + (int) (Math.cos(radian) * 80);
                        int y2 = 100 + (int) (Math.sin(radian) * 80);
                        g2d.drawLine(x1, y1, x2, y2);
                    }

                    // Draw smiley face
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(75, 75, 50, 50);
                    g2d.setColor(Color.BLUE);
                    g2d.drawArc(80, 90, 40, 20, -180, 180);

                    // Draw Eyes on the Sun
                    g2d.fillOval(80, 65, 10, 25);
                    g2d.fillOval(110, 65, 10, 25);
                    // Draw a square House to the bottom right of the sun
                    g2d.setColor(Color.ORANGE);
                    g2d.fillRect(200, 200, 50, 50);
                    // Draw red door

                    g2d.setColor(Color.red);
                    g2d.fillRect(220, 230, 10, 20);
                    // Draw door outline
                    g2d.setColor(Color.blue);
                    g2d.drawRect(220, 230, 11, 20);

                    // Draw roof
                    g2d.setColor(Color.red);
                    int[] trianglePointsX = new int[3];
                    trianglePointsX[0] = 200;
                    trianglePointsX[1] = 225;
                    trianglePointsX[2] = 250;
                    int[] trianglePointsY = new int[3];
                    trianglePointsY[0] = 200;
                    trianglePointsY[1] = 175;
                    trianglePointsY[2] = 200;
                    g2d.fillPolygon(trianglePointsX, trianglePointsY, 3);

                    // Draw Windows
                    g2d.setColor(Color.CYAN);
                    g2d.fillRect(210, 210, 10, 10);
                    g2d.fillRect(230, 210, 10, 10);

                    // Draw Panes
                    g2d.setColor(Color.BLUE);
                    g2d.fillRect(214, 210, 1, 10);
                    g2d.fillRect(234, 210, 1, 10);
                    g2d.fillRect(210, 214, 10, 1);
                    g2d.fillRect(230, 214, 10, 1);

                    // Draw grass
                    g2d.setColor(Color.GREEN);
                    g2d.fillRect(0, 250, 400, 150);

                }
            };

            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}
