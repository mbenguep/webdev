package com.webdev.user.service.implemented;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdev.model.Serve;
import com.webdev.repository.ServiceRepository;
import com.webdev.services.ServiceService;

@Service
public class ServiceServiceimplemented implements ServiceService {
	
	@Autowired
	private ServiceRepository sr;
	
	public List<Serve> listAll(){
		return sr.findAll();
		
	}
	
	public void save(Serve serve) {
		sr.save(serve);
	}
	
	public Serve get(int serve_id) {
		return sr.findById(serve_id).get();
		
	}

	public void delete(int serve_id) {
		sr.deleteById(serve_id);
		
	}
	

}
