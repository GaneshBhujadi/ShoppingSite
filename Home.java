import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame
{
	String user;
	JLabel L1;
	private Login l;
	JButton product,employee,customer,logout;
	public Home(Login l,String user)
	{
		super("Home");
		this.l=l;
		this.user=user;
		HomePage();
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void HomePage()
	{
		L1=new JLabel("Welcome "+user);
		product=new JButton("Product");
		employee=new JButton("Employee");
		customer=new JButton("Customer");
		logout=new JButton("LogOut");
		setLayout(null);
		L1.setBounds(160,100,200,50);
		product.setBounds(100,150,100,20);
		employee.setBounds(230,150,100,20);
		customer.setBounds(100,200,100,20);
		logout.setBounds(230,200,100,20);
		product.addActionListener(new ProdMenu(this));
		employee.addActionListener(new EmpMenu(this));
		customer.addActionListener(new CusMenu(this));
		logout.addActionListener(new LogOut(this));
		add(L1);
		add(product);
		add(employee);
		add(customer);
		add(logout);
	}
	class ProdMenu implements ActionListener
	{
		Home h;
		public ProdMenu(Home h)
		{
			this.h=h;
		}
		public void actionPerformed(ActionEvent e)
		{
			new ProductMenu(h);
		}
	}	
	class EmpMenu implements ActionListener
	{
		Home h;
		public EmpMenu(Home h)
		{
			this.h=h;
		}
		public void actionPerformed(ActionEvent e)
		{
			new EmployeeMenu(h);
		}
	}
	class CusMenu implements ActionListener
	{
		Home h;
		public CusMenu(Home h)
		{
			this.h=h;
		}
		public void actionPerformed(ActionEvent e)
		{
			new CustomerMenu(h);
		}
	}
	class LogOut implements ActionListener
	{
		private Home h;
		private LogOut(Home h)
		{this.h=h;}
		public void actionPerformed(ActionEvent e)
		{
			h.setVisible(false);
			l.setVisible(true);
		}
	}
}