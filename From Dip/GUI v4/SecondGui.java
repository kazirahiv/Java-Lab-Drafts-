import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SecondGui extends JFrame  implements ActionListener
{
	private JLabel valuesLabel;
	private JButton backBtn, changeBtn;
	private JPanel panel;
	private FirstGui fg;
	
	
	public SecondGui(String name, String pass, String radioText, String checkText, String comboText, FirstGui fg)
	{
		super("Second GUI");
		this.setSize(800,450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.fg = fg;
		
		
		panel = new JPanel();
		panel.setLayout(null);
		
		valuesLabel = new JLabel("Value will set Here"+" "+name+" "+pass+" "+radioText+" "+checkText+" "+comboText);
		valuesLabel.setBounds(50, 50, 300, 30);
		panel.add(valuesLabel);
		
		backBtn = new JButton("Back");
		backBtn.setBounds(360, 210, 80, 30);
		backBtn.addActionListener(this);
		panel.add(backBtn);
		
		changeBtn = new JButton("1");
		changeBtn.setBounds(50, 100, 80, 30);
		changeBtn.addActionListener(this);
		panel.add(changeBtn);
		
		
		
		this.add(panel);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(command.equals(backBtn.getText()))
		{
			fg.setVisible(true);
			this.setVisible(false);
		}
		else if(command.equals(changeBtn.getText()))
		{
			valuesLabel.setText(valuesLabel.getText()+changeBtn.getText());
		}
		else{}
	}
}











