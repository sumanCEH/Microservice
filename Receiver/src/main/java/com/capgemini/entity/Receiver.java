package com.capgemini.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Receiver {
	
	
	
	private String receiverName;
	@Id
	private String receiverEmail;
	private long receiverPh;
	private String receiverStreetAddress;
	private String receiverLandmark;
	private String receiverCity;
	private String receiverState;
	private String receiverZipCode;
	private String receiverCountry;
	
	
	public Receiver() {
		
	}


	public Receiver(String receiverName, String receiverEmail, long receiverPh, String receiverStreetAddress,
			String receiverLandmark, String receiverCity, String receiverState, String receiverZipCode,
			String receiverCountry) {
		super();
		this.receiverName = receiverName;
		this.receiverEmail = receiverEmail;
		this.receiverPh = receiverPh;
		this.receiverStreetAddress = receiverStreetAddress;
		this.receiverLandmark = receiverLandmark;
		this.receiverCity = receiverCity;
		this.receiverState = receiverState;
		this.receiverZipCode = receiverZipCode;
		this.receiverCountry = receiverCountry;
	}


	public String getReceiverName() {
		return receiverName;
	}


	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}


	public String getReceiverEmail() {
		return receiverEmail;
	}


	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}


	public long getReceiverPh() {
		return receiverPh;
	}


	public void setReceiverPh(long receiverPh) {
		this.receiverPh = receiverPh;
	}


	public String getReceiverStreetAddress() {
		return receiverStreetAddress;
	}


	public void setReceiverStreetAddress(String receiverStreetAddress) {
		this.receiverStreetAddress = receiverStreetAddress;
	}


	public String getReceiverLandmark() {
		return receiverLandmark;
	}


	public void setReceiverLandmark(String receiverLandmark) {
		this.receiverLandmark = receiverLandmark;
	}


	public String getReceiverCity() {
		return receiverCity;
	}


	public void setReceiverCity(String receiverCity) {
		this.receiverCity = receiverCity;
	}


	public String getReceiverState() {
		return receiverState;
	}


	public void setReceiverState(String receiverState) {
		this.receiverState = receiverState;
	}


	public String getReceiverZipCode() {
		return receiverZipCode;
	}


	public void setReceiverZipCode(String receiverZipCode) {
		this.receiverZipCode = receiverZipCode;
	}


	public String getReceiverCountry() {
		return receiverCountry;
	}


	public void setReceiverCountry(String receiverCountry) {
		this.receiverCountry = receiverCountry;
	}


	@Override
	public String toString() {
		return "Receiver [receiverName=" + receiverName + ", receiverEmail=" + receiverEmail + ", receiverPh="
				+ receiverPh + ", receiverStreetAddress=" + receiverStreetAddress + ", receiverLandmark="
				+ receiverLandmark + ", receiverCity=" + receiverCity + ", receiverState=" + receiverState
				+ ", receiverZipCode=" + receiverZipCode + ", receiverCountry=" + receiverCountry + "]";
	}
	
}
