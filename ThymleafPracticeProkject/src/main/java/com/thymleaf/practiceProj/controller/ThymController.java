package com.thymleaf.practiceProj.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ThymController {

	@GetMapping("/Sample")
	public String samplePage(Model model) {
		model.addAttribute("name", "Sharanappa");
		return "sample";
		
	}
	
	@GetMapping("/iterator")
	public String iterator(Model m) {
		List<String> names = List.of("Sharanu","Stranger","Unknown","FatBoy");
		m.addAttribute("ite", names);
		
		return "ite";
	}
	
	@GetMapping("/conditional")
	public String conditional(Model m) {
		m.addAttribute("isActive", false);
		
		m.addAttribute("Gender", "G");
		
		List<Integer> list01 = List.of(1,2,3,4);
		
		m.addAttribute("list01", list01);
		
		return "conditional";
	}
	@GetMapping("/fragExmp")
	public String fragExample(Model m) {
		return "frag";
	}
	
}
