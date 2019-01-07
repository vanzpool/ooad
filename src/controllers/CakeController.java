package controllers;

import java.util.Vector;

import models.Cake;
import repository.Database;

public class CakeController 
{
	public static Cake getCakeById(int id)
	{
		if(Database.cakeList.size() == 0)return null;
		return Database.cakeList.get(id-1);
	}
	
	public static void addNewCake
	(String CakeType,String Topping,int price)
	{
		Database.cakeList.add
		(new Cake(CakeType, Topping, price));
	}
	
	public static Vector<Cake> getAllCake()
	{
		return Database.cakeList;
	}
	
}
