import java.util.ArrayList;

public class SeatingChart 
{
	private static ArrayList <Table> tables = new ArrayList<Table>();
	
	public SeatingChart (ArrayList<Table> t)
	{
		tables = t;
	}
	
	public static ArrayList<Table> createTables()
	{
		
		for (int i = 0; i <= 29; i++)
		{
			
			tables.add(new Table(i, 0));
			
			
		}
		return tables;

	}

	public static void printChart()
	{
		for (int i = 0; i < tables.size(); i ++)
		{
			System.out.println(tables.get(i));
		}
	}



	public static void clearTable(int n)
	{
		for (int i = 0; i < tables.size(); i ++)
		{
			if (tables.get(i).getTableNum() == n)
			{
				tables.remove(i);
			}
		}
	}

	public static ArrayList<Table> gettables()
	{
		return tables;
	}

	public static Table getTableByNum(int n)
	{
		for (int i = 0; i < tables.size(); i++)
		{
			if(n == tables.get(i).getTableNum())
			{
				return tables.get(i);
			}

		}
		System.out.println("Table number" + n + " does not exist");
		return null;


	}

	public static ArrayList<Table> getTables()
	{
		return tables;
	}
}