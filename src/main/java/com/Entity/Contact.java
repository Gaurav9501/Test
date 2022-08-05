package com.Entity;

public class Contact {

	private int cID;
	private String email;
	private String contactName;
	private int userID;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int cID, String email, String contactName, int userID) {
		super();
		this.cID = cID;
		this.email = email;
		this.contactName = contactName;
		this.userID = userID;
	}
	public int getcID() {
		return cID;
	}
	public void setcID(int cID) {
		this.cID = cID;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactName() {
		return contactName;
	}
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	
}
