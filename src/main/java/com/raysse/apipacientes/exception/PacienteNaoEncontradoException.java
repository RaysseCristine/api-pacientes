package com.raysse.apipacientes.exception;

public class PacienteNaoEncontradoException extends RuntimeException{

    public PacienteNaoEncontradoException(Long id){
        super("Paciente com ID " + id + " não encontrado.");
    }
}
