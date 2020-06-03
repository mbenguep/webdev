package com.webdev.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.webdev.model.Users;
import com.webdev.user.service.implemented.UserServiceimplemented;

@Controller
public class RegistrationController {
	
	@Autowired
	private UserServiceimplemented rc;

	@GetMapping("/register")
	public String showForm(Model model) {
		Users username = new Users();
		model.addAttribute("user", username);

		List<String> listDomaine = Arrays.asList("Customer", "Individual", "Company");
		model.addAttribute("listdomaine", listDomaine);

		return "registration";
	}

	@RequestMapping(value = "/record", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("user") Users user) {
		rc.save(user);
		return "Registration_Success";
	}

}
