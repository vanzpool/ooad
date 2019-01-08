package view;

import java.util.Scanner;

import controller.CustomerController;
import model.Customer;

public class RegisterView {

	Scanner scn;
	String name;

	public RegisterView() {
		// TODO Auto-generated constructor stub
		scn = new Scanner(System.in);
	}

	public void inputCustomerData() {
		do {
			System.out.println("Input name[5-20 characters] : ");
			name = scn.nextLine();
			scn.nextLine();
		} while (name.length() < 5 || name.length() > 20);

		boolean statusRegis = new CustomerController().addNewCustomer(new Customer(name));

		if (statusRegis)
			System.out.println("Success Add Customer");
		else
			System.out.println("Failed Add Customer");
	}
}
