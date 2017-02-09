package Lab18;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by x00112730 on 25/11/2014.
 */
public class Calculator extends JFrame {
    //Member Variables
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 110;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JTextField text1,text2;
    private JLabel answerLabel;
    private JButton plus,minus,multiply,divide,clear,quit;
    private Container cPane;

    public Calculator()
    {
        this.setTitle("Calculator");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
        this.setLocationRelativeTo(this);
        cPane = this.getContentPane();
        this.setLayout(new GridLayout(1,1));

        //Panel 1
        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setLayout(new GridLayout(3, 0));
        text1 = new JTextField(3);
        panel1.add(text1);
        text2 = new JTextField(3);
        panel1.add(text2);
        answerLabel = new JLabel("");
        panel1.add(answerLabel);

        //Panel 2
        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.setLayout(new GridLayout(3, 2));
        plus = new JButton("+");
        plus.setMnemonic('p');
        panel2.add(plus);
        minus = new JButton("-");
        panel2.add(minus);
        minus.setMnemonic('t');
        multiply = new JButton("*");
        panel2.add(multiply);
        multiply.setMnemonic('m');
        divide = new JButton("/");
        panel2.add(divide);
        divide.setMnemonic('d');
        clear = new JButton("CLEAR");
        panel2.add(clear);
        clear.setMnemonic('c');
        quit = new JButton("Quit");
        panel2.add(quit);
        quit.setMnemonic('q');
        plus.addActionListener(new InnerCalculatorOperation());
        minus.addActionListener(new InnerCalculatorOperation());
        multiply.addActionListener(new InnerCalculatorOperation());
        divide.addActionListener(new InnerCalculatorOperation());
        clear.addActionListener(new InnerCalculatorOperation());
        quit.addActionListener(new InnerCalculatorOperation());


    }
    class InnerCalculatorOperation implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent e) {
            try
            {
                JButton b = (JButton) e.getSource();
                if (b == plus) {

                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int answer = num1 + num2;
                    String finalAnswer = Integer.toString(answer);
                    answerLabel.setText("Answer: " + finalAnswer);
                }
                else if(b == minus)
                {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int answer = num1 - num2;
                    String finalAnswer = Integer.toString(answer);
                    answerLabel.setText("Answer: " + finalAnswer);
                }
                else if(b == multiply)
                {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int answer = num1 * num2;
                    String finalAnswer = Integer.toString(answer);
                    answerLabel.setText("Answer: " + finalAnswer);
                }
                else if(b == divide)
                {
                    int num1 = Integer.parseInt(text1.getText());
                    int num2 = Integer.parseInt(text2.getText());
                    int answer = num1 / num2;
                    String finalAnswer = Integer.toString(answer);
                    answerLabel.setText("Answer: " + finalAnswer);
                }
                else if(b == clear)
                {
                    text1.setText("");
                    text2.setText("");
                    answerLabel.setText("");
                }
                else
                {
                    System.exit(0);
                }

            }

            catch (NumberFormatException n)
            {
                JOptionPane.showMessageDialog(null, "You must enter a numeric value in the textfield :)", "Error",JOptionPane.WARNING_MESSAGE);
            }
        }
    }

    public static void main(String [] args)
    {
        Calculator c = new Calculator();
        c.setVisible(true);
    }


}
