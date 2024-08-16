import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.applet.*;
import java.util.Date;
import java.util.Random;
import java.util.Calendar;
import java.util.*;
import java.text.*;
import java.sql.SQLException;


class FrontScreen extends JFrame implements ActionListener
{
	FrontScreen() 
	{
		super("Main Menu");	
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		
		JLabel menuname=new JLabel("Main Menu");
		JLabel menuname1=new JLabel("Super Market Management System");
		JButton opt1=new JButton("Customer Info");
		JButton opt2=new JButton("Product Info");
		JButton opt3=new JButton("Supplier Info");
		JButton opt4=new JButton("Trasaction");
		JButton opt5=new JButton("Reports");
		JButton opt6=new JButton("Exit");
		ContentPane.add(menuname);
		menuname.setFont(new Font("SansSerif", Font.BOLD, 25));
		menuname.setForeground(Color.black);
		menuname.setBounds(330,90,300,40);
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		
		ContentPane.add(opt1);
	    opt1.setBounds(30,175,200,50);
	    opt1.setForeground(Color.black);
		opt1.setFont(new Font("SansSerif", Font.BOLD, 18));
		ContentPane.add(opt2);
		opt2.setBounds(30,260,200,50);
		opt2.setForeground(Color.black);
		opt2.setFont(new Font("SansSerif", Font.BOLD, 18));
		ContentPane.add(opt3);
		opt3.setBounds(30,345,200,50);
		opt3.setForeground(Color.black);
		opt3.setFont(new Font("SansSerif", Font.BOLD, 18));
		ContentPane.add(opt4); 
		opt4.setBounds(560,175,200,50);
		opt4.setForeground(Color.black);
		opt4.setFont(new Font("SansSerif", Font.BOLD, 18));
		ContentPane.add(opt5);
		opt5.setBounds(560,260,200,50);
		opt5.setForeground(Color.black);
		opt5.setFont(new Font("SansSerif", Font.BOLD, 18));
		ContentPane.add(opt6);
		opt6.setBounds(560,345,200,50);
		opt6.setForeground(Color.black);
		opt6.setFont(new Font("SansSerif", Font.BOLD, 18));
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	  	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		ContentPane.setSize(800,570);
		setVisible(true);
		opt1.addActionListener(this);
		opt2.addActionListener(this);
		opt3.addActionListener(this);
		opt4.addActionListener(this);
		opt5.addActionListener(this);
		opt6.addActionListener(this); 
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Customer Info")
		{
			setVisible(false);
			CustMenu cm=new CustMenu();
			cm.setSize(800,570);
			cm.show();			  
		}	  
		else if(ae.getActionCommand()=="Product Info")
		{
			setVisible(false);
			ProdMenu pm=new ProdMenu();
			pm.setSize(800,570);
			pm.show();			
		}	
		else if(ae.getActionCommand()=="Supplier Info")
		{
			setVisible(false);
			SupMenu sp=new SupMenu();
			sp.setSize(800,570);
			sp.show();
		}	
		else if(ae.getActionCommand()=="Trasaction")
		{
			setVisible(false);
			TransMenu tm=new TransMenu();
			tm.setSize(800,570);
			tm.show();			
		}	
		else if(ae.getActionCommand()=="Reports")
		{
			setVisible(false);
			Report report=new Report();
			report.setSize(800,570);
			report.show();
		}	
		else if(ae.getActionCommand()=="Exit")
		{
			System.exit(0);
		}	
	}
}

//********************************************************************		

class CustMenu extends JFrame implements ActionListener
{
	public CustMenu()
	{
		super("Customer Information");
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Customer Info Menu");
		JLabel menuname1=new JLabel("Super Market Management System");
		JButton opt1=new JButton("Add Customer Info");
		JButton opt2=new JButton("Modify Customer Info");
		JButton opt3=new JButton("Delete Customer Info");
		JButton opt5=new JButton("Display Customer Info");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setBounds(280,90,300,40); 
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.BOLD, 25));
		ContentPane.add(opt1);
	    opt1.setBounds(30,195,200,50);
	    opt1.setForeground(Color.black);
	    opt1.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt2);
		opt2.setBounds(30,305,200,50);
		opt2.setForeground(Color.black);
		opt2.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt3);
		opt3.setBounds(560,195,200,50);
		opt3.setForeground(Color.black);
		opt3.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt5);
		opt5.setBounds(560,305,200,50);
		opt5.setForeground(Color.black);
		opt5.setFont(new Font("SansSerif",Font.BOLD,15));
		JButton opt4=new JButton("Back");
		ContentPane.add(opt4);
		opt4.setBounds(360,450,100,30);		
		opt4.setForeground(Color.black);
		setVisible(true);
		opt1.addActionListener(this);
		opt2.addActionListener(this);
		opt3.addActionListener(this);
		opt4.addActionListener(this);
		opt5.addActionListener(this);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Add Customer Info")
		{
			setVisible(false);
			AddCustomer addc=new AddCustomer();
			addc.setSize(800,570);
			addc.show();			  
		}	  
		else if(ae.getActionCommand()=="Modify Customer Info")
		{
			setVisible(false);
			ModifyCustomer modc=new ModifyCustomer();
			modc.setSize(800,570);
			modc.show();
		}	
		else if(ae.getActionCommand()=="Delete Customer Info")
		{
			setVisible(false);
			DeleteCustomer delc=new DeleteCustomer();
			delc.setSize(800,570);
			delc.show();			  						
		}
		else if(ae.getActionCommand()=="Display Customer Info")
		{
			DispCust dc=new DispCust();
			dc.setSize(800,570);
			dc.show();
		}	
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			FrontScreen tmp=new FrontScreen();
			tmp.setSize(800,570);	
			tmp.show();
		}
	}		
}

//*************************************************************************

class AddCustomer extends JFrame implements ActionListener
{
	JTextField cno,cname,cphone;
	JTextArea caddr;
	
	public AddCustomer()
	{
		super("Add Customer");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
			
		JLabel menuname=new JLabel("Add Customer Info");
		JLabel menuname1=new JLabel("Super Market Management");
		JLabel lb1=new JLabel("Customer Number:");
		cno=new JTextField();
		cno.setEditable(false);
		JLabel lb2=new JLabel("Customer Name:");
		cname=new JTextField();
		JLabel lb3=new JLabel("Address:");
		
		Box b=Box.createHorizontalBox();		
		caddr=new JTextArea();
		caddr.setLineWrap(true);
		caddr.setWrapStyleWord(true);
	//	int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
  	//	int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		b.add(new JScrollPane(caddr));
		
		
		JLabel lb4=new JLabel("Phone No.:");
		cphone=new JTextField();
		JButton btn1=new JButton("Ok");
		JButton back1=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,95,300,40); 
		ContentPane.add(lb1);
		ContentPane.add(cno);
		lb1.setBounds(15,170,120,20);
		lb1.setForeground(Color.black);
		cno.setBounds(150,170,80,20); 
		ContentPane.add(lb2);
		ContentPane.add(cname);
		lb2.setBounds(15,203,120,20);
		lb2.setForeground(Color.black);
		cname.setBounds(150,203,200,20); 
		ContentPane.add(lb3);
		ContentPane.add(b);
		lb3.setBounds(15,241,120,20);
		lb3.setForeground(Color.black);
		b.setBounds(150,241,250,50); 
		ContentPane.add(lb4);
		ContentPane.add(cphone);
		lb4.setBounds(15,355,120,20); 
		lb4.setForeground(Color.black);
		cphone.setBounds(150,355,100,20); 
		ContentPane.add(btn1);
		btn1.setBounds(350,410,60,20);
		btn1.setForeground(Color.black);
		ContentPane.add(back1);
		back1.setBounds(450,410,80,20);
		back1.setForeground(Color.black);
		setVisible(true);
		btn1.addActionListener(this);
		back1.addActionListener(this);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String url="jdbc:odbc:DB123";
				Connection con=DriverManager.getConnection(url);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("Select max(cno) from Cust");
				while(rs.next())
				{
					int n =Integer.parseInt(rs.getString(1));
					n=n+1;
					cno.setText(""+n);
				}
		    }
		    catch(SQLException e)
			{
				System.out.println("Error"+e);
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Error"+e);
			}
	
	}
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getActionCommand()=="Ok")
	    {
	    	
	    	if(cname.getText().equals("")||caddr.getText().equals("")||cphone.getText().equals(""))
	    	{
	    		JOptionPane.showMessageDialog(null,"Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);
	    		setVisible(true);
	    	}
			else
			{
				int v1=Integer.parseInt(cno.getText());
	    		String v2=cname.getText();
				String v3=caddr.getText();
				Double v4=Double.parseDouble(cphone.getText());
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url="jdbc:odbc:DB123";
					Connection con=DriverManager.getConnection(url);
					Statement stmt=con.createStatement();
					String qry="insert into Cust(cno, cname,caddr, cphone) "+
					" values("+v1+",'"+v2+"','"+v3+"',"+v4+")";
					stmt.executeUpdate(qry);
		    	}
		    	catch(SQLException e)
				{
						System.out.println("Error"+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("Error"+e);
				}	
				JOptionPane.showMessageDialog(null,"Record is Added","Successful",JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				CustMenu cm=new CustMenu();
				cm.setSize(800,570);
				cm.show();
			}
		}
			
		 if (ae.getActionCommand()=="Back")
		 {
		 	setVisible(false);
		 	CustMenu cm=new CustMenu();
			cm.setSize(800,570);
			cm.show();			  
		 } 		 	
	}
}

//********************************************************************

