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

import com.webdev.model.Product;
import com.webdev.user.service.implemented.ProductServiceimplemented;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductServiceimplemented pc;
	@GetMapping("/list")
	public String viewProduct(Model model) {
		List<Product> listProducts = pc.listAll();
		model.addAttribute("listsProducts", listProducts);
		 return "product";
	}
	@RequestMapping("/add")
	public String showNewProductPage(Model model) {
	    Product product = new Product();
	    model.addAttribute("product", product);
	     
	    return "addproduct";
	    }
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
	    pc.save(product);
	     
	    return "redirect:/product/list";
	}
	@RequestMapping("/edit/{product_id}")
	public ModelAndView showEditProductPage(@PathVariable(name = "product_id") int product_id) {
	    ModelAndView mav = new ModelAndView("EditProduct");
	    Product product = pc.get(product_id);
	    mav.addObject("product", product);
	     
	    return mav;
	}
	@RequestMapping("/delete/{product_id}")
	public String deleteProduct(@PathVariable(name = "product_id") int product_id) {
		pc.delete(product_id);
		
	    return "redirect:/product/list";       
	}

}
