package com.jobBoard.Job.Board.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobBoard.Job.Board.entity.JobListings;

public interface JobListingsRepository extends JpaRepository<JobListings, String> {

	List<JobListings> findByrole(String role);

	List<JobListings> findBycompanyName(String companyName);

	List<JobListings> getAllListedJobsBylocation(String location);

	List<JobListings> findByskills(String skills);

	List<JobListings> findBydepartment(String department);

}
