package com.example.demo.repository.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "universidad")
public class Universidad {
	
	@Id
	@SequenceGenerator(name = "seq_univ", sequenceName = "seq_univ", allocationSize = 1)
	@GeneratedValue(generator = "seq_univ", strategy = GenerationType.SEQUENCE)
	@Column(name = "univ_id")
	private Integer id;
	@Column(name = "univ_nombre")
	private String nombre;
	@Column(name = "univ_tipo")
	private String tipo;
	@Column(name = "univ_cantidad_estudiantes")
	private Double cantidadEstudiantes;
	
	@OneToMany(mappedBy = "universidad", cascade = CascadeType.ALL)
	private List<Departamento> departamentos;

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

	public Double getCantidadEstudiantes() {
		return cantidadEstudiantes;
	}

	public void setCantidadEstudiantes(Double cantidadEstudiantes) {
		this.cantidadEstudiantes = cantidadEstudiantes;
	}

	public List<Departamento> getDepartamentos() {
		return departamentos;
	}

	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Universidad: " + nombre + ", tipo: " + tipo + ", cantidad estudiantes: "
				+ cantidadEstudiantes;
	}
	
	

}
