package com.stuclg.service;

import java.util.List;

import com.stuclg.entity.College;

public interface CollegeService {

	College saveCollegeDetsils(College college);
	
	List<College> getAllCollegeDetsils();
}
