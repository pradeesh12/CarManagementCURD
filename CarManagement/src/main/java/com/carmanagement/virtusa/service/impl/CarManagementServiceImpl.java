package com.carmanagement.virtusa.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.carmanagement.virtusa.exception.ResourceNotFoundException;
import com.carmanagement.virtusa.model.Car;
import com.carmanagement.virtusa.repository.CarManagementRepository;
import com.carmanagement.virtusa.service.CarManagaementService;

@Service
public class CarManagementServiceImpl implements CarManagaementService{
	private CarManagementRepository repo;
	
	
	public CarManagementServiceImpl(CarManagementRepository repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Car saveCar(Car c) {
		return repo.save(c);
	}

	@Override
	public List<Car> getCars() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Car getCarById(int id) {
		// TODO Auto-generated method stub
		Optional<Car> car=repo.findById(id);
		if(car.isPresent())
		{
			return car.get();
		}
		else
		{
			throw new ResourceNotFoundException("Employee","id", id);
		}
	}

	@Override
	public Car editCar(Car car, int id) {
		Optional<Car> find=repo.findById(id);
		if(find.isPresent())
		{
			car.setCarId(car.getCarId());
			car.setCarName(car.getCarName());
			car.setCarNumber(car.getCarNumber());
			car.setCarStatus(car.getCarStatus());
			repo.save(car);
		}
		else
		{
			throw new ResourceNotFoundException("Employee","id", id);
		}
			return car;
	}

	@Override
	public void deleteCar(int id) {
		// TODO Auto-generated method stub
		Optional<Car> find=repo.findById(id);
		if(find.isPresent())
		{
			repo.deleteById(id);
		}
		else
		{
			throw new ResourceNotFoundException("Employee","id", id);
		}		
	}
}
