package main;

import controllers.StaffController;
import views.LoginView;

public class Main 
{
	public Main() 
	{
		StaffController.addNewStaff("admin","admin");
		new LoginView();
	}
	
	public static void main(String[] args) 
	{
		new Main();
	}
}
