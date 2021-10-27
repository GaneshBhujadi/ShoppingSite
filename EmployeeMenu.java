//package Employee;
import javax.swing.*;
import java.awt.event.*;

public class EmployeeMenu extends JFrame
{
	private Home h;
	JLabel Emp;
	JButton addEmp,delEmp,updateEmp,back;
	public EmployeeMenu(Home h)
	{
		super("Employee Menu");
		this.h=h;
		this.h.setVisible(false);
		ProdMenuForm();
		this.setSize(400,400);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void ProdMenuForm()
	{
		Emp=new JLabel("Employee Menu");
		addEmp=new JButton("Add");
		delEmp=new JButton("Delete");
		updateEmp=new JButton("Update");
		back=new JButton("Home");
		setLayout(null);
		Emp.setBounds(160,100,200,50);
		addEmp.setBounds(100,150,100,20);
		delEmp.setBounds(230,150,100,20);
		updateEmp.setBounds(100,200,100,20);
		back.setBounds(230,200,100,20);
		add(Emp);
		add(addEmp);
		add(delEmp);
		add(updateEmp);
		add(back);
	}
}