package com.jobBoard.Job.Board.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jobBoard.Job.Board.entity.JobSeekers;
import com.jobBoard.Job.Board.repository.JobSeekersRepository;
import com.jobBoard.Job.Board.service.JobSeekersService;

@RestController
@RequestMapping("/JobSeekers")
public class JobSeekersController {

	@Autowired
	JobSeekersService jobSeekersService;

	@PostMapping
	public ResponseEntity<JobSeekers> cretaeJobProfile(@RequestBody JobSeekers jobSeekers) {
		String uid = UUID.randomUUID().toString();
		jobSeekers.setEmpID(uid);
		JobSeekers saveJobProf = jobSeekersService.createJobSeekerDetails(jobSeekers);
		return new ResponseEntity<>(saveJobProf, HttpStatus.ACCEPTED);

	}

	@PutMapping
	public JobSeekers applyforAJob(@PathVariable String jobSeekID, @PathVariable String JobID) {
		return jobSeekersService.assignJobToSeeker(jobSeekID, JobID);

	}

}
