import java.util.ArrayList;
import java.util.Scanner;
public class Order 
{
	private Table table;
	private static ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
	private static ArrayList<MenuItem> side= new ArrayList<MenuItem>();

	public Order(Table t, ArrayList<MenuItem> entre, ArrayList<MenuItem> si) 
	{ 
		entrees = entre;
		side = si;
	}

	//creating 22 menu object with 10 entrees and 12 sides
	private final static MenuItem PIZZA = new MenuItem("Pizza",10.00,false); //change all to CAPS
	private final static MenuItem BURGER = new MenuItem("Burger",15.00,false);
	private final static MenuItem LOBSTER = new MenuItem("Lobster",25.00,false);
	private final static MenuItem CHICKEN = new MenuItem("Chicken",12.00,false);
	private final static MenuItem SPAGHETTI = new MenuItem("Spaghetti",8.00,false);
	private final static MenuItem STEAK = new MenuItem("Steak",27.00,false);
	private final static MenuItem RIBS = new MenuItem("Ribs",16.00,false);
	private final static MenuItem LAMB = new MenuItem("Lamb",22.00,false);
	private final static MenuItem SUSHI = new MenuItem("Sushi",13.00,false);
	private final static MenuItem FISH = new MenuItem("Fish",23.00,false);
	private final static MenuItem MAC = new MenuItem("Mac",7.00,true);
	private final static MenuItem SOUP = new MenuItem("Soup",6.00,true);
	private final static MenuItem SALAD = new MenuItem("Salad",5.00,true);
	private final static MenuItem FRIES = new MenuItem("Fries",3.00,true);
	private final static MenuItem CHIPS = new MenuItem("Chips",2.00,true);
	private final static MenuItem SPINACH = new MenuItem("Spinach",2.00,true);
	private final static MenuItem RICE = new MenuItem("Rice",3.00,true);
	private final static MenuItem MASHED = new MenuItem("Potatoes",5.00,true);
	private final static MenuItem APPLESAUCE = new MenuItem("Applesauce",2.00,true);
	private final static MenuItem COLESLAW = new MenuItem("Coleslaw",3.00,true);
	private final static MenuItem BREAD = new MenuItem("Bread",3.00,true);
	private final static MenuItem BEANS = new MenuItem("Beans",7.00,true);

	final static MenuItem[] menu = {PIZZA, BURGER, LOBSTER, CHICKEN, SPAGHETTI, STEAK, RIBS, LAMB, SUSHI, FISH,
			MAC, SOUP, SALAD, FRIES, CHIPS, SPINACH, RICE, MASHED, APPLESAUCE, COLESLAW, BREAD, BEANS};

	//assigning the items to  menu array 

