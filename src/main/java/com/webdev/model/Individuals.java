package com.webdev.model;

import javax.persistence.Entity;

@Entity
public class Individuals extends Person {
	
	private int individualsId;
	private String speciality;
	private String experinece;
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getExperinece() {
		return experinece;
	}
	public void setExperinece(String experinece) {
		this.experinece = experinece;
	}
	
	public int getIndividualsId() {
		return individualsId;
	}
	public void setIndividualsId(int individualsId) {
		this.individualsId = individualsId;
	}
	

}