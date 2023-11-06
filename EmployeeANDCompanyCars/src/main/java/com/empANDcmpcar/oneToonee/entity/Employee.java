package com.empANDcmpcar.oneToonee.entity;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

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

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Employee_Table")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String employeeName;
	private String employeeDepartment;
	private String employeeCompnay;

	@OneToOne(cascade = CascadeType.ALL) // ,fetch = FetchType.EAGER
	@JoinColumn(name = "companyCar")
	private CompanyCar companyCar;
}
