package com.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webdev.user.service.implemented.AdvertisementServiceimplemented;

@Controller
@RequestMapping("/advertisement")
public class AdvertisementController {
	@Autowired
	private AdvertisementServiceimplemented a_c;
	
	public String advertisement() {
		
		return "All advertisement are here";
	}

}
