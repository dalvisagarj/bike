package com.alighthub.bikeRent.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Feedback {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int feedback_id;
	private String feedback_name;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="c_id")
	private List<Customer> customer;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="e_id")
	private List<Employee> employee;
	

	public int getFeedback_id() {
		return feedback_id;
	}

	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}

	public String getFeedback_name() {
		return feedback_name;
	}

	public void setFeedback_name(String feedback_name) {
		this.feedback_name = feedback_name;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}


}
