package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Bodeguero;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class BodegueroRepoImpl implements IBodegueroRepo{
@PersistenceContext
private EntityManager entityManager;
	@Override
	public void insertar(Bodeguero bodeguero) {
		// TODO Auto-generated method stub
		this.entityManager.persist(bodeguero);
		
	}

}
