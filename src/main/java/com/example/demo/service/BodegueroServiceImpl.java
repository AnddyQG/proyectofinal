package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Bodeguero;
import com.example.demo.repository.IBodegueroRepo;

@Service
public class BodegueroServiceImpl implements IBodegueroService{

	
	@Autowired
	private IBodegueroRepo bodegueroRepo;

	@Override
	public void crear(Bodeguero bodeguero) {
		// TODO Auto-generated method stub
		this.bodegueroRepo.insertar(bodeguero);
	}
	
	
	
}
