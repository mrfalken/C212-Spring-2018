import java.util.ArrayList;
import java.util.Scanner;

public class Table 
{
	private  int tableNum;
	private int seatsFilled;
	private Order tableOrder;
	
	public Table(int num, int seatsF)
	{
		Scanner s = new Scanner(System.in);
		while (seatsF >= 4 && seatsF <= 0)
		{
			System.out.println("A table can only fit four people. Please enter a number of occupants between 1-4");
			seatsF = s.nextInt();
		}
	
		tableNum = num;
		seatsFilled = seatsF;
	}
	
	
	public int getSeatsFilled() {
		return seatsFilled;
	}
	public void setSeatsFilled(int seatsFilled)
	{
		Scanner scan = new Scanner(System.in);
		while (seatsFilled >= 4 || seatsFilled <= 0)
		{
			System.out.println("A table can only fit four people. Please enter a number of occupants between 1-4");
			seatsFilled = scan.nextInt();
			
		}
		this.seatsFilled = seatsFilled;
	}
	public int getTableNum() {
		return tableNum;
	}
	
	public boolean isOccupied()
	{
		if(this.getSeatsFilled() == 0)
		{
			return false;
		}
		return true;
	}
	
	public void setOrder(Order newOrder)
	{
		tableOrder = newOrder;
	}
	
	public Order getOrder()
	{
		return tableOrder;
	}
	
	public String toString()
	{
		return "Table Num: " + tableNum + " Seats Filled: " + seatsFilled;
	}

}
