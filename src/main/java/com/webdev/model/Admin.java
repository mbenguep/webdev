package com.webdev.model;

import javax.persistence.Entity;
@Entity
public class Admin extends Person{
	private int adminId;
	
	
	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	

}