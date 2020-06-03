package com.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webdev.user.service.implemented.CustomerServiceimplemented;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	private CustomerServiceimplemented cc;
	public String hello() {
		return "All customers are here";
	}

}