class ModifyCustomer extends JFrame implements ActionListener
{
	JTextField cno,cphone;
	JTextArea caddr;
	Choice cnm;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public ModifyCustomer()
	{
		super("Modify Customer");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Modify Customer Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Customer Number:");
		cno=new JTextField("");
		cno.setEditable(false);
		JLabel lb2=new JLabel("Customer Name:");
	    cnm=new Choice();
		JLabel lb3=new JLabel("Address:");
		
		Box b=Box.createHorizontalBox();
		caddr=new JTextArea("Address");
		caddr.setLineWrap(true);
		caddr.setWrapStyleWord(true);
		b.add(new JScrollPane(caddr));
		
		JLabel lb4=new JLabel("Phone No.:");
		cphone=new JTextField("Phone No.:");
		JButton btn1=new JButton("Ok");
		JButton back1=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,95,300,40); 
		ContentPane.add(lb1);
		ContentPane.add(cno);
		lb1.setBounds(15,170,120,20);
		lb1.setForeground(Color.black);
		cno.setBounds(150,170,80,20); 
		ContentPane.add(lb2);
		ContentPane.add(cnm);
		lb2.setBounds(15,203,120,20);
		lb2.setForeground(Color.black);
		cnm.setBounds(150,203,200,20); 
		
		ContentPane.add(lb3);
		ContentPane.add(b);
		
		lb3.setBounds(15,241,120,20);
		lb3.setForeground(Color.black);
		b.setBounds(150,241,250,50);
		 
		ContentPane.add(lb4);
		ContentPane.add(cphone);
		lb4.setBounds(15,355,120,20); 
		lb4.setForeground(Color.black);
		cphone.setBounds(150,355,100,20); 
		ContentPane.add(btn1);
		btn1.setBounds(350,410,60,20);
		btn1.setForeground(Color.black);
		ContentPane.add(back1);
		back1.setBounds(450,410,80,20);
		back1.setForeground(Color.black);
	
    	((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
	    try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Cust");
				
			
			while(rs.next())
			{
			 	
				
				String nm=rs.getString(3);
				cnm.add(""+nm);	
					
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}	 
		
		
		btn1.addActionListener(this);
		back1.addActionListener(this);
		cnm.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=cnm.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Cust where cname='"+s1+"'");
   						while(rs.next())
   						{
   							cno.setText(rs.getString(2));
   							caddr.setText(rs.getString(4));
   							cphone.setText(rs.getString(5)); 							
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		});
		setVisible(true);		
  }		
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getActionCommand()=="Ok")
		{
	 		if(caddr.getText().equals("")||cphone.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);	
				setVisible(true);
				
			}
			else
			{
				int v1=Integer.parseInt(cno.getText());
	   			String v3=caddr.getText();
				Double v4=Double.parseDouble(cphone.getText());
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					url="jdbc:odbc:DB123";
					con=DriverManager.getConnection(url);
					stmt=con.createStatement();
			   		String qry="UPDATE Cust SET caddr='"+v3+"',cphone="+v4+" WHERE Cust.cno="+v1+"";                       
					stmt.execute(qry);
				}	 
		   		catch(SQLException e)
				{
					System.out.println("Error"+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("Error"+e);
				} 
				JOptionPane.showMessageDialog(null,"Record is Modified","Successful",JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				CustMenu cm=new CustMenu();
				cm.setSize(800,570);
				cm.show();			 
			} 			 			  
		}	
			if(ae.getActionCommand()=="Back")
			{
				setVisible(false);
				CustMenu cm=new CustMenu();
				cm.setSize(800,570);
				cm.show();			 
			} 	
		    
	}
   	
}

//************************************************************************

class DeleteCustomer extends JFrame implements ActionListener
{
	JTextField cno;
	Choice cname;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public DeleteCustomer()
	{
		super("Delete Customer");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);

		JLabel menuname=new JLabel("Delete Customer Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Customer Number:");
		cno=new JTextField();
		cno.setEditable(false);
		JLabel lb2=new JLabel("Customer Name:");
		cname=new Choice();
		JButton btn1=new JButton("Ok");
		JButton back1=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,95,300,40); 
		ContentPane.add(lb1);
		ContentPane.add(cno);
		lb1.setForeground(Color.black);
		lb1.setBounds(15,180,170,20);
		cno.setBounds(160,180,60,20); 
		ContentPane.add(lb2);
		ContentPane.add(cname);
		lb2.setForeground(Color.black);
		lb2.setBounds(15,250,120,20);
		cname.setBounds(160,250,200,20);
		ContentPane.add(btn1);
		btn1.setForeground(Color.black);
		btn1.setFont(new Font("Sanserif",Font.BOLD,15));
		btn1.setBounds(350,410,60,20);
		ContentPane.add(back1);
		back1.setForeground(Color.black);
		back1.setFont(new Font("Sanserif",Font.BOLD,15));
		back1.setBounds(450,410,80,20);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Cust");
			while(rs.next())
			{
				String nm=rs.getString(3);
				cname.add(""+nm);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}
			 
		
		btn1.addActionListener(this);
		back1.addActionListener(this);
		cname.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=cname.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Cust where cname='"+s1+"'");
   						while(rs.next())
   						{
   							cno.setText(rs.getString(2));
   												
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		});
		setVisible(true);
	}	
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getActionCommand()=="Ok")
	    {
	    	int v1=Integer.parseInt(cno.getText());
	   	try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String url="jdbc:odbc:DB123";
				Connection con=DriverManager.getConnection(url);
				Statement stmt=con.createStatement();
				String qry="Delete from Cust where cno="+v1+"";
				stmt.executeUpdate(qry);
			}
		    catch(SQLException e)
			{
				System.out.println("Error:-\n"+e);
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Error:-"+e);
			}
			JOptionPane.showMessageDialog(null,"Record is Deleted","Successful",JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			CustMenu cm=new CustMenu();
			cm.setSize(800,570);
			cm.show();			 
		} 		 
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			CustMenu cm=new CustMenu();
			cm.setSize(800,570);
			cm.show();			 			
		}	  
	}
}

//*****************************************************************************
class DispCust extends JFrame
{
		String JDBC_DRIVER  ="sun.jdbc.odbc.JdbcOdbcDriver";
		String DB123_URL ="jdbc:odbc:DB123";
		String USERNAME ="";
		String PASSWORD="";
		ResultSetTableModel tableModel;
	public DispCust()
	{
		
		try
		{	
			String DEFAULT_QUERY ="Select cno,cname,cphone,caddr from Cust where cno>0";
			tableModel = new ResultSetTableModel(JDBC_DRIVER,DB123_URL,USERNAME,PASSWORD,DEFAULT_QUERY);
			JTable resultTable = new JTable(tableModel);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			add(new JScrollPane(resultTable),BorderLayout.CENTER);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			setSize(800,570);
			setVisible(true);
		}
		catch(Exception sqlException)
		{
			System.exit(1);
		}
	}
}

//*****************************************************************************

class ProdMenu extends JFrame implements ActionListener
{
	public ProdMenu()
	{
		super("Product Menu");
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Product Info Menu");
		JLabel menuname1=new JLabel("Super Market Management System");
		JButton opt1=new JButton("Add Product Info");
		JButton opt2=new JButton("Modify Product Info");
		JButton opt3=new JButton("Delete Product Info");
		ContentPane.add(menuname);
		menuname.setBounds(280,100,300,40); 
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.BOLD, 25));
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(opt1);
	    opt1.setBounds(295,175,200,50);
	    opt1.setForeground(Color.black);
	    opt1.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt2);
		opt2.setBounds(295,265,200,50);
		opt2.setForeground(Color.black);
		opt2.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt3);
		opt3.setBounds(295,355,200,50);
		opt3.setForeground(Color.black);
		opt3.setFont(new Font("SansSerif", Font.BOLD, 15));
		JButton opt4=new JButton("Back");
		ContentPane.add(opt4);
		opt4.setBounds(550,450,100,30);		
		opt4.setForeground(Color.black);
	//	opt4.setFont(new Font("SansSerif", Font.BOLD, 15));
		setVisible(true);
		opt1.addActionListener(this);
		opt2.addActionListener(this);
		opt3.addActionListener(this);
		opt4.addActionListener(this);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Add Product Info")
		{
			setVisible(false);
			AddProduct addp=new AddProduct();
			addp.setSize(800,570);
			addp.show();			  
		}	  
		else if(ae.getActionCommand()=="Modify Product Info")
		{
			setVisible(false);
			ModifyProduct modp=new ModifyProduct();
			modp.setSize(800,570);
			modp.show();					
		}	
		else if(ae.getActionCommand()=="Delete Product Info")
		{
			setVisible(false);
			DeleteProduct delp=new DeleteProduct();
			delp.setSize(800,570);
			delp.show();
		}	
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			FrontScreen tmp=new FrontScreen();
			tmp.setSize(800,570);	
			tmp.show();			
		}
	}		
}

//*******************************************************************

class AddProduct extends JFrame implements ActionListener
{
	JTextField pno,pname,qty,rt;
	JTextArea pdesc;
	public AddProduct()
	{
		super("Add Product");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Add Product Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Product Number"); 
		pno=new JTextField();
		pno.setEditable(false);
		JLabel lb2=new JLabel("Product Name");
		pname=new JTextField();
		JLabel lb3=new JLabel("Description");
		
		Box b=Box.createHorizontalBox();
		pdesc=new JTextArea();
		pdesc.setLineWrap(true);
		pdesc.setWrapStyleWord(true);
		b.add(new JScrollPane(pdesc));
		
		JLabel lb4=new JLabel("Quantity");
		qty=new JTextField();
		JLabel lb5=new JLabel("Net Rate");
		rt=new JTextField();
		JButton btn5=new JButton("Ok");
		JButton back5=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,100,300,40);  
		ContentPane.add(lb1);
		ContentPane.add(pno);
		lb1.setForeground(Color.black);
		lb1.setBounds( 15,170,150,20);
		pno.setBounds(170,170,60,20); 
		ContentPane.add(lb2);
		ContentPane.add(pname);
        lb2.setForeground(Color.black);
	    lb2.setBounds( 15,208,150,20);
		pname.setBounds(170,208,200,20); 
		ContentPane.add(lb3);
		ContentPane.add(b);
		lb3.setForeground(Color.black);
		lb3.setBounds( 15,246,150,20);
		b.setBounds(170,241,250,50);
		
