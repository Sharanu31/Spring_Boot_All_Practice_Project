package com.petadaption.Pet.Adoption.Platform.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Pets {

	@Id
	private String petID;

	@Column(name = "Type_Of_Pet", nullable = false)
	private String typeOfPet;

	@Column(name = "PETVACCINATION", nullable = false)
	private String petvacci;

	@NotNull
	@Column(name = "Pet_Age")
	private int petage;

	@NotNull
	@Column(name = "AdoptionStatus")
	private String adptstatus;

	@Column(name = "AboutPet")
	private String abt_pet;

	private String breed;

}
