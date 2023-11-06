package com.carfetu.service.imp;

import java.lang.StackWalker.Option;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.carfetu.entity.Feature;
import com.carfetu.repository.FeatureRepository;
import com.carfetu.service.FeatureService;

@Service
public class FeatureServiceImp implements FeatureService {

	@Autowired
	private FeatureRepository featureRepository;

	@Override
	public Feature saveFeaturerDetails(Feature feature) {
		Optional<Feature> dupli = Optional.ofNullable(featureRepository.findByfeatureName(feature.getFeatureName()));
		if (dupli.isPresent()) {
			throw new IllegalAccessError("Feature with name " + feature.getFeatureName() + " already exist");
		}
		if (!StringUtils.hasLength(feature.getFeatureName())) {
			throw new IllegalAccessError("Feature name should not be empty");
		}
		return featureRepository.save(feature);
	}

	@Override
	public List<Feature> getAllFeatureDetails() {
		return featureRepository.findAll();
	}

	@Override
	public Feature updateFeatureDetails(Long featureID, Feature feature) {
		Feature featureDet = featureRepository.findById(featureID).get();
		if (featureDet.getFeatureID().equals(featureID)) {
			if (Objects.isNull(feature.getFeatureName()) && !"".equals(feature.getFeatureName())) {
				featureDet.setFeatureName(feature.getFeatureName());
			}
		}
		return featureRepository.save(featureDet);

	}

	@Override
	public Feature findFeatureByID(Long featureID) {
		Optional<Feature> featureDet = featureRepository.findById(featureID);
		if (featureDet.isPresent()) {
			return featureDet.get();
		}
		return null;
	}

}
