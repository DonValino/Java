package gui;

import Lab20Model.PhoneBook;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class PhoneBookGUISk {
    private JPanel p1, p2;
    private JTextField nameF, addF, phoneF, emailF;
    private JButton addB, delB, updateB, forwardB, backB, quitB;
    private JFrame frame;
    private PhoneBook pbook;
    private int counter;

    public PhoneBookGUISk(PhoneBook phone) {

        frame = new JFrame();
        frame.setSize(400, 150);
        frame.setTitle("Phone Book Application");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pbook = phone;
        frame.setLayout(new GridLayout(1, 2));

        p1 = new JPanel();
        p1.setLayout(new GridLayout(4, 2));

        p1.add(new Label("Name:"));
        nameF = new JTextField(10);
        p1.add(nameF);

        p1.add(new Label("Address: "));
        addF = new JTextField(10);
        p1.add(addF);

        p1.add(new Label("Phone:"));
        phoneF = new JTextField(10);
        p1.add(phoneF);

        p1.add(new Label("E-mail:"));
        emailF = new JTextField(10);
        p1.add(emailF);

        p1.setBorder(new TitledBorder("Contact Details"));

        p2 = new JPanel();
        p2.setLayout(new GridLayout(4, 2));

        addB = new JButton("Add");
        addB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gui.AddGUISk a = new gui.AddGUISk(frame,pbook);
                setFRow();
            }
        });

        p2.add(addB);


        delB = new JButton("Delete");

        p2.add(delB);
        delB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteDep();
                setFRow();
            }
        });

        updateB = new JButton("Update");

        p2.add(updateB);
        updateB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //updateContact()
                updateContact();
                gui.UpdateGUISk u = new gui.UpdateGUISk(pbook,frame,counter);
                setFRow();
            }
        });


        quitB = new JButton("Exit");

        p2.add(quitB);
        quitB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        backB = new JButton("<");

        p2.add(backB);
        backB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((counter - 1) >= 0) {
                    counter--;
                    nameF.setText(pbook.getContact(counter).getName());
                    addF.setText(pbook.getContact(counter).getAddress());
                    phoneF.setText(pbook.getContact(counter).getPhoneNumber());
                    emailF.setText(pbook.getContact(counter).getEmail());

                }
            }
        });

        forwardB = new JButton(">");

        p2.add(forwardB);
        forwardB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ((counter + 1) < pbook.getNumContact()) {
                    counter++;
                    nameF.setText(pbook.getContact(counter).getName());
                    addF.setText(pbook.getContact(counter).getAddress());
                    phoneF.setText(pbook.getContact(counter).getPhoneNumber());
                    emailF.setText(pbook.getContact(counter).getEmail());
                }
            }
        });

        p2.setBorder(new TitledBorder("Options"));

        frame.add(p1);
        frame.add(p2);

        frame.setVisible(true);
        setFRow();
    }
    //setRow()
    public void setRow(int num)
    {
        nameF.setText(pbook.getContact(num).getName());
        addF.setText(pbook.getContact(num).getAddress());
        phoneF.setText(pbook.getContact(num).getPhoneNumber());
        emailF.setText(pbook.getContact(num).getEmail());
    }
    //setFRow()
    public void setFRow()
    {
        counter = 0;
        nameF.setText(pbook.getContact(counter).getName());
        addF.setText(pbook.getContact(counter).getAddress());
        phoneF.setText(pbook.getContact(counter).getPhoneNumber());
        emailF.setText(pbook.getContact(counter).getEmail());
    }

    //Delete Dept
    public void deleteDep() {
        {
            String b = "";

            while (b==null || pbook.findContact(b) == -1) {
                b = JOptionPane.showInputDialog(null,
                        "Enter the name of the person you wish to delete: ",
                        "PhoneBook", JOptionPane.QUESTION_MESSAGE);
            }
            int numberOfDeleted = pbook.removeContact(b);
            JOptionPane.showMessageDialog(null, numberOfDeleted
                    + " Record(s) deleted.");
        }
    }
    public void updateContact()
    {
        String d = "";
        d = JOptionPane.showInputDialog(null,
                "Enter the name of the person you wish to update: ",
                "Phone Book", JOptionPane.QUESTION_MESSAGE);

        while (d.equals("") || pbook.findContact(d) == -1) {
            JOptionPane.showMessageDialog(null,
                    "Contact Now found",
                    "Contacts", JOptionPane.WARNING_MESSAGE);
            d = JOptionPane.showInputDialog(null,
                    "Enter the name of the person you wish to update: ",
                    "Phone Book", JOptionPane.QUESTION_MESSAGE);
        }
        counter = pbook.findContact(d);
    }


}
