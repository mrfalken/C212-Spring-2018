import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class Login 
{
	private static Scanner inputReader;
	private static Scanner fileReader;
	private static FileWriter output;
	
	public static void addUser()
	{
		inputReader = new Scanner(System.in);
		System.out.print("Create a username: ");
		String username = inputReader.nextLine();
		System.out.print("Create a password: ");
		String password = inputReader.nextLine();
		if(username.equals("") || password.equals(""))
		{
			System.out.println("Could not enter user");
			return;
		}
		System.out.println();		
		try {
			output = new FileWriter("Login.txt", true);
			output.write(username+", "+password+System.getProperty("line.separator"));
			output.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean login()
	{
		inputReader = new Scanner(System.in);
		System.out.print("What is your username?: ");
		String username = inputReader.next();
		System.out.print("What is your password?: ");
		String password = inputReader.next();

		try {
			fileReader = new Scanner(new File("login.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(fileReader.hasNextLine())
		{
			String currentCredentials = fileReader.nextLine();
			Scanner credentialReader = new Scanner(currentCredentials);
			credentialReader.useDelimiter(", ");
			if(credentialReader.next().equals(username))
			{
				if(credentialReader.next().equals(password))
				{
					System.out.println("Logged In!");
					return true;
				}
				else
				{
					System.out.println("Incorrect Password");
					return false;
				}
			}
		}
		System.out.println("Incorrect Credentials");
		return false;
	}
	
	public static void main(String[] args) //For testing purposes
	{
		//Login.addUser(); //Uncomment to test adding credentials
		Login.login();
	}
	
	public static void login(String username, String password)
	{
		try {
			fileReader = new Scanner(new File("login.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}
}
