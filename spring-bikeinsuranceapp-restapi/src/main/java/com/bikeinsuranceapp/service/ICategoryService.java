package com.bikeinsuranceapp.service;

import java.util.List;

import com.bikeinsuranceapp.model.Category;

public interface ICategoryService {
	
	void updateCategory(Category category);
	void deleteCategory(int categoryId);
	Category getCategoryId(int categoryId);
	Category getCategoryName(String categoryName);
	
	List<Category> getAll();
	
	
	
	

}
