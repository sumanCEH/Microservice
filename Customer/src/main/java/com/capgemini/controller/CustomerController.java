package com.capgemini.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entity.Customer;
import com.capgemini.service.CustomerService;
import com.capgemini.vo.ResponseTemplateVO;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping(value = "/home")
	public String home() {
		return "cutomer welcome Home";
		}
	
	@PostMapping(value = "/addCustomer")
	public String addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}
	
	@GetMapping(value = "getCustomerByID/{id}")
	public Customer getCustomerByID(@PathVariable(value = "id") int cutomerID) {
		Customer customer = customerService.getCustomerByID(cutomerID);
		return customer;
	}
	
	@DeleteMapping(value = "deleteCustomerByID/{id}")
	public String deleteCustomerByID(@PathVariable("id") int cutomerID) {
		customerService.deleteCustomerByID(cutomerID);
		return "deleted sucessfully";
	}

	@GetMapping(value = "/combined/{id}")
	public ResponseTemplateVO getcombineddate(@PathVariable("id") int customerid) {
		System.out.println("calling combined method in customer controller");
		return customerService.combineddata(customerid);
	}
	

}
