package com.hbmapping.HBMapping.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hbmapping.HBMapping.Entity.User;
import com.hbmapping.HBMapping.Repository.UserInterface;

@RestController
public class RestControllerr {
	@Autowired
	UserInterface ui;
	
	
	@RequestMapping(value = "/postdata", method= RequestMethod.POST)
	public User func2(@RequestBody User user) {
		return ui.save(user);
	}
	
	
	@RequestMapping(value = "/getdata", method = RequestMethod.GET)
	public void func1() {
		System.out.println("Function call'ed");
		ui.findAll();
		
	}
	
	
	

}
