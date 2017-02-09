package Lab17;

import sun.awt.HorizBagLayout;
import sun.awt.VerticalBagLayout;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by x00112730 on 18/11/2014.
 */
public class Exercise1 extends JFrame {
    private final int WIN_WIDTH = 300;
    private final int WIN_HEIGHT = 300;
    private JLabel caption;
    private JTextField name,name1;
    private JButton enterButton;
    private Container cPane;

    public Exercise1()
    {
        setSize(WIN_WIDTH,WIN_HEIGHT);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        cPane = getContentPane();
        setLayout(new FlowLayout());
        caption = new JLabel("Please Enter your name");
        add(caption);
        name = new JTextField(20);
        add(name);
        name.setSize(100,40);
        name1 = new JTextField(20);
        add(name1);
        enterButton = new JButton("Enter");
        add(enterButton);
        cPane.setBackground(Color.GREEN);
        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = name.getText();
                name1.setText(text);
            }
        });

    }
    public static void main(String [] args)
    {
        Exercise1 e = new Exercise1();
        e.setVisible(true);
    }

}
