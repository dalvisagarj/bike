package com.alighthub.bikeRent.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bike 

{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bike_id;
	private String bike_name;
	private int bike_eng_cc;
	private int insurance_no;
	private Date insurance_date;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="e_id")
	private Employee employee;
	
	
	public int getBike_id() {
		return bike_id;
	}
	public void setBike_id(int bike_id) {
		this.bike_id = bike_id;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public int getBike_eng_cc() {
		return bike_eng_cc;
	}
	public void setBike_eng_cc(int bike_eng_cc) {
		this.bike_eng_cc = bike_eng_cc;
	}
	public int getInsurance_no() {
		return insurance_no;
	}
	public void setInsurance_no(int insurance_no) {
		this.insurance_no = insurance_no;
	}
	public Date getInsurance_date() {
		return insurance_date;
	}
	public void setInsurance_date(Date insurance_date) {
		this.insurance_date = insurance_date;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	
}
