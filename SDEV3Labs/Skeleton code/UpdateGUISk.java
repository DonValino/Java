package gui;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import Lab20Model.Contact;
import Lab20Model.PhoneBook;



public class UpdateGUISk extends JDialog {
    private JPanel p1,p2;
    private JTextField nameF, addF, phoneF,emailF;
    private JButton ok;
    private PhoneBook pbook;
    private int updateIndex;
    private JDialog updateD;

    public UpdateGUISk(PhoneBook p, JFrame parent, int i)
    {
        updateD = new JDialog(parent,true);
        updateD.setSize(250, 250);
        updateD.setTitle("PhoneBook Application");
        updateD.setLocationRelativeTo(null);
        updateD.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        //upDateContact();

        pbook = p;
        updateIndex = i;

        p1 = new JPanel(new GridLayout(4,2));
        p1.add(new Label("Name:"));
        nameF = new JTextField(p.getContact(updateIndex).getName());
        nameF.setEditable(false);
        p1.add(nameF);

        p1.add(new Label("Address: "));
        addF = new JTextField(p.getContact(updateIndex).getAddress());
        addF.setEditable(false);
        p1.add(addF);

        p1.add(new Label("Phone:"));
        phoneF = new JTextField(p.getContact(updateIndex).getPhoneNumber());
        phoneF.setEditable(true);
        p1.add(phoneF);


        p1.add(new Label("E-mail:"));
        emailF = new JTextField(p.getContact(updateIndex).getEmail());
        emailF.setEditable(false);
        p1.add(emailF);


        p1.setBorder(new TitledBorder("Contact Details"));
        updateD.add(p1, BorderLayout.CENTER);

        p2 = new JPanel();
        ok = new JButton("Save");
        p2.add(ok);
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String number = phoneF.getText();
                pbook.changeContactNumber(number,updateIndex);
                updateD.setVisible(false);
            }
        });

        updateD.add(p2,BorderLayout.SOUTH);
        updateD.setVisible(true);

    }




}
