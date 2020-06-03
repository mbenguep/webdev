package com.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webdev.user.service.implemented.AdminServiceimplemented;

@Controller
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminServiceimplemented ac;
	
	public String admin() {
		return "All Admin here";
		
	}

}
