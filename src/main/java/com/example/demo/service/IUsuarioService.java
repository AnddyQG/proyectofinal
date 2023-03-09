package com.example.demo.service;

import java.util.List;

import com.example.demo.modelo.Usuario;
import com.example.demo.modelo.Usuario;

public interface IUsuarioService {

	public void crear(Usuario usuario);

	public Usuario buscarId(Integer id);

	public void actualizar(Usuario usuario);

	public List<Usuario> buscarTodos();

	public List<Usuario> buscarApellido(String apellido);

	public List<Usuario> buscarCedula(String cedula);

	public Usuario buscarCedulaUna(String cedula);

	public void borrar(Integer id);

	public Boolean validacionCedula(List<Usuario> usuarios, String cedula);

}
