package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Mecanico;
import com.example.demo.repository.IMecanicoRepo;

@Service
public class MecanicoServiceImpl implements IMecanicoService {

	@Autowired
	private IMecanicoRepo iMecanicoRepo;

	@Override
	public void ingresar(Mecanico mecanico) {
		// TODO Auto-generated method stub
		this.iMecanicoRepo.ingresar(mecanico);
	}

}
