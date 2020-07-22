import javax.swing.*;

public class DemoDrawingPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setSize(400, 400);
        frame.setTitle("Task_2_3");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        DrawingPanel panel = new DrawingPanel(10, 20);
        frame.add(panel);
        //panel.setFocusable(true);
        frame.setVisible(true);
    }
}
