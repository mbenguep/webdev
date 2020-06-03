package com.webdev.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webdev.model.Serve;
import com.webdev.user.service.implemented.ServiceServiceimplemented;

@Controller
@RequestMapping("/service")
public class ServiceController {
	@Autowired
	private ServiceServiceimplemented sc;
	@GetMapping("/list")
	public String viewProduct(Model model) {
		List<Serve> listServe = sc.listAll();
		model.addAttribute("listService", listServe);
		 return "service";
	}
	@RequestMapping("/create")
	public String showNewServicePage(Model model) {
	    Serve service = new Serve();
	    model.addAttribute("service", service);
	     
	    return "createService";
	    }
	@RequestMapping(value = "/record", method = RequestMethod.POST)
	public String saveservice(@ModelAttribute("service") Serve service) {
	    sc.save(service);
	     
	    return "redirect:/service/list";
	}
	@RequestMapping("/update/{serve_id}")
	public ModelAndView showUpdateServicePage(@PathVariable(name = "serve_id") int serve_id) {
	    ModelAndView mav = new ModelAndView("UpdateService");
	    Serve service = sc.get(serve_id);
	    mav.addObject("service", service);
	     
	    return mav;
	}
	@RequestMapping("/delete/{serve_id}")
	public String deleteService(@PathVariable(name = "serve_id") int serve_id) {
		sc.delete(serve_id);
		
	    return "redirect:/service/list";       
	}

}
