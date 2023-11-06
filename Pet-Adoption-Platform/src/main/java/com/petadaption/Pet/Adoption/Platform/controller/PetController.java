package com.petadaption.Pet.Adoption.Platform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PutExchange;

import com.petadaption.Pet.Adoption.Platform.entity.Pets;
import com.petadaption.Pet.Adoption.Platform.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {

	@Autowired
	PetService petService;

	@PostMapping
	public Pets createPets(@RequestBody Pets pets) {
		return petService.createPets(pets);
	}

	@GetMapping
	public ResponseEntity<List<Pets>> getAllPets() {
		return ResponseEntity.ok(petService.getAllPets());
	}

	@GetMapping("/{age}")
	public List<Pets> getAllPetsByAge(@PathVariable int age) {
		return petService.getAllPetsByAge(age);
	}

	@GetMapping("/petype/{pettype}")
	public List<Pets> getAllPetsByAge(@PathVariable("pettype") String pettype) {
		return petService.getAllPetsByType(pettype);
	}

	@GetMapping("/pet")
	public List<Pets> getAllPetsByTypeAndBreed(@RequestParam String petType, @RequestParam String breed) {
		return petService.getAllPetsByTypeAndBreed(petType, breed);
		// url http://localhost:1020/pets/pet?petType=Cat&breed=Siamese cat
	}

	@PutMapping("/petUdate/{petID}")
	public Pets updatePet(@PathVariable String petID, @RequestBody Pets pets) {
		return petService.updatePetBytherID(petID, pets);

	}

}

/*
 * { "typeOfPet":"Cat", "petvacci":"Yes", "petage":1, "adptstatus":"Available",
 * "abt_pet":"Lovely and caring", "breed":"British Shorthair" }
 */
