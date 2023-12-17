package com.carfetu.service.impTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.annotation.DirtiesContext;

import com.carfetu.entity.Car;
import com.carfetu.entity.Feature;
import com.carfetu.service.FeatureService;

@SpringBootTest
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD)
class FeatureServiceImpTest {

	@Autowired
	private FeatureService featureService;

	@Disabled
	@Test
	void creatingNewFeatureForCar() {
		Feature input = featureService.saveFeaturerDetails(inputFeatureOne());
		assertEquals("SunRoof", input.getFeatureName());
	}

	@Disabled
	@Test
	void creatingNewFeatureForCarWithCarDetails() {
		Feature input = featureService.saveFeaturerDetails(inputFeatureOne());
		assertEquals("SunRoof", input.getFeatureName());
	}

	@Test
	void getALLFeatureDeatils() {
		featureService.saveFeaturerDetails(inputFeatureOne());
		featureService.saveFeaturerDetails(inputFeatureTwo());
		List<Feature> listOFFeature = featureService.getAllFeatureDetails();
		System.out.println("--------------------------");
		//Feature output = listOFFeature.get(1);
		//System.out.println(output);
		assertNotNull(listOFFeature);
	}

	Feature inputFeatureOne() {
		Feature inputOne = new Feature();
		inputOne.setFeatureID(1L);
		inputOne.setFeatureName("SunRoof");
		inputOne.setCarEntity(inputCar());
		return inputOne;
	}

	Feature inputFeatureTwo() {
		Feature inputOne = new Feature();
		inputOne.setFeatureID(2L);
		inputOne.setFeatureName("A/C");
		inputOne.setCarEntity(inputCar());
		return inputOne;
	}

	Car inputCar() {
		Car inputOne = new Car();
		inputOne.setCarID(1L);
		inputOne.setCarName("Swift");
		return inputOne;

	}

}
