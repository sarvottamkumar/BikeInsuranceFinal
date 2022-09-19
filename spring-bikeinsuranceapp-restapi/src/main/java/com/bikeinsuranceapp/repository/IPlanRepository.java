package com.bikeinsuranceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bikeinsuranceapp.model.Plan;

public interface IPlanRepository extends JpaRepository<Plan, Integer>{
	
	
	
//	 List<Plan> findByCategoryName(String categoryName);
//	
//     List<Plan> findByPlanTypeAndCategoryName(String type,String categoryName);
//     
//     List<Plan> findByPlanPremiumAndCategoryName(double premium,String categoryName);
//     
//     List<Plan> findByLocation(String location);

}