		ContentPane.add(lb4);
		ContentPane.add(qty);
		lb4.setForeground(Color.black);
		lb4.setBounds( 15,314,150,20); 
		qty.setBounds(170,314,60,20); 
		ContentPane.add(lb5);
		ContentPane.add(rt);
		lb5.setForeground(Color.black);
		lb5.setBounds( 15,352,150,20); 
		rt.setBounds(170,352,80,20);
		ContentPane.add(btn5);
		btn5.setForeground(Color.black);
	//	btn5.setFont(new Font("SansSerif",Font.BOLD,15));
		btn5.setBounds(350,410,60,20);
		ContentPane.add(back5);
		back5.setForeground(Color.black);
	//	back5.setFont(new Font("SansSerif",Font.BOLD,15));
		back5.setBounds(450,410,80,20);
		setVisible(true);
	   	btn5.addActionListener(this);
		back5.addActionListener(this);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:DB123";
			Connection con=DriverManager.getConnection(url);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select max(pno) from Prod");
			while(rs.next())
			{
				int n =Integer.parseInt(rs.getString(1));
				n=n+1;
				pno.setText(""+n);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Error"+e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error"+e);
		}
	
	}	
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getActionCommand()=="Ok")
	    {
	    	if(pname.getText().equals("")||pdesc.getText().equals("")||qty.getText().equals("")||
	    	   rt.getText().equals(""))
	    	 {
	    	 	JOptionPane.showMessageDialog(null,"Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);
	    	 	setVisible(true);	
	    	 }
	    	 else
	    	 {  
	    		int v1=Integer.parseInt(pno.getText());
	    		String v2=pname.getText();
				String v3=pdesc.getText();
				int v4=Integer.parseInt(qty.getText());
				float v5=Float.parseFloat(rt.getText());
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url="jdbc:odbc:DB123";
					Connection con=DriverManager.getConnection(url);
					Statement stmt=con.createStatement();
					String qry="insert into Prod values("+v1+",'"+v2+"','"+v3+"',"+v4+","+v5+")";      
					stmt.executeUpdate(qry);
		    	}
		    	catch(SQLException e)
				{
					System.out.println("User Error1:-"+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("User Error2:-"+e);
				}
				JOptionPane.showMessageDialog(null,"Product is Added","Successful",JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				ProdMenu pm=new ProdMenu();
				pm.setSize(800,570);
				pm.show();			
			 }
		} 				 			 
		else if(ae.getActionCommand()=="Back")  
		{
			setVisible(false);
			ProdMenu pm=new ProdMenu();
			pm.setSize(800,570);
			pm.show();			
		} 	
	}
}  

//************************************************************************

class ModifyProduct extends JFrame implements ActionListener
{
	JTextField pno,qty,rt;
	JTextArea pdesc;
	Choice pname;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public ModifyProduct()
	{
		super("Modify Product");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Modify Product Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Product Number"); 
		pno=new JTextField("Number");
		pno.setEditable(false);
		JLabel lb2=new JLabel("Product Name");
		pname=new Choice();
		JLabel lb3=new JLabel("Description");
		
		Box b=Box.createHorizontalBox();
		pdesc=new JTextArea("Description");
		pdesc.setLineWrap(true);
		pdesc.setWrapStyleWord(true);
		b.add(new JScrollPane(pdesc));
		
		JLabel lb4=new JLabel("Quantity");
		qty=new JTextField("Quantity");
		JLabel lb5=new JLabel("Net Rate");
		rt=new JTextField("Rate");
		JButton btn5=new JButton("Ok");
		JButton back5=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,100,300,40);  
		ContentPane.add(lb1);
		ContentPane.add(pno);
		lb1.setForeground(Color.black);
		lb1.setBounds( 15,170,150,20);
		pno.setBounds(170,170,60,20); 
		ContentPane.add(lb2);
		ContentPane.add(pname);
        lb2.setForeground(Color.black);
	    lb2.setBounds( 15,208,150,20);
		pname.setBounds(170,208,200,20); 
		ContentPane.add(lb3);
		ContentPane.add(b);
		lb3.setForeground(Color.black);
		lb3.setBounds( 15,246,150,20);
		b.setBounds(170,241,250,50);
		
		ContentPane.add(lb4);
		ContentPane.add(qty);
		lb4.setForeground(Color.black);
		lb4.setBounds( 15,314,150,20); 
		qty.setBounds(170,314,60,20); 
		ContentPane.add(lb5);
		ContentPane.add(rt);
		lb5.setForeground(Color.black);
		lb5.setBounds( 15,352,150,20); 
		rt.setBounds(170,352,80,20);
		ContentPane.add(btn5);
		btn5.setForeground(Color.black);
     	btn5.setBounds(350,410,60,20);
		ContentPane.add(back5);
		back5.setForeground(Color.black);
		back5.setBounds(450,410,80,20);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Prod");
			while(rs.next())
			{
				String nm=rs.getString(2);
				pname.add(""+nm);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}	 
		
	
	   	btn5.addActionListener(this);
		back5.addActionListener(this);
		pname.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=pname.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							pno.setText(rs.getString(1));
   							pdesc.setText(rs.getString(3));
   							qty.setText(rs.getString(4));
   							rt.setText(rs.getString(5));
   							 							
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		setVisible(true);
		
	}	 
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Ok")
		{
	    	if(pdesc.getText().equals("")||qty.getText().equals("")||rt.getText().equals(""))
	    	{
	    			JOptionPane.showMessageDialog(null,"Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);
					setVisible(true);
	    	}
	    	else
	    	{
	    		int v1=Integer.parseInt(pno.getText());
	    		String v3=pdesc.getText();
				int v4=Integer.parseInt(qty.getText());
				float v5=Float.parseFloat(rt.getText());
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url="jdbc:odbc:DB123";
					Connection con=DriverManager.getConnection(url);
					Statement stmt=con.createStatement();
					String qry="UPDATE Prod SET pdesc='"+v3+"',pqty="+v4+",prate="+v5+" "+" WHERE Prod.pno="+v1+"";                       
					stmt.execute(qry);				
		    	} 
		    	catch(SQLException e)
				{
					System.out.println("User Error1:- "+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("User Error2:- "+e);
				} 
				JOptionPane.showMessageDialog(null,"Record is Modified","Successful",JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				ProdMenu pm=new ProdMenu();
				pm.setSize(800,570);
				pm.show();			
			}		
		} 		
		
		if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			ProdMenu pm=new ProdMenu();
			pm.setSize(800,570);
			pm.show();			
		} 		  
	}
}


//**********************************************************************

class DeleteProduct extends JFrame implements ActionListener
{
	JTextField pno;
	Choice pname;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public DeleteProduct()
	{
		super("Delete Product");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Delete Product Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Product Number:");
		pno=new JTextField("Number");
		pno.setEditable(false);
		JLabel lb2=new JLabel("Product Name:");
		pname=new Choice();
		JButton btn1=new JButton("Ok");
		JButton back1=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,100,300,40); 
		ContentPane.add(lb1);
		ContentPane.add(pno);
		lb1.setForeground(Color.black);
		lb1.setBounds(15,180,170,20);
		pno.setBounds(160,180,60,20); 
		ContentPane.add(lb2);
		ContentPane.add(pname);
		lb2.setForeground(Color.black);
		lb2.setBounds(15,250,120,20);
		pname.setBounds(160,250,200,20); 
		ContentPane.add(btn1);
		btn1.setForeground(Color.black);
		btn1.setBounds(350,410,60,20);
		ContentPane.add(back1);
		back1.setForeground(Color.black);
		back1.setBounds(450,410,80,20);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Prod");
			while(rs.next())
			{
				String nm=rs.getString(2);
				pname.add(""+nm);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}	 

		setVisible(true);
		btn1.addActionListener(this);
		back1.addActionListener(this);
		pname.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=pname.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							pno.setText(rs.getString(1));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
	}	
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getActionCommand()=="Ok")
	    {
	    	int v1=Integer.parseInt(pno.getText());
	    	try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String url="jdbc:odbc:DB123";
				Connection con=DriverManager.getConnection(url);
				Statement stmt=con.createStatement();
				String qry="Delete from Prod where pno="+v1+"";
				stmt.executeUpdate(qry);
		    }
		    catch(SQLException e)
			{
				System.out.println("Error:-\n"+e);
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Error"+e);
			}
			JOptionPane.showMessageDialog(null,"Record is Deleted","Successful",JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			ProdMenu pm=new ProdMenu();
			pm.setSize(800,570);
			pm.show();			
		} 
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			ProdMenu pm=new ProdMenu();
			pm.setSize(800,570);
			pm.show();			
		}
	}
} 


//***********************************************************************
class SupMenu extends JFrame implements ActionListener
{
	public SupMenu()
	{
		super("Supplier Menu");
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Supplier Info Menu");
		JLabel menuname1=new JLabel("Super Market Management System");
		JButton opt1=new JButton("Add Supplier Info");
		JButton opt2=new JButton("Modify Supplier Info");
		JButton opt3=new JButton("Delete Supplier Info");
		JButton opt5=new JButton("Display Supplier Info");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setBounds(280,100,300,40); 
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.BOLD, 25));
		ContentPane.add(opt1);
	    opt1.setBounds(30,195,200,50);
	    opt1.setForeground(Color.black);
	    opt1.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt2);
		opt2.setBounds(30,305,200,50);
		opt2.setForeground(Color.black);
		opt2.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt3);
		opt3.setBounds(560,195,200,50);
		opt3.setForeground(Color.black);
		opt3.setFont(new Font("SansSerif", Font.BOLD, 15));
		
		ContentPane.add(opt5);
		opt5.setBounds(560,305,200,50);
		opt5.setForeground(Color.black);
		opt5.setFont(new Font("SansSerif",Font.BOLD,15));
			
		JButton opt4=new JButton("Back");
		ContentPane.add(opt4);
		opt4.setBounds(360,450,100,30);		
		opt4.setForeground(Color.black);
	//	opt4.setFont(new Font("SansSerif", Font.BOLD, 15));
		setVisible(true);
		opt1.addActionListener(this);
		opt2.addActionListener(this);
		opt3.addActionListener(this);
		opt4.addActionListener(this);
		opt5.addActionListener(this);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Add Supplier Info")
		{
			setVisible(false);
			AddSupplier adds=new AddSupplier();
			adds.setSize(800,570);
			adds.show();				  
		}	  
		else if(ae.getActionCommand()=="Modify Supplier Info")
		{
			setVisible(false);
			ModifySupplier mods=new ModifySupplier();
			mods.setSize(800,570);
			mods.show();
		}	
		else if(ae.getActionCommand()=="Delete Supplier Info")
		{
			setVisible(false);
			DeleteSupplier dels=new DeleteSupplier();
			dels.setSize(800,570);
			dels.show();
		}	
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			FrontScreen tmp=new FrontScreen();
			tmp.setSize(800,570);	
			tmp.show();			
		}
		else if(ae.getActionCommand()=="Display Supplier Info")
		{
			DispSupp ds=new DispSupp();
			ds.setSize(800,500);
			ds.show();
		}
	}		
}

