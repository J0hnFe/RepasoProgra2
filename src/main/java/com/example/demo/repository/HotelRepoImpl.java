package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Hotel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HotelRepoImpl implements IHotelRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Hotel h) {
		this.entityManager.persist(h);
	}

	@Override
	public List<Hotel> seleccionarHotelInnerJoin() {
		String queryString = "SELECT h from Hotel h JOIN h.habitaciones ha";
		TypedQuery<Hotel> query = this.entityManager.createQuery(queryString, Hotel.class);
		return query.getResultList();
	}
}
