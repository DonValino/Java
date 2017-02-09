package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import Lab20Model.Contact;
import Lab20Model.PhoneBook;



public class AddGUISk extends JDialog {
    private JPanel p1,p2;
    private JTextField nameF, addF, phoneF,emailF;
    private JButton ok;
    private JDialog addD;
    private PhoneBook pBook;

    public AddGUISk(JFrame parent, PhoneBook p)
    {
        addD = new JDialog(parent,true);
        addD.setSize(250, 250);
        addD.setTitle("Mortgage Application");
        addD.setLocationRelativeTo(null);
        addD.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        pBook = p;
        addD = new JDialog(parent, true);


        p1 = new JPanel(new GridLayout(4,2));
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
        addD.add(p1, BorderLayout.CENTER);

        p2 = new JPanel();
        ok = new JButton("OK");
        p2.add(ok);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addNewContact();
                addD.setVisible(false);
            }
        });

        addD.add(p2,BorderLayout.SOUTH);
        addD.setVisible(true);

    }

    //addnewContact
    public void addNewContact()
    {
        String name = nameF.getText();
        String address = addF.getText();
        String phoneNumber = phoneF.getText();
        String email = emailF.getText();
        Contact c = new Contact(name,address,phoneNumber,email);
        pBook.addContact(c);
    }
}

