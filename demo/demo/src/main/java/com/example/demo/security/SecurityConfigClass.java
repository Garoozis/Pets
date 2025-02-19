package com.example.demo.security;

import java.beans.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigClass {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity httpsecurity)throws Exception {
		httpsecurity.authorizeHttpRequests((requests) -> 
		requests.requestMatchers("/public/*").permitAll()
		.requestMatchers("/admin/*").hasRole("ADMIN")
		.requestMatchers("/user/*").hasRole("USER")
		.requestMatchers("/shelter/*").hasRole("SHELTER")
		.requestMatchers("/vet/*").hasRole("VET")
		).httpBasic();
		return httpsecurity.build();
	} 
	
	@Bean
	public PasswordEncoder passwordEncoder() {
	    return new BCryptPasswordEncoder();
	}

	public UserDetailsService userDetailsService() {
	    UserDetails admin = User.withUsername("admin")
	            .password(passwordEncoder().encode("admin-pass")) 
	            .roles("ADMIN")
	            .build();
	   
	    return new InMemoryUserDetailsManager(admin);
	}

	
}
