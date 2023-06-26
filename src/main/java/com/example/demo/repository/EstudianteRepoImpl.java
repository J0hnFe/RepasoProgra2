package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Estudiante;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo{

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public void insertar(Estudiante e) {
		this.entityManager.persist(e);
	}

	@Override
	public void actualizar(Estudiante e) {
		this.entityManager.merge(e);
	}

	@Override
	public Estudiante seleccionar(String cedula) {
		return this.entityManager.find(Estudiante.class, cedula);
	}

	@Override
	public void eliminar(String cedula) {
		Estudiante estuAux = this.seleccionar(cedula);
		this.entityManager.remove(estuAux);
	}

	@Override
	public Estudiante seleccionarPorApellido(String apellido) {
		/*
		 * En SQL: SELECT * FROM estudiante e WHERE e.estu_apellido =
		 * 
		 * En JPQL seria: SELECT e FROM Estudiante e WHERE e.apellido =
		 */
		
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult(); //Un solo resultado
	}

	@Override
	public Estudiante seleccionarPorApellidoTyped(String apellido) {
		//Forma recomendada porque especifico tipo
		TypedQuery<Estudiante> myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido", Estudiante.class);
		myQuery.setParameter("datoApellido", apellido);
		return myQuery.getSingleResult();
	}

	@Override
	public Estudiante seleccionarPorApellidoyNombre(String apellido, String nombre) {
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido AND e.nombre = :datoNombre");
		myQuery.setParameter("datoApellido", apellido);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult(); //Porque sigue siendo un solo resultado (Estudiante)
	}

	@Override
	public List<Estudiante> seleccionarListaPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT e FROM Estudiante e WHERE e.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return  myQuery.getResultList(); //Devuelvo una lista (varios resultados)
	}

}
