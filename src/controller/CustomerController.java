package controller;

import java.util.ArrayList;

import model.Customer;
import repo.Repo;

public class CustomerController {

	public CustomerController() {
		// TODO Auto-generated constructor stub
	}

	public boolean addNewCustomer(Customer newCustomer) {
		for (Customer customer : Repo.customers) {
			if(customer.getCustomerName().equals(
					newCustomer.getCustomerName()))
				return false;
		}
		return Repo.customers.add(newCustomer);
	}

	public ArrayList<Customer> getAllCustomer() {
		return Repo.customers;
	}

	public Customer getCustomerById(int id) {
		for (Customer customer : Repo.customers) {
			if (customer.getCustomerId() == id)
				return customer;
		}
		return null;
	}
}
