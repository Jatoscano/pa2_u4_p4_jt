package com.example.demo.uce.edu.service;

import java.util.List;

import com.example.demo.uce.edu.repository.model.PropietarioWeb;

public interface PropietarioWebService {

	public void registrar(PropietarioWeb propietarioWeb);
	public void guardar(PropietarioWeb propietarioWeb);
    public PropietarioWeb buscar(Integer id);
	public void borrar(Integer id);
	public List<PropietarioWeb> buscarTodos();
}
