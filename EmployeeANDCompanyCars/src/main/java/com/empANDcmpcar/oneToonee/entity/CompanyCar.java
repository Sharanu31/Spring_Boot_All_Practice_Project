package com.empANDcmpcar.oneToonee.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="CampanyCar_Table")
public class CompanyCar {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String comoanyCarName;
	private String comoanyCarModel;

	@OneToOne(mappedBy = "companyCar") // , fetch = FetchType.LAZY
	private Employee employee;

}
