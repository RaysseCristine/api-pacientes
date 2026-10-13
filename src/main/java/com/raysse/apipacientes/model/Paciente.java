package com.raysse.apipacientes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

@Entity
@Table(name = "pacientes")
public class Paciente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotBlank(message = "O nome é obrigatório")
        private String nome;

        @NotNull(message = "A idade é obrigatória.")
        @Positive(message = "A idade deve ser maior que zero.")
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

    public void setId(Long id) {
    this.id = id;
    }

    public void setNome(String nome) {
         this.nome = nome;
    }

    public void setIdade(Integer idade){
         this.idade = idade;
    }
}

