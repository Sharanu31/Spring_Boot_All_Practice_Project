package com.petadaption.Pet.Adoption.Platform.serviceimp;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.petadaption.Pet.Adoption.Platform.entity.Pets;
import com.petadaption.Pet.Adoption.Platform.exception.DataNotFoundException;
import com.petadaption.Pet.Adoption.Platform.repository.PetRepository;
import com.petadaption.Pet.Adoption.Platform.service.PetService;

@Service
public class PetServiceImp implements PetService {

	@Autowired
	PetRepository petRepository;

	@Override
	public List<Pets> getAllPets() {
		return petRepository.findAll();
	}

	@Override
	public List<Pets> getAllPetsByAge(int age) {
		List<Pets> allPets = petRepository.findBypetage(age);
		if (allPets.isEmpty()) {
			throw new DataNotFoundException("Data Your Searching for is not availabel kindly select other data");
		}
		return allPets;
	}

	@Override
	public List<Pets> getAllPetsByType(String petType) {

		return petRepository.findBypettype(petType);
	}

	@Override
	public Pets createPets(Pets pets) {
		String petID = UUID.randomUUID().toString();
		pets.setPetID(petID);
		return petRepository.save(pets);
	}

	@Override
	public Pets updatePetStatus(String petID, Pets pets) {
		return null;
	}

	@Override
	public List<Pets> getAllPetsByTypeAndBreed(String petType, String breed) {
		return petRepository.findByPetTypeAndBreed(petType, breed);
	}

	@Override
	public Pets updatePetBytherID(String petID, Pets pets) {
		Pets petFroDB = petRepository.findById(petID).get();
		if (petFroDB.getPetID().equals(petID)) {
			if (Objects.nonNull(pets.getAdptstatus()) && !"".equalsIgnoreCase(pets.getAdptstatus())) {
				petFroDB.setAdptstatus(pets.getAdptstatus());
			}
		}
		return petRepository.save(petFroDB);
	}

}
