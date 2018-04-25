import java.util.ArrayList;
import java.util.Scanner;

public class Server 
{
	public Server()
	{ }
	
	public Server(String user, String pass)
	{
		user = "server";
		pass = "server";
		Login.login();
	}
	
	public String takeOrder(String a, String b)
	{
		String order = a + ", " + b;
		return order;
	}
	
	public void viewPreviousTables()
	{
		
	}
	
	
}
