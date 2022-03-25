package com.JPA.Entityes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {
    
	@javax.persistence.Id
	@Column(name = "User_Id")
	private int Id;
	@Column(name = "User_Name")
	private String Name;
	@Column(name="User_PhoneNo")
	private long Phone;
	public int getId() {
		return Id;
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
	public Account(int id, String name, long phone) {
		super();
		Id = id;
		Name = name;
		Phone = phone;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
