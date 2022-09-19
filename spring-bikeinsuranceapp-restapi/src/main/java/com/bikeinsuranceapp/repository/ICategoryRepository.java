package com.bikeinsuranceapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bikeinsuranceapp.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Integer>{
	
	//Category findByCategoryName(String categoryName);

}
