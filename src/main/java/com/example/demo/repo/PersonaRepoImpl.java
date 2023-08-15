package com.example.demo.repo;

import javax.swing.text.html.parser.Entity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.example.demo.funcional.IPersona;
import com.example.demo.repo.modelo.Persona;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonaRepoImpl implements IPersonaRepo{

    private static final Logger LOG = LoggerFactory.getLogger(PersonaRepoImpl.class);

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void insertar(Persona persona) {
        LOG.info("Hilo repo: " + Thread.currentThread().getName());
        this.entityManager.persist(persona);
    }
    
}
