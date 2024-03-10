package com.studentANDteacher.entity;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Student_Table")
public class Student {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;

	@NotEmpty(message = "Should not be emty")
	@Column(name = "name", unique = true)
	public String name;

	@Column(name = "address")
	@Length(max = 50)
	public String address;

	@NonNull
	public String state;

	@NotEmpty
	public String nationality;

	@NonNull
	@Column(name = "PhoneNumber")
	public String phnNumber;

}
