package com.person.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Person {

	@Id
	private String aadharNumber;

	private String personName;

	private String fathersName;

	private String panCard;

	private LocalDate dateOfBirth;
	
	private String port;
}