package com.JPA.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.JPA.Entityes.Account;
import com.JPA.services.Account_Service;

@Controller
public class Account_Controller {
    
	@Autowired
	private Account_Service service;
	
	@GetMapping("/Account/{id}")
	 public ResponseEntity<Account> GetAccount(@PathVariable("id") int id) {
		 try {
			 Account account = this.service.getAccount(id);
			 if(account == null) {
				 throw new Exception();
			 }else {
				 return ResponseEntity.status(HttpStatus.OK).body(account);
			 }
		 }catch(Exception ex) {
			 return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		 }
	 }
	
	@GetMapping("/Account")
	public ResponseEntity<List<Account>> GetAllAccount(){
		try {
			 List<Account> account = this.service.getAllAcount();
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
	public ResponseEntity<Account> CreateAccount(@RequestBody Account account) {
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
	public ResponseEntity<Account> UpdateAccount(@PathVariable("id") int id, @RequestBody Account account){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(this.service.UpdateAccount(account, id));
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	
	@DeleteMapping("/Account/{id}")
	public ResponseEntity<Object> DeleteAccount(@PathVariable("id") int id){
		try {
			this.service.DeleteAccount(id);
			return ResponseEntity.status(HttpStatus.OK).build();
		}catch(Exception ex){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	} 
}