//*********************************************************************


class AddSupplier extends JFrame implements ActionListener
{
	JTextField sno,sname,sphone;
	JTextArea saddr;
	public AddSupplier()
	{
		super("Add Supplier");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Add Supplier Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Supplier Number:");
		sno=new JTextField();
		sno.setEditable(false);
		JLabel lb2=new JLabel("Supplier Name:");
		sname=new JTextField();
		JLabel lb3=new JLabel("Address:");
		Box b=Box.createHorizontalBox();
		saddr=new JTextArea();
		saddr.setLineWrap(true);
		saddr.setWrapStyleWord(true);
		b.add(new JScrollPane(saddr));
		
		JLabel lb4=new JLabel("Phone No.:");
		sphone=new JTextField();
		JButton btn1=new JButton("Ok");
		JButton back1=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,95,300,40); 
		ContentPane.add(lb1);
		ContentPane.add(sno);
		lb1.setBounds(15,170,120,20);
		lb1.setForeground(Color.black);
		sno.setBounds(150,170,80,20); 
		ContentPane.add(lb2);
		ContentPane.add(sname);
		lb2.setBounds(15,203,120,20);
		lb2.setForeground(Color.black);
		sname.setBounds(150,203,200,20); 
		ContentPane.add(lb3);
		ContentPane.add(b);
		b.setBounds(150,241,250,50);
		lb3.setBounds(15,241,120,20);
		lb3.setForeground(Color.black);
		 
		ContentPane.add(lb4);
		ContentPane.add(sphone);
		lb4.setBounds(15,355,120,20); 
		lb4.setForeground(Color.black);
		sphone.setBounds(150,355,100,20); 
		ContentPane.add(btn1);
		btn1.setBounds(350,410,60,20);
		btn1.setForeground(Color.black);
		ContentPane.add(back1);
		back1.setBounds(450,410,80,20);
		back1.setForeground(Color.black);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
	
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:DB123";
			Connection con=DriverManager.getConnection(url);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select max(sno) from Supp");
			while(rs.next())
			{
				int n =Integer.parseInt(rs.getString(1));
				n=n+1;
				sno.setText(""+n);
			}
	    }
	    catch(SQLException e)
		{
			System.out.println("Error"+e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error"+e);
		}
	
		setVisible(true);
		btn1.addActionListener(this);
		back1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getActionCommand()=="Ok")
	    {
	    	if(sname.getText().equals("")||saddr.getText().equals("")||sphone.getText().equals(""))
	    	{
	    		JOptionPane.showMessageDialog(null,"Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);
	    		setVisible(true);
	    	}
			else
			{
			
	    		int v1=Integer.parseInt(sno.getText());
	    		String v2=sname.getText();
				String v3=saddr.getText();
				Double v4=Double.parseDouble(sphone.getText());
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url="jdbc:odbc:DB123";
					Connection con=DriverManager.getConnection(url);
					Statement stmt=con.createStatement();
					String qry="insert into Supp(sno, sname,saddr, sphone) "+
					" values("+v1+",'"+v2+"','"+v3+"',"+v4+")";
					stmt.executeUpdate(qry);
		   		 }
		   		 catch(SQLException e)
				{
					System.out.println("Error"+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("Error"+e);
				}
				JOptionPane.showMessageDialog(null,"Supplier is Added","Successful",JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				SupMenu sp=new SupMenu();
				sp.setSize(800,570);
				sp.show();
			}	
			
		} 	
		if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			SupMenu sp=new SupMenu();
			sp.setSize(800,570);
			sp.show();
		} 	   
	}
}

//*******************************************************************************

class ModifySupplier extends JFrame implements ActionListener
{
	JTextField no,phone;
	JTextArea addr;
	Choice name;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public ModifySupplier()
	{
		super("Modify Supplier");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Modify Supplier Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Supplier Number:");
		no=new JTextField();
		no.setEditable(false);
		JLabel lb2=new JLabel("Supplier Name:");
		name=new Choice();
		JLabel lb3=new JLabel("Address:");
		Box b=Box.createHorizontalBox();
		addr=new JTextArea("Address");
		addr.setLineWrap(true);
		addr.setWrapStyleWord(true);
		b.add(new JScrollPane(addr));
		
		JLabel lb4=new JLabel("Phone No.:");
		phone=new JTextField();
		JButton btn1=new JButton("Ok");
		JButton back1=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,95,300,40); 
		ContentPane.add(lb1);
		ContentPane.add(no);
		lb1.setBounds(15,170,120,20);
		lb1.setForeground(Color.black);
		no.setBounds(150,170,80,20); 
		ContentPane.add(lb2);
		ContentPane.add(name);
		lb2.setBounds(15,203,120,20);
		lb2.setForeground(Color.black);
		name.setBounds(150,203,200,20); 
		ContentPane.add(lb3);
		ContentPane.add(b);
		lb3.setBounds(15,241,120,20);
		lb3.setForeground(Color.black);
		b.setBounds(150,241,250,50);
		ContentPane.add(lb4);
		ContentPane.add(phone);
		lb4.setBounds(15,355,120,20); 
		lb4.setForeground(Color.black);
		phone.setBounds(150,355,100,20); 
		ContentPane.add(btn1);
		btn1.setBounds(350,410,60,20);
		btn1.setForeground(Color.black);
		ContentPane.add(back1);
		back1.setBounds(450,410,80,20);
		back1.setForeground(Color.black);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Supp");
			while(rs.next())
			{
				String nm=rs.getString(2);
				name.add(""+nm);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}	 
		setVisible(true);
		btn1.addActionListener(this);
		back1.addActionListener(this);
		name.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Supp where sname='"+s1+"'");
   						while(rs.next())
   						{
   							no.setText(rs.getString(1));
   							addr.setText(rs.getString(3));
   							phone.setText(rs.getString(4)); 							
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
	}
	public void actionPerformed(ActionEvent ae)
	{
	    if(ae.getActionCommand()=="Ok")
	    {
	    	if(addr.getText().equals("")||phone.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);	
				setVisible(true);
				
			}
			else
			{
	    		int v1=Integer.parseInt(no.getText());
	    		String v3=addr.getText();
				Double v4=Double.parseDouble(phone.getText());
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url="jdbc:odbc:DB123";
					Connection con=DriverManager.getConnection(url);
					Statement stmt=con.createStatement();
					String qry="UPDATE Supp SET saddr='"+v3+"',sphone="+v4+" WHERE Supp.sno="+v1+"";                       
					stmt.execute(qry);
					System.out.println("Record is updated");
		    	} 
		    	catch(SQLException e)
				{
					System.out.println("Error"+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("Error"+e);
				} 
				JOptionPane.showMessageDialog(null,"Record is Modified","Successful",JOptionPane.INFORMATION_MESSAGE);
				setVisible(false);
				SupMenu sp=new SupMenu();
				sp.setSize(800,570);
				sp.show();
			}
		}	 		 			  
		if(ae.getActionCommand()=="Back") 
		{
			setVisible(false);
			SupMenu sp=new SupMenu();
			sp.setSize(800,570);
			sp.show();
		} 
	}
}


//******************************************************************


class DeleteSupplier extends JFrame implements ActionListener
{
	JTextField sno;
	Choice sname;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public DeleteSupplier()
	{
		super("Delete Supplier");
		Container ContentPane=getContentPane(); 
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Delete Supplier Info");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel lb1=new JLabel("Supplier Number:");
		JLabel lb2=new JLabel("Supplier Name:");
		sno=new JTextField();
		sno.setEditable(false);
		sname=new Choice();
		JButton btn1=new JButton("Ok");
		JButton back1=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 25));
		menuname.setBounds(280,95,300,40); 
		ContentPane.add(lb1);
		ContentPane.add(sno);
		ContentPane.add(lb2);
		ContentPane.add(sname);
		lb1.setForeground(Color.black);
		lb1.setBounds(15,180,170,20);
		sno.setBounds(160,180,60,20); 
		lb2.setBounds(15,250,170,20);
		sname.setBounds(160,250,150,20); 
		ContentPane.add(btn1);
		btn1.setForeground(Color.black);
		btn1.setBounds(350,410,60,20);
		ContentPane.add(back1);
		back1.setForeground(Color.black);
		back1.setBounds(450,410,80,20);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Supp");
			while(rs.next())
			{
				String nm=rs.getString(2);
				sname.add(""+nm);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}	 
			
		setVisible(true);
		btn1.addActionListener(this);
		back1.addActionListener(this);
		sname.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=sname.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Supp where sname='"+s1+"'");
   						while(rs.next())
   						{
   							sno.setText(rs.getString(1));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
	}	
	public void actionPerformed(ActionEvent ae)
	{
	       if(ae.getActionCommand()=="Ok")
	    {
	    	int v1=Integer.parseInt(sno.getText());
	    	try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String url="jdbc:odbc:DB123";
				Connection con=DriverManager.getConnection(url);
				Statement stmt=con.createStatement();
				String qry="Delete from Supp where sno="+v1;
				stmt.executeUpdate(qry);
		    }
		    catch(SQLException e)
			{
				System.out.println("Error:-\n"+e);
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Error"+e);
			}
			JOptionPane.showMessageDialog(null,"Record is deleted","Successful",JOptionPane.INFORMATION_MESSAGE);
			setVisible(false);
			SupMenu sp=new SupMenu();
			sp.setSize(800,570);
			sp.show();
		} 		 			 
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			SupMenu sp=new SupMenu();
			sp.setSize(800,570);
			sp.show();
		} 		  
	}
}

