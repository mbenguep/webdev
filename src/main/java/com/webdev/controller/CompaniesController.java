package com.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webdev.user.service.implemented.CompaniesServiceimplemented;

@Controller
@RequestMapping("/companies")
public class CompaniesController {
	@Autowired
	private CompaniesServiceimplemented com_con;
	
	public String hellow() {
		return "All companies are here";
	}

}
