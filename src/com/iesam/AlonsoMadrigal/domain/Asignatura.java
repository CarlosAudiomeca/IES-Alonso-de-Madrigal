package com.iesam.AlonsoMadrigal.domain;

public class Asignatura {
    private String id;
    private String nombre;
    private String idCurso;

    public Asignatura(String idCurso){
        setIdCurso(idCurso);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
        this.idCurso = idCurso;
    }
}
