package com.bikeinsuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Insurance;
import com.bikeinsuranceapp.repository.IInsuranceRepository;

@Service
public class InsuranceServiceImpl implements IInsuranceService{
	
	@Autowired
	IInsuranceRepository insuranceRepository;

	@Override
	public void updateInsurance(Insurance insurance) {
		
		insuranceRepository.save(insurance);
	}

	@Override
	public void deleteInsurance(int insuranceId) {
		insuranceRepository.deleteById(insuranceId);
		
	}

	@Override
	public Bike getInsuranceById(int insuranceId) {
		
		return null;
	}

	@Override
	public List<Insurance> getAll() {
		// TODO Auto-generated method stub
		// return insuranceRepository.findAll();
		return insuranceRepository.findAll();
	}

	@Override
	public List<Insurance> getByPlanType(String instype) {
		// TODO Auto-generated method stub
		//return insuranceRepository.findByPlanType(type);
		return null;
	}

	

}
