import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;


public class AndiaKaranjaLogoApp {

    //boiler code given in assignment details  
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

                // Draw Eyes on the Sun]
                //draws the two eyes of the same size. width and height
                //are selected to give the sun a slightly more cartoonish 
                //feel, and distances are decided based on the width of the sun 
                g2d.setColor(Color.BLUE);
                g2d.fillOval(75, 75, 10, 15);

                g2d.setColor(Color.BLUE);
                g2d.fillOval(115, 75, 10, 15);
                
                //adding highlights for fun 
                g2d.setColor(Color.WHITE);
                g2d.fillOval(120, 78, 5, 3); //right eye highlight
                g2d.fillOval(80, 78, 5, 3);

                // Draw a square House to the bottom right of the sun
                g2d.setColor(Color.BLUE);//resetting colour after highlights
                g2d.drawLine(275, 300, 275, 230); //left wall
                g2d.drawLine(275, 300, 350, 300); //floor
                g2d.drawLine(350, 300, 350, 230); //right wall
                g2d.drawLine(275, 230, 350, 230); //ceiling 
 


                // Draw red door
                g2d.setColor(Color.RED);
                g2d.fillRect(300, 250, 25, 50);

                // Draw door outline
                g2d.setColor(Color.GREEN); // wanted to use brown 
                //for correctness with emphasis but brown isn't 
                //native to the method and hex codes didn't immediately work 

                g2d.drawLine(300, 250, 325, 250);  //top of door frame
                g2d.drawLine(300, 250, 300, 300);  //left part of frame
                g2d.drawLine(325, 250, 325, 300);  



            }
        };

        frame.add(canvas);
        frame.setVisible(true);
        });
    }
}