import java.util.ArrayList;
import java.util.Scanner;

public class Tables 
{
	private int tableNum;
	private int seatsFilled;
	private static ArrayList <Tables> seatingChart = new ArrayList<Tables>();
	
	
	public Tables(int num, int seatsF)
	{
		Scanner s = new Scanner(System.in);
		int newSeatsF = 0;
		boolean wrongInput = false;

		while (seatsF > 4 || seatsF < 1)
		{
			System.out.println("A table can only fit four people. Please enter a number of occupants between 1-4");
			wrongInput = true;
			seatsF = s.nextInt();
			
		}
		
	
		tableNum = num;
		seatsFilled = seatsF;
		
		seatingChart.add(this);
	}
	
	
	public int getSeatsFilled() {
		return seatsFilled;
	}
	public void setSeatsFilled(int seatsFilled) {
		this.seatsFilled = seatsFilled;
	}
	public int getTableNum() {
		return tableNum;
	}
	public void setTableNum(int tableNum) {
		this.tableNum = tableNum;
	}
	
	public boolean isOccupied()
	{
		if(this.getSeatsFilled() == 0)
		{
			return false;
		}
		return true;
	}
	
	public static void printChart()
	{
		for (int i = 0; i < seatingChart.size(); i ++)
		{
			System.out.println(seatingChart.get(i));
		}
	}
	
	public String toString()
	{
		return "Table Num: " + tableNum + " Seats Filled: " + seatsFilled;
	}
	
	public static void clearTable(int n)
	{
		for (int i = 0; i < seatingChart.size(); i ++)
		{
			if (seatingChart.get(i).tableNum == n)
			{
				seatingChart.remove(i);
			}
		}
	}
	
	public static Tables getTableByNum(int n)
	{
		for (int i = 0; i < seatingChart.size(); i++)
		{
			if(n == seatingChart.get(i).tableNum)
			{
				return seatingChart.get(i);
			}
		
		}
				System.out.println("Table number" + n + " does not exist");
				return null;
	
	}

}
//GARRETT ADD TABLE ARRAYLIST