import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Login
{
	private String order;
	
	public Manager()
	{ }
	
	public String managerPin(int pin)
	{
		String yes = "Access Granted";
		String no = "Access Denied";
		
		if(pin == 4321) 
		{
			return yes;
		}
		else
			return no;
	}
	
	public void addServer(String s, ArrayList a)
	{
		Login.addUser();
		a.add(s);
	}
	
	 public void deleteServer(String s, ArrayList a)
	 {
		 //Login.removeUser();
		 a.remove(s);
	 }
	
	 public double applyDiscount(int n)
	 {
		 int total = n;
		 total = total / 10;
		 total = n - total;
		 return total;
	 }
}
