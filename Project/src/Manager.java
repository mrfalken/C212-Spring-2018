import java.util.ArrayList;
import java.util.Scanner;

public class Manager extends Login
{	
	public Manager()
	{ }
	
	public void addServer(String s, ArrayList a)
	{
		Login.addUser();
		a.add(s);
	}
	
	 public void deleteServer(String s, ArrayList a)
	 {
		 Login.removeUser();
		 a.remove(s);
	 }
	
	 public double applyDiscount(int n, int d)
	 {
		 int total = n;
		 total = total / d;
		 total = n - total;
		 return total;
	 }
}