//**********************************************************************

class DispSupp extends JFrame
{
		String JDBC_DRIVER  ="sun.jdbc.odbc.JdbcOdbcDriver";
		String DB123_URL ="jdbc:odbc:DB123";
		String USERNAME ="";
		String PASSWORD="";
		ResultSetTableModel tableModel;
	public DispSupp()
  	{
		try
		{	
			String DEFAULT_QUERY ="Select sno,sname,sphone,saddr from Supp";
			tableModel = new ResultSetTableModel(JDBC_DRIVER,DB123_URL,USERNAME,PASSWORD,DEFAULT_QUERY);
			JTable resultTable = new JTable(tableModel);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			add(new JScrollPane(resultTable),BorderLayout.CENTER);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			setSize(800,570);
			setVisible(true);
		}
		catch(Exception sqlException)
		{
			System.exit(1);
		}
  	}
}


//**********************************************************************

class TransMenu extends JFrame implements ActionListener
{
	public TransMenu()
	{
		super("Transaction Menu");
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Transaction Menu");
		JLabel menuname1=new JLabel("Super Market Management System");
		JButton opt1=new JButton("Sale Products");
		JButton opt2=new JButton("Purchase Product");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setBounds(280,100,300,40); 
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.BOLD, 25));
		ContentPane.add(opt1);
	    opt1.setBounds(100,250,200,50);
	    opt1.setForeground(Color.black);
	    opt1.setFont(new Font("SansSerif", Font.BOLD, 18));
		ContentPane.add(opt2);
		opt2.setBounds(500,250,200,50);
		opt2.setForeground(Color.black);
		opt2.setFont(new Font("SansSerif", Font.BOLD, 18));
		JButton opt4=new JButton("Back");
		ContentPane.add(opt4);
		opt4.setBounds(350,450,100,30);		
		opt4.setForeground(Color.black);
		setVisible(true);
		opt1.addActionListener(this);
		opt2.addActionListener(this);
		opt4.addActionListener(this);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Sale Products")
		{
			setVisible(false);
			Sales sale=new Sales();
			sale.setSize(800,570);
			sale.show();			  
		}	  
		else if(ae.getActionCommand()=="Purchase Product")
		{
			setVisible(false);
			Purchase pur=new Purchase();
			pur.setSize(800,570);
			pur.show();
		}	
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			FrontScreen tmp=new FrontScreen();
			tmp.setSize(800,570);	
			tmp.show();
		}
	}		
}


//*********************************************************************


