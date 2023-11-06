package com.familyANDhouse.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.familyANDhouse.entity.House;
import com.familyANDhouse.repository.HouseRepository;
import com.familyANDhouse.service.HouseService;

public class HouseServiceImp implements HouseService {

	@Autowired
	private HouseRepository houseRepository;
	
	@Override
	public House saveHouseDetails(House house) {
		return null;
	}

	@Override
	public List<House> getALlHouseDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public House getHouseDetailsByID(Long houseID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public House updateHouseDetails(Long houseID, House house) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public House updateHouseDetails(String houseName, House house) {
		// TODO Auto-generated method stub
		return null;
	}

}
