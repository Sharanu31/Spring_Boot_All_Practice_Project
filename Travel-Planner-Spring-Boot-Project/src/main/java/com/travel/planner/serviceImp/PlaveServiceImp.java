package com.travel.planner.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.travel.planner.EagerLoadingBean;
import com.travel.planner.entity.Place;
import com.travel.planner.repository.PlacesRepository;
import com.travel.planner.service.PlaceService;

@Service
@Primary
public class PlaveServiceImp implements PlaceService {

	
	@Autowired
	PlacesRepository placesRepository;

	@Override
	public Place createPlace(Place place) {
		return placesRepository.save(place);
	}

	@Override
	public List<Place> getAllListOfPlace() {
		return placesRepository.findAll();
	}

	@Override
	public Place updatePlaceDetail(Long id, Place place) {
		return placesRepository.save(place);
	}

	@Override
	public String deletePlace(Long id) {
		placesRepository.deleteById(id);
		return "Deleted";

	}

	@Override
	public Place getPlaceByplaceName(String placeNam) {
		return placesRepository.findByplaceName(placeNam);
	}

	@Override
	public List<Place> getAllPlaceByPlaceCountry(String placeCntry) {
		return placesRepository.findAllByplaceName(placeCntry);

	}

	@Override
	public List<Place> getAllPlaceAvailableAndByCountry(String avai, String cntry) {
		return placesRepository.findAllByAvilabeANdCountry(avai, cntry);

	}

}
