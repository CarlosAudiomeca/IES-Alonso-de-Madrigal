package com.iesam.AlonsoMadrigal.domain.models;

public class Profesores extends Persona{
    private String tituloAcademico;
    private String fechaAlta;

    //Fuciones

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
