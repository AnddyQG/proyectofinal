package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Usuario;
import com.example.demo.modelo.Usuario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class UsuarioRepoImpl implements IUsuarioRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.persist(usuario);
	}

	@Override
	public Usuario buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Usuario.class, id);
	}

	@Override
	public void actualizar(Usuario usuario) {
		// TODO Auto-generated method stub
		this.entityManager.merge(usuario);
	}

	@Override
	public List<Usuario> buscarTodos() {

		TypedQuery<Usuario> query = this.entityManager.createQuery("select c from Cliente c", Usuario.class);
		List<Usuario> listaTotal = query.getResultList();

		return listaTotal;
	}

	@Override
	public List<Usuario> buscarApellido(String apellido) {

		Query query = this.entityManager.createQuery("select c from Usuario c where c.apellido= :datoApellido");
		query.setParameter("datoApellido", apellido);
		return query.getResultList();
	}

	@Override
	public void eliminar(Integer id) {

		Usuario usuario = this.buscarId(id);
		this.entityManager.remove(usuario);

	}

	@Override
	public List<Usuario> buscarCedula(String cedula) {

		TypedQuery<Usuario> query = this.entityManager
				.createQuery("select c from Usuario c where c.cedula= :datoCedula", Usuario.class);
		query.setParameter("datoCedula", cedula);
		return query.getResultList();
	}

	@Override
	public Usuario buscarCedulaUna(String cedula) {
		// TODO Auto-generated method stub
		TypedQuery<Usuario> query = this.entityManager
				.createQuery("select c from Usuario c where c.cedula= :datoCedula", Usuario.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

}
