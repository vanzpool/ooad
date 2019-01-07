package models;

public class Transaction 
{
	static int count = 1;
	private int TransactionID;
	private int CustomerID;
	private int StaffID;
	private int CakeID;
	
	public Transaction(int customerID, int staffID, int cakeID) {
		super();
		TransactionID = count++;
		CustomerID = customerID;
		StaffID = staffID;
		CakeID = cakeID;
	}
	public int getTransactionID() {
		return TransactionID;
	}
	public void setTransactionID(int transactionID) {
		TransactionID = transactionID;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public int getStaffID() {
		return StaffID;
	}
	public void setStaffID(int staffID) {
		StaffID = staffID;
	}
	public int getCakeID() {
		return CakeID;
	}
	public void setCakeID(int cakeID) {
		CakeID = cakeID;
	}
	
	
	
}
