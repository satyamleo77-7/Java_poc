package com.project.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.UserData;
import com.project.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/Producer/Consumer-Service")
public class Controller {
	
	private final UserRepository repository;

	@PostMapping("/adduser")
	public UserData addUser(UserData data) {
		return repository.save(data);
	}

	@GetMapping("/showall")
	public List<UserData> showUsers() {
		return repository.findAll();
	}
	
}
