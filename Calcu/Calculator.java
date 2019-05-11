import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements MouseListener,ActionListener
{
	private JTextField inputF;
	private JButton clearb,replcb,oneb,twoBtn,threeb,fourb,fiveb,sixb,sevenb,eightb,nineb,zeroBtn,dotb,equalbtn,plusb,substractb,multiplyb,divb,backb;
	private JPanel panel;
	double a=0,b=0,res=0;
	int op=0;
	public Calculator()
	{
		super("A Simple Calculator");
		this.setSize(500,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.WHITE);
		inputF = new JTextField();
		inputF.setBounds(20,80,300,80);
		inputF.addMouseListener(this);		
		panel.add(inputF);
		clearb = new JButton("Reset");
		clearb.setBounds(20, 110, 100, 30);
		clearb.setBackground(Color.GRAY);
		clearb.addMouseListener(this);
		clearb.addActionListener(this);
		panel.add(clearb);
		replcb = new JButton("Turn OFF");
		replcb.setBounds(200, 110, 100, 30);
		replcb.setBackground(Color.BLUE);
		replcb.addMouseListener(this);
		replcb.addActionListener(this);
		panel.add(replcb);
		sevenb = new JButton("7");
		sevenb.setBounds(20, 200, 80, 80);
		sevenb.setBackground(Color.BLUE);
		sevenb.addMouseListener(this);
		sevenb.addActionListener(this);
		panel.add(sevenb);
		eightb = new JButton("8");
		eightb.setBounds(100, 200, 80, 80);
		eightb.setBackground(Color.BLUE);
		eightb.addMouseListener(this);
		eightb.addActionListener(this);
		panel.add(eightb);
		nineb = new JButton("9");
		nineb.setBounds(180, 200, 100, 80);
		nineb.setBackground(Color.BLUE);
		nineb.addMouseListener(this);
		nineb.addActionListener(this);
		panel.add(nineb);
		divb = new JButton("/");
		divb.setBounds(300, 200, 100, 80);
		divb.setBackground(Color.BLUE);
	    divb.addMouseListener(this);
		divb.addActionListener(this);
		panel.add(divb);
		fourb = new JButton("4");
		fourb.setBounds(20, 240, 100, 80);
		fourb.setBackground(Color.BLUE);
		fourb.addMouseListener(this);
		fourb.addActionListener(this);
		panel.add(fourb);
		fiveb = new JButton("5");
		fiveb.setBounds(100, 240, 80, 80);
		fiveb.setBackground(Color.BLUE);
		fiveb.addMouseListener(this);
		fiveb.addActionListener(this);
		panel.add(fiveb);
		sixb = new JButton("6");
		sixb.setBounds(180, 240, 80, 80);
		sixb.setBackground(Color.BLUE);
		sixb.addMouseListener(this);
		sixb.addActionListener(this);
		panel.add(sixb);
		multiplyb = new JButton("*");
		multiplyb.setBounds(300, 240, 80, 80);
		multiplyb.setBackground(Color.BLUE);
		multiplyb.addMouseListener(this);
		multiplyb.addActionListener(this);
		panel.add(multiplyb);
		oneb = new JButton("1");
		oneb.setBounds(20, 320, 80, 80);
		oneb.setBackground(Color.BLUE);
		oneb.addMouseListener(this);
		oneb.addActionListener(this);
		panel.add(oneb);
		twoBtn = new JButton("2");
		twoBtn.setBounds(100, 320, 80, 80);
		twoBtn.setBackground(Color.BLUE);
		twoBtn.addMouseListener(this);
		twoBtn.addActionListener(this);
		panel.add(twoBtn);
		threeb = new JButton("3");
		threeb.setBounds(180, 320, 80, 80);
		threeb.setBackground(Color.BLUE);
		threeb.addMouseListener(this);
		threeb.addActionListener(this);
		panel.add(threeb);
		substractb = new JButton("-");
		substractb.setBounds(300, 320, 80, 80);
		substractb.setBackground(Color.BLUE);
		substractb.addMouseListener(this);
		substractb.addActionListener(this);
		panel.add(substractb);
		dotb = new JButton(".");
		dotb.setBounds(20, 400, 80, 80);
		dotb.setBackground(Color.BLUE);
		dotb.addMouseListener(this);
		dotb.addActionListener(this);
		panel.add(dotb);
		zeroBtn = new JButton("0");
		zeroBtn.setBounds(100, 400, 80, 80);
		zeroBtn.setBackground(Color.BLUE);
		zeroBtn.addMouseListener(this);
		zeroBtn.addActionListener(this);
		panel.add(zeroBtn);
		equalbtn = new JButton("=");
		equalbtn.setBounds(180, 400, 80, 80);
		equalbtn.setBackground(Color.BLUE);
		equalbtn.addMouseListener(this);
		equalbtn.addActionListener(this);
		panel.add(equalbtn);
		plusb = new JButton("+");
		plusb.setBounds(300, 400, 80, 80);
		plusb.setBackground(Color.BLUE);
		plusb.addMouseListener(this);
		plusb.addActionListener(this);
		panel.add(plusb);
		backb = new JButton("Del");
		backb.setBounds(10, 500, 100, 30);
		backb.setBackground(Color.BLUE);
		backb.addMouseListener(this);
		backb.addActionListener(this);
		panel.add(backb);
		this.add(panel);
	}
	
	
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
    public void mouseClicked(MouseEvent me)
	{
		if (me.getSource() == inputF)
		{
			inputF.setEditable(false);
		    panel.add(inputF);
		}
		
		
		else 
		{
			
		}
	}	
	
	public void mouseEntered (MouseEvent me)
	{
		
	}
	
	public void mouseExited(MouseEvent me)
	{
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String text = ae.getActionCommand();
		
		if(ae.getSource() == sevenb)
		{
			inputF.setText(inputF.getText()+("7"));
		}
		else if(ae.getSource() == eightb)
		{
			inputF.setText(inputF.getText()+("8"));
		}
		else if(ae.getSource() == nineb)
		{
			inputF.setText(inputF.getText()+("9"));
		}
		else if(ae.getSource() == fourb)
		{
			inputF.setText(inputF.getText()+("4"));
		}
		else if(ae.getSource() == fiveb)
		{
			inputF.setText(inputF.getText()+("5"));
		}
		else if(ae.getSource() == sixb)
		{
			inputF.setText(inputF.getText()+("6"));
		}
		else if(ae.getSource() == oneb)
		{
			inputF.setText(inputF.getText()+("1"));
		}
		else if(ae.getSource() == twoBtn)
		{
			inputF.setText(inputF.getText()+("2"));
		}
		else if(ae.getSource() == threeb)
		{
			inputF.setText(inputF.getText()+("3"));
		}
		else if(ae.getSource() == zeroBtn)
		{
			inputF.setText(inputF.getText()+("0"));
		}
		else if(ae.getSource() == dotb)
		{
			inputF.setText(inputF.getText()+("."));
		}
		else if(ae.getSource() == clearb)
		{
			inputF.setText("");
		}
		else if(ae.getSource() == replcb)
		{
			System.exit(0);
		}
		else if(ae.getSource() == backb)
		{
			
			String bsp=inputF.getText();
            inputF.setText("");
            for(int i=0;i<bsp.length()-1;i++)
            inputF.setText(inputF.getText()+bsp.charAt(i));
		}
		
	
		if(ae.getSource() == plusb)
		{
			a=Double.parseDouble(inputF.getText());
			op=1;
			inputF.setText("");
		}
		else if(ae.getSource() == substractb)
		{
			a=Double.parseDouble(inputF.getText());
			op=2;
			inputF.setText("");
		}
		else if(ae.getSource() == multiplyb)
		{
			a=Double.parseDouble(inputF.getText());
			op=3;
			inputF.setText("");
			
		}
		else if(ae.getSource() == divb)
		{
			a=Double.parseDouble(inputF.getText());
			op=4;
			inputF.setText("");
		}
		
		if(ae.getSource() == equalbtn)
		{
			b=Double.parseDouble(inputF.getText());
			
				if(op==1)
				{
					res = a+b;
				}
				else if (op==2)
				{
					res = a-b;
				}
				else if (op==3)
				{
					res = a*b;
				}
				else if (op==4)
				{
					res = a/b;
				}
		    
			inputF.setText(""+res);
		}	
        
		
	}
}