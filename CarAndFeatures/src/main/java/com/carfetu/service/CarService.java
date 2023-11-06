package com.carfetu.service;

import java.util.List;

import com.carfetu.entity.Car;

public interface CarService {

	Car saveCarDetails(Car car);

	List<Car> getAllCarDetails();

	Car updateCarDetails(Long carID, Car car);

}
