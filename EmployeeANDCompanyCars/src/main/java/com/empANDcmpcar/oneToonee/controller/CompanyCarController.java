package com.empANDcmpcar.oneToonee.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.empANDcmpcar.oneToonee.entity.CompanyCar;
import com.empANDcmpcar.oneToonee.service.CompanyCarService;

@RestController
@RequestMapping("/CompanyCar")
public class CompanyCarController {

	@Autowired
	private CompanyCarService carService;

	@PostMapping
	public CompanyCar saveCompanyCarDetails(@RequestBody CompanyCar companyCar) {
		return carService.saveCompanyCarDetails(companyCar);

	}

	@GetMapping
	public List<CompanyCar> getAllCompanyCarDetails() {
		return carService.getAllCompanyCar();

	}

	@GetMapping("/{id}")
	public Optional<CompanyCar> getAllCompanyCarDetailsByID(@PathVariable("id") long companyCarId) {
		return carService.findByCompanyCarID(companyCarId);

	}

	@PutMapping("/{id}")
	public CompanyCar updatingCompanyCarDetails(@PathVariable("id") long companyCarId, CompanyCar companyCar) {
		return carService.updateCompanyCarDetails(companyCarId, companyCar);

	}

}
