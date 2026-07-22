package com.raysse.apipacientes.controller;

import com.raysse.apipacientes.model.Paciente;
import com.raysse.apipacientes.service.PacienteService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

        private final PacienteService pacienteService;

        public PacienteController(PacienteService pacienteService){
                 this.pacienteService = pacienteService;
        }

        @GetMapping
        public List<Paciente> listarPacientes(){
                return pacienteService.listarPacientes();
        }

        @PostMapping
        public Paciente cadastrarPaciente(@RequestBody Paciente paciente){
                return pacienteService.cadastrarPaciente(paciente);
        }

        @GetMapping("/{id}")
        public Paciente buscarPacientePorId(@PathVariable Long id){
                return pacienteService.buscarPacientePorId(id);
        }
}

