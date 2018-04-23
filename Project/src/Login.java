import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Login 
{
	private static Scanner inputReader;
	private static Scanner fileReader;
	private static PrintWriter output;
	
	public static void addUser(String username, String password)
	{
		inputReader = new Scanner(System.in);
		System.out.println("Create a username: ");
		username = inputReader.nextLine();
		System.out.println("Create a password: ");
		password = inputReader.nextLine();
		
		try {
			output = new PrintWriter("Login.txt");
			output.println(username+", "+password);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void login(String username, String password)
	{
		try {
			fileReader = new Scanner(new File("login.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		HashMap<String, String> logins = new HashMap<String, String>();
		fileReader.useDelimiter(", ");
		while(fileReader.hasNext())
		{
			
		}
	}
}
