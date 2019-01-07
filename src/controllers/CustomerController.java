package controllers;

import java.util.Vector;

import models.Customer;
import repository.Database;

public class CustomerController 
{
	public static void addNewCustomer(String name)
	{
		Database.custList.add(new Customer(name));
	}
	
	public static Vector<Customer> getAllCustomer()
	{
		return Database.custList;
	}
	
	public static Customer getCustomerById(int id)
	{
		if(Database.custList.size() == 0)return null;
		return Database.custList.get(id - 1);
	}
	
	
}
