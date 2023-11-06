package com.carfetu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carfetu.entity.Car;
import com.carfetu.entity.Feature;
import com.carfetu.service.CarService;
import com.carfetu.service.FeatureService;

@RestController
@RequestMapping("Car")
public class CarController {

	@Autowired
	private CarService carService;

	@GetMapping
	private List<Car> getAllFeature() {
		return carService.getAllCarDetails();

	}
}
