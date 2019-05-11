//package labtask;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class SearchForm extends Frame implements KeyListener{
    private Label messageBox;
	private TextField emailText;
	public Buffer buf;
	public SearchForm(){
		super("Java Keyboard Demo");
		Button b=new Button("Search Record from DB and Show Here");
        Label e=new Label("Email");
        messageBox=new Label("Message to show");
        emailText=new TextField(30);
		add(e);
        add(emailText);
        add(b);
		add(messageBox);
		emailText.addKeyListener(this);
		setSize(280,400);
		setLayout(new FlowLayout());
	}
	public void paint(Graphics g){
		//g.drawString(msg,40,50);
	}
	public void keyPressed(KeyEvent ke){
		//System.out.println("Key pressed");
	}
	public void keyTyped(KeyEvent ke){
		//System.out.println("Key typed");
	}
	public void keyReleased(KeyEvent ke){
		if(emailText.getText().length()>0){
			String text="select * from contact where email like '"+emailText.getText()+"%'";
			buf=new Buffer(10);
			buf.loadNames(text);
			buf.showNames(messageBox);
			//System.out.println(text);
		}
		//System.out.println("You typed:"+ke.getKeyChar());
	}
}
