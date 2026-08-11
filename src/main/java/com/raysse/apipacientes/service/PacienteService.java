package com.raysse.apipacientes.service;

import com.raysse.apipacientes.model.Paciente;
import com.raysse.apipacientes.repository.PacienteRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteService {

    private final PacienteRepository pacienteRepository;

    public PacienteService(PacienteRepository pacienteRepository){
        this.pacienteRepository = pacienteRepository;
    }

    public List<Paciente> listarPacientes(){
        return pacienteRepository.findAll();
    }

    public Paciente cadastrarPaciente(Paciente paciente){
        return pacienteRepository.save(paciente);
    }

    public Paciente buscarPacientePorId(Long id){
        return pacienteRepository.findById(id).orElse(null);
    }

    public Paciente atualizarPaciente(Long id, Paciente pacienteAtualizado){

        Paciente paciente = buscarPacientePorId(id);

        if (paciente == null) {
            return null;
        }

        paciente.setNome(pacienteAtualizado.getNome());
        paciente.setIdade(pacienteAtualizado.getIdade());

        return pacienteRepository.save(paciente);
    }

    public Paciente deletarPaciente(Long id){

        Paciente paciente = buscarPacientePorId(id);

        if (paciente == null) {
            return null;
        }

        pacienteRepository.delete(paciente);

        return paciente;
    }

}
