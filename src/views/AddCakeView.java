package views;

import java.util.Scanner;

import controllers.CakeController;

public class AddCakeView 
{
	Scanner scan = new Scanner(System.in);
	
	void view()
	{
		String type,topping;
		int price;
		
		do
		{
			System.out.print("Input cake type [Chiffon | Sponge | Foam]: ");
			type = scan.nextLine();
		}while(!type.equals("Chiffon") && !type.equals("Sponge") && !type.equals("Foam"));
		
		do
		{
			System.out.print("Input topping [Chocolate | Cheese | Strawberry]: ");
			topping = scan.nextLine();
		}while(!topping.equals("Chocolate") && !topping.equals("Cheese") && !topping.equals("Strawberry"));
		
		do
		{
			System.out.print("Input price [min. 10000]: ");
			try
			{
				price = scan.nextInt();
			}catch(Exception e){price = 0;}
			scan.nextLine();
		}while(price < 10000);
		
		CakeController.addNewCake(type, topping, price);
		System.out.println("Insert cake Success ");
		return;
	}
	
	public AddCakeView() 
	{
		view();
	}
}
