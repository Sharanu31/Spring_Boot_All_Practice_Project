package com.jobBoard.Job.Board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobBoard.Job.Board.entity.JobListings;
import com.jobBoard.Job.Board.service.JobListingsService;

@RestController
@RequestMapping("/JobListings")
public class JobListingsController {

	@Autowired
	public JobListingsService jobListingsService;

	@PostMapping
	public ResponseEntity<JobListings> createJobListings(@RequestBody JobListings jobListings) {
		JobListings savedJobsList = jobListingsService.createJobListings(jobListings);
		return new ResponseEntity<>(savedJobsList, HttpStatus.CREATED);
		
		
		
		/** {
		        "jobID": "784dbe55-67f9-4537-9c28-f80566a01cd1",
		        "role": "Software Engineer",
		        "companyName": "Red Hat",
		        "ratings": "4.4",
		        "reviews": "134",
		        "experiance": "2 to 5 years",
		        "salary": "Not Disclosed",
		        "location": "Pune",
		        "skills": "Automation Testing",
		        "jobDescription": "Red Hat's Digital Experience and Platform team is looking.",
		        "responsibilities": "Implement UIs with clean, responsive, and accessible HTML, CSS, and Java"
		        "department": "Engineering - Software & QA"
		    } **/
	}

	@GetMapping
	public ResponseEntity<List<JobListings>> getAllJobListed() {
		List<JobListings> listedJobs = jobListingsService.getAllListedJobs();
		if (listedJobs.isEmpty()) {
			return new ResponseEntity<>(listedJobs, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(listedJobs, HttpStatus.OK);
	}

	@GetMapping("/job/{role}")
	public ResponseEntity<List<JobListings>> getAllJobListedByJObRole(@PathVariable String role) {
		List<JobListings> listedJobs = jobListingsService.getAllListedJobsByRole(role);
		if (listedJobs.isEmpty()) {
			return new ResponseEntity<>(listedJobs, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(listedJobs, HttpStatus.OK);
	}

	@GetMapping("/job/company/{name}")
	public ResponseEntity<List<JobListings>> getAllJobListedByCompanyName(@PathVariable String name) {
		List<JobListings> listedJobs = jobListingsService.getAllListedJobsBycompanyName(name);
		if (listedJobs.isEmpty()) {
			return new ResponseEntity<>(listedJobs, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(listedJobs, HttpStatus.OK);
	}

	@GetMapping("/job/location/{loc}")
	public ResponseEntity<List<JobListings>> getAllJobListedByLocation(@PathVariable String loc) {
		List<JobListings> listedJobs = jobListingsService.getAllListedJobsBylocation(loc);
		if (listedJobs.isEmpty()) {
			return new ResponseEntity<>(listedJobs, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(listedJobs, HttpStatus.OK);
	}

	@GetMapping("/job/skills/{skill}")
	public ResponseEntity<List<JobListings>> getAllListedJobsByskills(@PathVariable String skill) {
		List<JobListings> listedJobs = jobListingsService.getAllListedJobsByskills(skill);
		if (listedJobs.isEmpty()) {
			return new ResponseEntity<>(listedJobs, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(listedJobs, HttpStatus.OK);
	}

	@GetMapping("/job/department/{dep}")
	public ResponseEntity<List<JobListings>> getAllListedJobsBydepartment(@PathVariable String dep) {
		List<JobListings> listedJobs = jobListingsService.getAllListedJobsBydepartment(dep);
		if (listedJobs.isEmpty()) {
			return new ResponseEntity<>(listedJobs, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(listedJobs, HttpStatus.OK);
	}

}
