package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;


public class EmployeeHome extends JFrame implements ActionListener
{
	JButton logoutBtn, manageEmpBtn, manageProductBtn, managePurchaseBtn, changePasswordBtn;
	JPanel panel;
	
	User user;
	
	public EmployeeHome(User user)
	{
		super("Welcome Employee");
		this.setSize(800,450);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.user = user;
		
		panel = new JPanel();
		panel.setLayout(null);
		
		logoutBtn = new JButton("Logout");
		logoutBtn.setBounds(600, 50, 150, 30);
		logoutBtn.addActionListener(this);
		panel.add(logoutBtn);
		
		changePasswordBtn = new JButton("Change Password");
		changePasswordBtn.setBounds(600, 100, 150, 30);
		changePasswordBtn.addActionListener(this);
		panel.add(changePasswordBtn);
		
		manageEmpBtn = new JButton("Manage Employee");
		manageEmpBtn.setBounds(50, 100, 150, 30);
		manageEmpBtn.addActionListener(this);
		panel.add(manageEmpBtn);
		
		manageProductBtn = new JButton("Manage Product");
		manageProductBtn.setBounds(225, 100, 150, 30);
		manageProductBtn.addActionListener(this);
		panel.add(manageProductBtn);
		
		
		managePurchaseBtn = new JButton("Manage Purchase");
		managePurchaseBtn.setBounds(400, 100, 150, 30);
		managePurchaseBtn.addActionListener(this);
		panel.add(managePurchaseBtn);
		
		this.add(panel);
	
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(logoutBtn.getText()))
		{
			LoginFrame lf = new LoginFrame();
			lf.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(manageEmpBtn.getText()))
		{
			if(user.getStatus()==0)
			{
				EmployeeFrame ef = new EmployeeFrame(user);
				ef.setVisible(true);
				this.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Access Denied");
			}
		}
		else if(command.equals(manageProductBtn.getText()))
		{
			
		}
		else if(command.equals(managePurchaseBtn.getText()))
		{
			
		}
		else{}
	}
}