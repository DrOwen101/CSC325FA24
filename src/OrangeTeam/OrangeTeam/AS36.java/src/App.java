import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class App {
	public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGUI());
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Sun and House Scene");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new DrawingPanel());
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}

class DrawingPanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw sun
        g2d.setColor(Color.YELLOW);
        g2d.fillOval(50, 50, 160, 160);

        // Draw sun rays
        g2d.setColor(Color.BLUE);
        int centerX = 130; // Center of the sun
        int centerY = 130; // Center of the sun
        int radius = 80;   // Radius of the sun

        for (int i = 0; i < 12; i++) { // Draw 12 rays
            double angle = Math.toRadians(i * 30); // Angle for each ray (30 degrees apart)
            int x1 = centerX + (int) (radius * Math.cos(angle));
            int y1 = centerY + (int) (radius * Math.sin(angle));
            int x2 = centerX + (int) ((radius + 30) * Math.cos(angle)); // Extend ray length
            int y2 = centerY + (int) ((radius + 30) * Math.sin(angle));
            g2d.drawLine(x1, y1, x2, y2); // Draw the ray
        }

        // Draw eyes on the sun (black)
        g2d.setColor(Color.BLACK);
        g2d.fillOval(90, 90, 20, 20);   // Left eye
        g2d.fillOval(150, 90, 20, 20);  // Right eye

        // Draw smile (blue)
        g2d.setColor(Color.BLUE);
        g2d.drawArc(70, 70, 120, 120, 0, -180); // Smiley face

        // Draw a square house to the bottom right of the sun
        int doorWidth = 40;
        int doorHeight = 70;
        int houseWidth = doorWidth * 2;
        int houseHeight = doorHeight * 2;

        g2d.setColor(Color.YELLOW);
        g2d.fillRect(410, 220, houseWidth, houseHeight);

        // Draw red door
        g2d.setColor(Color.RED);
        g2d.fillRect(410, 230, doorWidth, doorHeight);

        // Draw door outline
        g2d.setColor(Color.BLACK);
        g2d.drawRect(410, 230, doorWidth, doorHeight);
    }
}
