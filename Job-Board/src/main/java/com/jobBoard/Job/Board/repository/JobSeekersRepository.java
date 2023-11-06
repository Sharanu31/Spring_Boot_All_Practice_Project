package com.jobBoard.Job.Board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobBoard.Job.Board.entity.JobSeekers;

public interface JobSeekersRepository extends JpaRepository<JobSeekers, String> {

}
