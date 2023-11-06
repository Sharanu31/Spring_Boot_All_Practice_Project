package com.jobBoard.Job.Board.service;

import java.util.List;

import com.jobBoard.Job.Board.entity.JobListings;

public interface JobListingsService {

	JobListings createJobListings(JobListings jobListings);

	List<JobListings> getAllListedJobs();

	List<JobListings> getAllListedJobsByRole(String role);

	List<JobListings> getAllListedJobsBycompanyName(String companyName);

	List<JobListings> getAllListedJobsBylocation(String location);

	List<JobListings> getAllListedJobsByskills(String skills);

	List<JobListings> getAllListedJobsBydepartment(String department);
	

}
