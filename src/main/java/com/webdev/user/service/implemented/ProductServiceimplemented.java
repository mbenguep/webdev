package com.webdev.user.service.implemented;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdev.model.Product;
import com.webdev.repository.ProductRpositorty;
import com.webdev.services.ProductService;

@Service
public class ProductServiceimplemented implements ProductService {
	
	@Autowired
	private ProductRpositorty pr;
	
	public List<Product> listAll(){
		return pr.findAll();
		
	}
	
	public void save(Product product) {
		pr.save(product);
	}
	
	public Product get(int product_id) {
		return pr.findById(product_id).get();
		
	}

	public void delete(int product_id) {
		pr.deleteById(product_id);
		
	}
	

}
