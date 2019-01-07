package views;

import java.util.Scanner;

import controllers.CustomerController;

public class RegisterView 
{
	Scanner scan = new Scanner(System.in);
	
	void view()
	{
		String name;
		do
		{
			System.out.print("Input customer name[5 - 20]: ");
			name = scan.nextLine();
		}while(name.length()< 5 || name.length()> 20);
		CustomerController.addNewCustomer(name);
		System.out.println("Insert new Customer Success !");
		return;
	}
	
	public RegisterView() 
	{
		view();
	}
}
