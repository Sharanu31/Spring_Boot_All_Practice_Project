package com.carfetu.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Feature {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long featureID;

	private String featureName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Car", referencedColumnName = "carID")
	//@JsonManagedReference
	private Car carEntity;

}
