package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.capgemini.entity.Customer;
import com.capgemini.repository.CustomerRepository;
import com.capgemini.vo.Receiver;
import com.capgemini.vo.ResponseTemplateVO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public String addCustomer(Customer customer) {
		customerRepository.save(customer);
		return "save user";
	
	}

	@Override
	public Customer getCustomerByID(int customerId) {
		Customer getCustomer = customerRepository.findById(customerId).get();
		return getCustomer;
	}

	@Override
	public String deleteCustomerByID(int cutomerId) {
		 customerRepository.deleteById(cutomerId);
		return "deleted sucessfully";
	}

	@Override
	public List<Customer> findallcustomer() {

		return customerRepository.findAll();
	}
	
	

	public ResponseTemplateVO combineddata(int customerId ) {
		
		ResponseTemplateVO rt = new ResponseTemplateVO();
		
		Customer customer =	customerRepository.findById(customerId).get();
		
		System.out.println(customer+ " in customer service impl");
		
		Receiver receiver = restTemplate.getForObject("http://RECEIVER-SERVICE/receiver/getReceiverById/" + customer.getReceiverEmail(), Receiver.class);
		System.out.println(receiver);
		rt.setCustomer(customer);
		rt.setReceiver(receiver);
		System.out.println(rt);
		return rt;
		
	}

}
