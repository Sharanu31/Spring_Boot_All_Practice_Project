package com.carfetu.service;

import java.util.List;
import java.util.Optional;

import com.carfetu.entity.Feature;

public interface FeatureService {

	Feature saveFeaturerDetails(Feature feature);

	List<Feature> getAllFeatureDetails();

	Feature updateFeatureDetails(Long featureID, Feature feature);
	
	Feature findFeatureByID(Long featureID);
}
