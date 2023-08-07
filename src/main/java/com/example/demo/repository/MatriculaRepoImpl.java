package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Matricula;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class MatriculaRepoImpl implements IMatriculaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Matricula> seleccionarTodos() {
		TypedQuery<Matricula> query = this.entityManager.createQuery("SELECT e FROM Matricula e", Matricula.class);
		return query.getResultList();
	}

	@Override
	public void insertar(Matricula matriculas) {
		this.entityManager.persist(matriculas);
	}

}