class Sales extends JFrame implements ActionListener
{
	JTextField item1,item3,item4,item5,item6,item8,item9,item10,
			  item11,item13,item14,item15,item16,item18,item19,item20,
			  item21,item23,item24,item25,item26,item28,item29,item30,
			  bill,date,csno,total;
	Choice csname,name1,name2,name3,name4,name5,name6;
	String url;
	Connection con;
	Statement stmt;
	ResultSet rs;
	public Sales()
	{
		super("Sales Bill");
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		Date dat=new Date();
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		JLabel menuname=new JLabel("Sales Transaction");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel bl=new JLabel("Bill No.");
		bill=new JTextField();
		bill.setEditable(false);
		JLabel dt=new JLabel("Date");
		date=new JTextField(""+df.format(dat));
		date.setEditable(false);
		JLabel l1=new JLabel("Cust No");
		csno=new JTextField();
		csno.setEditable(false);
		JLabel l2=new JLabel("Cust Name");
		csname=new Choice();
		JLabel tmp1=new JLabel("*****************************************************************************************************************************");
		JLabel tmp2=new JLabel("*****************************************************************************************************************************");
		JLabel tmp3=new JLabel("Item No.");
		JLabel tmp4=new JLabel("Item Name.");
		JLabel tmp5=new JLabel("Quantity");
		JLabel tmp6=new JLabel("Net Rate");
		JLabel tmp7=new JLabel("Amount");
		item1 =new JTextField();
		item1.setEditable(false);
		name1 =new Choice();
		item3 =new JTextField();
		item4 =new JTextField();
		item4.setEditable(false);
		item5 =new JTextField();
		item5.setEditable(false);
		item6 =new JTextField();
		item6.setEditable(false);
		name2 =new Choice();
		item8 =new JTextField();
		item9 =new JTextField();
		item9.setEditable(false);
		item10=new JTextField();
		item10.setEditable(false);
		item11=new JTextField();
		item11.setEditable(false);
		name3 =new Choice();
		item13=new JTextField();
		item14=new JTextField();
		item14.setEditable(false);
		item15=new JTextField();
		item15.setEditable(false);
		item16=new JTextField();
		item16.setEditable(false);
		name4 =new Choice();
		item18=new JTextField();
		item19=new JTextField();
		item19.setEditable(false);
		item20=new JTextField();
		item20.setEditable(false);
		item21=new JTextField();
		item21.setEditable(false);
		name5 =new Choice();
		item23=new JTextField();
		item24=new JTextField();
		item24.setEditable(false);
		item25=new JTextField();
		item25.setEditable(false);
		item26=new JTextField();
		item26.setEditable(false);
		name6 =new Choice();
		item28=new JTextField();
		item29=new JTextField();
		item29.setEditable(false);
		item30=new JTextField();
		item30.setEditable(false);
		JButton lb=new JButton("Total");
		total=new JTextField();
		total.setEditable(false);
		JButton btn19=new JButton("Ok");
		JButton back19=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 20));
		menuname.setBounds(280,65,300,40); 
		ContentPane.add(bl);
		ContentPane.add(bill);
		bl.setFont(new Font("SansSerif",Font.BOLD,15));
		bl.setForeground(Color.black);
		bl.setBounds(52,110,60,20);
		bill.setBounds(140,110,80,20);						
		ContentPane.add(dt);
		ContentPane.add(date);
		dt.setFont(new Font("SansSerif",Font.BOLD,15));
		dt.setForeground(Color.black);
		dt.setBounds(585,110,80,20);
		date.setBounds(650,110,80,20);
		ContentPane.add(l1);
		ContentPane.add(csno);
		l1.setFont(new Font("SansSerif",Font.BOLD,15));
		l1.setForeground(Color.black);
		l1.setBounds( 50,150,80,20);
		csno.setBounds(140,150,80,20);
		ContentPane.add(l2);
		ContentPane.add(csname);
		l2.setFont(new Font("SansSerif",Font.BOLD,15));
		l2.setForeground(Color.black);
		l2.setBounds(350,150, 80,20);
		csname.setBounds(460,150,270,20);
		ContentPane.add(tmp1);
		tmp1.setForeground(Color.black);
		tmp1.setBounds(10,190,750,20);
		ContentPane.add(tmp2);
		tmp2.setForeground(Color.black);
		tmp2.setBounds(10,200,750,20);
		ContentPane.add(tmp3);
		tmp3.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp3.setForeground(Color.black);
		tmp3.setBounds(30,220,70,20);
		ContentPane.add(tmp4);
		tmp4.setForeground(Color.black);
		tmp4.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp4.setBounds(190,220,150,20);
		ContentPane.add(tmp5);
		tmp5.setForeground(Color.black);
		tmp5.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp5.setBounds(350,220,80,20);
		ContentPane.add(tmp6);
		tmp6.setForeground(Color.black);
		tmp6.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp6.setBounds(480,220,150,20);
		ContentPane.add(tmp7);
		tmp7.setForeground(Color.black);
		tmp7.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp7.setBounds(620,220,150,20);
		ContentPane.add(item1);
		ContentPane.add(name1);
		ContentPane.add(item3);
		ContentPane.add(item4);
		ContentPane.add(item5);
		ContentPane.add(item6);
		ContentPane.add(name2);
		ContentPane.add(item8);
		ContentPane.add(item9);
		ContentPane.add(item10);
		ContentPane.add(item11);
		ContentPane.add(name3);
		ContentPane.add(item13);
		ContentPane.add(item14);
		ContentPane.add(item15);
		ContentPane.add(item16);
		ContentPane.add(name4);
		ContentPane.add(item18);
		ContentPane.add(item19);
		ContentPane.add(item20);
		ContentPane.add(item21);
		ContentPane.add(name5);
		ContentPane.add(item23);
		ContentPane.add(item24);
		ContentPane.add(item25);
		ContentPane.add(item26);
		ContentPane.add(name6);
		ContentPane.add(item28);
		ContentPane.add(item29);
		ContentPane.add(item30);
		item1.setBounds(18,250,80,20);
		name1.setBounds(115,250,220,20);
		item3.setBounds(355,250,80,20);
		item4.setBounds(460,250,100,20);
		item5.setBounds(600,250,100,20);
		item6.setBounds(18,285,80,20);
		name2.setBounds(115,285,220,20);
		item8.setBounds(355,285,80,20);
		item9.setBounds(460,285,100,20);
		item10.setBounds(600,285,100,20);
		item11.setBounds(18,320,80,20);
		name3.setBounds(115,320,220,20);
		item13.setBounds(355,320,80,20);
		item14.setBounds(460,320,100,20);
		item15.setBounds(600,320,100,20);
		item16.setBounds(18,355,80,20);
		name4.setBounds(115,355,220,20);
		item18.setBounds(355,355,80,20);
		item19.setBounds(460,355,100,20);
		item20.setBounds(600,355,100,20);
		item21.setBounds(18,390,80,20);
		name5.setBounds(115,390,220,20);
		item23.setBounds(355,390,80,20);
		item24.setBounds(460,390,100,20);
		item25.setBounds(600,390,100,20);
		item26.setBounds(18,425,80,20);
		name6.setBounds(115,425,220,20);
		item28.setBounds(355,425,80,20);
		item29.setBounds(460,425,100,20);
		item30.setBounds(600,425,100,20);
		item1.setText("0");
		item3.setText("0");
		item4.setText("0");
		item5.setText("0");
		item6.setText("0");
		item8.setText("0");
		item9.setText("0");
		item10.setText("0");
		item11.setText("0");
		item13.setText("0");
		item14.setText("0");
		item15.setText("0");
		item16.setText("0");
		item18.setText("0");
		item19.setText("0");
		item20.setText("0");
		item21.setText("0");
		item23.setText("0");
		item24.setText("0");
		item25.setText("0");
		item26.setText("0");
		item28.setText("0");
		item29.setText("0");
		item30.setText("0");
		total.setText("0");
				
		ContentPane.add(lb);
		ContentPane.add(total);
		lb.setForeground(Color.black);
		lb.setBounds(460,455,100,20);
		total.setBounds(600,455,100,20);
		ContentPane.add(btn19);
		ContentPane.add(back19);
		btn19.setForeground(Color.black);
		btn19.setBounds(500,500,80,20);
		back19.setForeground(Color.black);
		back19.setBounds(600,500,80,20);
			
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		//For Customer Name
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Cust");
			while(rs.next())
			{
				String nm=rs.getString(3);
				csname.add(""+nm);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}	 
		
		//For Bill No
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				String url="jdbc:odbc:DB123";
				Connection con=DriverManager.getConnection(url);
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("Select max(billno) from Sales_trans");
				while(rs.next())
				{
					int n =Integer.parseInt(rs.getString(1));
					n=n+1;
					bill.setText(""+n);
				}
		    }
		    catch(SQLException e)
			{
				System.out.println("Error"+e);
			}
			catch(ClassNotFoundException e)
			{
				System.out.println("Error"+e);
			}
			
			//For Product name in items 	
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				url="jdbc:odbc:DB123";
				con=DriverManager.getConnection(url);
				stmt=con.createStatement();
				rs=stmt.executeQuery("select * from Prod");
				while(rs.next())
				{
					String nm=rs.getString(2);
					name1.add(""+nm);	
					name2.add(""+nm);	
					name3.add(""+nm);	
					name4.add(""+nm);	
					name5.add(""+nm);	
					name6.add(""+nm);	
				}
			}
			catch(Exception ae)
			{
				System.out.println("Error Item"+ae);
			}
				 
		lb.addActionListener(this);
		btn19.addActionListener(this);
		back19.addActionListener(this);
		//For Cno & Cname
		csname.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=csname.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Cust where cname='"+s1+"'");
   						while(rs.next())
   						{
   							csno.setText(rs.getString(2));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		//For Rate & Pno
		name1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name1.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item1.setText(rs.getString(1));
   							item4.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name2.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item6.setText(rs.getString(1));
   							item9.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name3.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name3.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item11.setText(rs.getString(1));
   							item14.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name4.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name4.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item16.setText(rs.getString(1));
   							item19.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name5.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name5.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item21.setText(rs.getString(1));
   							item24.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name6.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name6.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item26.setText(rs.getString(1));
   							item29.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		ContentPane.setSize(800,570);
		setVisible(true);		
	}
		
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Total")
		{
			Float qty1=Float.parseFloat(item3.getText());
			Float rt1=Float.parseFloat(item4.getText());
			Float qty2=Float.parseFloat(item8.getText());
			Float rt2=Float.parseFloat(item9.getText());
			Float qty3=Float.parseFloat(item13.getText());
			Float rt3=Float.parseFloat(item14.getText());
			Float qty4=Float.parseFloat(item18.getText());
			Float rt4=Float.parseFloat(item19.getText());
			Float qty5=Float.parseFloat(item23.getText());
			Float rt5=Float.parseFloat(item24.getText());
			Float qty6=Float.parseFloat(item28.getText());
			Float rt6=Float.parseFloat(item29.getText());
			
			Float amt1 = qty1 * rt1;
			Float amt2 = qty2 * rt2;
			Float amt3 = qty2 * rt3;
			Float amt4 = qty4 * rt4;
			Float amt5 = qty5 * rt5;
			Float amt6 = qty6 * rt6;
			
			Float tot=amt1+amt2+amt3+amt4+amt5+amt6;
			
			item5.setText(""+amt1);
			item10.setText(""+amt2);
			item15.setText(""+amt3);
			item20.setText(""+amt4);
			item25.setText(""+amt5);
			item30.setText(""+amt6);
			
			total.setText(""+tot);
			
			
		}
		
		if(ae.getActionCommand()=="Ok")
		{
			if(csno.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Name Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);	
				setVisible(true);
				
			}
			else
			{
				int billno=Integer.parseInt(bill.getText());
				int custno=Integer.parseInt(csno.getText());
				String custnm=csname.getSelectedItem();
				String sdate=date.getText();
				
				int v1=Integer.parseInt(item1.getText());
				String v2=name1.getSelectedItem(); 	
				int v3=Integer.parseInt(item3.getText());
				float v4=Float.parseFloat(item4.getText());  
				float v5=Float.parseFloat(item5.getText());
							
				int v6=Integer.parseInt(item6.getText());
				String v7=name2.getSelectedItem();
				int v8=Integer.parseInt(item8.getText());
				float v9=Float.parseFloat(item9.getText());  
				float v10=Float.parseFloat(item10.getText());
				
				int v11=Integer.parseInt(item11.getText());
				String v12=name3.getSelectedItem();
				int v13=Integer.parseInt(item13.getText());
				float v14=Float.parseFloat(item14.getText()); 
				float v15=Float.parseFloat(item15.getText());
							
				int v16=Integer.parseInt(item16.getText());
				String v17=name4.getSelectedItem();
				int v18=Integer.parseInt(item18.getText());
				float v19=Float.parseFloat(item19.getText());  
				float v20=Float.parseFloat(item20.getText());
							
				int v21=Integer.parseInt(item21.getText());
				String v22=name5.getSelectedItem();
				int v23=Integer.parseInt(item23.getText());
				float v24=Float.parseFloat(item24.getText());  
				float v25=Float.parseFloat(item25.getText());
							
				int v26=Integer.parseInt(item26.getText());
				String v27=name6.getSelectedItem();
				int v28=Integer.parseInt(item28.getText());
				float v29=Float.parseFloat(item29.getText());  
				float v30=Float.parseFloat(item30.getText());
				float totalall=Float.parseFloat(total.getText());
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url="jdbc:odbc:DB123";
					Connection con=DriverManager.getConnection(url);
					Statement stmt=con.createStatement();
					String qry="insert into Sales_trans values ("+billno+","+custno+",'"+custnm+"','"+sdate+"',"+v1+",'"+v2+"',"+v3+","+v4+","+v5+","+v6+",'"+v7+"',"+v8+","+v9+","+v10+","+v11+",'"+v12+"',"+v13+","+v14+","+v15+","+v16+",'"+v17+"',"+v18+","+v19+","+v20+","+v21+",'"+v22+"',"+v23+","+v24+","+v25+","+v26+",'"+v27+"',"+v28+","+v29+","+v30+","+totalall+")";
					stmt.executeQuery(qry); 
					qry="Select pqty from Prod where pno="+v1+"";
					ResultSet rs=stmt.executeQuery(qry);
					while(rs.next())
					{
						int tq=Integer.parseInt(rs.getString(1));
						tq=tq-v3;
						qry="update Prod set pqty="+tq+"where pno="+v1+"";
						stmt.executeQuery(qry);
					}
					 
				}
				catch(SQLException e)
				{
					System.out.println("User Error1 :-"+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("User Error2 :-  "+e);
				}
				
				setVisible(false);
				JOptionPane.showMessageDialog(null,"Sales Bill Created","Successful",JOptionPane.INFORMATION_MESSAGE);
				TransMenu tm=new TransMenu();
				tm.setSize(800,570);
				tm.show();
			}		
		}	  	  
		if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			TransMenu tm=new TransMenu();
			tm.setSize(800,570);
			tm.show();		
		}
	}		
} 


//**********************************************************************



class Purchase extends JFrame implements ActionListener
{
	String url;
	Statement stmt;
	Connection con;
	ResultSet rs;
	JTextField item1,item3,item4,item5,item6,item8,item9,item10,
			  item11,item13,item14,item15,item16,item18,item19,item20,
			  item21,item23,item24,item25,item26,item28,item29,item30,
			  transno,bill,date,spno,total,txt;
	Choice spname,name1,name2,name3,name4,name5,name6;
	public Purchase()
	{
		super("Purchase Transaction");
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Purchase Transaction");
		JLabel menuname1=new JLabel("Super Market Management System");
		JLabel b0=new JLabel("Trans No");
		transno=new JTextField();
		transno.setEditable(false);
		JLabel bl=new JLabel("Bill No.");
		bill=new JTextField();
		bill.setEditable(false);
		JLabel dt=new JLabel("Date");
		Date dat=new Date();
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT);
		date=new JTextField(""+df.format(dat));
		date.setEditable(false);		
		JLabel l1=new JLabel("Supp No");
		spno=new JTextField();
		spno.setEditable(false);
		JLabel l2=new JLabel("Supp Name");
		spname=new Choice();
		JLabel tmp1=new JLabel("*****************************************************************************************************************************");
		JLabel tmp2=new JLabel("*****************************************************************************************************************************");
		JLabel tmp3=new JLabel("Item No.");
		JLabel tmp4=new JLabel("Item Name.");
		JLabel tmp5=new JLabel("Quantity");
		JLabel tmp6=new JLabel("Net Rate");
		JLabel tmp7=new JLabel("Amount");
	
