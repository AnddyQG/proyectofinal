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
@Table(name = "jefe")
public class Jefe {

	// DATOS
	@Id
	@GeneratedValue(generator = "seq_jefe", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_jefe", sequenceName = "seq_jefe", allocationSize = 1)
	@Column(name = "jefe_id")
	private Integer id;
	

	@Column(name = "jefe_nombre")
	private String nombre;
	@Column(name = "jefe_apellido")
	private String apellido;
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
	@Override
	public String toString() {
		return "Jefe [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	

	

	
	
	

	
	
}
