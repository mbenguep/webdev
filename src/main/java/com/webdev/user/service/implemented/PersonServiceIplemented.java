package com.webdev.user.service.implemented;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webdev.model.Person;
import com.webdev.repository.PersonRepository;
import com.webdev.services.PersonService;

@Service
public class PersonServiceIplemented implements PersonService{
	
	@Autowired
	private PersonRepository per;
	
	public List<Person> listAll(){
		return per.findAll();
		
	}
	
	public void save(Person person) {
		per.save(person);
	}
	
	public Person get(int Id) {
		return per.findById(Id).get();
		
	}
	

	
	

}
