package com.jobBoard.Job.Board.entity;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobSeekers {

	@Id
	private String empID;
	@Column(name = "Employee_Name")
	@NotNull(message = "Name Shouldn't be empty")
	@Size(min = 6, max = 100)
	private String employeeName;
	private String location;
	private String currentCompany;
	private String fresherExperienced;
	private String totalExperience;
	private String currentSalary;
	private String mobileNumber;
	@Email
	private String emailAddress;
	private String noticePeriod;
	private String openForWork;
	private String skills;
	private String role;

	@JsonIgnore
	@OneToMany(mappedBy = "jobSeekers")
	private Set<JobListings> appliedJobs;

}
