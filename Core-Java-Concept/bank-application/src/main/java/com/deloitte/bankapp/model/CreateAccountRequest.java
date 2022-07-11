package com.deloitte.bankapp.model;

import lombok.Data;

@Data
public class CreateAccountRequest {
	
	private String aadharNumber;
	
	private String accountHolder;
	
	private Double amount;

}
