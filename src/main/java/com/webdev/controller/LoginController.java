package com.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webdev.model.Login;
import com.webdev.model.Users;
import com.webdev.user.service.implemented.UserServiceimplemented;

@Controller
public class LoginController {
	@Autowired
	private UserServiceimplemented lc;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String getLoginForm() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(@ModelAttribute("login") Login login, Model model) {
		Users user = lc.findUsersByusername(login.getUsername());
		   if(user.getPassword().equals(login.getPassword())){  
			   return"log_success";  
		    }  
		    else{  
		        return "error";  
		    }  
		
}

}
