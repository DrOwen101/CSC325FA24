import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.*;

public class EmiliaKubikLogoApp{
    public static void main(String[] args){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Logo Demo");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 400);

            JPanel canvas = new JPanel(){
                @Override
                //creating a method to draw the graphics
                protected void paintComponent(Graphics g){
                    //calls parent constructor
                    super.paintComponent(g);

                    //creates a new object called g2d of the Graphics2D class which is where our art will be created
                    Graphics2D g2d = (Graphics2D)g;

                    //Draw sun, make the sun yellow and give it its coordinate location and size
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(50, 50, 100, 100);
                    //Draw sun rays, make the rays blue and gives each line a start line (x1, y1) and stop line (x2, y2) coordinate 
                    //and then draws the line
                    g2d.setColor(Color.BLUE);
                    for(int i = 0; i < 360; i += 45){
                        double radian = Math.toRadians(i);
                        int x1 = 100 + (int)(Math.cos(radian) * 50);
                        int y1 = 100 + (int)(Math.sin(radian) * 50);
                        int x2 = 100 + (int)(Math.cos(radian) * 80);
                        int y2 = 100 + (int)(Math.sin(radian) * 80);
                        g2d.drawLine(x1, y1, x2, y2);
                    }

                    //Draw smiley face, makes the background color yellow and draws a smaller circle as background
                    //then changes color to blue and draws a curved line for the smile
                    g2d.setColor(Color.YELLOW);
                    g2d.fillOval(75, 75, 50, 50);
                    g2d.setColor(Color.BLUE);
                    g2d.drawArc(80, 90, 40, 20, -180, 180);

                    //Draw eyes on the sun, color is already blue from above smile, so just gives coordinate location and size for each eye
                    g2d.fillOval(90, 80, 5, 5);
                    g2d.fillOval(105, 80, 5, 5);

                    //Draw a square house to the bottom right of the sun, sets house color to orange and then gives coordinate location and size of house
                    g2d.setColor(Color.ORANGE);
                    g2d.fillRect(180, 180, 60, 70);

                    //Draw red door, makes color red and then gives coordinate location and size of door
                    g2d.setColor(Color.RED);
                    g2d.fillRect(200, 225, 20, 25);

                    //Draw door outline, makes outline color black and then gives coordinate location and size of the outline
                    //called drawRect instead of fillRect so it only draws the outline and keeps the middle unfilled
                    g2d.setColor(Color.BLACK);
                    g2d.drawRect(200, 225, 20, 25);
                }
            };
            //add the canvas to the frame and then make the frame visible so it is displayed on the user's screen
            frame.add(canvas);
            frame.setVisible(true);
        });
    }
}
