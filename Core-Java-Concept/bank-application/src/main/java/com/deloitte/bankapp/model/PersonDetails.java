package com.deloitte.bankapp.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDetails {
	
	private String aadharNumber;

	private String personName;

	private String fathersName;

	private String panCard;

	private LocalDate dateOfBirth;
	
	private String port;

}
