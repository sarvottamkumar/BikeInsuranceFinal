package com.bikeinsuranceapp.service;

import java.util.List;


import com.bikeinsuranceapp.model.Plan;

public interface IPlanService {
	
	
	void updatePlan(Plan plan);
	void deletePlan(int planId);
	
	List<Plan> getAll();

}
