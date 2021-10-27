import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
//import Product.*;
//import Employee.*;
//import Customer.*;
public class Login extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1;
	JPasswordField p1;
	JCheckBox c1;
	JButton login,clear;
	public Login(String s)
	{
		super(s);
	}
	public void setComponents()
	{
		l1=new JLabel("User");
		l2=new JLabel("Password");
		t1=new JTextField();
		p1=new JPasswordField();
		c1=new JCheckBox("Show Password");
		l3=new JLabel();
		login=new JButton("Login");
		clear=new JButton("Clear");
		setLayout(null);
		l1.setBounds(100,100,100,20);
		t1.setBounds(180,100,100,20);
		l2.setBounds(100,140,200,20);
		p1.setBounds(180,140,100,20);
		c1.setBounds(180,160,200,20);
		login.setBounds(100,200,80,20);
		clear.setBounds(200,200,80,20);
		l3.setBounds(50,240,250,20);
		login.addActionListener(new SignIn(this));
		clear.addActionListener(new Reset());
		add(l1);
		add(t1);
		add(l2);
		add(p1);
		add(c1);
		add(l3);
		add(login);
		add(clear);
	}
	public void chkCredentials(String user,String pass)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/AddzDecor","root","");
			Statement stmt=con.createStatement();
			String query="select User,Pass from Login where User like binary '"+user+"' && Pass like binary '"+pass+"'";
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next())
			{
				JOptionPane.showMessageDialog(this,"Login successful");
				this.setVisible(false);
				new Home(this,rs.getString(1));				
			}
			else
				JOptionPane.showMessageDialog(this,"User name does not match","Alert",JOptionPane.WARNING_MESSAGE);
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
		catch(SQLException ex)
		{
			System.out.println("Exception :"+ex.getMessage());
		}
	}
	class SignIn implements ActionListener
	{
		private Login l;
		private SignIn(Login l)
		{this.l=l;}
		public void actionPerformed(ActionEvent e)
		{
			String user=t1.getText();
			String pass=p1.getText();
			if(user.length()>=4 && pass.length()>=4)
				chkCredentials(user,pass);
			else
				JOptionPane.showMessageDialog(l,"Please enter valid username and password","Alert",JOptionPane.WARNING_MESSAGE);
		}
	}
	class Reset implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			t1.setText("");
			p1.setText("");
		}
	}
	public static void main(String[]args)
	{
		Login l=new Login("Login");
		l.setComponents();
		l.setSize(400,400);
		l.setVisible(true);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}