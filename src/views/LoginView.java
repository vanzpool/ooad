package views;

import java.util.Scanner;

import controllers.StaffController;
import repository.Session;

public class LoginView 
{
	Scanner scan = new Scanner(System.in);
	
	void view()
	{
		String username,password;
		do
		{
			System.out.print("Insert Username: ");
			username = scan.nextLine();
			System.out.print("Insert Password: ");
			password = scan.nextLine();
			
			Session.logged =
					StaffController.authenticate(username, password);
			
			if(Session.logged == null)
				System.out.println("Invalid username / password !");
			else
				new StaffView();
			
		}while(Session.logged == null);
	}
	
	public LoginView() 
	{
		view();
	}
}
