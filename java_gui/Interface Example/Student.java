public class Student implements iStudent{
	private int id;
	private double cgpa;
	public final int c=10;
	//int perCreditFee;
	public void sayHello(){
		System.out.println("Hello from subclass");
	}
	public void setID(int i){	id=i;}
	public void setCGPA(double c){	cgpa=c;}
	public int getID(){return id;}
	public double getCGPA(){return cgpa;}
	public void print(){
		System.out.println("id : "+id+" : cgpa : "+cgpa);
		System.out.println(perCreditFee);
	}
}