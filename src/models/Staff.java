package models;

public class Staff 
{
	static int count = 1;
	public int StaffID;
	public String Username;
	public String Password;
	
	
	
	
	
	public Staff(String username, String password) {
		super();
		StaffID = count++;
		Username = username;
		Password = password;
	}
	public int getStaffID() {
		return StaffID;
	}
	public void setStaffID(int staffID) {
		StaffID = staffID;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	
}
