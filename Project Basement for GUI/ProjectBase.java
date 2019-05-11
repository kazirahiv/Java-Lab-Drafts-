public class ProjectBase{
    public static void main(String str[]){
		Register r=new Register();
		r.loginWindow=new LoginWindow(r);
		r.signUpWindow=new SignUpWindow(r);
        r.loginWindow.setVisible(true);
    }
}