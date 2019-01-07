package models;

public class Cake 
{
	static int count = 1;
	private int CakeID;
	private String CakeType;
	private String Topping;
	private int Price;
	
	// ALT SHIFT S + O
	
	public Cake(String cakeType, String topping, int price) {
		super();
		CakeID = count++;
		CakeType = cakeType;
		Topping = topping;
		Price = price;
	}
	//ALT SHIFT S + R
	public int getCakeID() {
		return CakeID;
	}
	
	public void setCakeID(int cakeID) {
		CakeID = cakeID;
	}
	public String getCakeType() {
		return CakeType;
	}
	public void setCakeType(String cakeType) {
		CakeType = cakeType;
	}
	public String getTopping() {
		return Topping;
	}
	public void setTopping(String topping) {
		Topping = topping;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
	
}
