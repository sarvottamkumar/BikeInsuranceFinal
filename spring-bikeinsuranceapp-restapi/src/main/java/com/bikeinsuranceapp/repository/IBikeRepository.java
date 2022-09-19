package com.bikeinsuranceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bikeinsuranceapp.exception.InvalidBikeInsurance;
import com.bikeinsuranceapp.model.Bike;

@Repository
public interface IBikeRepository extends JpaRepository<Bike, Integer>{
	
	
	List<Bike> findByBikeNumber(String bikeNumber);
	
	//Derived Queries
	@Query("from Bike where bikeName=?1")
	List<Bike> findByBikeName(String bikeName);
	@Query("from Bike where brand=?1")
	List<Bike> findByBikeBrand(String brand);
	
//	@Query("from Bike where bikeNumber=?1 and bikeName=?2")
//	List<Bike> findByBikeNumberAndBikeName(String bikeNumber,String bikeName);
//	@Query("from Bike where bikeName=?1 and brand=?2")
//	List<Bike> findByBikeNameAndBrand(String bikeName,String brand);
//	@Query("from Bike where ownerName=?1")
//	List<Bike> findByBikeOwnerName(String ownerName);
//	
//	//Custom Queries
//	
	@Query("from Bike b inner join b.insurance i where i.insuranceName=?1")
	List<Bike> findByInsuranceName(String insuranceName);
//	
//	@Query("from Bike b inner join b.insurance i where i.insType=?1")
//	List<Bike> findByType(String insType);	
//	
//	@Query("from Bike b inner join b.insurance i where i.insType=?1 and i.amount=?2")
//	List<Bike> findByTypeAndAmount(String insType,double amount);
//	
//	@Query("from Bike b inner join b.insurance i where i.insType=?1 and i.insuranceName=?2")
//	List<Bike> findByTypeAndInsuranceName(String insType,String insuranceName);
	 
//	@Query("from Bike b inner join b.category c where c.categoryName=?1")
//	List<Bike> findByCategoryName(String categoryName) throws InvalidBikeInsurance;
//	
//	@Query("from Bike b inner join b.bikeName p inner join p.type bp where b.bikename=? 1AND bp.type=?2")
//	 
	

}
