package com.example.demo.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.edu.repository.PropietarioWebRepository;
import com.example.demo.uce.edu.repository.model.PropietarioWeb;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Service
public class PropietarioWebServiceImpl implements PropietarioWebService{

	@Autowired
	private PropietarioWebRepository propietarioWebRepository;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void registrar(PropietarioWeb propietarioWeb) {
		
		this.propietarioWebRepository.insertar(propietarioWeb);
	}

	@Override
	@Transactional(value = TxType.REQUIRED)
	public void guardar(PropietarioWeb propietarioWeb) {
	
		this.propietarioWebRepository.actualizar(propietarioWeb);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public PropietarioWeb buscar(Integer id) {
		
		return this.propietarioWebRepository.seleccionar(id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void borrar(Integer id) {
	
		this.propietarioWebRepository.eliminar(id);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<PropietarioWeb> buscarTodos() {
		
		return this.propietarioWebRepository.seleccionarTodos();
	}

}
