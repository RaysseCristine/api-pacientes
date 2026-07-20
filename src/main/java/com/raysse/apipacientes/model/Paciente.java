package com.raysse.apipacientes.model;

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
}