	public static Order placeOrder() {
		System.out.println("Which table number would you like to place an entree for? ");
		Scanner scan = new Scanner(System.in);
		int tn = scan.nextInt();
		while (tn > 29 || tn < 0)
		{
			System.out.println("The Table you selected does not exist. Please enter a Table number between 0-29: ");
			tn = scan.nextInt();
		}
		
		while (SeatingChart.getTables().get(tn).getSeatsFilled() == 0)
		{
			System.out.println("The Table you selected is empty, please choose a Table Number that has people at it: ");
			SeatingChart.printChart();
			tn = scan.nextInt();

		}
		
		Table t = SeatingChart.getTableByNum(tn);
		
		while (t == null)
		{
			System.out.print("Which table number would you like to place an entree for? ");
			tn = scan.nextInt();
			t = SeatingChart.getTableByNum(tn);
		}


		boolean entree = true;
		boolean sides = false;

		for (int j = 0; j < entrees.size(); j++)
		{
			entrees.remove(j);	
		}
		for (int z = 0; z < side.size(); z++)
		{
			side.remove(z);	
		}

		for (int i = 0; i < 10; i++)
		{
			System.out.println(menu[i]);	
		}

		while (entree)
		{
			System.out.println("Which entree would you like to add? Press q when done adding entrees");
			String s = scan.next();
			if (s.equalsIgnoreCase("pizza")) 
			{
				entrees.add(PIZZA);
			}
			else if (s.equalsIgnoreCase("burger")) 
			{
				entrees.add(BURGER);
			}
			else if (s.equalsIgnoreCase("lobster")) 
			{
				entrees.add(LOBSTER);
			}
			else if (s.equalsIgnoreCase("chicken")) 
			{
				entrees.add(CHICKEN);
			}
			else if (s.equalsIgnoreCase("spaghetti")) {
				entrees.add(SPAGHETTI);
			}
			else if (s.equalsIgnoreCase("steak")) {
				entrees.add(STEAK);
			}
			else if (s.equalsIgnoreCase("ribs")) {

				entrees.add(RIBS);
			}
			else if (s.equalsIgnoreCase("lamb")) {
				entrees.add(LAMB);
			}
			else if (s.equalsIgnoreCase("sushi")) {
				entrees.add(SUSHI);
			}
			else if (s.equalsIgnoreCase("fish")) {
				entrees.add(FISH);
			}
			else if (s.equalsIgnoreCase("q"))
			{
				entree = false;
				sides = true;
			}
			else
			{
				System.out.print("That item is not an Entree on our Menu \n");
			}

		}


		for (int i = 10; i < menu.length; i++)
		{
			System.out.println(menu[i]);	
		}

		while (sides == true)
		{
			System.out.println("Which sides would you like to add? Press q when done adding sides");

			String si = scan.next();

			if (si.equalsIgnoreCase("mac")) 
			{
				side.add(MAC);
			}
			else if (si.equalsIgnoreCase("soup")) 
			{
				side.add(SOUP);
			}
			else if (si.equalsIgnoreCase("salad")) 
			{
				side.add(SALAD);
			}
			else if (si.equalsIgnoreCase("fries")) 
			{
				side.add(FRIES);
			}
			else if (si.equalsIgnoreCase("chips")) {
				side.add(CHIPS);
			}
			else if (si.equalsIgnoreCase("spinach")) {
				side.add(SPINACH);
			}
			else if (si.equalsIgnoreCase("rice")) {
			
				side.add(RICE);
			}
			else if (si.equalsIgnoreCase("potatoes")) {
				side.add(MASHED);
			}
			else if (si.equalsIgnoreCase("applesauce")) {
				side.add(APPLESAUCE);
			}
			else if (si.equalsIgnoreCase("coleslaw")) {
				side.add(COLESLAW);
			}
			else if (si.equalsIgnoreCase("bread")) {
				side.add(BREAD);
			}
			else if (si.equalsIgnoreCase("beans")) {
				side.add(BEANS);
			}
			else if (si.equalsIgnoreCase("q"))
			{

				sides = false;
			}
			else
			{
				System.out.print("That item is not an Side on our Menu \n");
			}
		}



		Order o = new Order(t,entrees,side);
		System.out.println("Here is the order you input: " + o);
		
		
		System.out.println("Would you like to edit the order? Y or N: ");
		String f  = scan.next();
		
		boolean edit = false;
		//if edit
		if (f.equalsIgnoreCase("y"))
		{
			edit = true;
			
		}
		while (edit)
		{
	

		boolean deleteEntree = false;
		while (deleteEntree == false)
		{
			System.out.println("Would you like to delete something from the order? Y or N: ");
			String d  = scan.next();
			
			if (d.equalsIgnoreCase("y")) //delete
			{
				System.out.println("Would you like to delete an Entree from the order? Y or N: ");
				String delEntr  = scan.next();
				
				if (delEntr.equalsIgnoreCase("y")) //delete specific entree
				{
					
					System.out.println("Please enter the name of the Entree you would like to Delete: ");
					String del = scan.next();
					deleteEntree(del);
					deleteEntree = true;
				}
				else if (delEntr.equalsIgnoreCase("n")) // dont delete entree
				{
					deleteEntree = true;
				}
				
				else // invalid input Y or N
				{
					System.out.println("Invalid input. Please Enter Y or N: ");
					
				}
				
			}
		}
			
			
			//DELETE SIDE
		boolean deleteSide = false;
		while (deleteSide == false)
		{
			System.out.println("Would you like to delete an Side from the order? Y or N: ");
			String delS  = scan.next();
			
			if (delS.equalsIgnoreCase("y")) //delete specific Side
			{
				System.out.println("Please enter the name of the Side you would like to Delete: ");
				String del2 = scan.next();
				deleteSide(del2);
				deleteSide = true;
			}
			else if (delS.equalsIgnoreCase("n")) // dont delete Side
			{
				deleteSide = true;
			}
			
			else // invalid input Y or N
			{
				System.out.println("Invalid input. Please Enter Y or N: ");
				
			}
		}
			
			///////////////////////////////////////////////////////////////////////////////////////////////////////
			
			
				//Add to order
		boolean addEntree = false;
		while (addEntree == false)
		{
			System.out.println("Would you like to Add something to the order? Y or N: ");
			String add  = scan.next();
			
			if (add.equalsIgnoreCase("y")) //add
			{
				System.out.println("Would you like to add an Entree to the order? Y or N: ");
				String adEntr  = scan.next();
				
				if (adEntr.equalsIgnoreCase("y")) //add specific entree
				{
					System.out.println("Please enter the name of the Entree you would like to Add: ");
					String add2 = scan.next();
					addEntree(add2);
					addEntree = true;
				}
				else if (adEntr.equalsIgnoreCase("n")) // dont add entree
				{
					addEntree = true;
				}
				
				else // invalid input Y or N
				{
					System.out.println("Invalid input. Please Enter Y or N: ");
				
				}
				
				
			}
		}
			
			
			//ADD SIDE
		boolean addSide = false;
		while (addSide == false)
		{
			System.out.println("Would you like to add a Side to the order? Y or N: ");
			String addS  = scan.next();
			
			if (addS.equalsIgnoreCase("y")) //add specific Side
			{
				System.out.println("Please enter the name of the Side you would like to add: ");
				String add3 = scan.next();
				addSide(add3);
				addSide = true;
			}
			else if (addS.equalsIgnoreCase("n")) // dont delete entree
			{
				addSide = true;
			}
			
			else // invalid input Y or N
			{
				System.out.println("Invalid input. Please Enter Y or N: ");
			
			}
		
			
		}
			
			
			////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			//Submit order after editing
			System.out.println("Here is the edited order: " + o);
			System.out.println("Order has been sent to the kitchen!");
			return o;
		}
			
			
			if (f.equalsIgnoreCase("n")) // no need to edit
			{
				edit = false;
				System.out.println("Order has been sent to the kitchen!");
				return o;
			}
			/*
			else // not yes or no
			{
				System.out.println("Invalid input. Would you like to edit the order? Y or N: ");
				f  = scan.next();
			}
			*/
		return o; // Catch-all Return Case 
	}

