package com.webdev.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
	private String username;
	private String email;
	private String password;
	private String gender;
	private Date birthday;
	private String domaine;
	public Users() {
		super();
	}
	@Override
	public String toString() {
		return "User [name=" + username + ", email=" + email + ", password=" + password + ", gender=" + gender
				+ ", birthday=" + birthday + ", domaine=" + domaine + "]";
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Id
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDomaine() {
		return domaine;
	}
	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}
}
