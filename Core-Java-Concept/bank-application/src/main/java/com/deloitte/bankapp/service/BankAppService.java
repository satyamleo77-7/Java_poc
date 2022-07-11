package com.deloitte.bankapp.service;

import java.net.URI;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.deloitte.bankapp.controller.exception.NameException;
import com.deloitte.bankapp.controller.proxy.PersonProxy;
import com.deloitte.bankapp.entity.BankAccount;
import com.deloitte.bankapp.mapstruct.PersonMapper;
import com.deloitte.bankapp.model.CreateAccountRequest;
import com.deloitte.bankapp.model.PersonDetails;
import com.deloitte.bankapp.repository.BankAccountRepository;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder;

//import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BankAppService {
	
	@Autowired
	private BankAccountRepository bankAccountRepository;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private Environment env;
	
	@Autowired
	private PersonProxy personProxy;
	
	public BankAccount createNewAccountWithFeign(CreateAccountRequest request) {
	//	try {
			log.info("Inside Service Method...");
			PersonDetails personDetails = null;
			ResponseEntity<PersonDetails> responseEntity = personProxy.getPersonDetails(request.getAadharNumber());
			if(responseEntity.hasBody()) {
				personDetails = responseEntity.getBody();
				if(!request.getAccountHolder().equalsIgnoreCase(personDetails.getPersonName())) {
					new NameException("Aadhar Name and Account Holder doesn't match!!");
				}
				
				log.info("Port------> {}",personDetails.getPort());
				BankAccount bankAccount = PersonMapper.INSTANCE.personToBankAccount(personDetails);
				bankAccount.setAccountNumber(RandomStringUtils.randomNumeric(10));
				bankAccount.setActive(true);
				bankAccount.setAmount(request.getAmount());
				return bankAccountRepository.save(bankAccount);
			}
			
			return BankAccount.builder().build();
	/*	}
		catch(HttpClientErrorException | HttpServerErrorException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;*/
	}
	
	private BankAccount FallbackPersonInfo(CreateAccountRequest aadharno,Throwable t) {
		log.info("Inside Bank Service create account Circuit breaker fallback methood");
		return BankAccount.builder().build();
	}
	
	//@CircuitBreaker(name = "TikTok", fallbackMethod = "FallbackPersonInfo")
	public BankAccount createNewAccount(CreateAccountRequest request) {
		try {
			String url = env.getProperty("person.get.uri");
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<PersonDetails> requestEntity = new HttpEntity<PersonDetails>(headers);
			
			URI uri = UriComponentsBuilder.fromUriString(url)
			  .path("/{aadhar}").build(request.getAadharNumber());
			 
			log.info("Uri : {}",uri);
			
			PersonDetails personDetails = null;
			
			ResponseEntity<PersonDetails> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, requestEntity, PersonDetails.class);
			if(responseEntity.hasBody()) {
				personDetails = responseEntity.getBody();
				if(!request.getAccountHolder().equalsIgnoreCase(personDetails.getPersonName())) {
					new NameException("Aadhar Name and Account Holder doesn't match!!");
				}
			}
			
			BankAccount bankAccount = PersonMapper.INSTANCE.personToBankAccount(personDetails);
			bankAccount.setAccountNumber(RandomStringUtils.randomNumeric(10));
			bankAccount.setActive(true);
			bankAccount.setAmount(request.getAmount());
			return bankAccountRepository.save(bankAccount);
			
		}
		catch(HttpClientErrorException | HttpServerErrorException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
