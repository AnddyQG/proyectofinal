package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vendedor;
import com.example.demo.repository.IVendedorRepo;

@Service
public class VendedorServiceImpl implements IVendedorService{

	@Autowired
	private IVendedorRepo iVendedorRepo;
	
	@Override
	public void agregar(Vendedor vendedor) {
		// TODO Auto-generated method stub
		this.iVendedorRepo.insertar(vendedor);
	}

}
