package controllers;

import java.util.Vector;

import models.Transaction;
import repository.Database;

public class TransactionController 
{
	public static Vector<Transaction> getAllTransaction()
	{
		return Database.transactionList;
	}
	
	public static void addNewTransaction(int customerID,int staffID, int cakeID)
	{
		Database.transactionList.add
		(new Transaction(customerID, staffID, cakeID));
	}
}
