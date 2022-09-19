package com.bikeinsuranceapp.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;



@Entity
public class Insurance {
	
	@Id
	@GeneratedValue(generator = "inc_gen", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "inc_gen", sequenceName = "insurance_id")
	private Integer insuranceId;
	

	@OneToMany(cascade=CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "insurance_id")
	private Set<Plan> planList;
	
	private String insuranceName;
	
	private String insType;

	public Insurance() {
		super();
	}
	
	public Insurance(Set<Plan> planList, String insuranceName, String insType) {
		super();
		this.planList = planList;
		this.insuranceName = insuranceName;
		this.insType = insType;
	}

	public Integer getInsuranceId() {
		return insuranceId;
	}

	public void setInsuranceId(Integer insuranceId) {
		this.insuranceId = insuranceId;
	}

	public Set<Plan> getPlanList() {
		return planList;
	}

	public void setPlanList(Set<Plan> planList) {
		this.planList = planList;
	}

	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public String getType() {
		return insType;
	}

	public void setType(String insType) {
		this.insType = insType;
	}

	@Override
	public String toString() {
		return "Insurance [insuranceId=" + insuranceId + ", planList=" + planList + ", insuranceName=" + insuranceName
				+ ", insType=" + insType + "]";
	}

}
