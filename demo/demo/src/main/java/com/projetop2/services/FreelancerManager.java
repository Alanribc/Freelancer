package com.projetop2.services;

import java.util.ArrayList;
import java.util.List;

import com.projetop2.entities.Freelancer;

public class FreelancerManager {
    private List<Freelancer> freelancers;
    private Long contadorId;

    public FreelancerManager(){
        this.freelancers = new ArrayList<>();
        this.freelancers.add(new Freelancer());
    }

    private List<Freelancer> getFreelancers(){
        return this.freelancers;
    }

    public Freelancer add(Freelancer freelancer){
        freelancer.setId(++contadorId);
        this.freelancers.add(freelancer);
        return freelancer;
    }

    public Freelancer getById(int codigo){
        for(Freelancer f: this.freelancers){
            if(f.getId() == codigo){
                return f;
            }
        }
        return null;
    }

    public void remove(int codigo){
        Freelancer aRemover = getById(codigo);
        if(aRemover == null){
            return;
        }
        this.freelancers.remove(aRemover);
    }

    public void update(int codigo, Freelancer freelancer){
        Freelancer ant = getById(codigo);
        ant.setNome(freelancer.getNome());
        ant.setEmail(freelancer.getEmail());
        ant.setAvaliacao(freelancer.getAvaliacao());
        ant.setHabilidades(freelancer.getHabilidades());
        ant.setNumero(freelancer.getNumero());
    }
         
}
