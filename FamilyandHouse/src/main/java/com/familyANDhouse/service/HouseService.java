package com.familyANDhouse.service;

import java.util.List;

import com.familyANDhouse.entity.House;

public interface HouseService {

	House saveHouseDetails(House house);

	List<House> getALlHouseDetails();

	House getHouseDetailsByID(Long houseID);

	House updateHouseDetails(Long houseID, House house);

	House updateHouseDetails(String houseName, House house);

}
