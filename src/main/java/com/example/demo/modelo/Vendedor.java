package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="vend")
public class Vendedor {
	@Id
	@GeneratedValue(generator = "seq_vend", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_vend", sequenceName = "seq_vend", allocationSize = 1)
	@Column(name = "vend_id")
	private Integer id;
	@Column(name="vend_nombre")
	private String nombre;
	@Column(name="vend_cedula")
	private String cedula;
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
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
}
