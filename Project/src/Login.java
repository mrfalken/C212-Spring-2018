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
	private static final int MANAGER_PIN = 1234;
	
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
	
	public static void addUser(String name)
	{
		inputReader = new Scanner(System.in);
		//System.out.print("Create a username: ");
		String username = name;
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
	
	public static void removeUser()
	{
		inputReader = new Scanner(System.in);
		System.out.print("Which user would you like to remove?: ");
		String userToRemove = inputReader.next();
		try {
			fileReader = new Scanner(new File("Login.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.print("What is the manager pin?: ");
		boolean isNumber = true;
		do
		{
			String pinInput = inputReader.next();
			try 
			{
				int iPinInput = Integer.parseInt(pinInput);
			} catch(NumberFormatException e)
			{
				System.out.println("The pin must be a number");
				isNumber = false;
			}
		} while(!isNumber);

		String newLogin = "";
		
		System.out.println(fileReader.hasNextLine());
		while(fileReader.hasNextLine())
		{
			String currentCredentials = fileReader.nextLine();
			Scanner credentialReader = new Scanner(currentCredentials);
			System.out.println(currentCredentials);
			credentialReader.useDelimiter(", ");
			if(credentialReader.next().equals(userToRemove))
			{
				System.out.println("SKIPPED");
				continue;
			}
			else 
			{
				newLogin+=currentCredentials+System.getProperty("line.separator");
			}
		}
		try {
			output = new FileWriter("Login.txt",false);
			output.write(newLogin);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("User removed.");
	}
	
	public static void removeUser(String user)
	{
		inputReader = new Scanner(System.in);
		//System.out.print("Which user would you like to remove?: ");
		String userToRemove = user;
		try {
			fileReader = new Scanner(new File("Login.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		System.out.print("What is the manager pin?: ");
		boolean isNumber = true;
		do
		{
			String pinInput = inputReader.next();
			try 
			{
				int iPinInput = Integer.parseInt(pinInput);
			} catch(NumberFormatException e)
			{
				System.out.println("The pin must be a number");
				isNumber = false;
			}
		} while(!isNumber);

		String newLogin = "";
		
		System.out.println(fileReader.hasNextLine());
		while(fileReader.hasNextLine())
		{
			String currentCredentials = fileReader.nextLine();
			Scanner credentialReader = new Scanner(currentCredentials);
			credentialReader.useDelimiter(", ");
			if(credentialReader.next().equals(userToRemove))
			{
				continue;
			}
			else 
			{
				newLogin+=currentCredentials+System.getProperty("line.separator");
			}
		}
		try {
			output = new FileWriter("Login.txt",false);
			output.write(newLogin);
			output.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void changePassword() 
	{
		inputReader = new Scanner(System.in);
		System.out.print("What is your username?: ");
		String username = inputReader.next();
		
		removeUser(username);
		
		addUser(username);
		
		
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
					credentialReader.close();
					return true;
				}
				else
				{
					System.out.println("Incorrect Password");
					credentialReader.close();
					return false;
				}
				
			}
		}
		System.out.println("Incorrect Credentials");
		return false;
	}
	
	public static void main(String[] args) //For testing purposes
	{
		//Login.removeUser();
		//Login.addUser(); //Uncomment to test adding credentials
		Login.changePassword();
		/*
		Login.addUser();
		Login.addUser();
		Login.addUser();
		*/
		
		//Login.login();
	}
}
