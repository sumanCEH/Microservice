package com.capgemini.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CutomerTable")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cutomerId;
	private String customerName;
	private String email;
	private long cutomerPh;
	private String streetAddress;
	private String landmark;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String receiverEmail;
	
	
	
	public Customer() {
		
	}



	public Customer(int cutomerId, String customerName, String email, long cutomerPh, String streetAddress,
			String landmark, String city, String state, String zipCode, String country, String receiverEmail) {
		super();
		this.cutomerId = cutomerId;
		this.customerName = customerName;
		this.email = email;
		this.cutomerPh = cutomerPh;
		this.streetAddress = streetAddress;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.receiverEmail = receiverEmail;
	}



	public int getCutomerId() {
		return cutomerId;
	}



	public void setCutomerId(int cutomerId) {
		this.cutomerId = cutomerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getCutomerPh() {
		return cutomerPh;
	}



	public void setCutomerPh(long cutomerPh) {
		this.cutomerPh = cutomerPh;
	}



	public String getStreetAddress() {
		return streetAddress;
	}



	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}



	public String getLandmark() {
		return landmark;
	}



	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getZipCode() {
		return zipCode;
	}



	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getReceiverEmail() {
		return receiverEmail;
	}



	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}



	@Override
	public String toString() {
		return "Customer [cutomerId=" + cutomerId + ", customerName=" + customerName + ", email=" + email
				+ ", cutomerPh=" + cutomerPh + ", streetAddress=" + streetAddress + ", landmark=" + landmark + ", city="
				+ city + ", state=" + state + ", zipCode=" + zipCode + ", country=" + country + ", receiverEmail="
				+ receiverEmail + "]";
	}



	
}