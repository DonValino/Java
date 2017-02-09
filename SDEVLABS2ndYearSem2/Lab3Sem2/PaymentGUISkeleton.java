package Lab3Sem2;

/**
 * Created by Jake on 11/02/15.
 */
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.*;

class PaymentGUISkeleton extends JFrame
{
    private JRadioButton creditCardRadioButton, billCustomerRadioButton;
    private JList        cardTypeList;
    private JTextField   cardNumberTextField;
    private JComboBox    monthComboBox,yearComboBox;
    private JCheckBox    verifiedCheckBox;
    private JButton      acceptButton,exitButton;
    private JLabel       cardTypeLabel,cardNumberLabel,expirationDateLabel;
    private JScrollPane JScrollPanecardTypeScrollPane;
    private GridBagLayout layout;
    private GridBagConstraints constraints;

    //private GridBagLayout layout;

    public PaymentGUISkeleton()
    {
        setTitle("Payment Application");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        setSize(350,350);

        layout = new GridBagLayout();
        this.setLayout(layout);

        constraints = new GridBagConstraints();

        Border loweredBorder= BorderFactory.createBevelBorder(BevelBorder.LOWERED);

        // radio button panel
        JPanel radioPanel = new JPanel();
        ButtonGroup billingGroup = new ButtonGroup();
        radioPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        radioPanel.setBorder(BorderFactory.createTitledBorder(loweredBorder,"Billing:"));


        // credit card radio button
        creditCardRadioButton = new JRadioButton("Credit card", true);
        billingGroup.add(creditCardRadioButton);
        radioPanel.add(creditCardRadioButton);

        // bill customer radio button
        billCustomerRadioButton = new JRadioButton("Bill customer");
        billingGroup.add(billCustomerRadioButton);
        radioPanel.add(billCustomerRadioButton);

        this.addComponent(radioPanel,0,0,2,1);


        // card type label
        cardTypeLabel = new JLabel("Card type:");
        this.addComponent(cardTypeLabel,1,0,1,1);
        //


        // Insert Code for the JList
        String[] cardNames = {"Visa", "Master Card", "American Express", "Other"};
        cardTypeList = new JList(cardNames);
        cardTypeList.setFixedCellWidth(170);
        cardTypeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        cardTypeList.setVisibleRowCount(3);
        JScrollPanecardTypeScrollPane = new JScrollPane(cardTypeList);

        this.addComponent(JScrollPanecardTypeScrollPane,1,1,4,1);


        // card number label
        cardNumberLabel = new JLabel("Card number:");
        this.addComponent(cardNumberLabel,2,0,1,1);

        // card number text field
        cardNumberTextField = new JTextField(15);
        constraints.anchor = GridBagConstraints.WEST;
        this.addComponent(cardNumberTextField,2,1,3,1);


        // expiration date label
        expirationDateLabel= new JLabel("Expiration date:");
        this.addComponent(expirationDateLabel,3,0,1,1);

        // month combo box
        String[] months = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December" };
        monthComboBox = new JComboBox<String>(months);
        constraints.anchor = GridBagConstraints.WEST;
        this.addComponent(monthComboBox,3,1,2,1);

        // year combo box
        String[] years = { "2011", "2012", "2013", "2014", "2015", "2016" };
        yearComboBox = new JComboBox<String>(years);
        this.addComponent(yearComboBox,3,3,1,1);



        // verified check box
        verifiedCheckBox = new JCheckBox("Verified");
        constraints.anchor = GridBagConstraints.WEST;
        this.addComponent(verifiedCheckBox,4,1,1,1);

        // calculate button
        acceptButton = new JButton("Accept");
        constraints.anchor = GridBagConstraints.EAST;
        this.addComponent(acceptButton,5,1,2,1);

        // exit button
        exitButton = new JButton("Exit");
        this.addComponent(exitButton,5,3,2,1);

    }

    // a  method for setting grid bag constraints
    private GridBagConstraints getConstraints(int gridx, int gridy,
                                              int gridwidth, int gridheight, int anchor)
    {
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.ipadx = 0;
        c.ipady = 0;
        c.gridx = gridx;
        c.gridy = gridy;
        c.gridwidth = gridwidth;
        c.gridheight = gridheight;
        c.anchor = anchor;
        return c;
    }

    private void addComponent(Component component,int row,int column,
                              int width,int height)
    {
        constraints.insets = new Insets(5, 5, 5, 5);
        constraints.ipadx = 0;
        constraints.ipady = 0;
        constraints.gridx = column;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
        layout.setConstraints(component,constraints);
        add(component);
    }

}
