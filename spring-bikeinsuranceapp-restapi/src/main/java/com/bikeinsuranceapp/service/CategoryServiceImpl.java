package com.bikeinsuranceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bikeinsuranceapp.model.Category;
import com.bikeinsuranceapp.repository.ICategoryRepository;

@Service
@Transactional
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	ICategoryRepository categoryRepository;

	@Override
	public void updateCategory(Category category) {
		categoryRepository.save(category);
		
	}

	@Override
	public void deleteCategory(int categoryId) {
		categoryRepository.deleteById(categoryId);
		
	}

	@Override
	@Transactional
	public Category getCategoryId(int categoryId) {
		return categoryRepository.findById(categoryId).get();
	}

	@Override
	@Transactional
	public Category getCategoryName(String categoryName) {
//		// TODO Auto-generated method stub
//		return categoryRepository.findByCategoryName(categoryName);
		return null;
	}

	@Override
	public List<Category> getAll() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
