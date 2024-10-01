import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class CadenOutlandLogoApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel canvas = new JPanel() {
                @Override
                //method for drawing graphics
                protected void paintComponent(Graphics g) {
                    //calls parent constructor
                    super.paintComponent(g);
                    //new object of Graphics2D class
                    Graphics2D g2d = (Graphics2D) g;

                    //Draw sun. Color yellow. Set parameters of fillOval()
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(50, 50, 100, 100);
                    //Draw sun rays. Color blue. Draws sun ray every 45 degrees
                    g2d.setColor(Color.BLUE);
                    for (int i = 0; i < 360; i += 45) {
                        double radian = Math.toRadians(i);
                        int x1 = 100 + (int) (Math.cos(radian) * 50);
                        int y1 = 100 + (int) (Math.sin(radian) * 50);
                        int x2 = 100 + (int) (Math.cos(radian) * 80);
                        int y2 = 100 + (int) (Math.sin(radian) * 80);
                        g2d.drawLine(x1, y1, x2, y2);
                    }

                    //Draw smiley face. Color yellow. Set parameters of fillOval(). Color blue. Set parameters of drawArc()
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(75, 75, 50, 50);
                    g2d.setColor(Color.BLUE);
                    g2d.drawArc(80, 90, 40, 20, -180, 180);

                    //Draw Eyes on the Sun. Set parameters of fillOval()
                    g2d.fillOval(90,80,15,15);
                    g2d.fillOval(105,80,15,15);
                    //Draw a square House to the bottom right of the sun. Color Magenta. Set parameters of fillRect()
                    g2d.setColor(Color.MAGENTA);
                    g2d.fillRect(200,200,300,300);
                    //Draw red door. Color Red. Set parameters of fillRect()
                    g2d.setColor(Color.red);
                    g2d.fillRect(325,400,50,100);
                    //Draw door outline. Color Black. Set parameters of drawRect()
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(325,400,50,100);
                }
            };
            //add canvas to frame. display frame
            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}