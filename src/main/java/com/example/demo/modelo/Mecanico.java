package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "mecanico")
public class Mecanico {
	
	@Id
	@GeneratedValue(generator = "seq_meca", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_meca", sequenceName = "seq_meca", allocationSize = 1)
	@Column(name = "meca_id")
	private Integer id;
	@Column(name = "meca_nombre")
	private String nombre;
	@Column(name = "meca_tipo")
	private String tipo;
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
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "Mecanico [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + "]";
	}
	
	
	
	

}
