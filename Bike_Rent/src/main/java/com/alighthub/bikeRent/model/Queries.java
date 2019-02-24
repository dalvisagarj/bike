package com.alighthub.bikeRent.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Queries {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int query_id;
	private String query_name;
	private String query_details;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="c_id")
	private Customer customer;
	

	public int getQuery_id() {
		return query_id;
	}

	public void setQuery_id(int query_id) {
		this.query_id = query_id;
	}

	public String getQuery_name() {
		return query_name;
	}

	public void setQuery_name(String query_name) {
		this.query_name = query_name;
	}

	public String getQuery_details() {
		return query_details;
	}

	public void setQuery_details(String query_details) {
		this.query_details = query_details;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
