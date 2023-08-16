package com.example.demo.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.edu.repository.PropietarioWebRepository;
import com.example.demo.uce.edu.repository.model.PropietarioWeb;

@Service
public class PropietarioWebServiceImpl implements PropietarioWebService{

	@Autowired
	private PropietarioWebRepository propietarioWebRepository;
	
	@Override
	public void registrar(PropietarioWeb propietarioWeb) {
		
		this.propietarioWebRepository.insertar(propietarioWeb);
	}

	@Override
	public void guardar(PropietarioWeb propietarioWeb) {
	
		this.propietarioWebRepository.actualizar(propietarioWeb);
	}

	@Override
	public PropietarioWeb buscar(Integer id) {
		
		return this.propietarioWebRepository.seleccionar(id);
	}

	@Override
	public void borrar(Integer id) {
	
		this.propietarioWebRepository.eliminar(id);
	}

	@Override
	public List<PropietarioWeb> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
