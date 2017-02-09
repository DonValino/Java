package ClassExerciseWeek10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by x00112730 on 17/11/2014.
 */
public class Counter extends JFrame implements ActionListener {

    private JLabel counterLabel;
    private JTextField text1;
    private JButton countUp,countDown,reset1;
    private Container cPane;

    private final int WIN_WIDTH = 490;
    private final int WIN_HEIGHT = 100;
    int c = 0;

    public Counter()
    {
        setTitle("Counter Application");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        cPane = getContentPane();
        setSize(WIN_WIDTH,WIN_HEIGHT);
        counterLabel = new JLabel("Counter");
        add(counterLabel);
        text1 = new JTextField(10);
        add(text1);
        countUp = new JButton("Count Up");
        add(countUp);
        countUp.addActionListener(this);
        countDown = new JButton("Count Down");
        add(countDown);
        reset1 = new JButton("Reset");
        add(reset1);
        countDown.addActionListener(this);
        reset1.addActionListener(this);
        cPane.setBackground(Color.BLACK);
        countDown.setBackground(Color.ORANGE);
        countUp.setBackground(Color.YELLOW);
        reset1.setBackground(Color.BLUE);


    }

    public void actionPerformed(ActionEvent e)
    {
 //       String b = e.getActionCommand();
 //       if(b.equals("Count Up"))
  //      {
 //           c++;
 //           text1.setText(Integer.toString(c));
 //           cPane.setBackground(Color.YELLOW);
 //       }
 //       else if(b.equals("Count Down"))
  //      {
       //     c--;
  //          text1.setText(Integer.toString(c));
  //          cPane.setBackground(Color.ORANGE);
   //     }
  //      else
  //      {
       //     c=0;
  //          text1.setText(Integer.toString(c));
  //          cPane.setBackground(Color.BLACK);
  //      }
//
        JButton b = (JButton) e.getSource();
        if(b == countUp)
         {
                       c++;
                       text1.setText(Integer.toString(c));
                       cPane.setBackground(Color.YELLOW);
          }
         else if(b == countDown)
                 {
                   c--;
                  text1.setText(Integer.toString(c));
                  cPane.setBackground(Color.ORANGE);
             }
         else
         {
            c=0;
                  text1.setText(Integer.toString(c));
                  cPane.setBackground(Color.BLACK);
         }

    }

    public static void main(String [] args)
    {
        Counter c = new Counter();
        c.setVisible(true);
    }
}
