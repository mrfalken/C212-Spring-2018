import java.util.ArrayList;

public class Tables 
{
	private int tableNum;
	private int seatsFilled;
	private static ArrayList <Tables> seatingChart = new ArrayList<Tables>();
	public Tables(int num, int seatsF)
	{
		
		setTableNum(num);
		setSeatsFilled(seatsF);
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
			System.out.print(seatingChart.get(i));
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

}
