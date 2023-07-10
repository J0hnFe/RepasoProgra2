package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Carro;
import com.example.demo.repository.modelo.dto.CarroDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CarroRepoImpl implements ICarroRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Carro c) {
		this.entityManager.persist(c);
	}

	@Override
	public List<CarroDTO> seleccionarTodosDTO() {
		String queryString = "SELECT NEW com.example.demo.repository.modelo.dto.CarroDTO(c.marca, c.modelo) FROM Carro c";
		TypedQuery<CarroDTO> query = this.entityManager.createQuery(queryString, CarroDTO.class);
		return query.getResultList();
	}

}
