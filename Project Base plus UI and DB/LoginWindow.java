import java.awt.*;
import java.awt.event.*;
class LoginWindow extends Frame implements WindowListener, ActionListener{
	private Register register;
	public TextField uName;
	public TextField password;
	public Button loginButton;
	public Button signUpButton;
	public LoginWindow(Register r){
		super("User Login Window");
		this.register=r;
		uName=new TextField();
		password=new TextField();
		loginButton=new Button("Login");
		signUpButton=new Button("Signup");
		password.setEchoChar('*');
		uName.setBounds(120,80,150,30);
		password.setBounds(120,130,150,30);
		loginButton.setBounds(60,200,80,30);
		signUpButton.setBounds(180,200,80,30);
		add(uName);
		add(password);
		add(loginButton);
		add(signUpButton);
		loginButton.addActionListener(this);
		signUpButton.addActionListener(this);
		addWindowListener(this);
		setSize(800,400);
		setLocation(100,100);
		setLayout(null);
	}
	public void paint(Graphics g){
		g.drawString("User Name:",40,100);
		g.drawString("Password:",40,150);
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String s=e.getActionCommand();
		boolean b=false;
		if(s.equals("Login")){
			try{
				register.buffer.loadStudents("select * from student");
				//register.buffer.printAllStudents();
				b=register.buffer.checkStudentAuth(uName.getText(),password.getText());
				if(b){
					System.out.println("Valid User");
					register.signUpWindow.setVisible(true);
					register.loginWindow.setVisible(false);
				}
				else{
					System.out.println("Invalid User");
				}
			}
			catch(Exception ex){ex.printStackTrace();}
			//System.out.println(uName.getText());
			//System.out.println(password.getText());
		}
		else if(s.equals("Signup")){
			register.loginWindow.setVisible(false);
			register.signUpWindow.setVisible(true);
		}
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}