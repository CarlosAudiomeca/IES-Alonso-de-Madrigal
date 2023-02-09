package com.iesam.AlonsoMadrigal.domain.models;

public class Alumno extends Persona{
    private String madreDNI;
    private String padreDNI;
    private String email;

    //Funciones

    public String getMadreDNI() {
        return madreDNI;
    }

    public void setMadreDNI(String madreDNI) {
        this.madreDNI = madreDNI;
    }

    public String getPadreDNI() {
        return padreDNI;
    }

    public void setPadreDNI(String padreDNI) {
        this.padreDNI = padreDNI;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
