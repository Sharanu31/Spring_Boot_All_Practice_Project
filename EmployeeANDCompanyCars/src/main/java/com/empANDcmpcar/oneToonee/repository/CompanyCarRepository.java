package com.empANDcmpcar.oneToonee.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empANDcmpcar.oneToonee.entity.CompanyCar;

public interface CompanyCarRepository extends JpaRepository<CompanyCar, Long> {

	CompanyCar findBycomoanyCarName(String comoanyCarName);

}
