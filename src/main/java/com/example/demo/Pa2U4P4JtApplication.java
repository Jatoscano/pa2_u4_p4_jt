package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.edu.repository.model.PropietarioWeb;
import com.example.demo.uce.edu.service.PropietarioWebService;

@SpringBootApplication
public class Pa2U4P4JtApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Pa2U4P4JtApplication.class, args);
	}

	@Autowired
	private PropietarioWebService propietarioWebService;
	@Override
	
	public void run(String... args) throws Exception {
		/*
		PropietarioWeb propietarioWeb = new PropietarioWeb();
		propietarioWeb.setNombre("David");
		propietarioWeb.setApellido("Silva");
		propietarioWeb.setCedula("1234567890");
		
		this.propietarioWebService.registrar(propietarioWeb);
		*/
	}
}
