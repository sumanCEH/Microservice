package com.capgemini.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.capgemini.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
	
	
	public List<Customer> findByCutomerPh(int cutomerPh);
	
	
}
