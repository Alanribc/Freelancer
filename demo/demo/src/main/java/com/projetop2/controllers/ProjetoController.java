package com.projetop2.controllers;

/*
Alan Ribeiro do Carmo 10428496
Wendell Rodrigues da Costa 10428555
Jennifer Tondade 10420574
*/

import com.projetop2.entities.Projeto;
import com.projetop2.repositories.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProjetoController {

    @Autowired
    private ProjetoRepository projetoRepository;

    @GetMapping("/projetos")
    public Iterable<Projeto> listarProjetos() {
        return projetoRepository.findAll();
    }

    @PostMapping("/projetos")
    public Projeto criarProjeto(@RequestBody Projeto projeto) {
        return projetoRepository.save(projeto);
    }
}
