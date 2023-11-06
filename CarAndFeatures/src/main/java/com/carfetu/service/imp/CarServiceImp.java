package com.carfetu.service.imp;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carfetu.entity.Car;
import com.carfetu.repository.CarRepository;
import com.carfetu.service.CarService;

import org.springframework.util.StringUtils;


@Service
public class CarServiceImp implements CarService {

	@Autowired
	private CarRepository carRepository;

	@Override
	public Car saveCarDetails(Car car) {
		Optional<Car> dupliCar = Optional.ofNullable(carRepository.findBycarName(car.getCarName()));
		if (dupliCar.isPresent()) {
			throw new IllegalAccessError("Car with name " + car.getCarName() + " already exist");
		}
		if (StringUtils.hasLength(car.getCarName())) {
			throw new IllegalAccessError("Car name should not be empty");

		}
		return carRepository.save(car);
	}

	@Override
	public List<Car> getAllCarDetails() {
		return carRepository.findAll();
	}

	@Override
	public Car updateCarDetails(Long carID, Car car) {
		Car cariD = carRepository.findById(carID).get();
		if (cariD.getCarID().equals(carID)) {
			if (Objects.nonNull(car.getCarName()) && !"".equals(car.getCarName())) {
				cariD.setCarName(car.getCarName());
			}
		}
		return carRepository.save(cariD);
	}

}
