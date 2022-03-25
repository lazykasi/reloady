package com.JPA.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.JPA.Dao.Account_Database;
import com.JPA.Entity.Account;

@Service
public class Services {
    @Autowired
	private Account_Database database;
	
   
    public List<Account> getAllAccounts(){
    	List<Account> list = (List<Account>) this.database.findAll();
    	return list;
    }
    
    
    public Account getAccount(int id){
    	return this.database.findById(id);
    }
   
  
   public Account CreateAccount(@RequestBody Account account){
   	     return this.database.save(account);
   }
   
  
   public Account UpdateAccount(@RequestBody Account account,@PathVariable("id") int id){
	  
  			this.database.deleteById(id);
  			return this.database.save(account);
  		
   }
   
   public void DeleteAccount(int id) {
	   this.database.deleteById(id);
   }
 
}
