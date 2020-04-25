package com.capgemini.airport;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@SpringBootApplication
public class FlightManagementSystemSprint2Application implements CommandLineRunner {
	
	@Autowired
	EntityManager em;
	public static void main(String[] args) {
		SpringApplication.run(FlightManagementSystemSprint2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
