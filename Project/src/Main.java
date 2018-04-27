import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	public static void main (String [] args)
	{
		boolean run = true;
		Scanner keyboard = new Scanner(System.in);

		Login log = new Login();
		SeatingChart.createTables();
		if (log.login())
		{
			while (run == true)
			{	
				System.out.println("What would you like to do today?");
				System.out.println("1. Seat Table");
				System.out.println("2. Place Order");
				System.out.println("3. Process Payment");
				System.out.println("4. Clear Table");

				///MANAGER _ADD/DELETE SERVERS // APPLY DISCOUNTS TO BILL (Any discount)//
				System.out.println("5. Logout");
				int o = keyboard.nextInt();

				
			
				if (o == 1)
				{
					System.out.println("Please enter the table number you would like to seat 0-29");
					int tn = keyboard.nextInt();
					while (tn >= 28 || tn <= -1)
					{
						System.out.println("Invalid Input. Please Enter A number 0-29");
						tn = keyboard.nextInt();
						
					}
					System.out.println("Please enter the number of people you would like to seat");
					int np = keyboard.nextInt();
					Scanner scan = new Scanner(System.in);
					while (np > 4 || np < 1)
					{
						System.out.println("A table can only fit four people. Please enter a number of occupants between 1-4");
						np = scan.nextInt();
						
					}
					
					for (int i = 0; i < SeatingChart.getTables().size(); i++ )
					{
						if (SeatingChart.getTables().get(i).getTableNum() == tn)
						{
							SeatingChart.getTables().get(i).setSeatsFilled(np);
						}


					}
					SeatingChart.printChart();
				}
				
				else if (o == 2)
				{
					Order.placeOrder();
				}
				
				else if (0 == 3)
				{
					
					
				}

				else if (o == 4)
				{
					System.out.println("Please enter the table number you would like to clear 0-29");
					int tn = keyboard.nextInt();
					while (tn >= 28 || tn <= -1)
					{
						System.out.println("Invalid Input. Please Enter A number 0-29");
						tn = keyboard.nextInt();
						
					}
					SeatingChart.clearTable(tn);

					SeatingChart.printChart();
				}

				else if (o == 5)
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
