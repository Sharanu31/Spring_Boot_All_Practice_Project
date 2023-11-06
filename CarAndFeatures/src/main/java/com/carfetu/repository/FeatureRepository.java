package com.carfetu.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carfetu.entity.Feature;

public interface FeatureRepository extends JpaRepository<Feature, Long> {

	Feature findByfeatureName(String featureName);

}
