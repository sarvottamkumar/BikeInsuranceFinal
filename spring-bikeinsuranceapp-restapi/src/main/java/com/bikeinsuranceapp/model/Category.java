package com.bikeinsuranceapp.model;


import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Category {
	@Id
	@GeneratedValue(generator = "cat_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "cat_gen", sequenceName = "category_id")
	private Integer categoryId;
	
	private String categoryName; 
	private String location;
	private String date;
	private String time;

	@JsonIgnore
	@ManyToMany(mappedBy = "category")
	private Set<Plan> planList = new HashSet<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String categoryName, String location, String date, String time) {
		super();
		this.categoryName = categoryName;
		this.location = location;
		this.date = date;
		this.time = time;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Set<Plan> getPlanList() {
		return planList;
	}

	public void setPlanList(Set<Plan> planList) {
		this.planList = planList;
	}

	@Override
	public String toString() {
		return "Category [categoryName=" + categoryName + ", location=" + location + ", date=" + date + ", time=" + time
				+ "]";
	}

	

}
