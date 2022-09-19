package com.bikeinsuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikeinsuranceapp.exception.InvalidBikeInsurance;
import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.repository.IBikeRepository;

@Service
public class BikeServiceImpl implements IBikeService{
	
	@Autowired
	IBikeRepository bikeRepository;

	@Override
	public void addBike(Bike bike) {
	     bikeRepository.save(bike);
	}

	@Override
	public void updateBike(Bike bike) {
		bikeRepository.save(bike);
		
	}

	@Override
	public void deleteBike(int bikeId) {
		bikeRepository.deleteById(bikeId);
		
	}
	

	@Override
	public List<Bike> getAll() {
		
		return bikeRepository.findAll();
	}

	@Override
	public List<Bike> getByBikeNumber(String bikeNumber) {
		// TODO Auto-generated method stub
		return bikeRepository.findByBikeName(bikeNumber);
	}

	@Override
	public List<Bike> getByBikeName(String bikeName) throws InvalidBikeInsurance {
		// TODO Auto-generated method stub
		return bikeRepository.findByBikeName(bikeName);
	}

	@Override
	public List<Bike> getByBikeBrand(String brand) throws InvalidBikeInsurance {
		
		return bikeRepository.findByBikeBrand(brand);
	}

	@Override
	public List<Bike> getByInsuranceName(String insuranceName) {
		// TODO Auto-generated method stub
		return bikeRepository.findByInsuranceName(insuranceName);
	}

	@Override
	public Bike getById(int planId) throws InvalidBikeInsurance {
		return bikeRepository
				.findById(planId)
				.orElseThrow(()->new InvalidBikeInsurance("Invalid Id"));
	}
	
//	return investmentRepository
//			.findById(planId)
//			.orElseThrow(()->new PlanNotFoundException("Invalid Id"));



//	@Override
//	public List<Bike> getByBikeNumber(String bikeNumber) {
//		// TODO Auto-generated method stub
//		return bikeRepository.findByBikeNumber(bikeNumber);
//	}
//
//	@Override
//	public List<Bike> getByBikeName(String bikeName) throws InvalidBikeInsurance{
//		// TODO Auto-generated method stub
//		return bikeRepository.findByBikeName(bikeName);
//	}
//
//	@Override
//	public List<Bike> getByBikeBrand(String brand) {
//		// TODO Auto-generated method stub
//		return bikeRepository.findByBikeBrand(brand);
//	}
//
//	@Override
//	public List<Bike> getByBikeNumberAndBikeName(String bikeNumber, String bikeName) {
//		
//		return bikeRepository.findByBikeNumberAndBikeName(bikeNumber, bikeName);
//	}
//
//	@Override
//	public List<Bike> getByBikeNumberAndBrand(String bikeNumber, String brand) {
//	       return null;
//	}
//
//	@Override
//	public List<Bike> getAll() {
//		
//		return bikeRepository.findAll();
//	}
//
//	@Override
//	public List<Bike> getByInsuranceName(String insuranceName)  {
//	//return bikeRepository.findByInsuranceName(insuranceName);
//		return null;
//	}
//
//	@Override
//	public List<Bike> getByType(String type) {
//		// TODO Auto-generated method stub
//	//return bikeRepository.findByType(type);
//	return null;
//	}
//
//	@Override
//	public List<Bike> getByTypeAndInsuranceName(String type, String insuranceName) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public List<Bike> getByBikeNameAndBrand(String bikeName, String brand) {
//		// TODO Auto-generated method stub
//		return bikeRepository.findByBikeNameAndBrand(bikeName, brand);
//	}
//
//	@Override
//	public List<Bike> getByBikeOwnerName(String ownerName) {
//		// TODO Auto-generated method stub
//		return bikeRepository.findByBikeOwnerName(ownerName);
//	}
//
//	


//	@Override
//	public List<Bike> getByTypeAndAmount(String type, double amount) {
//		// TODO Auto-generated method stub
//		//return bikeRepository.findByTypeAndAmount(type, amount);
//		return null;
//	}

//	@Override
//	public List<Bike> getByTypeAndInsuranceName(String type, String insuranceName) {
//		// TODO Auto-generated method stub
//		return bikeRepository.findByTypeAndInsuranceName(type, insuranceName);
//	}

}
