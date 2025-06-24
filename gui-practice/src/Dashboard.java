import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Dashboard implements ActionListener
{
    Account[] accounts = new Account[100];//for storing accounts

    //labels
    JLabel lano;
    JLabel lbalance;
    JLabel opName;

    //textfields
    JTextField accNo;
    JTextField balance;

    //textarea
    JTextArea display;

    //buttons
    JButton insertBtn;
    JButton deleteBtn;
    JButton dispBtn;
    JButton searchBtn;
    JButton logoutBtn;
    JButton lcUser;
    JButton proceedInsert;
    JButton proceedDelete;
    JButton proceedDisplay;
    JButton proceedSearch;

    //imageIcon
    ImageIcon i1;

    //for table(s)
    JTable jt;
    //JScrollPane sp;

    //frame
    JFrame frame;



        Dashboard(String user)
        {
            //create frame
            frame = new JFrame ("Dashboard");

            //construct components
            lano = new JLabel ("Account Number");
            lano.setForeground(new Color(230, 238, 250));

            lbalance = new JLabel ("Balance");
            lbalance.setForeground(new Color (230, 238, 250));

            opName = new JLabel ("Default!");
            opName.setForeground(new Color (230, 238, 250));

            accNo = new JTextField (5);
            balance = new JTextField (5);

            display = new JTextArea (5, 5);

            insertBtn = new JButton ("Insert");

            deleteBtn = new JButton ("Delete");
            dispBtn = new JButton ("Display");
            proceedInsert = new JButton("Proceed");
            proceedDelete = new JButton("Proceed");
            proceedDisplay = new JButton("Proceed");
            proceedSearch = new JButton("Proceed");
            searchBtn = new JButton ("Search");
            logoutBtn = new JButton ("Logout");
            lcUser = new JButton(user);

            i1 = new ImageIcon("download.png");

            jt = new JTable();

            //add components
            frame.add (lano);
            frame.add (lbalance);
            frame.add (accNo);
            frame.add (opName);
            frame.add (balance);

            frame.add (display);

            frame.add (insertBtn);
            frame.add (deleteBtn);
            frame.add (dispBtn);
            frame.add (searchBtn);
            frame.add (proceedInsert);
            frame.add (proceedDelete);
            frame.add (proceedDisplay);
            frame.add (proceedSearch);
            frame.add (logoutBtn);
            frame.add (lcUser);
            frame.add(jt);

            //set component bounds (only needed by Absolute Positioning)
            lano.setBounds (35, 90, 100, 25);
            lbalance.setBounds (35, 130, 100, 25);
            opName.setBounds (365, 80, 140, 30);
            accNo.setBounds (155, 90, 100, 25);
            balance.setBounds (155, 130, 100, 25);

            display.setBounds (35, 180, 380, 90);

            insertBtn.setBounds (35, 30, 120, 30);
            deleteBtn.setBounds (165, 30, 120, 30);
            dispBtn.setBounds (290, 30, 120, 30);
            proceedInsert.setBounds(355, 110, 120, 30);
            proceedDelete.setBounds(355, 110, 120, 30);
            proceedDisplay.setBounds(355, 110, 120, 30);
            proceedSearch.setBounds(355, 110, 120, 30);
            searchBtn.setBounds (420, 30, 120, 30);
            logoutBtn.setBounds (525, 5, 75, 20);
            lcUser.setBounds (420, 5, 75, 20);

            //by default labels, textfield, textarea-invisible
            lano.setVisible(false);
            lbalance.setVisible(false);
            opName.setVisible(false);
            accNo.setVisible(false);
            balance.setVisible(false);
            display.setVisible(false);
            proceedInsert.setVisible(false);
            proceedDelete.setVisible(false);
            proceedDisplay.setVisible(false);
            proceedSearch.setVisible(false);

            //addActionListener
            logoutBtn.addActionListener(this);
            lcUser.addActionListener(this);
            insertBtn.addActionListener(this);
            deleteBtn.addActionListener(this);
            dispBtn.addActionListener(this);
            searchBtn.addActionListener(this);
            proceedInsert.addActionListener(this);
            proceedDelete.addActionListener(this);
            proceedDisplay.addActionListener(this);
            proceedSearch.addActionListener(this);

            //frame properties
            //adjust size and set layout
            frame.setSize (624, 329);
            frame.setLocationRelativeTo(null);//to center screen gui
            frame.setLayout (null);
            frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            frame.setIconImage(i1.getImage());
            frame.getContentPane().setBackground(new Color (1, 5, 77));//setting a background color
            frame.setResizable(false);
            frame.setVisible (true);
        }
        public void addAccount (Account a)
        {
            int count=0;
            for (int i = 0; i <accounts.length; i++)
            {
                if(accounts[i]==null)
                {
                    accounts[i]=a;
                    count++;
                    break;
                }

            }
            if (count==0)
            {

            }
        }


    }

