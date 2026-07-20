package com.raysse.apipacientes.controller;

import com.raysse.apipacientes.model.Paciente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

        @GetMapping
        public List<Paciente> listarPaciente(){

                List<Paciente> pacientes = new ArrayList<>();

                pacientes.add(new Paciente(1L, "Maia", 30));
                pacientes.add(new Paciente(2L, "João", 28));
                pacientes.add(new Paciente(3L, "Liz", 25));

                return pacientes;
        }
}

