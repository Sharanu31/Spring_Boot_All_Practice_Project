package com.familyANDhouse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long houseID;

	@NotNull
	private String houseName;
	
	private String houseAddress;
}
