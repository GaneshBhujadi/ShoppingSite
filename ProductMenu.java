//package Product;
import javax.swing.*;
import java.awt.event.*;

public class ProductMenu extends JFrame
{
	private Home h;
	JLabel Prod;
	JButton addProd,delProd,updateProd,back;
	public ProductMenu(Home h)
	{
		super("Product Menu");
		this.h=h;
		this.h.setVisible(false);
		ProdMenuForm();
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void ProdMenuForm()
	{
		Prod=new JLabel("Product Menu");
		addProd=new JButton("Add");
		delProd=new JButton("Delete");
		updateProd=new JButton("Update");
		back=new JButton("Home");
		setLayout(null);
		Prod.setBounds(160,100,200,50);
		addProd.setBounds(100,150,100,20);
		delProd.setBounds(230,150,100,20);
		updateProd.setBounds(100,200,100,20);
		back.setBounds(230,200,100,20);
		back.addActionListener(new Back(this));
		add(Prod);
		add(addProd);
		add(delProd);
		add(updateProd);
		add(back);
	}
	class Back implements ActionListener()
	{
		private ProductMenu pm;
		public Back(ProductMenu pm)
		{
			this.pm=
		}
		public void actionPerformed(ActionEvent e)
		{
			
		}
	}
}