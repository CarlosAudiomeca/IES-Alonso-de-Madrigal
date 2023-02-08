package com.iesam.AlonsoMadrigal.domain.models;

public class Matricula {
    private String id;
    private Curso curso;

    //Funciones

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
