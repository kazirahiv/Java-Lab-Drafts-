import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.Label;
public class Buffer{
	public String record[];
	
	public Buffer(int s){
		record=new String[s];
	}
	public void addData(String s,int idx){
			record[idx]=s;
	}
	public void addData(String s){
		for(int i=0;i<record.length;i++){
			if(record[i]==null){
				record[i]=s;
				break;
			}
		}
	}
	public void deleteData(int idx){
			record[idx]=null;
	}
	public void loadNames(String sql){
		try{
			DataAccess da=new DataAccess();
			ResultSet rs=da.getData(sql);
			while(rs.next()){
				addData(rs.getString("name"));
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void showNames(Label l){
		printAll();
		String s="";
		for(String r:record){
			if(r!=null){
				s=s+r+",";
			}
		}
		l.setText(s);
	}
	public void printAll(){
		for(String r:record){
			if(r!=null){
				System.out.println(r);
			}
		}
	}
}