package views;

import java.util.Scanner;

public class StaffView 
{
	Scanner scan = new Scanner(System.in);
	
	void view()
	{
		int input;
		do
		{
			System.out.println("BJ Cake Shop");
			System.out.println("1. Add Customer");
			System.out.println("2. Transaction Form");
			System.out.println("3. Add Cake");
			System.out.println("4. View Transaction Data");
			System.out.println("5. Exit");
			try
			{
				System.out.print("Choose menu: ");input = scan.nextInt();
			}catch(Exception e){input = 0;}
			scan.nextLine();
			
			switch(input)
			{
			case 1:
				new RegisterView();
				break;
			case 2:
				new TransactionFormView();
				break;
			case 3:
				new AddCakeView();
				break;
			case 4:
				new ViewTransactionDataView();
				break;
			}
			
		}while(input != 5);
	}
	
	public StaffView() 
	{
		view();
	}
}
