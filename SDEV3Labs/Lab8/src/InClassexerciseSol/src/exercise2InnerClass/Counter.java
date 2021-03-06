package exercise2InnerClass;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Counter extends JFrame {
    private JTextField cField; // To get the Celsius temperature
    private JButton upButton, dnButton, rButton;      // Calculates everything
    private JLabel resultLabel;
    private JLabel inputMsg;
    // Constants for window size
    private final int WINDOW_WIDTH = 400;
    private final int WINDOW_HEIGHT = 100;
    private int c = 0;


    public Counter() {
        // Set the title.
        setTitle("Counter Application");
        // Specify what happens when the close button is clicked.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        // Create a label prompting for the total sales.
        inputMsg = new JLabel("Counter:");
        add(inputMsg);
        // Create a text field for total sales.
        cField = new JTextField(3);
        add(cField);
        // Create 3 buttons to click.
        upButton = new JButton("Count Up");
        add(upButton);
        upButton.addActionListener(new CountListener1());

        dnButton = new JButton("Count Down");
        add(dnButton);
        dnButton.addActionListener(new CountListener2());

        rButton = new JButton("Reset");
        add(rButton);
        rButton.addActionListener(new CountListener3());

        // Size and display the window.
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    }


        private class CountListener1 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                c++;
                cField.setText(Integer.toString(c));

        }
    }
        private class CountListener2 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                c--;
                cField.setText(Integer.toString(c));

            }
        }
        private class CountListener3 implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                c = 0;
                cField.setText(Integer.toString(c));
            }
        }



    public static void main(String args[]) {
        Counter c = new Counter();
        c.setVisible(true);
    }
}

