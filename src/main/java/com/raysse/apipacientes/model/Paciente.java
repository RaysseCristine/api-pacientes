package com.raysse.apipacientes.model;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Paciente {

        private Long id;
        private String nome;
        private Integer idade;


     public Paciente(){
     }

     public Paciente(Long id, String nome, Integer idade){
         this.id = id;
         this.nome = nome;
         this.idade = idade;
     }

     public Long getId() {
         return id;
     }

     public String getNome() {
         return nome;
     }

     public Integer getIdade(){
         return idade;
     }

    @PostMapping
    public Paciente cadastrarPaciente(@RequestBody Paciente paciente){

            return paciente;
    }
}

