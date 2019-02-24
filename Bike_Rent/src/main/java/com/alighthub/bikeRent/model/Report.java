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
public class Report {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int report_id;
	private String report_name;
	private String report_type;
	private Date startdate;
	private Date enddate;
	
	/*@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="c_id")
	private Customer customer;
	

	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="b_id")
	private Bike bike;*/
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="m_id")
	private List<MyOrders> myOrders;

	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	public String getReport_name() {
		return report_name;
	}

	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}

	public String getReport_type() {
		return report_type;
	}

	public void setReport_type(String report_type) {
		this.report_type = report_type;
	}

	public Date getStartdate() {
		return startdate;
	}

	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}

	public Date getEnddate() {
		return enddate;
	}

	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}

	public List<MyOrders> getMyOrders() {
		return myOrders;
	}

	public void setMyOrders(List<MyOrders> myOrders) {
		this.myOrders = myOrders;
	}

	

	/*public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}*/
	
}
