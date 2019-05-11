public class Contact{
	private int cid;
	private String name;
	private String phone;
	private String email;
	public Contact(int c,String n,String p,String e){
		cid=c;name=n;
		phone=p;email=e;
	}
	public String getName(){return name;}
	public String getPhone(){return phone;}
	public String getEmail(){return email;}
	public int getCID(){return cid;}
	public String toString(){
		return name+" : "+email;
	}
}