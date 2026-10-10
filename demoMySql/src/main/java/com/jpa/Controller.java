package com.jpa;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import java.util.List;

@Path("/personagem")
public class Controller 
{
    @Inject
    private Service service;

    @GET
    public List<Personagem> getPersonagens() {
        return service.obterPersonagens();
    }

    @POST
    public String criarPersonagem(Personagem personagem) {
        service.registarPersonagem(personagem);
        return "Personagem criada com sucesso!";
    }
}
