package com.example.CustomerModule.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerModule.model.Customer;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer>{

	

	

	

}
