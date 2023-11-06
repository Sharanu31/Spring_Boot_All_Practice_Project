package com.stuclg.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "college")
@Table(name = "Student_Project_For_Resume")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iD;
	private String studentName;

	// @JsonIgnore
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY) // ,fetch = FetchType.EAGER
	@JoinColumn(name = "college_iD", referencedColumnName = "iD")
	@JsonIgnoreProperties(value = {"Student_Project_For_Resume", "hibernateLazyInitializer"})
	private College college;

}
