import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class LandonWebbLogoApp {
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

                   
                    g2d.setColor(new Color(135, 206, 235)); 
                    g2d.fillRect(0, 0, getWidth(), getHeight()); 

                   
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(50, 50, 100, 100);

                   
                    g2d.setColor(Color.BLUE);
                    for (int i = 0; i < 360; i += 45) {
                        double radian = Math.toRadians(i);
                        int x1 = 100 + (int) (Math.cos(radian) * 50);
                        int y1 = 100 + (int) (Math.sin(radian) * 50);
                        int x2 = 100 + (int) (Math.cos(radian) * 80);
                        int y2 = 100 + (int) (Math.sin(radian) * 80);
                        g2d.drawLine(x1, y1, x2, y2);
                    }

                   
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(75, 75, 50, 50);
                    g2d.setColor(Color.BLUE);
                    g2d.drawArc(85, 95, 30, 15, 0, -180); 

                    
                    g2d.fillOval(85, 85, 8, 8);  
                    g2d.fillOval(107, 85, 8, 8); 

                    
                    g2d.setColor(Color.GRAY); 
                    g2d.fillRect(250, 200, 100, 100); 

                    g2d.setColor(Color.BLACK); 
                    g2d.drawRect(250, 200, 100, 100); 

                    
                    g2d.setColor(Color.RED);
                    g2d.fillRect(280, 250, 40, 50); 

                   
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(280, 250, 40, 50); 

                   
                    g2d.setColor(Color.DARK_GRAY);
                    int[] xPoints = { 240, 300, 360 }; 
                    int[] yPoints = { 200, 150, 200 };
                    g2d.fillPolygon(xPoints, yPoints, 3);

                   
                    g2d.setColor(new Color(34, 139, 34)); 
                    g2d.fillRect(0, 300, getWidth(), 100); 
                }
            };

            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}
