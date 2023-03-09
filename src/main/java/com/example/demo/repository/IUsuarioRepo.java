package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Usuario;

public interface IUsuarioRepo {

	public void insertar(Usuario usuario);

	public Usuario buscarId(Integer id);

	public void actualizar(Usuario usuario);

	public List<Usuario> buscarTodos();

	public List<Usuario> buscarApellido(String apellido);

	public List<Usuario> buscarCedula(String cedula);

	public void eliminar(Integer id);

	public Usuario buscarCedulaUna(String cedula);

}
