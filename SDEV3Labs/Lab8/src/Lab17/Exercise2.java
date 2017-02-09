package Lab17;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by x00112730 on 18/11/2014.
 */
public class Exercise2 extends JFrame {
    private final int WIN_WIDTH = 300;
    private final int WIN_HEIGHT = 250;
    private JButton add1,clear;
    private JTextField caption;
    private JTextArea textArea;
    private Container cPane;

    public Exercise2()
    {
        setSize(WIN_WIDTH, WIN_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cPane = getContentPane();
        setLayout(new FlowLayout());
        cPane.setBackground(Color.PINK);

        add1 = new JButton("Add");
        add(add1);
        add1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = caption.getText();
                textArea.setText(text);
            }
        });
        clear = new JButton("Clear");
        add(clear);
        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                caption.setText("Please enter your message here");
                textArea.setText("Please enter your message here");
            }
        });

        caption = new JTextField(20);
        caption.setText("Please enter your message here");
        add(caption);

        textArea = new JTextArea(6,17);
        textArea.setLineWrap(true);
        textArea.setBorder(BorderFactory.createLineBorder(Color.red));
        textArea.setText("Please enter your message here");
        add(textArea);
    }

    public static void main(String [] args)
    {
        Exercise2 e2 = new Exercise2();
        e2.setVisible(true);
    }
}
