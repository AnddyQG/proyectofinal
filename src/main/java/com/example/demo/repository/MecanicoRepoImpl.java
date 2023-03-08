package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Mecanico;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MecanicoRepoImpl implements IMecanicoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void ingresar(Mecanico mecanico) {
		// TODO Auto-generated method stub
		this.entityManager.persist(mecanico);
	}

}
