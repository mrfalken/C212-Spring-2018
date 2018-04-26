import java.util.ArrayList;
import java.util.Scanner;
public class Order 
{
	private Tables table;
	private static ArrayList<MenuItem> entrees = new ArrayList<MenuItem>();
	private static ArrayList<MenuItem> side= new ArrayList<MenuItem>();

	public Order(Tables t, ArrayList<MenuItem> entre, ArrayList<MenuItem> si) 
	{ 
		entrees = entre;
		side = si;
	}

	//creating 22 menu object with 10 entrees and 12 sides
	private final static MenuItem pizza = new MenuItem("Pizza",10.00,false);

	private final static MenuItem burger = new MenuItem("Burger",15.00,false);
	private final static MenuItem lobster = new MenuItem("Lobster",25.00,false);
	private final static MenuItem chicken = new MenuItem("Chicken",12.00,false);
	private final static MenuItem spaghetti = new MenuItem("Spaghetti",8.00,false);

	private final static MenuItem steak = new MenuItem("Steak",27.00,false);
	private final static MenuItem ribs = new MenuItem("Ribs",16.00,false);
	private final static MenuItem lamb = new MenuItem("Lamb",22.00,false);
	private final static MenuItem sushi = new MenuItem("Sushi",13.00,false);
	private final static MenuItem fish = new MenuItem("Fish",23.00,false);
	private final static MenuItem mac = new MenuItem("Mac",7.00,true);
	private final static MenuItem soup = new MenuItem("Soup",6.00,true);
	private final static MenuItem salad = new MenuItem("Salad",5.00,true);

	private final static MenuItem fries = new MenuItem("Fries",3.00,true);
	private final static MenuItem chips = new MenuItem("Chips",2.00,true);
	private final static MenuItem spinach = new MenuItem("Spinach",2.00,true);
	private final static MenuItem rice = new MenuItem("Rice",3.00,true);

	private final static MenuItem mashed = new MenuItem("Mashed Potatoes",5.00,true);
	private final static MenuItem applesauce = new MenuItem("Applesauce",2.00,true);

	private final static MenuItem coleslaw = new MenuItem("Coleslaw",3.00,true);
	private final static MenuItem bread = new MenuItem("Bread",3.00,true);
	private final static MenuItem beans = new MenuItem("Beans",7.00,true);

	final static MenuItem[] menu = {pizza, burger, lobster, chicken, spaghetti, steak, ribs, lamb, sushi, fish,
			mac, soup, salad, fries, chips, spinach, rice, mashed, applesauce, coleslaw, bread, beans};

	//assigning the items to  menu array 

	public static Order placeOrder() {
		System.out.println("Which table number would you like to place an entree for? ");
		Scanner scan = new Scanner(System.in);
		int tn = scan.nextInt();
		Tables t = Tables.getTableByNum(tn);
		while (t == null)
		{
			System.out.print("Which table number would you like to place an entree for? ");
			tn = scan.nextInt();
			t = Tables.getTableByNum(tn);
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
			System.out.println("Which entree would you like to add? Press q to quit when done adding entrees");
			String s = scan.next();
			if (s.equalsIgnoreCase("pizza")) 
			{
				entrees.add(pizza);
			}
			else if (s.equalsIgnoreCase("burger")) 
			{
				entrees.add(burger);
			}
			else if (s.equalsIgnoreCase("lobster")) 
			{
				entrees.add(lobster);
			}
			else if (s.equalsIgnoreCase("chicken")) 
			{
				entrees.add(chicken);
			}
			else if (s.equalsIgnoreCase("spaghetti")) {
				entrees.add(spaghetti);
			}
			else if (s.equalsIgnoreCase("steak")) {
				entrees.add(steak);
			}
			else if (s.equalsIgnoreCase("ribs")) {

				entrees.add(ribs);
			}
			else if (s.equalsIgnoreCase("lamb")) {
				entrees.add(lamb);
			}
			else if (s.equalsIgnoreCase("sushi")) {
				entrees.add(sushi);
			}
			else if (s.equalsIgnoreCase("fish")) {
				entrees.add(fish);
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
			System.out.println("Which sides would you like to add? Press q to quit when done adding sides");

			String si = scan.next();

			if (si.equalsIgnoreCase("mac")) 
			{
				side.add(mac);
			}
			else if (si.equalsIgnoreCase("soup")) 
			{
				side.add(soup);
			}
			else if (si.equalsIgnoreCase("salad")) 
			{
				side.add(salad);
			}
			else if (si.equalsIgnoreCase("fries")) 
			{
				side.add(fries);
			}
			else if (si.equalsIgnoreCase("chips")) {
				side.add(chips);
			}
			else if (si.equalsIgnoreCase("spinach")) {
				side.add(spinach);
			}
			else if (si.equalsIgnoreCase("rice")) {
				System.out.println("RIBZZZZ");
				side.add(rice);
			}
			else if (si.equalsIgnoreCase("mashed potatoes")) {
				side.add(mashed);
			}
			else if (si.equalsIgnoreCase("applesauce")) {
				side.add(applesauce);
			}
			else if (si.equalsIgnoreCase("cole slaw")) {
				side.add(coleslaw);
			}
			else if (si.equalsIgnoreCase("bread")) {
				side.add(bread);
			}
			else if (si.equalsIgnoreCase("beans")) {
				side.add(beans);
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
		System.out.println("Here is the order you placed " + o);
		return o;
	}

	public void deleteEntree(String s) 
	{	
		for (int i = 0; i < entrees.size(); i ++)
		{
			if (entrees.get(i).getItemName().equals(s))
				entrees.remove(i);
		}


	}
	public void deleteSide(String s) 
	{
		for (int i = 0; i < side.size(); i ++)
		{
			if (side.get(i).getItemName().equals(s))
				side.remove(i);
		}

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
	/*
	public void printSide()
	{

		for (int i =0; i < menu.length; i++ ) {
				if (menu[i].isSide())
				{
					System.out.println(menu[i]);
				}
		}
	}

	public void printEntree()
	{
		for (int i = 0; i < menu.length; i++) {
			if(!(menu[i].isSide())) {
				System.out.println(menu[i]);
			}
		}
	}


	 */



}
