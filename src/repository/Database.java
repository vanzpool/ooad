package repository;

import java.util.Vector;

import models.Cake;
import models.Customer;
import models.Staff;
import models.Transaction;

public class Database 
{
	public static Vector<Cake> cakeList = new Vector<>();
	public static Vector<Staff> staffList = new Vector<>();
	public static Vector<Transaction> transactionList = new Vector<>();
	public static Vector<Customer> custList = new Vector<>();
}
