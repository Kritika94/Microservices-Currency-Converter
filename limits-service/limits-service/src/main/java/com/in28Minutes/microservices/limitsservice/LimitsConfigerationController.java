package com.in28Minutes.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28Minutes.microservices.limitsservice.bean.LimitConfigeration;

@RestController
public class LimitsConfigerationController {
	@Autowired
	Configeration limit;
@GetMapping("/limits")
	public LimitConfigeration retrieveLimitsfromConfigeration() {
		return new LimitConfigeration(limit.getMinimum(), limit.getMaximum());
	}
	
	
}
