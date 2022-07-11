
package com.saikumar.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfigure extends WebSecurityConfigurerAdapter {

	@Override //Authentication
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication()
		.withUser("kumar")
		.password("kumar")
		.roles("USER")
		.and()
		.withUser("akhil")
		.password("$2y$12$HdQ2bWu26wCNeIhgs0wnSuQwmDTZxURn0lO3fkR9yMx9/7BowBdl.")
		.roles("ADMIN");
	}

	@Override //Authorization
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/user").hasRole("USER")
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/").permitAll()

		// login Form details
		.and().formLogin()
		.and()
		.exceptionHandling()
		.accessDeniedPage("/denied");
		
	}

	/*
	 * @Bean public PasswordEncoder getPasswordEncoder() { return
	 * NoOpPasswordEncoder.getInstance();
	 * 
	 * }
	 */
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
		
	}

}
