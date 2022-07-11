package com.deloitte.bankapp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BankAccount {
	
	@Id
	private String accountNumber;
	
	private String accountHolder;
	
	private String fathersName;
	
	private String aadharNumber;
	
	private String panCard;
	
	private LocalDate dateOfBirth;
	
	private Double amount;
	
	private Boolean active;
}
