//package Product;
import javax.swing.*;
import java.awt.event.*;

public class CustomerMenu extends JFrame
{
	private Home h;
	JLabel Cus;
	JButton addCus,delCus,updateCus,back;
	public CustomerMenu(Home h)
	{
		super("Customer Menu");
		this.h=h;
		this.h.setVisible(false);
		ProdMenuForm();
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void ProdMenuForm()
	{
		Cus=new JLabel("Customer Menu");
		addCus=new JButton("Add");
		delCus=new JButton("Delete");
		updateCus=new JButton("Update");
		back=new JButton("Home");
		setLayout(null);
		Cus.setBounds(160,100,200,50);
		addCus.setBounds(100,150,100,20);
		delCus.setBounds(230,150,100,20);
		updateCus.setBounds(100,200,100,20);
		back.setBounds(230,200,100,20);
		add(Cus);
		add(addCus);
		add(delCus);
		add(updateCus);
		add(back);
	}
}