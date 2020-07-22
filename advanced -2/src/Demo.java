import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Test");
        frame.setBounds(new Rectangle(100, 100, 600, 400));

        JButton button1 = new JButton("Hello!!!");
        JButton button2 = new JButton("Bye-bye!!!");
        JTextField text = new JTextField();

        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(text, BorderLayout.CENTER);

        frame.setVisible(true);

        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                text.setText(text.getText() + " press Hello");
            }
        });

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                text.setText(text.getText() + " press Bye-bye");
            }
        });
    }

}

