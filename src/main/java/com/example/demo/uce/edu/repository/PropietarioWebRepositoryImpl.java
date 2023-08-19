package com.example.demo.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.edu.repository.model.PropietarioWeb;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class PropietarioWebRepositoryImpl implements PropietarioWebRepository{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	@Transactional(value = TxType.MANDATORY)
	public void insertar(PropietarioWeb propietarioWeb) {
		
		this.entityManager.persist(propietarioWeb);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void actualizar(PropietarioWeb propietarioWeb) {
		
        this.entityManager.merge(propietarioWeb);
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public PropietarioWeb seleccionar(Integer id) {
		
		return this.entityManager.find(PropietarioWeb.class, id);
	}

	@Override
	@Transactional(value = TxType.MANDATORY)
	public void eliminar(Integer id) {
		
		this.entityManager.remove(this.seleccionar(id));
	}

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<PropietarioWeb> seleccionarTodos() {
		
		TypedQuery<PropietarioWeb> typedQuery = this.entityManager.createQuery(
				"SELECT pw FROM PropietarioWeb pw", PropietarioWeb.class);
		
		return typedQuery.getResultList();
	}

	
}
