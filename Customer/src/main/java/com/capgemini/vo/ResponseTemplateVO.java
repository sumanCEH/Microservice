package com.capgemini.vo;

import com.capgemini.entity.Customer;

public class ResponseTemplateVO {
	private Customer customer;
	private Receiver receiver;
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Receiver getReceiver() {
		return receiver;
	}
	public void setReceiver(Receiver receiver) {
		this.receiver = receiver;
	}
	@Override
	public String toString() {
		return "ResponseTemplateVO [customer=" + customer + ", receiver=" + receiver + "]";
	}
	
	

}
