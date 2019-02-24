package com.alighthub.bikeRent.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Bikes_Rates 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int bike_rate_id;
	private int per_hour;
	private int per_day;
	private int per_week;
	private int deposite;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="b_id")
	private Bike bike;
	
	public int getBike_rate_id() {
		return bike_rate_id;
	}
	public void setBike_rate_id(int bike_rate_id) {
		this.bike_rate_id = bike_rate_id;
	}
	public int getPer_hour() {
		return per_hour;
	}
	public void setPer_hour(int per_hour) {
		this.per_hour = per_hour;
	}
	public int getPer_day() {
		return per_day;
	}
	public void setPer_day(int per_day) {
		this.per_day = per_day;
	}
	public int getPer_week() {
		return per_week;
	}
	public void setPer_week(int per_week) {
		this.per_week = per_week;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	public Bike getBike() {
		return bike;
	}
	public void setBike(Bike bike) {
		this.bike = bike;
	}
}
