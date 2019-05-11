public class Student{
	private int id;
	private float cgpa;
	private String uname;
	private String dept;
	private String pass;
	public Student(int i,String un, String p){
		id=i;cgpa=(float)0.0;
		uname=un;pass=p;
	}
	public String getPassword(){
		return pass;
	}
	public String getUName(){
		return uname;
	}
	
	public void print(){
		System.out.print(uname+" is from "+dept);
		System.out.println(" with cgpa: "+cgpa);
	}
}