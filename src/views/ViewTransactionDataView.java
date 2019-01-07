package views;

import java.util.Scanner;
import java.util.Vector;

import controllers.CakeController;
import controllers.CustomerController;
import controllers.TransactionController;
import models.Cake;
import models.Customer;
import models.Transaction;

public class ViewTransactionDataView 
{
	Scanner scan = new Scanner(System.in);
	void view()
	{
		Vector<Transaction> transList = TransactionController.getAllTransaction();
		if(transList.size() == 0)
		{
			System.out.println("No Transaction");
			return;
		}
		
		
		System.out.printf
		("| %10s | %20s | %10s | %10s | %10s | %10s |\n",
		"Tran ID",
		"Customer Name",
		"Cake ID",
		"Cake Type",
		"Topping",
		"Price");
		for(int i = 0; i< transList.size();i++)
		{
			Transaction trans 
			= transList.get(i);
			Customer customer 
			= CustomerController.getCustomerById(trans.getCustomerID());
			Cake cake 
			= CakeController.getCakeById(trans.getCakeID());
			
			System.out.printf
			("| %10d | %20s | %10d | %10s | %10s | %10d |\n",
			trans.getTransactionID(),
			customer.getName(),
			cake.getCakeID(),
			cake.getCakeType(),
			cake.getTopping(),
			cake.getPrice());
		}
		
		scan.nextLine();
		return;
		
	}
	
	public ViewTransactionDataView() 
	{
		view();
	}
}
