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
public class Images {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int image_id;
	
	@Lob
	private byte[] image_images;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="b_id")
	private List<Bike> bike;
	

	public int getImage_id() {
		return image_id;
	}

	public void setImage_id(int image_id) {
		this.image_id = image_id;
	}

	public byte[] getImage_images() {
		return image_images;
	}

	public void setImage_images(byte[] image_images) {
		this.image_images = image_images;
	}

	public List<Bike> getBike() {
		return bike;
	}

	public void setBike(List<Bike> bike) {
		this.bike = bike;
	}


	
}
