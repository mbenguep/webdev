package com.webdev.model;

import javax.persistence.Entity;


@Entity
public class Customer extends Person {
	
	private int costumerId;

	public Customer() {
		super();
	}

	public int getCostumerId() {
		return costumerId;
	}
	public void setCostumerId(int costumerId) {
		this.costumerId = costumerId;
	}
	
	

}
