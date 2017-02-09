package Lab1Skeleton.src.Lab1GUI;

import Lab1Skeleton.src.model.Bank;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * Created by JakeValino on 27/01/2015.
 */
public class BankGUI implements ItemListener{
    private static final int FRAME_WIDTH = 450;
    private static final int FRAME_HEIGHT = 270;
    private JButton applyInterest, exit;
    private JTextArea jTextArea1;
    private Bank theBank;
    private JLabel welcometoBanking;
    private JCheckBox savings,current;
    private JFrame frame;
    JScrollPane scrollPane;
    private Font f = new Font("Verdana",Font.BOLD,28);

    public BankGUI(Bank b) {
        frame = new JFrame();
        frame.setTitle("Banking Application");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        theBank = b;

        // Panel 1 - top
        JPanel top = new JPanel(new FlowLayout());
        frame.add(top, BorderLayout.NORTH);
        welcometoBanking = new JLabel("Welcome to Banking");
        welcometoBanking.setFont(f);
        welcometoBanking.setForeground(Color.RED);
        top.add(welcometoBanking);

        top.setBorder(BorderFactory.createLineBorder(Color.RED));

        JPanel middle = new JPanel(new GridLayout(2, 0));
        frame.add(middle, BorderLayout.CENTER);
        jTextArea1 = new JTextArea(15,200);
        scrollPane = new JScrollPane(jTextArea1);
        scrollPane.createHorizontalScrollBar();
        scrollPane.setEnabled(true);
        scrollPane.setPreferredSize(new Dimension(450,10));
        middle.add(scrollPane);
        JPanel button = new JPanel(new FlowLayout());
        middle.add(button);
        applyInterest = new JButton("Apply Interest");
        applyInterest.setForeground(Color.RED);
        button.add(applyInterest);
        exit = new JButton("Exit");
        exit.setForeground(Color.RED);
        button.add(exit);

        JPanel bottom = new JPanel(new GridLayout(1,2));
        frame.add(bottom,BorderLayout.SOUTH);
        bottom.setBorder(BorderFactory.createLineBorder(Color.RED));
        savings = new JCheckBox("Savings");
        bottom.add(savings);
        current = new JCheckBox("Current");
        bottom.add(current);

        savings.addItemListener(this);
        current.addItemListener(this);


        applyInterest.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                theBank.applyInterest();
                String text = theBank.getDetails();
                jTextArea1.setText(text);
            }
        });

        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.setVisible(true);


    }
    public void itemStateChanged(ItemEvent e) {
        if((savings.isSelected() && current.isSelected()))
        {

            jTextArea1.setText(theBank.getDetails());
        }
        else if (savings.isSelected())
        {
            jTextArea1.setText(theBank.getDetails("Savings"));
        }
        else if (current.isSelected())
        {
            jTextArea1.setText(theBank.getDetails("Current"));
        }
        else
        {

            jTextArea1.setText("");
        }
    }
}
