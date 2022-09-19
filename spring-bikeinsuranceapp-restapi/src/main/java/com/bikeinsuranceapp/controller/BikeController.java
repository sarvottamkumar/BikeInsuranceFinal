package com.bikeinsuranceapp.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bikeinsuranceapp.model.Bike;
import com.bikeinsuranceapp.model.Insurance;
import com.bikeinsuranceapp.service.IBikeService;
import com.bikeinsuranceapp.service.IInsuranceService;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("bike-api")
public class BikeController {

	@Autowired
	IBikeService bikeService;
	@Autowired
	IInsuranceService iInsuranceService;

	@PostMapping("/bikes")
	public ResponseEntity<Void> addBike(@RequestBody Bike bike) {
		bikeService.addBike(bike);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "add one bike");
		return ResponseEntity.status(HttpStatus.CREATED).headers(headers).build();
	}
	
	@PutMapping("/bikes")
	public ResponseEntity<String> updateBike(@RequestBody Bike bike) {
		bikeService.updateBike(bike);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "update one bike");
		return ResponseEntity.accepted().headers(headers).body("Updated");
	}
	
	
	@DeleteMapping("/bikes/{bikeId}")
	public ResponseEntity<Void> deleteBike(@PathVariable("bikeId")  int bikeId) {
		bikeService.deleteBike(bikeId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "delete one bike");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).build();
	}
	
	@GetMapping("/bikes")
	public ResponseEntity<List<Bike>> getAll(){
		List<Bike> bikes = bikeService.getAll();
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "All bike");
		headers.add("info", "Getting bikes from db");
		
		ResponseEntity<List<Bike>> responseEntity = new ResponseEntity<>(bikes,headers,HttpStatus.OK);
		
		return responseEntity;
	}
	
	@GetMapping("/bikes/brand/{brand}")
	public ResponseEntity<List<Bike>> getByBikeBrand
			(@PathVariable("brand") String brand ) {
		
		List<Bike> bikes = bikeService.getByBikeBrand(brand);
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("desc", "Same Bike Brand");
		headers.add("info", "bike Rest api by brand");
		
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(bikes);
	}
	
	@GetMapping("/bikes/insuranceName/{insuranceName}")
	public ResponseEntity<List<Bike>> getByInsuranceName
			(@PathVariable("insuranceName") String insuranceName ) {
		
		List<Bike> bikes = bikeService.getByBikeBrand(insuranceName);
		HttpHeaders headers = new HttpHeaders();
		
		headers.add("desc", "Bike insurance");
		headers.add("info", "bike Rest api by insurance");
		
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(bikes);
	}
	
	@GetMapping("/bikes/bikeId/{id}")
	public ResponseEntity<Bike> getById(@PathVariable("id") int planId) {
		Bike bikes = bikeService.getById(planId);
		HttpHeaders headers = new HttpHeaders();
		headers.add("desc", "Getting one bike by Id");
		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(bikes);
	}
	
//	@GetMapping("/bikes/type/{type}")
//	public List<Bike> getByType(@PathVariable("type") String type){
//		return bikeService.getByType(type);
//	} 
	

	
//	@GetMapping("/bikes/bikeName/{bikeName}/brand/{brand}")
//	public ResponseEntity<List<Bike>> getByBikeNameAndBrand
//			(@PathVariable("bikeName") String bikeName, @PathVariable("brand") String brand ) {
//		
//		List<Bike> bikesm = bikeService.getByBikeNameAndBrand(bikeName, brand);
//		
//		HttpHeaders headers = new HttpHeaders();
//	
//	    headers.add("desc", "All Bike");
//    	headers.add("info", "bike Rest api by BikeName and brand");
//		
//		return ResponseEntity.status(HttpStatus.OK).headers(headers).body(bikesm);
//	}

	
//	@GetMapping("/bikes/{ownerName}")
//	public ResponseEntity<List<Bike>> getByBikeOwnerName(@PathVariable("ownerName") String ownerName){
//        List<Bike> bikess = bikeService.getByBikeOwnerName(ownerName);
//		
//        return ResponseEntity.ok().body(bikess);
//	
//	    
//	}
	
//	http://localhost:8080/investments

	
	


}
