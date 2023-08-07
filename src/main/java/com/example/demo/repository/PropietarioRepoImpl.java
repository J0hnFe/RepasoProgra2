package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.example.demo.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Repository
@Transactional
public class PropietarioRepoImpl implements IPropietarioRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.NEVER)
	public void insertar(Propietario p) {
		System.out.println(TransactionSynchronizationManager.isActualTransactionActive()); //Import del support
		this.entityManager.persist(p);
	}

	@Override
	public Propietario seleccionar(String cedula) {
		String jpql = "SELECT p FROM Propietario p WHERE p.cedula = :datoCedula";
		TypedQuery<Propietario> query = this.entityManager.createQuery(jpql, Propietario.class);
		query.setParameter("datoCedula", cedula);

		return query.getSingleResult();
	}

}
