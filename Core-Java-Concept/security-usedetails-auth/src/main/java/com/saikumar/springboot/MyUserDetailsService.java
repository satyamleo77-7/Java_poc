package com.saikumar.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) {

		User user = userRepository.findByUserName(username);

		return new UserPrinciple(user);
	}

}

/*
 * Parameters: username - the username identifying the user whose data is
 * required. Returns: a fully populated user record (never null) Throws:
 * UsernameNotFoundException - if the user could not be found or the user has no
 * GrantedAuthority
 */