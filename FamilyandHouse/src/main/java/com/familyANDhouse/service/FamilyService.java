package com.familyANDhouse.service;

import java.util.List;
import java.util.Optional;

import com.familyANDhouse.entity.Family;

public interface FamilyService {

	Family saveFamilyDetails(Family family);

	List<Family> getAllFamilyDetails();

	Optional<Family> getFamilyByID(Long familyID);

	Family updateFamilyByID(Long familyID, Family family);

	Family updateFamilyByFamilyHead(String familyHead, Family family);

}
