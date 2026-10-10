package com.jpa;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.util.List;

@ApplicationScoped
public class Repository {

    @PersistenceContext
    private EntityManager em;

    public void salvar(Personagem personagem) {
        em.persist(personagem);
    }

    public List<Personagem> listarTodos() {
        return em.createQuery("SELECT p FROM Personagem p", Personagem.class).getResultList();
    }
}