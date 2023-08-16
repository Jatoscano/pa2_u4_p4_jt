package com.example.demo.uce.edu.repository;

import java.util.List;

import com.example.demo.uce.edu.repository.model.PropietarioWeb;

public interface PropietarioWebRepository {

	public void insertar(PropietarioWeb propietarioWeb);
	public void actualizar(PropietarioWeb propietarioWeb);
    public PropietarioWeb seleccionar(Integer id);
	public void eliminar(Integer id);
	public List<PropietarioWeb> seleccionarTodos();
}
