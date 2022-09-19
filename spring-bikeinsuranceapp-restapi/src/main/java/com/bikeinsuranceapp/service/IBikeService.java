package com.bikeinsuranceapp.service;

import java.util.List;

import com.bikeinsuranceapp.exception.InvalidBikeInsurance;
import com.bikeinsuranceapp.model.Bike;

public interface IBikeService {
	
	void addBike(Bike bike);
	void updateBike(Bike bike);
	void deleteBike(int bikeId);
	
	Bike getById(int planId) throws InvalidBikeInsurance;
	
	List<Bike> getAll();
	
	List<Bike> getByBikeNumber(String bikeNumber) throws InvalidBikeInsurance;
	
	//derived Queries
	List<Bike> getByBikeName(String bikeName) throws InvalidBikeInsurance;
//	List<Bike> getByBikeOwnerName(String ownerName) throws InvalidBikeInsurance;
	List<Bike> getByBikeBrand(String brand) throws InvalidBikeInsurance;
//	List<Bike> getByBikeNumberAndBikeName(String bikeNumber,String bikeName) throws InvalidBikeInsurance;
//	List<Bike> getByBikeNumberAndBrand(String bikeNumber,String brand) throws InvalidBikeInsurance;
//	List<Bike> getByBikeNameAndBrand(String bikeName,String brand) throws InvalidBikeInsurance;
//	
	List<Bike> getByInsuranceName(String insuranceName);
//	List<Bike> getByType(String type);
//	List<Bike> getByTypeAndInsuranceName(String type,String insuranceName);
//	List<Bike> getByTypeAndAmount(String type,double amount);


}
