package com.familyANDhouse.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Family {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long  familyID;
	
	@NotEmpty
	private String familyHead;
	
	private int totalFamilyMem;
	
}
