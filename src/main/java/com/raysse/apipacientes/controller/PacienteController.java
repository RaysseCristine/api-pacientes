package com.raysse.apipacientes.controller;

import com.raysse.apipacientes.model.Paciente;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

        List<Paciente> pacientes = new ArrayList<>();

        public PacienteController(){
                pacientes.add(new Paciente(1L, "Maia", 30));
                pacientes.add(new Paciente(2L, "João", 28));
                pacientes.add(new Paciente(3L, "Liz", 25));
        }

        @GetMapping
        public List<Paciente> listarPacientes(){
                return pacientes;
        }

        @PostMapping
        public Paciente cadastrarPaciente(@RequestBody Paciente paciente){
                pacientes.add(paciente);
                return paciente;
        }
}