	public static void deleteEntree(String s) 
	{	
		for (int i = 0; i < entrees.size(); i ++)
		{
			if (entrees.get(i).getItemName().equalsIgnoreCase(s))
				entrees.remove(i);
		}


	}
	public static void deleteSide(String s) 
	{
		for (int i = 0; i < side.size(); i ++)
		{
			if (side.get(i).getItemName().equalsIgnoreCase(s))
				side.remove(i);
		}

	}
	
	
	public static void addEntree(String s) 
	{	
		for (int i = 0; i < menu.length; i ++)
		{
			if (menu[i].getItemName().equalsIgnoreCase(s))
				entrees.add(menu[i]);
		}


	}
	public static void addSide(String s) 
	{
		for (int i = 0; i < menu.length; i ++)
		{
			if (menu[i].getItemName().equalsIgnoreCase(s))
				side.add(menu[i]);
		}


	}
	
	public ArrayList<MenuItem> getEntrees()
	{
		return entrees;
	}
	
	public ArrayList<MenuItem> getSides()
	{
		return side;
	}


	public String toString()
	{
		String str = "\n Entrees: \n";
		for (int i = 0; i < entrees.size(); i ++)
		{
			str += entrees.get(i) + "\n";

		}
		str += "Sides: \n";
		for (int j = 0; j < side.size(); j ++)
		{
			str += side.get(j) + "\n";
		}
		return str;

	}

	
	//MAX Make all final variables All Caps



}
