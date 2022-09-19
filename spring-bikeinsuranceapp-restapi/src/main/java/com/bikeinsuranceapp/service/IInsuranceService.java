package com.bikeinsuranceapp.service;

import java.util.List;

import com.bikeinsuranceapp.exception.InvalidBikeInsurance;
import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Insurance;

public interface IInsuranceService {
	
	void updateInsurance(Insurance insurance);
	void deleteInsurance(int insuranceId);
	
	List<Insurance> getAll();
	List<Insurance> getByPlanType(String instype) throws InvalidBikeInsurance;
	Bike getInsuranceById(int insuranceId) throws InvalidBikeInsurance;

}
