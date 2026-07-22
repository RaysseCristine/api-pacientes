package com.raysse.apipacientes.service;

import com.raysse.apipacientes.model.Paciente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacienteService {

    private List<Paciente> pacientes = new ArrayList<>();

    public PacienteService(){
        pacientes.add(new Paciente(1L, "Maia", 30));
        pacientes.add(new Paciente(2L, "João", 25));
        pacientes.add(new Paciente(3L, "Liz", 40));
    }

    public List<Paciente> listarPacientes(){
        return pacientes;
    }

    public Paciente cadastrarPaciente(Paciente paciente){
        pacientes.add(paciente);
        return paciente;
    }

    public Paciente buscarPacientePorId(Long id){
        for (Paciente paciente : pacientes){
            if(paciente.getId().equals(id)){
                return paciente;
            }
        }
        return null;
    }
}
