package com.example.demo.repository.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {
	
	@Id
	@SequenceGenerator(name = "seq_departamento", sequenceName = "seq_departamento", allocationSize = 1)
	@GeneratedValue(generator = "seq_departamento", strategy = GenerationType.SEQUENCE)
	@Column(name = "dpto_id")
	private Integer id;
	@Column(name = "dpto_nombre")
	private String nombre;
	@Column(name = "dpto_codigo")
	private String codigo;
	
	@ManyToOne
	@JoinColumn(name = "dpto_id_universidad")
	private Universidad universidad;

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public Integer getId() {
		return id;
	}

	//toString
	@Override
	public String toString() {
		return "Departamento: " + nombre + ", codigo: " + codigo + ", pertenece a: " + universidad;
	}

}
