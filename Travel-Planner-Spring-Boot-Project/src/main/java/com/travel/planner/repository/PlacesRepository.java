package com.travel.planner.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.travel.planner.entity.Place;

public interface PlacesRepository extends JpaRepository<Place, Long> {

	Place findByplaceName(String placeNam);

	@Query(value = "Select * from Place where placeName=?1", nativeQuery = true)
	List<Place> findAllByplaceName(String placeCntry);

	@Query(value = "Select * from Place where availabletoVisit=?1 and placeCountry=?2", nativeQuery = true)
	List<Place> findAllByAvilabeANdCountry(String avai, String cntry);

}
