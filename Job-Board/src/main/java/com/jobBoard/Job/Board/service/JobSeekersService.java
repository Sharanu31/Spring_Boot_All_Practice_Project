package com.jobBoard.Job.Board.service;

import com.jobBoard.Job.Board.entity.JobSeekers;

public interface JobSeekersService {

	JobSeekers createJobSeekerDetails(JobSeekers JobSeekers);

	JobSeekers assignJobToSeeker(String jobSeekID, String jobID);
	
	
	
}
