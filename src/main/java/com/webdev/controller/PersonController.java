package com.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webdev.model.Person;
import com.webdev.user.service.implemented.PersonServiceIplemented;

@Controller
@RequestMapping("/person")

public class PersonController {
	@Autowired
	private PersonServiceIplemented personservice;

	@GetMapping("/all")
	public String Getperson(Model model) {
		List<Person> listPerson = personservice.listAll();
		model.addAttribute("listPerson", listPerson);

		return "person";
	}

}
