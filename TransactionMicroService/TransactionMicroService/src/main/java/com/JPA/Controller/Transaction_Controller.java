package com.JPA.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.JPA.Entity.Account;
import com.JPA.Services.Services;

public class Transaction_Controller {
    
	private Services service;
	
	@GetMapping("/Account")
    public ResponseEntity<List<Account>> getAllAccounts(){
    	List<Account> list = null;
    	try {
    		list = (List<Account>)this.service.getAllAccounts();
    		if(list == null) {
    			throw new Exception();
    		}else {
    			return ResponseEntity.status(HttpStatus.OK).body(list);
    		}
    	}catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}
    }
    
    @GetMapping("/Account/{id}")
    public ResponseEntity<Account> getAccount(int id){
    	Account account = null;
    	try {
    		account = this.service.getAccount(id);
    		if(account == null) {
    			throw new Exception();
    		}else {
    			return ResponseEntity.status(HttpStatus.OK).body(account);
    		}
    	}catch(Exception ex) {
    		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    	}
    }
   
   @PostMapping("/Account")
   public ResponseEntity<Account> CreateAccount(@RequestBody Account account){
   	try {
   		if(account == null) {
   			throw new Exception();
   		}else {
   			return ResponseEntity.status(HttpStatus.OK).body(this.service.CreateAccount(account));
   		}
   	}catch(Exception ex) {
   		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
   	}
   }
   
   @PutMapping("/Account/{id}")
   public ResponseEntity<Account> UpdateAccount(@RequestBody Account account,@PathVariable("id") int id){
	   try {
	   if(account == null) {
  			throw new Exception();
  		}else {
  			this.service.DeleteAccount(id);
  			return ResponseEntity.status(HttpStatus.OK).body(this.service.CreateAccount(account));
  		}
  	}catch(Exception ex) {
  		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
  	}
   }
}
