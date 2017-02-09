package Lab1Week8;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * Created by x00112730 on 18/03/2015.
 */
public class Excercise1 extends JFrame{


    /**
     * Created by JakeValino on 17/03/2015.
     */
        final static int HOST_SIZE = 10;
        final static int WEEK_NUMBER_SIZE = 4;
        final static int GUESTS_SIZE = 4;
        final static int RECORD_SIZE =
                (HOST_SIZE + WEEK_NUMBER_SIZE + GUESTS_SIZE);
        private String host;
        private int week;
        private int guest;
        private static final int FRAME_WIDTH = 400;
        private static final int FRAME_HEIGHT = 300;
        private static final int FRAME_X_ORIGIN = 150;
        private static final int FRAME_Y_ORIGIN = 250;
        private JLabel title;
        private JButton enterData,exit;
        private JLabel monthsEventHostLabel,weekNumberLabel,guestLabel;
        private JTextField monthsEventHostTextField,weekNumberTextField,guestTextField;
        private RandomAccessFile raf;

        public Excercise1()
        {
            try
            {
                raf = new RandomAccessFile("src/File/events.txt","rw");
            } catch (IOException ex)
            {
                System.out.print("Error: " + ex);
                System.exit(0);
            }

            this.setTitle("Event Application");
            this.setSize(390, 200);
            this.setLocation(FRAME_X_ORIGIN,FRAME_Y_ORIGIN);
            this.setLocationRelativeTo(null);
            this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            JPanel top = new JPanel(new FlowLayout());
            title = new JLabel("Event Handlers Incorporated");
            top.add(title);
            this.add(BorderLayout.NORTH,top);
            JPanel centre = new JPanel(new GridLayout(3,2));
            monthsEventHostLabel = new JLabel("Enter the month's event Host");
            centre.add(monthsEventHostLabel);
            monthsEventHostTextField = new JTextField();
            centre.add(monthsEventHostTextField);
            weekNumberLabel = new JLabel("Week Number");
            centre.add(weekNumberLabel);
            weekNumberTextField = new JTextField();
            centre.add(weekNumberTextField);
            guestLabel = new JLabel("Guest");
            centre.add(guestLabel);
            guestTextField = new JTextField();
            centre.add(guestTextField);
            this.add(BorderLayout.CENTER,centre);
            JPanel buttom = new JPanel();
            enterData = new JButton("Enter data");
            buttom.add(enterData);
            exit = new JButton("Exit");
            buttom.add(exit);
            this.add(BorderLayout.SOUTH,buttom);
            this.setVisible(true);
            this.setBackground(Color.WHITE);

            enterData.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        host = monthsEventHostTextField.getText();
                        week = Integer.parseInt(weekNumberTextField.getText());
                        guest = Integer.parseInt(guestTextField.getText());

                        raf.seek(((Integer.parseInt(weekNumberTextField.getText()))-1) * RECORD_SIZE);

                        raf.writeInt(Integer.parseInt(weekNumberTextField.getText()));
                        System.out.println("1: " + raf.getFilePointer());
                        raf.writeInt(Integer.parseInt(guestTextField.getText()));
                        System.out.println("2: " + raf.getFilePointer());
                        raf.writeUTF(monthsEventHostTextField.getText());
                        System.out.println("3: "+raf.getFilePointer());

                    } catch (IOException e1)
                    {

                    }
                }
            });

            exit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });
        }

        public void clearFields()
        {
            monthsEventHostTextField.setText("");
            weekNumberTextField.setText("");
            guestTextField.setText("");
        }

        public static void main(String[] args) {
            Excercise1 l = new Excercise1();
            l.setVisible(true);

        }

    public String getHost()
    {
        return host;
    }
    public int getWeekNumberSize()
    {
        return week;
    }

    public int getGuest()
    {
        return guest;
    }
    //Write one specified record to the RandomAccessFile
    public void write () throws IOException
    {
        writeName(getHost());
    }

    // ensure all records are the same length by writing exactly 15
    // characters for first name and last name
    // A string buffer implements a mutable sequence of characters. A
    // string buffer is like a String, but can be modified. At any point
    // in time it contains some particular sequence of characters, but the
    // length and content of the sequence can be changed through certain method calls.

    private void writeName(String name) throws IOException
    {
        StringBuffer buf = null;
        if (name != null)
            buf = new StringBuffer(name);
        else
            buf = new StringBuffer(10);

        buf.setLength(10);
        raf.writeUTF(buf.toString());
    }

}


