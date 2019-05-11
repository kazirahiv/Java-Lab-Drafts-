import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.*;
import java.awt.event.*;

public class GUIDemo{
	public static void main(String s[]){
		MyWindow mw=new MyWindow();
		//Button b2=new Button("another");
		//mw.add(b2);
		
	}
}
//super type of WindowAdapter is WindowListener
//which is an interface
class WindowSensor extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.out.println("Window closed");
		System.exit(0);
	}
}
class MyWindow extends Frame{
	public MyWindow(){
		super("My First Java Frame");
		TextField tf=new TextField(10);
		Button b=new Button("Ok");
		add(tf);
		add(b);
		setSize(300,400);
		setLayout(new FlowLayout());
		setVisible(true);
		WindowSensor ws=new WindowSensor();
		addWindowListener(ws);//WindowListener
	}
}