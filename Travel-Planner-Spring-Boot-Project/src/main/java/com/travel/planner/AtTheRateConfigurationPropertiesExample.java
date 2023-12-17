package com.travel.planner;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "from")
@Data
@Component
public class AtTheRateConfigurationPropertiesExample {
	
	private String host;
	
	private String post;
	
	private String port;

}
