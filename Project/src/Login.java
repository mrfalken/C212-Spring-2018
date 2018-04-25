import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public static class Login 
{
	private String username;
	private String password;
	private Scanner sc;
	PrintWriter output;
	
	public void addUser(String username, String password)
	{
		sc = new Scanner(System.in);
		System.out.println("Create a username: ");
		username = sc.nextLine();
		System.out.println("Create a password: ");
		password = sc.nextLine();
		
		try {
			output = new PrintWriter("Login.txt");
			output.println(username+", "+password);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
