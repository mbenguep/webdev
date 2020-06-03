package com.webdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webdev.user.service.implemented.NotificationServiceimplemented;

@Controller
@RequestMapping("/Notification")
public class NotificationController {
	@Autowired
	private NotificationServiceimplemented nc;
	
	public String Notify() {
		return "All Notification are here";
	}

}
