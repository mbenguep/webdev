package com.webdev.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Advertisement {
	private int advertisement_Id;
	private String style;
	private String tittle;
	private String description;
	public Advertisement() {
		super();
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getAdvertisement_Id() {
		return advertisement_Id;
	}
	public void setAdvertisement_Id(int advertisement_Id) {
		this.advertisement_Id = advertisement_Id;
	}

}
