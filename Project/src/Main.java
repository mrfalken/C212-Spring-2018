import java.util.Scanner;

public class Main 
{
	
	public static void main (String [] args)
	{
		boolean run = true;
		Scanner keyboard = new Scanner(System.in);
		Login log = new Login();
		if (log.login())
		{
		while (run == true)
		{	
			System.out.println("What would you like to do today?");
			System.out.println("1. Place Order");
			System.out.println("2. Process Payment");
			System.out.println("3. Change Order");
			System.out.println("4. Seat Table");
			System.out.println("5. Clear Table");
			
			///MANAGER _ADD/DELETE SERVERS // APPLY DISCOUNTS TO BILL (Any discount)//
			System.out.println("6. Logout");
			int o = keyboard.nextInt();
			
			if (o == 1)
			{
				Order.placeOrder();
			}
			else if (o == 2)
			{
				
			}
			else if (o == 3)
			{
				
			}
			else if (o == 4)
			{
				System.out.println("Please enter the table number you would like to seat");
				int tn = keyboard.nextInt();
				System.out.println("Please enter the number of people you would like to seat");
				int np = keyboard.nextInt();
				
				Tables  t = new Tables(tn,np);
			
				Tables.printChart();
			}
			
			else if (o == 5)
			{
				System.out.println("Please enter the table number you would like to clear");
				int tn = keyboard.nextInt();
				
				Tables.clearTable(tn);
			
				Tables.printChart();
			}
			
			else if (o == 6)
			{
				System.out.println("Logged Out");
				run = false;
			}
			else
			{
				System.out.println("Invalid Input. Please choose an option 1-5");
			}
			
	
			}
		}
		else 
		{
			System.out.println("ACCESS DENIED");
		}
	}

}
