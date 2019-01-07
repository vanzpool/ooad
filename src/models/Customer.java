package models;

public class Customer 
{
	static int count = 1;
	private int CustomerID;
	private String Name;
	
	public Customer(String name) 
	{
		super();
		CustomerID = count++;
		Name = name;
	}
	
	
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Customer.count = count;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}


	public int getCustomerID() {
		return CustomerID;
	}


	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	
	
}
