package com.jobBoard.Job.Board.serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobBoard.Job.Board.entity.JobListings;
import com.jobBoard.Job.Board.entity.JobSeekers;
import com.jobBoard.Job.Board.repository.JobListingsRepository;
import com.jobBoard.Job.Board.repository.JobSeekersRepository;
import com.jobBoard.Job.Board.service.JobSeekersService;

@Service
public class JobSeekersServiceImp implements JobSeekersService {

	@Autowired
	JobSeekersRepository jobSeekersRepository;

	@Autowired
	JobListingsRepository jobListingsRepository;

	@Override
	public JobSeekers createJobSeekerDetails(JobSeekers JobSeekers) {

		return jobSeekersRepository.save(JobSeekers);
	}

	@Override
	public JobSeekers assignJobToSeeker(String jobSeekID, String jobID) {
		JobSeekers jobSek = jobSeekersRepository.findById(jobSeekID).get();
		JobListings JobListings = jobListingsRepository.findById(jobID).get();

		return null;
	}

}
