import java.util.ArrayList;
import java.util.Scanner;

public class Payment 
{
	private static Scanner inputReader;
	private static final double TAX_PERCENT = 0.08;
	
	
	public static void pay(Order finalOrder)
	{
		double subtotal = 0;
		ArrayList<MenuItem> entrees = finalOrder.getEntrees();
		ArrayList<MenuItem> sides = finalOrder.getSides();
		System.out.println("Entrees:");
		for(MenuItem i : entrees) 
		{
			subtotal+=i.getPrice();
			System.out.printf("%16s:",i.getItemName());
			System.out.printf("%11s%,.2f%n", "$",i.getPrice());
			
		}
		System.out.println("Sides:");
		for(MenuItem i : sides)   
		{ 
			subtotal+=i.getPrice();
			System.out.printf("%16s:",i.getItemName());
			System.out.printf("%11s%,.2f%n", "$",i.getPrice());
		}
		
		
		double total = subtotal;
		System.out.printf("Subtotal: %7s%,.2f%n", "$", subtotal);
		double tax = Math.round((subtotal * TAX_PERCENT)*100)/100;
		System.out.printf("Tax: %12s%,.2f%n", "$", tax);
		double gratuity = Math.round((subtotal*0.20)*100)/100;
		System.out.printf("Gratuity: %7s%,.2f%n","$",gratuity);
		total+=tax+gratuity;
		System.out.printf("Total: %10s%,.2f%n", "$", total);
		
		
		
		inputReader = new Scanner(System.in);
		System.out.print("How did the customer pay?(Cash or card): ");
		String paymentMethod = inputReader.next();
		boolean paymentCorrect = false;
		while(!paymentCorrect)
		{
			if(paymentMethod.equalsIgnoreCase("card"))
			{
				System.out.print("Please input the card number: ");
				int cardNumber = inputReader.nextInt();
				System.out.println("Please enter your pin number: ");
				int pinNumber = inputReader.nextInt();
				paymentCorrect = true; 
			} 
			else if(paymentMethod.equalsIgnoreCase("cash"))
			{
				System.out.print("Enter the amount of cash paid with: ");
				double cash = inputReader.nextFloat();
				if(cash<total)
				{
					System.out.println("There is not enough cash");
					continue;
				}
				System.out.printf("The change required is: %s%.2f%n","$",(double)Math.round(((cash - total)*100))/100);
				paymentCorrect = true;
			}
			if(paymentCorrect)
			{
				System.out.println("Transaction Completed!");
			}
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		MenuItem burger = new MenuItem("Burger",15.00,false);
		MenuItem lobster = new MenuItem("Lobster",25.00,false);
		
		MenuItem fries = new MenuItem("Fries",3.00,true);
		MenuItem chips = new MenuItem("Chips",2.00,true);
		MenuItem coleslaw = new MenuItem("Coleslaw",2.00,true);
		
		ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
		entrees.add(burger); entrees.add(lobster);
		
		ArrayList<MenuItem> sides = new ArrayList<MenuItem>();
		sides.add(fries); sides.add(chips); sides.add(coleslaw);
		
		Table tables = new Table(3, 4);
		Order order = new Order(tables, entrees, sides);
		Payment.pay(order);
	}
}
