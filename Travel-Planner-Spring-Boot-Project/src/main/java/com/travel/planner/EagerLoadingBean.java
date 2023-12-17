package com.travel.planner;

import org.springframework.stereotype.Component;

@Component
public class EagerLoadingBean {

	public EagerLoadingBean() {
		System.out.println("EagerLoadingBean Object Created .........");
	}
}