		item1 =new JTextField();
		item1.setEditable(false);
		name1 =new Choice();
		item3 =new JTextField();
		item4 =new JTextField();
		item4.setEditable(false);
		item5 =new JTextField();
		item5.setEditable(false);
		item6 =new JTextField();
		item6.setEditable(false);
		name2 =new Choice();
		item8 =new JTextField();
		item9 =new JTextField();
		item9.setEditable(false);
		item10=new JTextField();
		item10.setEditable(false);
		item11=new JTextField();
		item11.setEditable(false);
		name3 =new Choice();
		item13=new JTextField();
		item14=new JTextField();
		item14.setEditable(false);
		item15=new JTextField();
		item15.setEditable(false);
		item16=new JTextField();
		item16.setEditable(false);
		name4 =new Choice();
		item18=new JTextField();
		item19=new JTextField();
		item19.setEditable(false);
		item20=new JTextField();
		item20.setEditable(false);
		item21=new JTextField();
		item21.setEditable(false);
		name5 =new Choice();
		item23=new JTextField();
		item24=new JTextField();
		item24.setEditable(false);
		item25=new JTextField();
		item25.setEditable(false);
		item26=new JTextField();
		item26.setEditable(false);
		name6 =new Choice();
		item28=new JTextField();
		item29=new JTextField();
		item29.setEditable(false);
		item30=new JTextField();
		item30.setEditable(false);
		
		JButton lb=new JButton("Total");
		total=new JTextField();
		total.setEditable(false);
		JButton btn19=new JButton("Ok");
		JButton back19=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,0,500,80);  
		ContentPane.add(menuname);
		menuname.setForeground(Color.black);
		menuname.setFont(new Font("SansSerif", Font.ITALIC, 20));
		menuname.setBounds(280,40,300,40);
		ContentPane.add(b0);
		ContentPane.add(transno);
		b0.setFont(new Font("SansSerif",Font.BOLD,15));
		b0.setForeground(Color.black);
		b0.setBounds(52,80,80,20);
		transno.setBounds(140,80,80,20);			 
		ContentPane.add(bl);
		ContentPane.add(bill);
		bl.setFont(new Font("SansSerif",Font.BOLD,15));
		bl.setForeground(Color.black);
		bl.setBounds(52,120,80,20);
		bill.setBounds(140,120,80,20);						
		ContentPane.add(dt);
		ContentPane.add(date);
		dt.setFont(new Font("SansSerif",Font.BOLD,15));
		dt.setForeground(Color.black);
		dt.setBounds(600,120,80,20);
		date.setBounds(650,120,80,20);
		ContentPane.add(l1);
		ContentPane.add(spno);
		l1.setFont(new Font("SansSerif",Font.BOLD,15));
		l1.setForeground(Color.black);
		l1.setBounds( 50,160,80,20);
		spno.setBounds(140,160,80,20);
		ContentPane.add(l2);
		ContentPane.add(spname);
		l2.setFont(new Font("SansSerif",Font.BOLD,15));
		l2.setForeground(Color.black);
		l2.setBounds(420,160, 100,20);
		spname.setBounds(530,160,200,20);
		ContentPane.add(tmp1);
		tmp1.setForeground(Color.black);
		tmp1.setBounds(10,185,750,20);
		ContentPane.add(tmp2);
		tmp2.setForeground(Color.black);
		tmp2.setBounds(10,195,750,20);
		ContentPane.add(tmp3);
		tmp3.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp3.setForeground(Color.black);
		tmp3.setBounds(30,215,70,20);
		ContentPane.add(tmp4);
		tmp4.setForeground(Color.black);
		tmp4.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp4.setBounds(190,215,150,20);
		ContentPane.add(tmp5);
		tmp5.setForeground(Color.black);
		tmp5.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp5.setBounds(350,215,80,20);
		ContentPane.add(tmp6);
		tmp6.setForeground(Color.black);
		tmp6.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp6.setBounds(480,215,150,20);
		ContentPane.add(tmp7);
		tmp7.setForeground(Color.black);
		tmp7.setFont(new Font("SansSerif",Font.BOLD,15));
		tmp7.setBounds(620,215,150,20);
		ContentPane.add(item1);
		ContentPane.add(name1);
		ContentPane.add(item3);
		ContentPane.add(item4);
		ContentPane.add(item5);
		ContentPane.add(item6);
		ContentPane.add(name2);
		ContentPane.add(item8);
		ContentPane.add(item9);
		ContentPane.add(item10);
		ContentPane.add(item11);
		ContentPane.add(name3);
		ContentPane.add(item13);
		ContentPane.add(item14);
		ContentPane.add(item15);
		ContentPane.add(item16);
		ContentPane.add(name4);
		ContentPane.add(item18);
		ContentPane.add(item19);
		ContentPane.add(item20);
		ContentPane.add(item21);
		ContentPane.add(name5);
		ContentPane.add(item23);
		ContentPane.add(item24);
		ContentPane.add(item25);
		ContentPane.add(item26);
		ContentPane.add(name6);
		ContentPane.add(item28);
		ContentPane.add(item29);
		ContentPane.add(item30);
		item1.setBounds(18,250,80,20);
		name1.setBounds(115,250,220,20);
		item3.setBounds(355,250,80,20);
		item4.setBounds(460,250,100,20);
		item5.setBounds(600,250,100,20);
		item6.setBounds(18,285,80,20);
		name2.setBounds(115,285,220,20);
		item8.setBounds(355,285,80,20);
		item9.setBounds(460,285,100,20);
		item10.setBounds(600,285,100,20);
		item11.setBounds(18,320,80,20);
		name3.setBounds(115,320,220,20);
		item13.setBounds(355,320,80,20);
		item14.setBounds(460,320,100,20);
		item15.setBounds(600,320,100,20);
		item16.setBounds(18,355,80,20);
		name4.setBounds(115,355,220,20);
		item18.setBounds(355,355,80,20);
		item19.setBounds(460,355,100,20);
		item20.setBounds(600,355,100,20);
		item21.setBounds(18,390,80,20);
		name5.setBounds(115,390,220,20);
		item23.setBounds(355,390,80,20);
		item24.setBounds(460,390,100,20);
		item25.setBounds(600,390,100,20);
		item26.setBounds(18,425,80,20);
		name6.setBounds(115,425,220,20);
		item28.setBounds(355,425,80,20);
		item29.setBounds(460,425,100,20);
		item30.setBounds(600,425,100,20);
		
		item1.setText("0");
		item3.setText("0");
		item4.setText("0");
		item5.setText("0");
		item6.setText("0");
		item8.setText("0");
		item9.setText("0");
		item10.setText("0");
		item11.setText("0");
		item13.setText("0");
		item14.setText("0");
		item15.setText("0");
		item16.setText("0");
		item18.setText("0");
		item19.setText("0");
		item20.setText("0");
		item21.setText("0");
		item23.setText("0");
		item24.setText("0");
		item25.setText("0");
		item26.setText("0");
		item28.setText("0");
		item29.setText("0");
		item30.setText("0");
		total.setText("0");
		
		ContentPane.add(lb);
		ContentPane.add(total);
		lb.setForeground(Color.black);
		lb.setBounds(460,455,100,20);
		total.setBounds(600,455,100,20);
		ContentPane.add(btn19);
		ContentPane.add(back19);	
		btn19.setForeground(Color.black);
		btn19.setBounds(500,500,80,20);
		back19.setForeground(Color.black);
		back19.setBounds(600,500,80,20);
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
	//For transno & billno	
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:DB123";
			Connection con=DriverManager.getConnection(url);
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("Select max(trans_no),max(billno) from Purchase_trans");
			while(rs.next())
			{
				int n1 =Integer.parseInt(rs.getString(1));
				n1=n1+1;
				transno.setText(""+n1);
				int n =Integer.parseInt(rs.getString(2));
				n=n+1;
				bill.setText(""+n);
				
			}
		}
		catch(SQLException e)
		{
			System.out.println("Error"+e);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Error"+e);
		}
		
		try
		{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			url="jdbc:odbc:DB123";
			con=DriverManager.getConnection(url);
			stmt=con.createStatement();
			rs=stmt.executeQuery("select * from Supp");
			while(rs.next())
			{
				String nm=rs.getString(2);
				spname.add(""+nm);	
			}
		}
		catch(Exception ae)
		{
			System.out.println("Error Item"+ae);
		}	 
		
		//For Product name in items 	
			try
			{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				url="jdbc:odbc:DB123";
				con=DriverManager.getConnection(url);
				stmt=con.createStatement();
				rs=stmt.executeQuery("select * from Prod");
				while(rs.next())
				{
					String nm=rs.getString(2);
					name1.add(""+nm);	
					name2.add(""+nm);	
					name3.add(""+nm);	
					name4.add(""+nm);	
					name5.add(""+nm);	
					name6.add(""+nm);	
				}
			}
			catch(Exception ae)
			{
				System.out.println("Error Item"+ae);
			}
				 
		btn19.addActionListener(this);
		back19.addActionListener(this);
		lb.addActionListener(this);
		
		spname.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=spname.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Supp where sname='"+s1+"'");
   						while(rs.next())
   						{
   							spno.setText(rs.getString(1));							
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		//For Rate & Pno
		name1.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name1.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item1.setText(rs.getString(1));
   							item4.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name2.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name2.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item6.setText(rs.getString(1));
   							item9.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name3.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name3.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item11.setText(rs.getString(1));
   							item14.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name4.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name4.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item16.setText(rs.getString(1));
   							item19.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name5.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name5.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item21.setText(rs.getString(1));
   							item24.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		name6.addItemListener(new ItemListener()
		{
			public void itemStateChanged(ItemEvent ie)
   			{
   				String s1=name6.getSelectedItem();	
   					try
   					{
   						rs=stmt.executeQuery("select * from Prod where pname='"+s1+"'");
   						while(rs.next())
   						{
   							item26.setText(rs.getString(1));
   							item29.setText(rs.getString(5));
   						}
   						
   				   	}
   			   		catch(Exception e){}	
   			}
		
		}
		);
		
		ContentPane.setSize(800,570);
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getActionCommand()=="Total")
		{
			Float qty1=Float.parseFloat(item3.getText());
			Float rt1=Float.parseFloat(item4.getText());
			Float qty2=Float.parseFloat(item8.getText());
			Float rt2=Float.parseFloat(item9.getText());
			Float qty3=Float.parseFloat(item13.getText());
			Float rt3=Float.parseFloat(item14.getText());
			Float qty4=Float.parseFloat(item18.getText());
			Float rt4=Float.parseFloat(item19.getText());
			Float qty5=Float.parseFloat(item23.getText());
			Float rt5=Float.parseFloat(item24.getText());
			Float qty6=Float.parseFloat(item28.getText());
			Float rt6=Float.parseFloat(item29.getText());
			
			Float amt1 = qty1 * rt1;
			Float amt2 = qty2 * rt2;
			Float amt3 = qty2 * rt3;
			Float amt4 = qty4 * rt4;
			Float amt5 = qty5 * rt5;
			Float amt6 = qty6 * rt6;
			
			Float tot=amt1+amt2+amt3+amt4+amt5+amt6;
			
			item5.setText(""+amt1);
			item10.setText(""+amt2);
			item15.setText(""+amt3);
			item20.setText(""+amt4);
			item25.setText(""+amt5);
			item30.setText(""+amt6);
			
			total.setText(""+tot);		
		}
		
		
		
		if(ae.getActionCommand()=="Ok")
		{
			if(spno.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null,"Name Field Empty","Error",JOptionPane.INFORMATION_MESSAGE);	
				setVisible(true);
				
			}
			else
			{
				int trno=Integer.parseInt(transno.getText());
				int billno=Integer.parseInt(bill.getText());
				String sdate=date.getText();
				
				int suppno=Integer.parseInt(spno.getText());
				String suppnm=spname.getSelectedItem();
				
				int v1=Integer.parseInt(item1.getText());
				String v2=name1.getSelectedItem(); 	
				int v3=Integer.parseInt(item3.getText());
				float v4=Float.parseFloat(item4.getText());  
				float v5=Float.parseFloat(item5.getText());
							
				int v6=Integer.parseInt(item6.getText());
				String v7=name2.getSelectedItem();
				int v8=Integer.parseInt(item8.getText());
				float v9=Float.parseFloat(item9.getText());  
				float v10=Float.parseFloat(item10.getText());
				
				int v11=Integer.parseInt(item11.getText());
				String v12=name3.getSelectedItem();
				int v13=Integer.parseInt(item13.getText());
				float v14=Float.parseFloat(item14.getText()); 
				float v15=Float.parseFloat(item15.getText());
							
				int v16=Integer.parseInt(item16.getText());
				String v17=name4.getSelectedItem();
				int v18=Integer.parseInt(item18.getText());
				float v19=Float.parseFloat(item19.getText());  
				float v20=Float.parseFloat(item20.getText());
							
				int v21=Integer.parseInt(item21.getText());
				String v22=name5.getSelectedItem();
				int v23=Integer.parseInt(item23.getText());
				float v24=Float.parseFloat(item24.getText());  
				float v25=Float.parseFloat(item25.getText());
							
				int v26=Integer.parseInt(item26.getText());
				String v27=name6.getSelectedItem();
				int v28=Integer.parseInt(item28.getText());
				float v29=Float.parseFloat(item29.getText());  
				float v30=Float.parseFloat(item30.getText());
				float totalall=Float.parseFloat(total.getText());
				try
				{
					
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url="jdbc:odbc:DB123";
					Connection con=DriverManager.getConnection(url);
					Statement stmt= con.createStatement();
					String qry="insert into Purchase_trans values ("+trno+","+suppno+",'"+suppnm+"',"+billno+",'"+sdate+"',"+v1+",'"+v2+"',"+v3+","+v4+","+v5+","+v6+",'"+v7+"',"+v8+","+v9+","+v10+","+v11+",'"+v12+"',"+v13+","+v14+","+v15+","+v16+",'"+v17+"',"+v18+","+v19+","+v20+","+v21+",'"+v22+"',"+v23+","+v24+","+v25+","+v26+",'"+v27+"',"+v28+","+v29+","+v30+","+totalall+")";
					stmt.executeQuery(qry);
				}	
				
				catch(SQLException e)
				{
					System.out.println("User Error"+e);
				}
				catch(ClassNotFoundException e)
				{
					System.out.println("User Error :-  "+e);
				}
				setVisible(false);
				JOptionPane.showMessageDialog(null,"Purchase Transaction added","Successful",JOptionPane.INFORMATION_MESSAGE);
		    	TransMenu tm=new TransMenu();
				tm.setSize(800,570);
				tm.show();		 
				 
			}
		}	  
			if(ae.getActionCommand()=="Back")
			{
				setVisible(false);
				TransMenu tm=new TransMenu();
				tm.setSize(800,570);
				tm.show();		 
			} 
	}		
} 


