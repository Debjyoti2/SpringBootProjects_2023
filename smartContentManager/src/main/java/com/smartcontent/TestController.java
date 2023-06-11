package com.smartcontent;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.smartcontent.entities.Contact;
import com.smartcontent.entities.User;

@RestController
public class TestController {
	
	@Autowired
	private TestControllerRepo dao;
	
	@GetMapping("/test")
	public String test() {
		
		User user = new User();
		user.setName("Deb");
		user.setEmail("de.r1@tcs.com");
		
		Contact c= new Contact();
		c.setName("Madhu");
		c.setPhoneno("987654878");
		user.getContacts().add(c);
		
		dao.save(user);
		
		return "Saved";
		
	}

}
