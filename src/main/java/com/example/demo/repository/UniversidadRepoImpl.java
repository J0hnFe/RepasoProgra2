package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Departamento;
import com.example.demo.repository.modelo.Universidad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class UniversidadRepoImpl implements IUniversidadRepo{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void insertar(Universidad u) {
		this.entityManager.persist(u);
	}

	@Override
	public List<Universidad> seleccionarInnerJoin() {
		String jpql = "SELECT u from Universidad u INNER JOIN u.departamentos dpto";
		TypedQuery<Universidad> query = this.entityManager.createQuery(jpql, Universidad.class);
		return query.getResultList();
	}
	
	@Override
	public List<Departamento> seleccionarDptoInnerJoin() {
		String jpql = "SELECT dpto from Universidad u INNER JOIN u.departamentos dpto";
		TypedQuery<Departamento> query = this.entityManager.createQuery(jpql, Departamento.class);
		return query.getResultList();
	}

	@Override
	public List<Universidad> seleccionarOuterRightJoin() {
		String jpql = "SELECT u from Universidad u RIGHT JOIN u.departamentos dpto";
		TypedQuery<Universidad> query = this.entityManager.createQuery(jpql, Universidad.class);
		return query.getResultList();
	}

	@Override
	public List<Departamento> seleccionarDptoOuterRightJoin() {
		String jpql = "SELECT dpto from Universidad u RIGHT JOIN u.departamentos dpto";
		TypedQuery<Departamento> query = this.entityManager.createQuery(jpql, Departamento.class);
		return query.getResultList();
	}

	@Override
	public List<Universidad> seleccionarOuterLeftJoin() {
		String jpql = "SELECT u from Universidad u LEFT JOIN u.departamentos dpto";
		TypedQuery<Universidad> query = this.entityManager.createQuery(jpql, Universidad.class);
		return query.getResultList();
	}

	@Override
	public List<Departamento> seleccionarDptoOuterLeftJoin() {
		String jpql = "SELECT dpto from Universidad u LEFT JOIN u.departamentos dpto";
		TypedQuery<Departamento> query = this.entityManager.createQuery(jpql, Departamento.class);
		return query.getResultList();
	}

	@Override
	public List<Universidad> seleccionarOuterFullJoin() {
		String jpql = "SELECT u from Universidad u FULL JOIN u.departamentos dpto";
		TypedQuery<Universidad> query = this.entityManager.createQuery(jpql, Universidad.class);
		return query.getResultList();
	}

	@Override
	public List<Departamento> seleccionarDptoOuterFullJoin() {
		String jpql = "SELECT dpto from Universidad u FULL JOIN u.departamentos dpto";
		TypedQuery<Departamento> query = this.entityManager.createQuery(jpql, Departamento.class);
		return query.getResultList();
	}

	@Override
	public List<Universidad> seleccionarWhereJoin() {
		String jpql = "SELECT u from Universidad u, Departamento dpto WHERE u = dpto.universidad";
		TypedQuery<Universidad> query = this.entityManager.createQuery(jpql, Universidad.class);
		return query.getResultList();
	}

	@Override
	public List<Departamento> seleccionarDptoWhereJoin() {
		String jpql = "SELECT dpto from Universidad u, Departamento dpto WHERE u = dpto.universidad";
		TypedQuery<Departamento> query = this.entityManager.createQuery(jpql, Departamento.class);
		return query.getResultList();
	}

}
