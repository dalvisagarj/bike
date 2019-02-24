package com.alighthub.bikeRent.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	private String customer_user_id;
	private String password;
	private String customer_email;
	private long aadhar_id;
	private String license_no;
	private String customer_address;
	private int wallet_balance;
	
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_user_id() {
		return customer_user_id;
	}
	public void setCustomer_user_id(String customer_user_id) {
		this.customer_user_id = customer_user_id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCustomer_email() {
		return customer_email;
	}
	public void setCustomer_email(String customer_email) {
		this.customer_email = customer_email;
	}
	public long getAadhar_id() {
		return aadhar_id;
	}
	public void setAadhar_id(long aadhar_id) {
		this.aadhar_id = aadhar_id;
	}
	public String getLicense_no() {
		return license_no;
	}
	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}
	public String getCustomer_address() {
		return customer_address;
	}
	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}
	public int getWallet_balance() {
		return wallet_balance;
	}
	public void setWallet_balance(int wallet_balance) {
		this.wallet_balance = wallet_balance;
	}
}
