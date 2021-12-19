package com.carmanagement.virtusa.service;

import java.util.List;

import com.carmanagement.virtusa.model.Car;

public interface CarManagaementService {
		//Car saveCar(Car c);

		Car saveCar(Car car);
		List<Car> getCars();
		Car getCarById(int id);
		Car editCar(Car car,int id);
		void deleteCar(int id);
}
