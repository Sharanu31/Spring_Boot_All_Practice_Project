package com.petadaption.Pet.Adoption.Platform.service;

import java.util.List;

import com.petadaption.Pet.Adoption.Platform.entity.Pets;

public interface PetService {

	public List<Pets> getAllPets();

	public List<Pets> getAllPetsByAge(int age);

	public List<Pets> getAllPetsByType(String petType);

	public Pets createPets(Pets pets);

	public List<Pets> getAllPetsByTypeAndBreed(String petType, String breed);

	public Pets updatePetStatus(String petID, Pets pets);

	public Pets updatePetBytherID(String petID, Pets pets);

}
