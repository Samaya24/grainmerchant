package com.isu.graduateproject.grainmerchant.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.isu.graduateproject.grainmerchant.dao.User;
import com.isu.graduateproject.grainmerchant.service.UserService;

@Controller
public class SignupController {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/signup")
	public String signup(Model model){
		
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@RequestMapping(value="/createaccount", method=RequestMethod.POST)
	public String createaccount(@Valid User user, BindingResult result){
		if(result.hasErrors())
			return "signup";
		
		user.setAuthority("ROLE_USER");
		user.setEnabled(1);

		/*if(usersService.exists(user.getUsername())){
			result.rejectValue("username", "DuplicateKey.user.username", "Username already exists! by new");
			return "newaccount";
		}*/
		
		try{
			userService.create(user);
		}
		catch(Exception e){
			System.out.println(e.getClass());
			return "home";
		}
		return "accountcreated";
	}
}
