package com.alighthub.bikeRent.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class MyOrders 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int myorder_id;
	private int cost;
	private Date myorder_date;

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="c_id")
	private List<Customer> customer;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="b_id")
	private List<Bike> bike;
	

	public int getMyorder_id() {
		return myorder_id;
	}

	public void setMyorder_id(int myorder_id) {
		this.myorder_id = myorder_id;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Date getMyorder_date() {
		return myorder_date;
	}

	public void setMyorder_date(Date myorder_date) {
		this.myorder_date = myorder_date;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Bike> getBike() {
		return bike;
	}

	public void setBike(List<Bike> bike) {
		this.bike = bike;
	}


	
	
}
