package cinema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CinemaIC extends JFrame {
    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 300;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JButton wolfman, edge, invictus, up, quit;
    private JLabel number, total, title;
    private JTextField amount, quantity;
    private JPanel top, topMiddle, bottomMiddle, bottom, bottomExit;

    public CinemaIC() {
        // Set window coordinates
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("Cinema System");
        this.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setLayout(new GridLayout(5, 1));

        // Initialise panels
        top = new JPanel();
        topMiddle = new JPanel();
        bottomMiddle = new JPanel();
        bottom = new JPanel();
        bottomExit = new JPanel();

        // Add panels to the frame
        this.add(top);
        this.add(topMiddle);
        this.add(bottomMiddle);
        this.add(bottom);
        this.add(bottomExit);

        Font titleFont = new Font("Helvetica", Font.ITALIC, 28);

        // Panel 1
        top.setLayout(new FlowLayout());
        title = new JLabel("Welcome to the Cinema");
        title.setFont(titleFont);
        top.add(title);

        // Panel 2
        topMiddle.setLayout(new FlowLayout());
        number = new JLabel("Number of tickets");
        quantity = new JTextField(3);


        topMiddle.add(number);
        topMiddle.add(quantity);

        // Panel 3
        bottomMiddle.setLayout(new GridLayout(2, 2));
        wolfman = new JButton("The Wolfman");
        wolfman.addActionListener(new ButtonListener());
        edge = new JButton("The Edge of Darkness");
        edge.addActionListener(new ButtonListener());

        invictus = new JButton("Invictus");
        invictus.addActionListener(new ButtonListener());
        up = new JButton("Up in the Air");
        up.addActionListener(new ButtonListener());


        bottomMiddle.add(wolfman);
        bottomMiddle.add(edge);
        bottomMiddle.add(invictus);
        bottomMiddle.add(up);

        // Panel 4
        bottom.setLayout(new FlowLayout());
        total = new JLabel();
        amount = new JTextField(6);


        bottom.add(total);
        bottom.add(amount);

        // Panel 5
        bottomExit.setLayout(new FlowLayout());
        quit = new JButton("Exit");
        quit.addActionListener (new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        bottomExit.add(quit);

    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                int numTickets = Integer.parseInt(quantity.getText());
                if ((e.getSource() == wolfman) || (e.getSource() == edge)
                        || (e.getSource() == invictus) || (e.getSource() == up)) {
                    if (numTickets < 1) {
                        JOptionPane.showMessageDialog(null, "Quantity must be greater than 0", "Error",
                                JOptionPane.WARNING_MESSAGE);
                    } else {
                        String totalAmt = Integer.toString(numTickets * 10);
                        amount.setText("€" + totalAmt);
                        String title = e.getActionCommand();
                        total.setText("Total cost of tickets for " + title + " is ");
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "You did not enter a valid quantity  ", "Error",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    public static void main(String args[]) {
        CinemaIC c = new CinemaIC();
        c.setVisible(true);
    }
}
