package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Jefe;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class IJefeRepoImpl implements IJefeRepo {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Jefe jefe) {
		// TODO Auto-generated method stub
		this.entityManager.persist(jefe);
	}

}
