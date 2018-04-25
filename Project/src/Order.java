import java.util.Scanner;
public class Order 
{



	//creating 22 menu object with 10 entrees and 12 sides
	MenuItem pizza = new MenuItem("Pizza",10.00,false);
	
	MenuItem burger = new MenuItem("Burger",15.00,false);
	MenuItem lobster = new MenuItem("Lobster",25.00,false);
	MenuItem chicken = new MenuItem("Chicken",12.00,false);
	MenuItem spaghetti = new MenuItem("Spaghetti",8.00,false);
	
	MenuItem steak = new MenuItem("Steak",27.00,false);
	MenuItem ribs = new MenuItem("Ribs",16.00,false);
	MenuItem lamb = new MenuItem("Lamb",22.00,false);
	MenuItem sushi = new MenuItem("Sushi",13.00,false);
	MenuItem fish = new MenuItem("Fish",23.00,false);
	MenuItem mac = new MenuItem("Mac and Cheese",7.00,true);
	MenuItem soup = new MenuItem("Soup",6.00,true);
	MenuItem salad = new MenuItem("Salad",5.00,true);
	
	MenuItem fries = new MenuItem("Fries",3.00,true);
	MenuItem chips = new MenuItem("Chips",2.00,true);
	MenuItem spinach = new MenuItem("Spinach",2.00,true);
	MenuItem rice = new MenuItem("Rice",3.00,true);
	
	MenuItem mashed = new MenuItem("Mashed Potatoes",5.00,true);
	MenuItem applesauce = new MenuItem("Applesauce",2.00,true);
	
	MenuItem coleslaw = new MenuItem("Coleslaw",3.00,true);
	MenuItem bread = new MenuItem("Bread",3.00,true);
	MenuItem beans = new MenuItem("Beans",7.00,true);
	
	final MenuItem[] menu = {pizza, burger, lobster, chicken, spaghetti, steak, ribs, lamb, sushi, fish,
			mac, soup, salad, fries, chips, spinach, rice, mashed, applesauce, coleslaw, bread, beans};

	//assigning the items to  menu array 
	
	public void addEntree(String s) {
			Scanner scan = new Scanner(System.in);
			System.out.println("Which entree would you like to choose?");
			Order e = new Order();
			e.printEntree();
			s = scan.next();
			
	}
	public void addSide(String s) {

	}
	public void deleteEntree(String s) {

	}
	public void deleteSide(String s) {

	}
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
				
			
	
		
	
public static void main (String[]args)
{
	Order d = new Order();
	d.addEntree("");
	/*
	Order d = new Order();
	d.printSide();
	Order e = new Order();
	e.printEntree();
	*/
}
}
