package com.deloitte.fallback;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import com.deloitte.bankapp.controller.proxy.PersonProxy;
import com.deloitte.bankapp.model.PersonDetails;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class Fallback implements PersonProxy{
	@Override
	public ResponseEntity<PersonDetails> getPersonDetails(String aadhar) {
		log.info("Madafaka is fucked up in fallback");
		return  ResponseEntity.ok(null);
	}
}
