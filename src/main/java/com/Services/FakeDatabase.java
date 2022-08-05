package com.Services;

import java.util.List;

import org.springframework.stereotype.Service;
import com.Entity.*;

@Service
public class FakeDatabase {

//	Temp Users database 
	List<User> users = List.of(
			new User(1,"Gaurav","9680842865"),
			new User(2,"Gaurav2","9580842865"),
			new User(3,"Gaurav3","9670842865"),
			new User(4,"Gaurav4","9680742865")			
			);
	
//	Method to search and return user with corresponding ID
	public User getUser(int id) {
		User user = users.stream().filter((usr)->id==usr.getID()).findAny().orElse(null);
		return user;
	}
	
}
