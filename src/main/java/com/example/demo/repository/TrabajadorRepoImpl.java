package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Trabajador;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TrabajadorRepoImpl implements ITrabajadorRepo{

	@Autowired
	private EntityManager entityManager;

	@Override
	public void insertar(Trabajador t) {
		this.entityManager.persist(t);
	}

	@Override
	public void actualizar(Trabajador t) {
		this.entityManager.merge(t);
	}

	@Override
	public Trabajador seleccionar(Integer id) {
		return this.entityManager.find(Trabajador.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Trabajador trabAux = this.seleccionar(id);
		this.entityManager.remove(trabAux);
	}

	@Override
	public Trabajador seleccionarPorApellido(String apellido) {
		Query myQuery = this.entityManager.createQuery("SELECT t FROM Trabajador t WHERE t.apellido = :datoApellido");
		myQuery.setParameter("datoApellido", apellido);
		return (Trabajador) myQuery.getSingleResult();
	}

	@Override
	public List<Trabajador> seleccionarPorCargo(String cargo) {
		Query myQuery = this.entityManager.createQuery("SELECT t FROM Trabajador t WHERE t.cargo = :datoCargo");
		myQuery.setParameter("datoCargo", cargo);
		return myQuery.getResultList();
	}

	@Override
	public Trabajador seleccionarPorApellidoTyped(String apellido) {
		TypedQuery<Trabajador> myQuery = this.entityManager.createQuery("SELECT t FROM Trabajador t WHERE t.apellido = :datoApellido", Trabajador.class);
		myQuery.setParameter("datoApellido", apellido);
		return (Trabajador) myQuery.getSingleResult();
	}

	@Override
	public List<Trabajador> seleccionarPorCargoTyped(String cargo) {
		TypedQuery<Trabajador> myQuery = this.entityManager.createQuery("SELECT t FROM Trabajador t WHERE t.cargo = :datoCargo", Trabajador.class);
		myQuery.setParameter("datoCargo", cargo);
		return myQuery.getResultList();
	}
	
}
