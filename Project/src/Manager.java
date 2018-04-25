import java.util.ArrayList;
import java.util.Scanner;

public class Manager 
{
	private String order;
	
	public Manager()
	{ }
	
	public Manager(String user, String pass)
	{
		Login.login();
	}
	
	public void changeServerPassword(int n)
	{
		
	}
	
	public void addServer(ArrayList s)
	{
		
	}
	
	 public void deleteServer(ArrayList s)
	 {
		 
	 }
	
	 public double applyDiscount(int n)
	 {
		 int total = n;
		 total = total / 10;
		 total = n - total;
		 return total;
	 }
	
	public void changeOrder(Order o)
	{
		
	}
}
