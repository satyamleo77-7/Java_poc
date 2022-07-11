package com.deloitte.bankapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.bankapp.entity.BankAccount;
import com.deloitte.bankapp.model.CreateAccountRequest;
import com.deloitte.bankapp.service.BankAppService;

@RestController
@RequestMapping("/bank-application")
@CrossOrigin("*")
public class BankAppController {
	
	@Autowired
	private BankAppService bankAppService;
	
	@GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
	@PostMapping("/create/account")
	public ResponseEntity<BankAccount> createNewBankAccount(@RequestBody CreateAccountRequest createAccountRequest){
		BankAccount bankAccount = bankAppService.createNewAccount(createAccountRequest);
		return new ResponseEntity<BankAccount>(bankAccount, HttpStatus.CREATED);
	}
	
	@PostMapping("/create/account/feign")
	public ResponseEntity<BankAccount> createNewBankAccountWithFeign(@RequestBody CreateAccountRequest createAccountRequest){
		BankAccount bankAccount = bankAppService.createNewAccountWithFeign(createAccountRequest);
		return new ResponseEntity<BankAccount>(bankAccount, HttpStatus.CREATED);
	}

}
