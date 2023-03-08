package com.example.cloud.getway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping(value = "customerServiceFallBackMethod")
	public String  customerServiceFallBackMethod() {
		return "customer Service  is talking longer then Expected"+
				"please try again later";
	}
	
	@GetMapping(value = "receiverServiceFallBackMethod")
	public String  receiverServiceFallBackMethod() {
		return "receiver Service  is talking longer then Expected"+
				"please try again later";
	}
}
