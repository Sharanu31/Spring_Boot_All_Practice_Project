package com.stuclg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stuclg.entity.College;
import com.stuclg.service.CollegeService;

@RestController
@RequestMapping("College")
public class CollegeController {

	@Autowired
	private CollegeService collegeService;

	@GetMapping()
	private List<College> fetchAllCollegeDetails() {

		List<College> clgs = collegeService.getAllCollegeDetsils();

		List<College> newCLgList = new ArrayList<>();
		clgs.forEach(clg -> {
			College college = new College();
			college.setiD(clg.getiD());
			college.setCollegeID(clg.getCollegeID());
			// college.setStudent(clg.getStudent());
			newCLgList.add(college);
		});

		return newCLgList;
	}

}
