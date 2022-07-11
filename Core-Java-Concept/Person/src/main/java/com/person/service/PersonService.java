package com.person.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.person.entity.Person;
import com.person.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;

	public Person addPerson(Person person) {
		return personRepository.saveAndFlush(person);
	}

	public Person findPerson(String adharno) {
		Optional<Person> person = personRepository.findById(adharno);
		return person.orElse(null);

	}
}
