package com.bikeinsuranceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Insurance;
import com.bikeinsuranceapp.model.Plan;

@Repository
public interface IInsuranceRepository extends JpaRepository<Insurance, Integer>{
//	
//	List<Insurance> findByInsuranceNameAndDuration(String insuranceName,int duration);
//	
//	List<Insurance> findByPremiumAndCategoryName(double premium,String categoryName);
//	
//	List<Insurance> findByPlanType(String insType);
//	
//	@Query("from Insurance i inner join i.planList p where p.type=?1")
//	List<Insurance> findByPlanType(String type);

}
