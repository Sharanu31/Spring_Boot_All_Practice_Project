package com.familyANDhouse.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.familyANDhouse.entity.Family;

public interface FamilyRepository extends JpaRepository<Family, Long> {

	//Optional<Family> findById(Long familyID);
}