//**************************************************************************************************

class Report extends JFrame implements ActionListener
{
	public Report() 
	{ 
		Container ContentPane=getContentPane();
		ContentPane.setLayout(null);
		JLabel menuname=new JLabel("Reports");
		JLabel menuname1=new JLabel("Super Market Management System");
		JButton opt1=new JButton("Product Stock");
		JButton opt2=new JButton("Purchase");
		JButton opt3=new JButton("Sale");
		JButton opt6=new JButton("Back");
		ContentPane.add(menuname1);
		menuname1.setFont(new Font("Pristina", Font.BOLD, 35));
		menuname1.setForeground(Color.red);
        menuname1.setBounds(150,15,500,80);  
		ContentPane.add(menuname);
		menuname.setFont(new Font("SansSerif", Font.BOLD, 25));
		menuname.setForeground(Color.black);
		menuname.setBounds(355,85,300,40);
		ContentPane.add(opt1);
	    opt1.setBounds(295,160,200,50);
	    opt1.setForeground(Color.black);
		opt1.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt2);
		opt2.setBounds(295,250,200,50);
		opt2.setForeground(Color.black);
		opt2.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt3);
		opt3.setBounds(295,340,200,50);
		opt3.setForeground(Color.black);
		opt3.setFont(new Font("SansSerif", Font.BOLD, 15));
		ContentPane.add(opt6);
		opt6.setBounds(540,430,100,30);
		opt6.setForeground(Color.black);
		opt6.setFont(new Font("SansSerif", Font.BOLD, 15));
		opt1.addActionListener(this);
		opt2.addActionListener(this);
		opt3.addActionListener(this);
		opt6.addActionListener(this); 
		
		((JPanel)getContentPane()).setOpaque(false);
		ImageIcon earth = new ImageIcon("Vista Aurora.jpg");
	   	JLabel backlabel = new JLabel(earth);
	   	getLayeredPane().add(backlabel,JLayeredPane.FRAME_CONTENT_LAYER);
	   	backlabel.setBounds(0,0,earth.getIconWidth(),
	   	earth.getIconHeight());
	    
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand()=="Product Stock")
		{
			Stock stock=new Stock();
			stock.setSize(800,570);
			stock.show();			  
		}	  
		else if(ae.getActionCommand()=="Purchase")
		{
			SupplierWise sw=new SupplierWise();
			sw.setSize(800,570);
			sw.show();	
		}	
		else if(ae.getActionCommand()=="Sale")
		{
			DailyTran dt=new DailyTran();
			dt.setSize(800,570);
			dt.show();
		}	
		else if(ae.getActionCommand()=="Back")
		{
			setVisible(false);
			FrontScreen frsc=new FrontScreen();
			frsc.setSize(800,570);
			frsc.show();
		}	
	}
}

//****************************************************************************

class Stock extends JFrame
{
		String JDBC_DRIVER  ="sun.jdbc.odbc.JdbcOdbcDriver";
		String DB123_URL ="jdbc:odbc:DB123";
		String USERNAME ="";
		String PASSWORD="";
		ResultSetTableModel tableModel;
	public Stock()
	{
		
		try
		{	
			String DEFAULT_QUERY ="Select pno,pname,pqty from Prod";
			tableModel = new ResultSetTableModel(JDBC_DRIVER,DB123_URL,USERNAME,PASSWORD,DEFAULT_QUERY);
			JTable resultTable = new JTable(tableModel);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			add(new JScrollPane(resultTable),BorderLayout.CENTER);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			setSize(800,570);
			setVisible(true);
		}
		catch(Exception sqlException)
		{
			System.exit(1);
		}
	}
}


//********************************************************************************************


class SupplierWise extends JFrame
{
		String JDBC_DRIVER  ="sun.jdbc.odbc.JdbcOdbcDriver";
		String DB123_URL ="jdbc:odbc:DB123";
		String USERNAME ="";
		String PASSWORD="";
		ResultSetTableModel tableModel;
	public SupplierWise()
	{
		try
		{	
			String DEFAULT_QUERY ="Select sno,sname,total,date,billno from Purchase_trans";
			tableModel = new ResultSetTableModel(JDBC_DRIVER,DB123_URL,USERNAME,PASSWORD,DEFAULT_QUERY);
			JTable resultTable = new JTable(tableModel);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			add(new JScrollPane(resultTable),BorderLayout.CENTER);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			setSize(800,570);
			setVisible(true);
		}
		catch(Exception sqlException)
		{
			System.exit(1);
		}
	}
}

//******************************************************************************************


class DailyTran extends JFrame 
{
  		String JDBC_DRIVER  ="sun.jdbc.odbc.JdbcOdbcDriver";
		String DB123_URL ="jdbc:odbc:DB123";
		String USERNAME ="";
		String PASSWORD="";
		ResultSetTableModel tableModel;
  public DailyTran()
  {
		try
		{	
			String DEFAULT_QUERY ="Select cno,cname,total,date,billno from Sales_trans";
			tableModel = new ResultSetTableModel(JDBC_DRIVER,DB123_URL,USERNAME,PASSWORD,DEFAULT_QUERY);
			JTable resultTable = new JTable(tableModel);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			add(new JScrollPane(resultTable),BorderLayout.CENTER);
			resultTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
			setSize(800,570);
			setVisible(true);
		}
		catch(Exception sqlException)
		{
			System.exit(1);
		}	
  }
}

//********************************************************************

public class SuperShopeeSystem
{ 
	public static void main(String args[])
	{
		JFrame.setDefaultLookAndFeelDecorated(true);
		try
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
	 	}catch(Exception e){}

		FrontScreen frsc=new FrontScreen();
		frsc.setSize(800,570);
		frsc.show();
	}
} 

//**************************************************************************