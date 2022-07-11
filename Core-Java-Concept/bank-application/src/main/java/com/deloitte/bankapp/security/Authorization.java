package com.deloitte.bankapp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class Authorization extends WebSecurityConfigurerAdapter {

	@Override // Authentication
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication()
		.withUser("Sam")
		.password("Sam")
		.roles("ADMIN")
		.and()
		.withUser("Dua")
		.password("Dua")
		.roles("USER");
	}

	@Override // Authorization
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
				.antMatchers(HttpMethod.GET, "/bank-application/hello").hasRole("USER")
				.antMatchers(HttpMethod.POST, "/bank-application/create/account/feign").hasRole("ADMIN")
				.antMatchers("/").permitAll()
				.and().httpBasic()
				.and().csrf().disable();
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();

	}

	/*
	 * @Bean public BCryptPasswordEncoder bCryptPasswordEncoder() { return new
	 * BCryptPasswordEncoder();
	 * 
	 * }
	 */
}
