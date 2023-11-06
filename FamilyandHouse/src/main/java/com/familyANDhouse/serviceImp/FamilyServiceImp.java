package com.familyANDhouse.serviceImp;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.familyANDhouse.entity.Family;
import com.familyANDhouse.repository.FamilyRepository;
import com.familyANDhouse.service.FamilyService;

public class FamilyServiceImp implements FamilyService {

	@Autowired
	private FamilyRepository familyRepository;

	@Override
	public Family saveFamilyDetails(Family family) {
		return familyRepository.save(family);
	}

	@Override
	public List<Family> getAllFamilyDetails() {
		return familyRepository.findAll();
	}

	@Override
	public Optional<Family> getFamilyByID(Long familyID) {

		return familyRepository.findById(familyID);
	}

	@Override
	public Family updateFamilyByID(Long familyID, Family family) {
		Family fam = familyRepository.findById(family.getFamilyID()).get();
		if (fam.getFamilyID().equals(familyID)) {
			if (Objects.nonNull(family.getFamilyHead()) && !"".equals(family.getFamilyHead())) {
				fam.setFamilyHead(family.getFamilyHead());
			}
			if (family.getTotalFamilyMem() >= 0) {
				fam.setTotalFamilyMem(family.getTotalFamilyMem());
			}
		}
		return familyRepository.save(fam);
	}

	@Override
	public Family updateFamilyByFamilyHead(String familyHead, Family family) {
		Family famHead = familyRepository.findById(family.getFamilyID()).get();
		if (famHead.getFamilyHead().equals(familyHead)) {
			if (Objects.nonNull(family.getFamilyHead()) && !"".equals(family.getFamilyHead())) {
				famHead.setFamilyHead(family.getFamilyHead());
			}

		}
		return familyRepository.save(famHead);
	}

}
