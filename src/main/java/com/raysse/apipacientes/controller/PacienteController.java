package com.raysse.apipacientes.controller;

import com.raysse.apipacientes.model.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {


        @GetMapping
        public Paciente listarPaciente(){

                return new Paciente(1L, "Maria", 30);
        }
}

