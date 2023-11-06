package com.example.rev.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Emp_ID")
	private Long id;
	@Column(name="First_Name" , nullable = false ,unique = true)
	private String empFirstName;
	@Column(name = "Last_Name")
	private String empLastName;
	
	
}
