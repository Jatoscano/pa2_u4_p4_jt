package com.example.demo.uce.edu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.uce.edu.repository.model.PropietarioWeb;
import com.example.demo.uce.edu.service.PropietarioWebService;


@Controller
@RequestMapping("/propietarios")
public class PropietarioWebController {

	@Autowired
	private PropietarioWebService propietarioWebService;
	
	// http://localhost:8080/concensionario/propietarios/buscar
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		
		List<PropietarioWeb> lista = this.propietarioWebService.buscarTodos();
		
		modelo.addAttribute("propietarios", lista);
		return "vistaListaPropietarios";
	}
}
