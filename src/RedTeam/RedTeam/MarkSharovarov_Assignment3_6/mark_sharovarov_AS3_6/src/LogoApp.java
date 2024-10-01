import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LogoApp {
    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);
            
            JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            
            Graphics2D g2d = (Graphics2D) g;
            
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
            g2d.setColor(Color.BLUE);
            g2d.fillOval(110, 75, 5, 7);
            g2d.fillOval(90, 75, 5, 7);

            // Draw a square House to the bottom right of the sun
            g2d.setColor(new Color(180, 180, 180));
            g2d.fillRect(250, 261, 100, 100);
            g2d.setColor(new Color(99, 206, 134));
            g2d.fillPolygon(new int[] {250, 350, 300}, new int[] {261, 261, 220}, 3);


            // Draw red door
            g2d.setColor(Color.RED);
            g2d.fillRect(270, 316, 27, 45);
            // Draw door outline
            g2d.setColor(Color.BLACK);
            g2d.drawRect(270, 316, 27, 45);
            g2d.drawRect(275, 345, 1, 1);
            }
            };
            
            frame.add(canvas);
            frame.setVisible(true);
            });
             
    }
}
