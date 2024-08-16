import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class PasswordForm 
{
   public static void main(String arg[])
   {  
      PasswordForm ac=new PasswordForm();
   }
   public PasswordForm()
   {
   	  PassForm frame = new PassForm();
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.setResizable (false);
      frame.show(); 
      frame.setLocation(450,250);
      frame.setSize(230,150);
   }
}

class PassForm extends JFrame 
{  
   public PassForm()
   {    	
      setTitle("Login Screen");
      setSize(WIDTH, HEIGHT);
	  setResizable(false);

      Container contentPane = getContentPane();

      JPanel panel1 = new JPanel();
      JPanel panel2 = new JPanel();
      JPanel panel3 = new JPanel();
      
      JLabel j1 = new JLabel("User Name");
      panel1.add(j1);
      UserName = new JTextField(10);
      panel1.add(UserName);
      UserName.setFont(font);   
	  UserName.addActionListener(new RightAction());
      //UserName.setEnabled(true);
      
      JLabel j2 = new JLabel("Password");
      panel2.add(j2);
      Password = new JPasswordField(10);
      panel2.add(Password);
      Password.setFont(font);  
      Password.addActionListener (new RightAction()) ;
      	  	  		
      JButton OkButton = new JButton("Ok");
      panel3.add(OkButton);
      OkButton.setFont(font);
      OkButton.addActionListener(new RightAction());
                        
      JButton CancelButton = new JButton("Cancel");
      panel3.add(CancelButton);
      CancelButton.setFont(font);
      CancelButton.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent event)
            {
               System.exit(0);
            }
         });

      contentPane.add(panel1);
      contentPane.add(panel2);
      contentPane.add(panel3);
     // contentPane.setLayout(null);
      contentPane.setLayout (new GridLayout(3,1));
    } 
   public static final int WIDTH = 500;
   public static final int HEIGHT = 200;  
   private JTextField UserName;
   private JPasswordField Password;
   private Font font = new Font("Tahoma",Font.BOLD,13);   
   
   public static final int	HAND_CURSOR	= 12;
   
   private class RightAction implements ActionListener
   {
            public void actionPerformed(ActionEvent event)
            {    	
		      	
		      	String Name=UserName.getText();
				String Pass=Password.getText();
		      	if(Name.equals("admin") && Pass.equals("admin"))
		      	{
		      		FrontScreen ac=new FrontScreen();	
		      		PassForm.this.dispose();
		      	}
		      	else
		      	{
		      		JOptionPane.showMessageDialog(PassForm.this,"         Please try Again !","Invalid Password !!!",JOptionPane.WARNING_MESSAGE);
		      	}
            }
    }
}