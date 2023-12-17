package com.travel.planner.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.travel.planner.AtTheRateConfigurationPropertiesExample;

import com.travel.planner.LazyLoadingBean;
import com.travel.planner.entity.Place;
import com.travel.planner.service.PlaceService;

@RestController
@RequestMapping("/place")
@PropertySource("classpath:applicationOne.properties")
public class PlaceController {

	@Autowired
	AtTheRateConfigurationPropertiesExample atTheRateConfigurationPropertiesExample;
	
	@Autowired
	LazyLoadingBean lazyLoadingBean;
	
	@Autowired
	//@Qualifier("plaveServiceImp")
	private PlaceService placeService;
	
	//to load a values from properties file
	
	@Value("${from.host}")
	private String host;
	
	@Value("${from.post}")
	private String post;
	
	@Value("${from.port}")
	private String port;
	
	@Value("${name}")
	private String name;
	

	@PostMapping
	private Place createPlace(@RequestBody Place place) {
		return placeService.createPlace(place);
	}

	@GetMapping
	private List<Place> getAllListedPLaces() {
		System.out.println(host +" : "+ post +" : "+ port);
		System.out.println("From Custome.properties" +name);
		return placeService.getAllListOfPlace();
	}

	@PutMapping("/{id}")
	private Place updateDetailOfPlace(@PathVariable Long id, @RequestBody Place place) {
		return placeService.updatePlaceDetail(id, place);
	}

	@DeleteMapping("/delete/{id}")
	private String deletePlaceDetail(@PathVariable Long id) {
		placeService.deletePlace(id);
		return "Deleted";
	}

	@GetMapping("/placeName/{placeNam}")
	private Place getPlaceByPlaceNam(@PathVariable String placeNam) {
		return placeService.getPlaceByplaceName(placeNam);
	}

	@GetMapping("/placeCnt/{contry}")
	private List<Place> getAllPlaceByCntryName(@PathVariable String contry) {
		return placeService.getAllPlaceByPlaceCountry(contry);
	}

	@GetMapping("/{avai}/{cntry}")
	private List<Place> getAllPlaceByAvailabilityANDCntryName(String avai, String cntry) {
		return placeService.getAllPlaceAvailableAndByCountry(avai, cntry);
	}
	
	@GetMapping("/atTheRateConfigurationPropertiesExample")
	private String AtTheRateConfigurationPropertiesExample() {
		System.out.println("AtTheRateConfigurationPropertiesExample = "+ atTheRateConfigurationPropertiesExample);
		return "";
	}
}
