package com.jobBoard.Job.Board.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class JobListings {

	@Id
	@Column(name = "Job_Id")
	private String jobID;
	private String role;
	@Column(name = "Company_Name")
	private String companyName;
	private String ratings;
	private String reviews;
	private String experiance;
	private String salary;
	private String location;
	private String skills;
	@Column(name = "Job Description")
	private String jobDescription;
	private String responsibilities;
	private String department;

	@ManyToOne
	private JobSeekers jobSeekers;

}
