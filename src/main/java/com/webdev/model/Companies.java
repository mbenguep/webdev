package com.webdev.model;

import javax.persistence.Entity;


@Entity
public class Companies extends Person {
	
	private int companyId;
	private String Status;
	public Companies() {
		super();
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	private String description;
	
}
