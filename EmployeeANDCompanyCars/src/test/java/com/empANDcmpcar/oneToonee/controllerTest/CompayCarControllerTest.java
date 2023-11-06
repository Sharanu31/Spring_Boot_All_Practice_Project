package com.empANDcmpcar.oneToonee.controllerTest;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.empANDcmpcar.oneToonee.controller.CompanyCarController;
import com.empANDcmpcar.oneToonee.entity.CompanyCar;
import com.empANDcmpcar.oneToonee.service.CompanyCarService;

@WebMvcTest(CompanyCarController.class)
public class CompayCarControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private CompanyCarService carService;

	private CompanyCar outputCompanyCar;

	@BeforeEach
	void setup() {
		outputCompanyCar = CompanyCar.builder().comoanyCarModel("1GENB").comoanyCarName("Swift").build();

	}

	@Test
	void saveCompanyCarDetailsTest() throws Exception {
		CompanyCar input = new CompanyCar(null, "Swift", "1GENB", null);

		Mockito.when(carService.saveCompanyCarDetails(inputCompanyCarDetails())).thenReturn(inputCompanyCarDetails());
		mockMvc.perform(post("/CompanyCar").contentType(MediaType.APPLICATION_JSON)
				.content("{  \r\n" + "\"comoanyCarName\":\"Swift\",\r\n" + "\"comoanyCarModel\": \"1GENB\"\r\n" + " }"))
				.andExpect(status().isOk());
	}

	public CompanyCar inputCompanyCarDetails() {
		CompanyCar input = new CompanyCar();
		input.setId(1L);
		input.setComoanyCarName("Swift");
		input.setComoanyCarModel("1GENB");
		return input;

	}

}
