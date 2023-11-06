package com.empANDcmpcar.oneToonee.serviceImp;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.empANDcmpcar.oneToonee.entity.CompanyCar;
import com.empANDcmpcar.oneToonee.repository.CompanyCarRepository;
import com.empANDcmpcar.oneToonee.service.CompanyCarService;

@Service
public class CompanyCarServiceImp implements CompanyCarService {

	@Autowired
	private CompanyCarRepository carRepository;

	@Override
	public CompanyCar saveCompanyCarDetails(CompanyCar companyCardet) {
		if (!StringUtils.hasLength(companyCardet.getComoanyCarName())) {
			throw new IllegalArgumentException("Should not be empty");
		}
		return carRepository.save(companyCardet);
	}

	@Override
	public List<CompanyCar> getAllCompanyCar() {
		return carRepository.findAll();
	}

	@Override
	public Optional<CompanyCar> findByCompanyCarID(Long iD) {
		return carRepository.findById(iD);
	}

	@Override
	public CompanyCar updateCompanyCarDetails(Long id, CompanyCar companyCardet) {
		CompanyCar companyCar = carRepository.findById(id).get();
		if (companyCar.getId().equals(id)) {
			if (Objects.nonNull(companyCardet.getComoanyCarName())
					&& !"".equalsIgnoreCase(companyCardet.getComoanyCarName())) {
				companyCar.setComoanyCarName(companyCardet.getComoanyCarName());
			}
			if (Objects.nonNull(companyCardet.getComoanyCarModel())
					&& !"".equalsIgnoreCase(companyCardet.getComoanyCarModel())) {
				companyCar.setComoanyCarModel(companyCardet.getComoanyCarModel());
			}
		}

		return carRepository.save(companyCar);
	}

	@Override
	public CompanyCar findByCompanyCarName(String comoanyCarName) {
		return carRepository.findBycomoanyCarName(comoanyCarName);
	}

}
