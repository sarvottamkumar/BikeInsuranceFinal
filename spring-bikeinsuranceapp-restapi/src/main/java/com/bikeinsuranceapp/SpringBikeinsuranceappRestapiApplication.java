package com.bikeinsuranceapp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Category;
import com.bikeinsuranceapp.model.Insurance;
import com.bikeinsuranceapp.model.Plan;
import com.bikeinsuranceapp.service.IBikeService;
import com.bikeinsuranceapp.service.ICategoryService;
import com.bikeinsuranceapp.service.IInsuranceService;
import com.bikeinsuranceapp.service.IPlanService;

@SpringBootApplication
public class SpringBikeinsuranceappRestapiApplication {
//
	   public static void main(String[] args) {
		   
	     	SpringApplication.run(SpringBikeinsuranceappRestapiApplication.class, args);
	}
//	
//	    @Autowired
//	    IBikeService bikeService;
//	    
//		@Autowired
//		IInsuranceService insuranceService;
//		
//		@Autowired
//		IPlanService planService;
//		
//		@Autowired
//		ICategoryService categoryService;
//
//		@Override
//		public void run(String... args) throws Exception {
//			bikeService.getByType("type").forEach(System.out::println);
//			bikeService.getByInsuranceName("Acko").forEach(System.out::println);
		//	bikeService.getAll().forEach(System.out::println);
			
		//	bikeService.getByCatName("Fire").forEach(System.out::println);
		
	

//	    @Override
//	    public void run(String... args) throws Exception {
//		
//		Category categorys = new Category("Accident", "Chennai", "11.08.2022", "1:30pm");
//		
//		Set<Category> category= new HashSet<>(Arrays.asList(categorys));
//		
//		Plan plan1 =new Plan("3rd person", 30380, 165000, 5, category);
//		
//		Set<Plan> plan= new HashSet<>(Arrays.asList(plan1));
//		
//		Insurance insurance = new Insurance(plan, "Kotak Mahindra Bike Insurance", "400ccbike");
//		
//		Bike bike = new Bike("kawasaki400","TN06KG0010","Ranga","Kawasaki",insurance,"mother");
//		
//		
//		bikeService.addBike(bike);
//		
//		
//       Category categoryss = new Category("Accident", "Chennai", "18.08.2021", "1:48pm");
//		
//		Set<Category> categoryst= new HashSet<>(Arrays.asList(categoryss));
//		
//		Plan plan12 =new Plan("3rd person", 16500, 150000, 5, categoryst);
//		
//		Set<Plan> plans= new HashSet<>(Arrays.asList(plan12));
//		
//		Insurance insurancei = new Insurance(plans, "Kotak Mahindra Bike Insurance", "250ccbike");
//		
//		Bike bike1 = new Bike("Kawasaki600","TN09KE1010","Virat","Kawasaki",insurancei,"mother");
//		
//		
//		bikeService.addBike(bike1);
////		
////		System.out.println("-----------------------------------------------------------------------------------------");
////		
//		//bikeService.getAll().forEach(System.out::println);
//		
//	    bikeService.getByInsuranceName("Acko").forEach(System.out::println);
////		
//        bikeService.getByType("type").forEach(System.out::println);
//        
//		//bikeService.getByTypeAndAmount("bike",3355.0).forEach(System.out::println);
//        
////		bikeService.getByTypeAndInsuranceName("bike", "Acko").forEach(System.out::println);
//		
//		bikeService.getByBikeNumber("KA09KE1111").forEach(System.out::println);
//		
//		System.out.println("-----------------------------------------------------------------------------------------");
//		
//		bikeService.getByBikeBrand("KTM").forEach(System.out::println);
//		
//        System.out.println("-----------------------------------------------------------------------------------------");
//		
//		bikeService.getByBikeName("Duke200").forEach(System.out::println);
//		
//		System.out.println("==================================================================================");
//		
//		bikeService.getByBikeNumberAndBikeName("KA09KE1111","Duke200").forEach(System.out::println);
//		
//		
//		
////		insuranceService.getByPlanType("1st person").forEach(System.out::println);
//		
//		//insuranceService.getAll().forEach(System.out::println);
//		
//		System.out.println("-----------------------------------------------------------------------------------------");
//
//		//planService.getAll().forEach(System.out::println);
//		
//		
//		
//		System.out.println("-----------------------------------------------------------------------------------------");
//
//		//categoryService.getAll().forEach(System.out::println);
//		
//		System.out.println("-----------------------------------------------------------------------------------------");
//
//	}
	//	}

}
