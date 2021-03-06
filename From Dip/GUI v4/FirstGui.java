import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FirstGui extends JFrame implements MouseListener, ActionListener
{
	private JLabel nameLabel, passLabel, imgLabel, imgLabel1;
	private JTextField nameTF;
	private JPasswordField passPF;
	private JButton loginBtn, exit;
	private JRadioButton r1, r2, r3;
	private JCheckBox c1, c2, c3;
	private ButtonGroup bg;
	private JComboBox combo;
	private ImageIcon img, img1;
	private JPanel panel;
	private Color backColor;
	private Font font;
	
	
	public FirstGui()
	{
		super("This is a GUI");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		backColor = new Color(210, 240, 130);
		font = new Font("Consolas", Font.PLAIN, 20);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(backColor);
		
		nameLabel = new JLabel("User Name:");
		nameLabel.setBounds(180,120,120,30);
		nameLabel.setBackground(Color.GRAY);
		nameLabel.setOpaque(true);
		nameLabel.setFont(font);
		panel.add(nameLabel);
		
		nameTF = new JTextField();
		nameTF.setBounds(300, 120, 100,30);
		nameTF.setBackground(Color.BLUE);
		panel.add(nameTF);
		
		passLabel = new JLabel("Password:");
		passLabel.setBounds(180, 170, 100, 30);
		passLabel.setForeground(Color.MAGENTA);
		passLabel.setFont(font);
		panel.add(passLabel);
		
		passPF = new JPasswordField();
		passPF.setBounds(300,170, 100, 30);
		passPF.setEchoChar('*');
		panel.add(passPF);
		
		
		loginBtn = new JButton("Login");
		loginBtn.setBounds(300, 250, 80, 30);
		loginBtn.setBackground(Color.GREEN);
		loginBtn.addMouseListener(this);
		loginBtn.addActionListener(this);
		panel.add(loginBtn);
		
		
		exit = new JButton("Exit");
		exit.setBounds(420, 250, 80, 30);
		exit.setBackground(Color.RED);
		exit.addMouseListener(this);
		exit.addActionListener(this);
		panel.add(exit);
	
		r1 = new JRadioButton("Agree");
		r1.setBounds(420, 50, 80, 30);
		panel.add(r1);
		
		r2 = new JRadioButton("Mod-Agree");
		r2.setBounds(420, 100, 100, 30);
		r2.setOpaque(false);
		panel.add(r2);
		
		r3 = new JRadioButton("DisAgree");
		r3.setBounds(420, 150, 100, 30);
		panel.add(r3);
		
		bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		bg.add(r3);
		
		c1 = new JCheckBox("OOP1 A");
		c1.setBounds(520, 50, 80, 30);
		panel.add(c1);
		
		c2 = new JCheckBox("OOP1 B");
		c2.setBounds(520, 100, 100, 30);
		panel.add(c2);
		
		c3 = new JCheckBox("OOP1 E");
		c3.setBounds(520, 150, 100, 30);
		panel.add(c3);
		
		String items[] = {"CS", "CSE", "CSSE", "SE", "CIS", "COE"};
		
		combo = new JComboBox(items);
		combo.setBounds(620, 50, 80, 30);
		panel.add(combo);
		
		
		img = new ImageIcon("oop1b.jpg");
		imgLabel = new JLabel(img);
		imgLabel.setBounds(50, 200, 200, 112);
		panel.add(imgLabel);
		
		
		
		this.add(panel);
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.BLUE);
			loginBtn.setForeground(Color.WHITE);
		}
		else if(me.getSource()== exit)
		{
			exit.setBackground(Color.BLUE);
			exit.setForeground(Color.WHITE);
		}
		else{}
	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == loginBtn)
		{
			loginBtn.setBackground(Color.GREEN);
			loginBtn.setForeground(Color.BLACK);
		}
		else if(me.getSource()== exit)
		{
			exit.setBackground(Color.RED);
			exit.setForeground(Color.BLACK);
		}
		else{}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(loginBtn.getText()))
		{
			String name = nameTF.getText();
			String pass = passPF.getText();
			
			String radioText = null;
			String checkText = null;
			
			
			if(r1.isSelected()){radioText = r1.getText();}
			else if(r2.isSelected()){radioText = r2.getText();}
			else if(r3.isSelected()){radioText = r3.getText();}
			else{}
			
			if(c1.isSelected()){checkText = c1.getText();}
			else if(c2.isSelected()){checkText = c2.getText();}
			else if(c3.isSelected()){checkText = c3.getText();}
			else{}
			
			String comboText = combo.getSelectedItem().toString();
			
			SecondGui sg = new SecondGui(name, pass, radioText, checkText, comboText, this);
			sg.setVisible(true);
			this.setVisible(false);
			
			
		}
		else if(command.equals(exit.getText()))
		{
			System.exit(0);
		}
		else{}
	}
}



