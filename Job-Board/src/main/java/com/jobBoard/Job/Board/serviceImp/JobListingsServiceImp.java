package com.jobBoard.Job.Board.serviceImp;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobBoard.Job.Board.entity.JobListings;
import com.jobBoard.Job.Board.repository.JobListingsRepository;
import com.jobBoard.Job.Board.service.JobListingsService;

@Service
public class JobListingsServiceImp implements JobListingsService {

	@Autowired
	JobListingsRepository jobListingsRepository;

	@Override
	public JobListings createJobListings(JobListings jobListings) {
		String uid = UUID.randomUUID().toString();
		jobListings.setJobID(uid);
		return jobListingsRepository.save(jobListings);
	}

	@Override
	public List<JobListings> getAllListedJobs() {
		return jobListingsRepository.findAll();
	}

	@Override
	public List<JobListings> getAllListedJobsByRole(String role) {
		return jobListingsRepository.findByrole(role);
	}

	@Override
	public List<JobListings> getAllListedJobsBycompanyName(String companyName) {
		return jobListingsRepository.findBycompanyName(companyName);
	}

	@Override
	public List<JobListings> getAllListedJobsBylocation(String location) {
		return jobListingsRepository.getAllListedJobsBylocation(location);

	}

	@Override
	public List<JobListings> getAllListedJobsByskills(String skills) {
		return jobListingsRepository.findByskills(skills);
	}

	@Override
	public List<JobListings> getAllListedJobsBydepartment(String department) {
		return jobListingsRepository.findBydepartment(department);
	}

}
