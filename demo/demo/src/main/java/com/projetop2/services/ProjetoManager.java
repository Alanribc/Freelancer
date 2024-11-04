package com.projetop2.services;

/*
Alan Ribeiro do Carmo 10428496
Wendell Rodrigues da Costa 10428555
Jennifer Tondade 10420574
*/

import java.util.ArrayList;
import java.util.List;

import com.projetop2.entities.Projeto;

public class ProjetoManager {
    private List<Projeto> projetos;
    private Long contadorId;

    public ProjetoManager(){
        this.projetos = new ArrayList<>();
        this.projetos.add(new Projeto());
    }

    private List<Projeto> getProjetos(){
        return this.projetos;
    }

    public Projeto add(Projeto projeto){
        projeto.setId(contadorId++);
        this.projetos.add(projeto);
        return projeto;
    }

    public Projeto getById(int codigo){
        for(Projeto p: this.projetos){
            if(p.getId() == codigo){
                return p;
            }
        }
        return null;
    }

    public void remove(int codigo){
        Projeto aRemover = getById(codigo);
        if(aRemover == null){
            return;
        }
        this.projetos.remove(aRemover);
    }

    
}
