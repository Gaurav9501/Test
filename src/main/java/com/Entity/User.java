package com.Entity;
import java.util.*;

public class User {

	private int ID;
	private String Name;
	private String Phone;
	private List<Contact> contacts = new ArrayList<>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int iD, String name, String phone, List<Contact> contacts) {
		super();
		ID = iD;
		Name = name;
		Phone = phone;
		this.contacts = contacts;
	}
	
	public User(int iD, String name, String phone) {
		super();
		ID = iD;
		Name = name;
		Phone = phone;
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public List<Contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}
	
}
