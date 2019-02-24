package com.alighthub.bikeRent.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.OneToMany;

@Entity
public class Ride {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int ride_id;
	
	@Lob
	private byte[] ride_image;
	
	@Lob
	private byte[] ride_video;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="c_id")
	private List<Customer> customer;
	

	public int getRide_id() {
		return ride_id;
	}

	public void setRide_id(int ride_id) {
		this.ride_id = ride_id;
	}

	public byte[] getRide_image() {
		return ride_image;
	}

	public void setRide_image(byte[] ride_image) {
		this.ride_image = ride_image;
	}

	public byte[] getRide_video() {
		return ride_video;
	}

	public void setRide_video(byte[] ride_video) {
		this.ride_video = ride_video;
	}

	public List<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(List<Customer> customer) {
		this.customer = customer;
	}

	
	
	
	
}
