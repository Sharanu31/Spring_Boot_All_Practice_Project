package com.carfetu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carfetu.entity.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
	Car findBycarName(String carName);

}
