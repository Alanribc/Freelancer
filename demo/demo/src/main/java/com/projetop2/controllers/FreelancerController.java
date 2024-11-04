package com.projetop2.controllers;

/*
Alan Ribeiro do Carmo 10428496
Wendell Rodrigues da Costa 10428555
Jennifer Tondade 10420574
*/

import com.projetop2.entities.Freelancer;
import com.projetop2.repositories.FreelancerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FreelancerController {

    @Autowired
    private FreelancerRepository freelancerRepository;

    @GetMapping("/freelancers")
    public Iterable<Freelancer> listarFreelancers() {
        return freelancerRepository.findAll();
    }

    @PostMapping("/freelancers")
    public Freelancer criarFreelancer(@RequestBody Freelancer freelancer) {
        return freelancerRepository.save(freelancer);
    }
}
