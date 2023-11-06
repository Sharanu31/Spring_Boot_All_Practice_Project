package com.familyANDhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.familyANDhouse.entity.House;

public interface HouseRepository extends JpaRepository<House, Long> {

}
