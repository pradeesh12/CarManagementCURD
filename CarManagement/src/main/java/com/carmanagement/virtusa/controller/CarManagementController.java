package com.carmanagement.virtusa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.carmanagement.virtusa.model.Car;
import com.carmanagement.virtusa.service.CarManagaementService;

@RestController
public class CarManagementController {
	private CarManagaementService carservice;

	public CarManagementController(CarManagaementService carservice) {
		super();
		this.carservice = carservice;
	}
	@PostMapping("/saveCar")
	public ResponseEntity<Car> saveCar(@RequestBody Car car)
	{
		return new ResponseEntity<Car>(carservice.saveCar(car),HttpStatus.CREATED);
	}
	
	@GetMapping("/getCars")
	public List<Car> getCars()
	{
		return carservice.getCars();
	}
	
	@GetMapping("/getCarById/{id}")
	public ResponseEntity<Car> getCarById(@PathVariable("id") int id)
	{
		return new ResponseEntity<Car>(carservice.getCarById(id),HttpStatus.OK);
	}
	
	@PutMapping("/editCar/{id}")
	public ResponseEntity<Car> editCar(@PathVariable("id") int id,@RequestBody Car car)
	{
		return new ResponseEntity<Car>(carservice.editCar(car,id),HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteCar/{id}")
	public ResponseEntity<String> deleteCar(@PathVariable("id") int id)
	{
		carservice.deleteCar(id);
		return new ResponseEntity<String>("Car deleted successfully",HttpStatus.OK);
	}
	
}
