public class MAIN{
	public static void main(String str[]){
		Student st=new Student();
		st.setID(123);
		st.setCGPA(3.9);
		iStudent ist=st;
		ist.setID(456);
		st.print();
		
	}
}