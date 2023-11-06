package com.stuclg.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stuclg.entity.College;
import com.stuclg.repository.CollegeRepository;
import com.stuclg.service.CollegeService;

@Service
public class CollegeServiceImp implements CollegeService {

	@Autowired
	private CollegeRepository collegeRepository;

	@Override
	public College saveCollegeDetsils(College college) {
		return collegeRepository.save(college);
	}

	@Override
	public List<College> getAllCollegeDetsils() {
		return collegeRepository.findAll();
	}

}
