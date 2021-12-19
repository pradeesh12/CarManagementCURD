package com.carmanagement.virtusa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carmanagement.virtusa.model.Car;


public interface CarManagementRepository extends JpaRepository<Car, Integer>{
		
}
