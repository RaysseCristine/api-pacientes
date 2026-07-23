package com.raysse.apipacientes.controller;

import com.raysse.apipacientes.model.Paciente;
import com.raysse.apipacientes.service.PacienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        public ResponseEntity<Paciente> buscarPacientePorId(@PathVariable Long id) {

                Paciente paciente = pacienteService.buscarPacientePorId(id);

                if (paciente == null) {
                        return ResponseEntity.notFound().build();
                }
                return ResponseEntity.ok(paciente);
        }

        @PutMapping("/{id}")
        public ResponseEntity<Paciente> atualizarPaciente(@PathVariable Long id,
                                                          @RequestBody Paciente pacienteAtualizado) {

                Paciente paciente = pacienteService.atualizarPaciente(id, pacienteAtualizado);

                if(paciente == null){
                        return ResponseEntity.notFound().build();
                }

                return ResponseEntity.ok(paciente);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Paciente> deletarPaciente(@PathVariable Long id) {

                Paciente paciente = pacienteService.deletarPaciente(id);

                if(paciente == null){
                        return ResponseEntity.notFound().build();
                }

                return ResponseEntity.ok(paciente);
        }
}

