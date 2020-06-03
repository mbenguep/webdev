package com.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webdev.user.service.implemented.IndividualsServiceimplemented;

@Controller
@RequestMapping("/individuals")
public class IndividualsController {
	@Autowired
	public IndividualsServiceimplemented ic;
	public String container() {
		return "All Individuals are here";
	}

}
