package com.travel.planner.service;

import java.util.List;

import com.travel.planner.entity.Place;

public interface PlaceService {

	Place createPlace(Place place);

	List<Place> getAllListOfPlace();

	Place updatePlaceDetail(Long id, Place place);

	String deletePlace(Long id);

	Place getPlaceByplaceName(String placeNam);

	List<Place> getAllPlaceByPlaceCountry(String placeCntry);

	List<Place> getAllPlaceAvailableAndByCountry(String avai, String cntry);

}
