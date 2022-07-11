package com.deloitte.bankapp.controller.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.deloitte.bankapp.config.FooClientConfiguration;
import com.deloitte.bankapp.model.PersonDetails;


//@FeignClient(name="person-app", url="localhost:8080") -- without Eureka
//@FeignClient(name="person-app", path = "/person", configuration = FooClientConfiguration.class,  fallback = Fallback.class)
@FeignClient(name="person-app", path = "/person",fallback = Fallback.class)
public interface PersonProxy {
	
	@GetMapping("/getPerson/{aadhar}")
	public ResponseEntity<PersonDetails> getPersonDetails(@PathVariable("aadhar") String aadhar);

}
