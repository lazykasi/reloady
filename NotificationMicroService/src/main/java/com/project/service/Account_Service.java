package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Dao.Account_DataBase;
import com.project.Entity.Account;



@Service
public class Account_Service {
     
	@Autowired
	 private Account_DataBase database;
	 
	
	 public Account getAccount(int id) {
		 return this.database.findById(id);
	 }
	 
	 public List<Account> getAllAcount(){
		 List<Account> list = (List<Account>) this.database.findAll();
		 return list;
	 }
	 
	 public Account UpdateAccount(Account account,int id) {
		 this.database.deleteById(id);
		 return this.database.save(account);
	 }
	 
	 public Account CreateAccount(Account account) {
		 return this.database.save(account);
	 }
	 
	 public void DeleteAccount(int id) {
		 this.database.deleteById(id);
	 }
}
