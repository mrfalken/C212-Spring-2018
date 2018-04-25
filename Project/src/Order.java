
public class Order {
	 public static void main(String[] args) {

	        
	        MenuItem[] menu =new MenuItem[22];
	        
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
	        
	        
	        //assigning the items to  menu array 
	        menu[0]= pizza;
	        menu[1]= burger;
	        menu[2]= lobster;
	        menu[3]= chicken;
	        menu[4]= spaghetti;
	        menu[5]= steak;
	        menu[6]= ribs;
	        menu[7]= lamb;
	        menu[8]= sushi;
	        menu[9]= fish;
	        menu[10]= mac;
	        menu[11]= soup;
	        menu[12]= salad;
	        menu[13]= fries;
	        menu[14]= chips;
	        menu[15]= spinach;
	        menu[16]= rice;
	        menu[17]= mashed;
	        menu[18]= applesauce;
	        menu[19]= coleslaw;
	        menu[20]= bread;
	        menu[21]= beans;
	    }
	 public void addEntree(String s) {
		 
	 }
	 public void addSide(String s) {
		 
	 }
	 public void deleteEntree(String s) {
		 
	 }
	 public void deleteSide(String s) {
		 
	 }
}
