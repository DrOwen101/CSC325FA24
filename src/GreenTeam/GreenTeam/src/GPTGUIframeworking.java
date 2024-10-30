package GreenTeam.GreenTeam.src;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GPTGUIframeworking {
    // Default sizes for components
    private static final int DEFAULT_FRAME_WIDTH = 540;
    private static final int DEFAULT_FRAME_HEIGHT = 960;
    private static final int DEFAULT_BUTTON_WIDTH = 500;
    private static final int DEFAULT_BUTTON_HEIGHT = 25;

    // Main frames
    private static JFrame frame;
    private static JFrame employeeWindow;
    private static JFrame employee1Window;
    private static JFrame sprintEvalWindow;

    public static void main(String[] args) {
        // Initialize frames
        frame = new JFrame("GUI framework");
        employeeWindow = new JFrame("Employee View");
        employee1Window = new JFrame("Employee1 Window");
        sprintEvalWindow = new JFrame("Sprint Eval Window");

        // Set default close operation and size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        
        // Create main canvas
        JPanel canvas = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;
            }
        };
        
        // Set layout for canvas - stacks everything vertically
        canvas.setLayout(new BoxLayout(canvas, BoxLayout.Y_AXIS));

        // Create buttons
        JButton employeeButton = createButton("Employee");
        JButton sprintEvalButton = createButton("SPRINT Evaluations");

        // Add action listeners
        employeeButton.addActionListener(e -> openEmployeeWindow(canvas));
        sprintEvalButton.addActionListener(e -> openSprintEvalWindow(canvas));

        // Add buttons to main canvas
        canvas.add(employeeButton);
        canvas.add(sprintEvalButton);

        frame.add(canvas);
        frame.setVisible(true);
    }

    private static JButton createButton(String title) {
        JButton button = new JButton(title);
        button.setPreferredSize(new Dimension(DEFAULT_BUTTON_WIDTH, DEFAULT_BUTTON_HEIGHT));
        return button;
    }

    private static void openEmployeeWindow(JPanel canvas) {
        employeeWindow.setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        frame.setVisible(false);
        employeeWindow.setVisible(true);

        canvas.removeAll();
        
        JButton employee1Button = createButton("Example Employee1");
        employee1Button.addActionListener(e -> openEmployee1Window(canvas));
        JButton employee2Button = createButton("Example Employee2");
        JButton createEmployeeButton = createButton("Create Employee");

        canvas.add(employee1Button);
        canvas.add(employee2Button);
        canvas.add(createEmployeeButton);
        
        employeeWindow.add(canvas);
        employeeWindow.revalidate();
        employeeWindow.repaint();
    }

    private static void openEmployee1Window(JPanel canvas) {
        employee1Window.setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        employeeWindow.setVisible(false);
        employee1Window.setVisible(true);

        canvas.removeAll();
        
        JLabel employeeLabel = new JLabel("Employee 1");
        JButton editEmployeeButton = createButton("Edit Employee");

        canvas.add(employeeLabel);
        canvas.add(editEmployeeButton);
        
        employee1Window.add(canvas);
        employee1Window.revalidate();
        employee1Window.repaint();
    }

    private static void openSprintEvalWindow(JPanel canvas) {
        sprintEvalWindow.setSize(DEFAULT_FRAME_WIDTH, DEFAULT_FRAME_HEIGHT);
        frame.setVisible(false);
        sprintEvalWindow.setVisible(true);

        canvas.removeAll();
        
        JLabel evalLabel = new JLabel("Eval Title");
        JButton editEvalButton = createButton("Edit SPRINT Evaluation");

        canvas.add(evalLabel);
        canvas.add(editEvalButton);
        
        sprintEvalWindow.add(canvas);
        sprintEvalWindow.revalidate();
        sprintEvalWindow.repaint();
    }
}
