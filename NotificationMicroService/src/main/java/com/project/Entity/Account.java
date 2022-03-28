package com.project.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Accounts")
public class Account {
    
	@javax.persistence.Id
	@Column(name = "User_Id")
	private int Id;
	@Column(name = "User_Name")
	private String Name;
	@Column(name="User_PhoneNo")
	private long Phone;
	@Column(name="EMail")
	private String Email;
	public int getId() {
		return Id;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhone() {
		return Phone;
	}
	public void setPhone(long phone) {
		Phone = phone;
	}
	
	public Account(int id, String name, long phone, String email) {
		super();
		Id = id;
		Name = name;
		Phone = phone;
		Email = email;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
