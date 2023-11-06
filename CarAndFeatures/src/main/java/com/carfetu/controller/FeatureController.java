package com.carfetu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carfetu.entity.Feature;
import com.carfetu.service.FeatureService;

@RestController
@RequestMapping("Feature")
public class FeatureController {

	@Autowired
	private FeatureService featureService;

	@GetMapping
	private List<Feature> getAllFeature() {
		return featureService.getAllFeatureDetails();

	}
}
