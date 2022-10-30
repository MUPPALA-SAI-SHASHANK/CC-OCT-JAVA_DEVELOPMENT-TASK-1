import java.util.* ;
import java.util.Scanner ;
public class MailLogin{
	public static ArrayList<MailClient> users=new ArrayList<MailClient> () ;
	public MailLogin(String username,String password){
		user_name=username ;
		this.password=password ;
 	}
	private String user_name ;
	private String password ;
	Scanner cin=new Scanner(System.in) ;
	public void displayLogin(){
	System.out.println("Enter User-Name : ") ;
	user_name=cin.nextLine() ;
	System.out.println("Enter Password : ") ;
	password=cin.nextLine() ;
	}
	public String getUserName(){
	return(user_name) ;
	}
	public String getPassword(){
	return(password) ;
	}
}