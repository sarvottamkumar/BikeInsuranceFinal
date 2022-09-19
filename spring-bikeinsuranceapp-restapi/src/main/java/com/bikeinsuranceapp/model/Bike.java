package com.bikeinsuranceapp.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;



@Entity
public class Bike {
	
	
	@Id
	@GeneratedValue(generator = "bk_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "bk_gen", sequenceName = "bike_id")
	private Integer BikeId;
	
	private String bikeName;
	
	private String bikeNumber;
	
	private String ownerName;
	
	private String brand;
	
	private String nominee;
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="insurance_id")
	private Insurance insurance;

	public Bike() {
		super();
	}

	public Bike(String bikeName, String bikeNumber, String ownerName, String brand, Insurance insurance,String nominee) {
		super();
		this.bikeName = bikeName;
		this.bikeNumber = bikeNumber;
		this.ownerName = ownerName;
		this.brand = brand;
		this.insurance = insurance;
		this.nominee=nominee;
	}

	public Integer getBikeId() {
		return BikeId;
	}

	public void setBikeId(Integer bikeId) {
		BikeId = bikeId;
	}

	public String getBikeName() {
		return bikeName;
	}

	public void setBikeName(String bikeName) {
		this.bikeName = bikeName;
	}

	public String getBikeNumber() {
		return bikeNumber;
	}

	public void setBikeNumber(String bikeNumber) {
		this.bikeNumber = bikeNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getNominee() {
		return nominee;
	}

	public void setNominee(String nominee) {
		this.nominee = nominee;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "Bike [BikeId=" + BikeId + ", bikeName=" + bikeName + ", bikeNumber=" + bikeNumber + ", ownerName="
				+ ownerName + ", brand=" + brand + ", nominee=" + nominee + ", insurance=" + insurance + "]";
	}


}
