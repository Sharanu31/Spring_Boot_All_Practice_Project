package com.travel.planner.entity;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Place {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long place_ID;

	private String placeCountry;

	private String placeName;

	private String placeAddress;

	// mode of transport
	private String placeMOT;

	@Nonnull
	private String placeTreakDifficulty;

	// best time to travel
	private String placeBTV;

	@Nonnull
	private String availabletoVisit;

	@Nonnull
	private boolean admin;

}
