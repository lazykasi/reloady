package com.project.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.project.Entity.Account;


@Component
public interface Account_DataBase extends CrudRepository<Account, Integer>{
     
	public Account findById(int id);
	public Account deleteById(int id);
}
