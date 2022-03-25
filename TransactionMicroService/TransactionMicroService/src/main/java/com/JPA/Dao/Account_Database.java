package com.JPA.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.JPA.Entity.Account;
@Component
public interface Account_Database extends CrudRepository<Account, Integer>{
      public Account findById(int id);
      public void deleteById(int id);
}
