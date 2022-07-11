package com.project.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.PathAllocationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class Controller {
	private final PathAllocationService pathAllocationService;
@PostMapping("/add")
	public ResponseEntity<String> addUser(HttpServletRequest request) {
		return pathAllocationService.passThrough(request);
		
	}
	
}
