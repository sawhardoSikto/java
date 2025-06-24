import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Login implements ActionListener
{
    private JButton lgnBtn;
    private JButton singBtn;
    private JButton exitbtn;
    private JLabel luername;
    private JLabel lpass;
    private JTextField uname;
    private JPasswordField upass;
    private ImageIcon i1;
    JFrame frame;
    //accociantion with user class
    User u1,u2;
    User users[];


    public Login()
    {
        u1=new User("sikto","1234");
        u2=new User("sawhardo","3210");
        users=new User[4];
        users[0]=u1;
        users[1]=u2;

        //create frame
        frame=new JFrame("System");
        //construct component
        lgnBtn=new JButton("Login");
        singBtn=new JButton("Signup");
        exitbtn=new JButton("Exit");
        luername=new JLabel("Username");
        lpass=new JLabel("Password");
        uname=new JTextField();
        upass=new JPasswordField();
        i1=new ImageIcon("download.png");

        luername.setForeground(new Color (230, 238, 250));
        lpass.setForeground(new Color (230, 238, 250));

        luername.setFont(new Font("Default",Font.BOLD,17));
        lpass.setFont(new Font("Default",Font.BOLD,17));

        //set component bounds
        lgnBtn.setBounds(150, 185, 100, 30);
        singBtn.setBounds(305, 185, 100, 30);
        exitbtn.setBounds (205, 235, 140, 30);
        luername.setBounds (150, 105, 100, 25);
        lpass.setBounds (150, 145, 100, 25);
        uname.setBounds (305, 105, 100, 25);
        upass.setBounds (305, 145, 100, 25);

        //addActionListener
        lgnBtn.addActionListener(this);
        exitbtn.addActionListener(this);
        singBtn.addActionListener(this);
        //addd component
        frame.add(luername);
        frame.add(lpass);
        frame.add(lgnBtn);
        frame.add(exitbtn);
        frame.add(singBtn);
        frame.add(uname);
        frame.add(upass);


        //frame properties
        //adjust size and set layout
        frame.setSize(624,400);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(i1.getImage());
        frame.getContentPane().setBackground(new Color(139, 143, 203));
        frame.getContentPane();
        frame.setVisible(true);


    }
    //loginbutton
    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource()==lgnBtn)
        {
            String userinfo=uname.getText();
            String passinfo=upass.getText();
            int flag=0;
            if (userinfo.isEmpty()==false && passinfo.isEmpty()==false)
            {
                for (int i = 0; i <users.length ; i++)
                {
                    if (users[i]!=null)
                    { if(userinfo.equals(users[i].getUserName()))
                    {
                        flag=1;
                        break;
                    }

                    }


                }
                if (flag==1)
                {
                    new Dashboard(userinfo);
                    frame.setVisible(false);
                }
                else
                {
                    showMessageDialog(null,"invald username and password");
                }
            }
            else {
                showMessageDialog(null,"please fill up each other");
            }


        } else if (e.getSource()==exitbtn)
        {
            System.exit(0);

        }

    }


}
