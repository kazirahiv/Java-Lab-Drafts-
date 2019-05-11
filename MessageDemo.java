import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

class MyFrame extends Frame implements ActionListener,WindowListener{
	public String msg;
	private TextField tf;
	private Label lm;
	public MyFrame(){
		super("Java Message Box Demo");
		msg="Window Created";
		Button b=new Button("Check It !");
		tf=new TextField();
		lm=new Label("Message Label");
		add(tf);
		add(b);
		add(lm);
		tf.setBounds(80,80,200,30);
		b.setBounds(80,140,200,40);
		lm.setBounds(200,462,200,20);
		ButtonSensor bs=new ButtonSensor(tf);
		b.addActionListener(this);
		addWindowListener(this);
		setSize(380,500);
		setLocation(100,100);
		setLayout(null);
	}
	public void paint(Graphics g){
		g.drawLine(0,460,500,460);
		g.drawString(msg,20,480);
	}
	public void actionPerformed(ActionEvent ae){
		String s=tf.getText();
		if(s.length()==0){
			JOptionPane.showMessageDialog(this,"You Must Type");
		}
		else if(s.equals("raju")){
			System.out.println("Valid User Name");
			lm.setText("Valid User Name");
		}
		else{
			System.out.println("Invalid Info");
			lm.setText("Invalid Info");
		}
		msg="Button Pressed";repaint();
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}
public class MessageDemo{
    public static void main(String str[]){
        MyFrame mf=new MyFrame();
        mf.setVisible(true);
    }
}