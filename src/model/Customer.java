package model;

import repo.Repo;

public class Customer {
	private int customerId;
	private String customerName;

	public Customer(String customerName) {
		customerId = Repo.customers.size() + 1;
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

}
