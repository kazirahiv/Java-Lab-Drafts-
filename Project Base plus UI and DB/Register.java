public class Register{
	public LoginWindow loginWindow;
	public SignUpWindow signUpWindow;
	public Buffer buffer;
	public Register(){
		loginWindow=null;
		signUpWindow=null;
		buffer=new Buffer(20);
	}
}