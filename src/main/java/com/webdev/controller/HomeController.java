package com.webdev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping("/home")
	public  String Hello() {
		return "Hello Home from Spring";
	}
	@ResponseBody
	@RequestMapping("/welcome")
	public String Welcome() {
		
		return "welcomepage";
	}

}
 