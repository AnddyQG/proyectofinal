package com.example.demo.modelo;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	// DATOS
	@Id
	@GeneratedValue(generator = "usua_clie", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "usua_clie", sequenceName = "usua_clie", allocationSize = 1)
	@Column(name = "usua_id")
	private Integer id;
	
	@Column(name = "usua_nombre")
	private String nombre;
	@Column(name = "usua_apellido")
	private String apellido;
	

	// RELACION

	@OneToMany(mappedBy = "usuario")
	private List<Reserva> reserva;

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// RELACION

	//@OneToMany(mappedBy = "cliente")
	//private List<Reserva> reserva;

	
	

	
	
}
