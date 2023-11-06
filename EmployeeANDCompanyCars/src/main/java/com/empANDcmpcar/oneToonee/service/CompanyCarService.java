package com.empANDcmpcar.oneToonee.service;

import java.util.List;
import java.util.Optional;

import com.empANDcmpcar.oneToonee.entity.CompanyCar;

public interface CompanyCarService {

	CompanyCar saveCompanyCarDetails(CompanyCar companyCardet);

	List<CompanyCar> getAllCompanyCar();

	Optional<CompanyCar> findByCompanyCarID(Long iD);

	CompanyCar updateCompanyCarDetails(Long id, CompanyCar companyCardet);

	CompanyCar findByCompanyCarName(String comoanyCarName);

}
