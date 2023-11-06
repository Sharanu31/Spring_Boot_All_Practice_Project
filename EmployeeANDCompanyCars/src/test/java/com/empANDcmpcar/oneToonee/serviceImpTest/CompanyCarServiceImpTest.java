package com.empANDcmpcar.oneToonee.serviceImpTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.empANDcmpcar.oneToonee.entity.CompanyCar;
import com.empANDcmpcar.oneToonee.repository.CompanyCarRepository;
import com.empANDcmpcar.oneToonee.service.CompanyCarService;

@SpringBootTest
public class CompanyCarServiceImpTest {

	@Autowired
	private CompanyCarService companyCarService;

	/*
	 * @MockBean private CompanyCarRepository carRepository;
	 */
	public CompanyCar outputCar;

	/*
	 * @BeforeEach void setup() { outputCar =
	 * CompanyCar.builder().comoanyCarModel("1F33RF").comoanyCarName("Swift").build(
	 * ); Mockito.when(companyCarService.findByCompanyCarName("Swift")).thenReturn(
	 * outputCar); }
	 */

	@Test
	// @Disabled
	void creatingCompanyCarDetails() {
		CompanyCar outputCompanyCar = companyCarService.saveCompanyCarDetails(inputCompanyCar());
		assertNotNull(outputCompanyCar);
	}

	@Test
	@Disabled
	void tofectAllCompanyCarDetails() {
		CompanyCar input1 = companyCarService.saveCompanyCarDetails(inputCompanyCar());
		CompanyCar input2 = companyCarService.saveCompanyCarDetails(inputCompanyCar1());
		assertTrue(companyCarService.getAllCompanyCar().size() > 1);
	}

	@Test
	@Disabled
	void updateCompanyCarDetails() {
		companyCarService.saveCompanyCarDetails(inputCompanyCar());
		// Mockito.when(companyCarService.findById(1L)).thenReturn(inputCompanyCar());
		long id = 1;
		CompanyCar input1 = CompanyCar.builder().comoanyCarModel("Swift").comoanyCarName("1D23RF").build();
		CompanyCar outp = companyCarService.updateCompanyCarDetails(id, input1);
		assertEquals("1D23RF", outp.getComoanyCarName());

	}

	@Test
	void tofectCompanyCarDetailsByName() {
		Mockito.when(companyCarService.findByCompanyCarName("Swift")).thenReturn(inputCompanyCar());
		CompanyCar companyCarName = companyCarService.findByCompanyCarName("Swift");
		assertEquals("1F33RF", companyCarName.getComoanyCarModel());
	}

	public CompanyCar inputCompanyCar() {
		CompanyCar input = new CompanyCar();
		input.setId(1L);
		input.setComoanyCarName("Swift");
		input.setComoanyCarModel("1F33RF");
		return input;

	}

	public CompanyCar inputCompanyCar1() {
		CompanyCar input = new CompanyCar();
		input.setId(2L);
		input.setComoanyCarName("Swift-Dezier");
		input.setComoanyCarModel("1F876RF");
		return input;

	}

}
