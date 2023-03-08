package com.capgemini.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.entity.Customer;
import com.capgemini.vo.ResponseTemplateVO;

@Service
public interface CustomerService {
	
	public String addCustomer(Customer customer);
	public Customer getCustomerByID(int customerId);
	public String  deleteCustomerByID(int cutomerId);
	public List<Customer> findallcustomer();
	public ResponseTemplateVO combineddata(int customerid);

}
