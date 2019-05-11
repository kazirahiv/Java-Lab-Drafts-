import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
public class Buffer{
	public Contact contactList[];
	public Buffer(int s){
		contactList=new Contact[s];
	}
	public void addContact(Contact c){
		for(int i=0;i<contactList.length;i++){
			if(contactList[i]==null){
				contactList[i]=c;
				break;
			}
		}
	}
	public void loadContacts(String sql){
		//System.out.println(sql);
		try{
			DataAccess da=new DataAccess();
			ResultSet rs=da.getData(sql);
			Contact c=null;
			while(rs.next()){
				c=new Contact(rs.getInt("cid"),rs.getString("name"),rs.getString("phone"),rs.getString("email"));
				addContact(c);
				//System.out.println(rs.getInt("cid"));
			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
	public void showAllContact(JLabel l){
		printAllContact();
		String s="<html>";
		for(Contact r:contactList){
			if(r!=null){
				s=s+r.getName()+":"+r.getPhone();
				s=s+","+r.getEmail()+"<br/>";
			}
		}
		s+="</html>";
		l.setText(s);
	}
	public void printAllContact(){
		for(Contact c:contactList){
			if(c!=null){
				System.out.println(c);
			}
		}
	}
}