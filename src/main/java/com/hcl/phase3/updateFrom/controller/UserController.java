package com.hcl.phase3.updateFrom.controller;

import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.hcl.phase3.updateFrom.model.User;
import com.hcl.phase3.updateFrom.service.UserService;

@Controller
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService UserService;
	private User user;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showForm(ModelMap model) {
		logger.debug("In showForm");
		logger.info("In showForm");
		return "form";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public String searchUser(ModelMap model, @RequestParam(value = "id") int id) {
		Optional<User> u = UserService.findone(id);
		if(u.isPresent()) {
			//model.addAttribute("user", u);
			user = u.get();
			return "updateForm";
		}else {
			return "DNE";
		}
		
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String updateUser(ModelMap model,  @RequestParam String firstname,@RequestParam String lastname,
			@RequestParam String username, @RequestParam String password) {
		logger.info("in update user");
		//Optional<User> u = UserService.findone(id);
		//User u = u;
		//User u = (User) model.getAttribute("user");
		//logger.info("user " + u.getFirstName());
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setPassword(password);
		user.setUsername(username);
		UserService.update(user);
		return "UpdateSuccess";
	}
}
