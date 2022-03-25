package com.JPA.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Transaction_Account")
public class Account {
	 @Column(name="User_Name")
     private String Name;
	 @Column(name = "User_AccountNo")
	 @Id
	 private long id;
	 @Column(name = "Amount")
	 private long Amount;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getAmount() {
		return Amount;
	}
	public void setAmount(long amount) {
		Amount = amount;
	}
	public Account(String name, long id, long amount) {
		super();
		Name = name;
		this.id = id;
		Amount = amount;
	}
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
