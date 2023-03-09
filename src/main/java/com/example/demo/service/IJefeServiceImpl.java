package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Jefe;
import com.example.demo.repository.IJefeRepo;

@Service
public class IJefeServiceImpl implements IJefeService {

	@Autowired
	private IJefeRepo iJefeRepo;
	
	@Override
	public void insertar(Jefe jefe) {
		// TODO Auto-generated method stub
		this.iJefeRepo.insertar(jefe);
	}

}
