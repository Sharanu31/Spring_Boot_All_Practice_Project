package com.petadaption.Pet.Adoption.Platform.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.petadaption.Pet.Adoption.Platform.entity.Pets;

@Repository
public interface PetRepository extends JpaRepository<Pets, String> {

	@Query(value = "Select * from Pets where Pet_Age=?1", nativeQuery = true)
	List<Pets> findBypetage(int age);

	@Query(value = "Select * from Pets where Type_Of_Pet=?1", nativeQuery = true)
	List<Pets> findBypettype(String petType);

	@Query(value = "Select * from Pets where Type_Of_Pet=?1 and breed=?2", nativeQuery = true)
	List<Pets> findByPetTypeAndBreed(String petType, String breed);
}
