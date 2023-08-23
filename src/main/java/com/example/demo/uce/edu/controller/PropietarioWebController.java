package com.example.demo.uce.edu.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.uce.edu.repository.model.PropietarioWeb;
import com.example.demo.uce.edu.service.PropietarioWebService;


@Controller
@RequestMapping("/propietarios")
public class PropietarioWebController {

	@Autowired
	private PropietarioWebService propietarioWebService;
	
	private static final Logger LOG = LogManager.getLogger(PropietarioWebController.class);

	// http://localhost:8080/concensionario/propietarios/buscar
	@GetMapping("/buscar")
	public String buscarTodos(Model modelo) {
		LOG.info("Info");
        LOG.error("Info");
        LOG.warn("Info");
        LOG.debug("Info");
		List<PropietarioWeb> lista = this.propietarioWebService.buscarTodos();
		
		modelo.addAttribute("propietarios", lista);
		return "vistaListaPropietarios";
	}
	
	// http://localhost:8080/concensionario/propietarios/buscarPorId/1
	@GetMapping("/buscarPorId/{idPropietario}")
	public String buscarPorId(@PathVariable("idPropietario") Integer id, Model modelo) {
		PropietarioWeb propietario = this.propietarioWebService.buscar(id);
		modelo.addAttribute("propietario", propietario);
		return "vistaPropietario";
	}
	
	
	@PutMapping("/actualizar/{idPropietario}")
	public String actualizarPropietario(@PathVariable("idPropietario") Integer id, PropietarioWeb propietario) {

		this.propietarioWebService.guardar(propietario);
		return "redirect:/propietarios/buscar";
	}

	// http://localhost:8080/concensionario/propietarios/borrar/1
	@DeleteMapping("/borrar/{idPropietario}")
	public String eliminarPorId(@PathVariable("idPropietario") Integer id) {
	
		this.propietarioWebService.borrar(id);
		return "redirect:/propietarios/buscar";
	}
	
	// http://localhost:8080/concensionario/propietarios/ingresar
	
	@PostMapping("/ingresar")
	public String insertarPorpietario(PropietarioWeb propietarioWeb) {
		this.propietarioWebService.registrar(propietarioWeb);
		return "redirect:/propietarios/buscar";
	}

	// Metodo de Pagina de ReDireccionamiento
	// http://localhost:8080/concensionario/propietarios/nuevoPropietario
	@GetMapping("/nuevoPropietario")
	public String paginaNuevoPropietario(Model model, PropietarioWeb propietarioWeb) {
		model.addAttribute("propietario", propietarioWeb);
		return "vistaNuevoPropietario";
	}
}
