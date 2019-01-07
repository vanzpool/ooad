package controllers;

import models.Staff;
import repository.Database;

public class StaffController 
{
	public static void addNewStaff(String username,String password)
	{
		Database.staffList.add(new Staff(username, password));
	}
	
	public static Staff authenticate(String username,String password)
	{
		for(int i = 0; i< Database.staffList.size(); i++)
		{
			Staff temp = Database.staffList.get(i);
			if(username.equals(temp.getUsername()) 
					&& password.equals(temp.getPassword()))
			{
				return temp;
			}
		}
		return null;
	}
	
}
