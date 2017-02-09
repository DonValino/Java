package ClassExerciseWeek9Wednesday;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by x00112730 on 12/11/2014.
 */
public class Conversion extends JFrame implements ActionListener{
    private JTextField cInput;
    private JButton calculationButton;
    private JLabel cLabel,rLabel;

    private final int WIN_WIDTH = 360;
    private final int WIN_HEIGHT = 100;

    public Conversion()
    {
        setTitle("Celcius to Farenheit");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        cLabel = new JLabel("Enter the Celcius Temperature");
        add(cLabel);
        cInput = new JTextField(10);
        add(cInput);
        calculationButton = new JButton("Calculate Fahrenheit");
        add(calculationButton);
        calculationButton.addActionListener(this);
        rLabel = new JLabel(" ");
        add(rLabel);

        setSize(WIN_WIDTH, WIN_HEIGHT);

    }
    //We override the method from the implement
    public void actionPerformed(ActionEvent ae)
    {
        int c,f;
        String text = cInput.getText();

        c = Integer.parseInt(text);
        f = (c*9/5) + 32;

        rLabel.setText("Farenheight" + f);
    }
    public static void main(String [] args)
    {
        Conversion c = new Conversion();
        c.setVisible(true);
    }
}
