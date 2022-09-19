package com.bikeinsuranceapp.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Plan {
	
	@Id
	@GeneratedValue(generator = "pn_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "pn_gen", sequenceName = "plan_id")
	private Integer planId;
	
    private String type;
	
	private double premium;
	
	private double sumAssured;
	
	private int duration;
	
	@ManyToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(name="plan_category",joinColumns = @JoinColumn(name="plan_id"),
	inverseJoinColumns = @JoinColumn(name="category_id"))
	private Set<Category> category;
	
	public Plan() {
		super();
	}
	
	public Plan(String type, double premium, double sumAssured, int duration, Set<Category> category) {
		super();
		this.type = type;
		this.premium = premium;
		this.sumAssured = sumAssured;
		this.duration = duration;
		this.category = category;
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPremium() {
		return premium;
	}

	public void setPremium(double premium) {
		this.premium = premium;
	}

	public double getSumAssured() {
		return sumAssured;
	}

	public void setSumAssured(double sumAssured) {
		this.sumAssured = sumAssured;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Set<Category> getCategory() {
		return category;
	}

	public void setCategory(Set<Category> category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Plan [type=" + type + ", premium=" + premium + ", sumAssured=" + sumAssured + ", duration=" + duration
				+ ", category=" + category + "]";
	}



	
	
	
    
}
