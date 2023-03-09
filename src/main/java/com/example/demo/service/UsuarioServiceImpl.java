package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Usuario;
import com.example.demo.repository.IUsuarioRepo;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioRepo iUsuarioRepo;

	@Override
	public void crear(Usuario usuario) {
		// TODO Auto-generated method stub
		this.iUsuarioRepo.insertar(usuario);
	}

	@Override
	public Usuario buscarId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> buscarApellido(String apellido) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Usuario> buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarCedulaUna(String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Boolean validacionCedula(List<Usuario> usuarios, String cedula) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
