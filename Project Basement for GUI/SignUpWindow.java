import java.awt.*;
import java.awt.event.*;
class SignUpWindow extends Frame implements WindowListener,ActionListener{
	private Register register;
	public TextField uName;
	public TextField email;
	public Button signUpButton;
	public Button backButton;
	public SignUpWindow(Register r){
		super("User Sign Up Window");
		this.register=r;
		uName=new TextField(10);
		email=new TextField(10);
		Label ul=new Label("User Name:");
		Label el=new Label("Email:");
		signUpButton=new Button("Signup");
		backButton=new Button("Back");
		add(ul);
		add(uName);
		add(el);
		add(email);
		add(signUpButton);
		add(backButton);
		
		signUpButton.addActionListener(this);
		backButton.addActionListener(this);
		addWindowListener(this);
		setLocation(150,150);
		setSize(800,400);
		setLayout(new FlowLayout());
	}
	public void windowClosing(WindowEvent we){
        System.out.println("Window is closing");
		System.exit(0);
	}
	public void actionPerformed(ActionEvent e){
		String st=e.getActionCommand();
		if(st.equals("Signup")){
		}
		else if(st.equals("Back")){
			register.signUpWindow.setVisible(false);
			register.loginWindow.setVisible(true);
		}
	}
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}

}