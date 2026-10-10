package com.jpa;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class Service {

    @Inject
    private Repository repository;

    public List<Personagem> obterPersonagens() {
        return repository.listarTodos();
    }

    @Transactional
    public String registarPersonagem(Personagem personagem) {

        if (personagem.getComidaFavorita() == null) {
            personagem.setComidaFavorita("macarrao");
        }
        
        repository.salvar(personagem);
        return "Personagem criada com sucesso!";
    }

}
