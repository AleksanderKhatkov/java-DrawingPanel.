import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoColor {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Task_2_2");
        frame.setBounds(new Rectangle(100, 100, 600, 400));

        JTextField coloredText = new JTextField();
        coloredText.setBackground(Color.RED);
        coloredText.setEditable(false);

        JPanel downPanel = new JPanel();
        JTextField red = new JTextField("255");
        JTextField green = new JTextField("0");
        JTextField blue = new JTextField("0");
        JButton button = new JButton("Change Color");

        downPanel.setLayout(new GridLayout(1, 4));
        downPanel.add(red);
        downPanel.add(green);
        downPanel.add(blue);
        downPanel.add(button);

        frame.setLayout(new GridLayout(2, 1));
        frame.add(coloredText);
        frame.add(downPanel);

        frame.setVisible(true);

        button.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int r = 0;
                try {
                    r = Math.abs(Integer.valueOf(red.getText())) % 256;
                } catch (NumberFormatException exc) {
                }

                int g = 0;
                try {
                    g = Math.abs(Integer.valueOf(green.getText())) % 256;
                } catch (NumberFormatException exc) {
                }

                int b = 0;
                try {
                    b = Integer.valueOf(blue.getText()) % 256;
                } catch (NumberFormatException exc) {
                }

                red.setText("" + r);
                green.setText("" + g);
                blue.setText("" + b);

                coloredText.setBackground(new Color(r, g, b));
            }
        });
    }
}

