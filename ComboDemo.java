import java.awt.*;
import java.awt.event.*;
import java.awt.Choice;


class WindowSensor extends WindowAdapter{
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
}


class ItemSensor implements ItemListener
{
	MyFrame mf;
	public ItemSensor(MyFrame m){
		mf=m;
	}
	public void itemStateChanged(ItemEvent ie){
		System.out.println("combo clicked");
		mf.loadStudents();
	}
}



class MyFrame extends Frame{
	public String msg;
	private String dept[]={"CS","BBA","EEE"};
	private String students[]={"raju","mina"};
	Choice deptChoice=new Choice();
	Choice stuChoice=new Choice();
	public MyFrame(){
		super("Java Combo Window");
		deptChoice.add("CS");
		deptChoice.add("EEE");
		add(deptChoice);
		add(stuChoice);
		deptChoice.addItemListener(new ItemSensor(this));
		setSize(600,400);
		setLayout(new FlowLayout());
	}
	public void loadDept(){
		
	}
	public void loadStudents(){
		int l=0;
		for(String s:students){
			if(s.length()>l)l=s.length();
			stuChoice.add(s);
		}
		stuChoice.setSize(l*15,0);
	}
}


class ButtonSensor implements ActionListener{
	TextField t;
	public ButtonSensor(TextField v){
		t=v;
	}
	public void actionPerformed(ActionEvent ae){
		String s1=t.getText();
		int a=Integer.parseInt(s1);
		System.out.println("You entered : "+s1);
	}
}

public class ComboDemo{
    public static void main(String str[]){
        MyFrame mf=new MyFrame();
        mf.addWindowListener(new WindowSensor());
        mf.setVisible(true);
    }
}