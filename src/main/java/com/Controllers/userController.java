package com.Controllers;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.Services.FakeDatabase;
import com.Entity.User;
import com.Entity.Contact;
import java.util.List;

@RestController
public class userController {

	Logger log = (Logger) LogFactory.getLog(userController.class);
	@Autowired
	FakeDatabase db;

	@Autowired
	RestTemplate restTemplate;
	
//	Get method to get user ID and return user with correcponding ip
	@GetMapping("/getUser/{id}")
	public User getUser(@PathVariable("id") int ID) {
		log.info("getting user ID: "+ID);
		User use = db.getUser(ID);
		System.out.println("ID:"+ID);
		List<Contact> con = restTemplate.getForEntity("http://localhost:9002/getUser/"+ID, List.class).getBody();
		use.setContacts(con);
		return db.getUser(ID);	
	}
}
