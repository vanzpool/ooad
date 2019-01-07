package views;

import java.util.Scanner;
import java.util.Vector;

import controllers.CakeController;
import controllers.CustomerController;
import controllers.TransactionController;
import models.Cake;
import models.Customer;
import repository.Session;

public class TransactionFormView 
{
	Scanner scan = new Scanner(System.in);
	
	void view()
	{
		Vector<Customer> customerList = CustomerController.getAllCustomer();
		if(customerList.size() == 0)
		{
			System.out.println("No Customer !");
			return;
		}
		
		int index = 0;
		do
		{
			for(int i = 0; i< customerList.size();i++)
			{
				Customer temp = customerList.get(i);
				System.out.println(temp.getCustomerID() + ". " + temp.getName());
			}
			System.out.print("Choose customer: ");
			index = scan.nextInt();
			scan.nextLine();
		}while(index < 1 || index > customerList.size());
		
		Customer customer = CustomerController.getCustomerById(index);
		
		Vector<Cake> cakeList = CakeController.getAllCake();
		if(cakeList.size() == 0)
		{
			System.out.println("No Cake !");
			return;
		}
		
		do
		{
			for(int i = 0; i< cakeList.size();i++)
			{
				Cake temp = cakeList.get(i);
				System.out.println(temp.getCakeID() + ". " + temp.getCakeType()
				+ " -- " + temp.getTopping() + " -- " + temp.getPrice());
			}
			System.out.print("Choose cake: ");
			index = scan.nextInt();
			scan.nextLine();
		}while(index < 1 || index > cakeList.size());
		
		Cake cake = CakeController.getCakeById(index);
		
		TransactionController.addNewTransaction
		(customer.getCustomerID(),
				Session.logged.getStaffID(),
				cake.getCakeID());
		
		System.out.println("Thanks for ordering !");
		return;
	}
	
	public TransactionFormView() 
	{
		view();
	}
}
