package com.person.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.entity.Person;
import com.person.service.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@Autowired
	private Environment env;

	@PostMapping("/addperson")
	public ResponseEntity<Person> createPerson(  @RequestBody Person person) {
		Person personresp = personService.addPerson(person);
		return new ResponseEntity<>(personresp, HttpStatus.CREATED);
	}

	@GetMapping("/getPerson/{aadhar}")
	public ResponseEntity<Person> getPersonDetails(@PathVariable("aadhar") String aadhar) {
		Person person = personService.findPerson(aadhar);
		person.setPort(env.getProperty("local.server.port"));
		return new ResponseEntity<>(person,HttpStatus.OK);
	}
}
