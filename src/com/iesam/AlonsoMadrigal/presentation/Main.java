package com.iesam.AlonsoMadrigal.presentation;

import com.iesam.AlonsoMadrigal.domain.models.*;

import java.util.Currency;

public class Main {
    public static void main(String[] args) {

        Curso primeroESO = new Curso();
        primeroESO.setId("1");
        primeroESO.setNombre("Primero");
        primeroESO.setDescripcion("ESO");
        primeroESO.setIdAula("1");


        Asignatura asignatura1 = new Asignatura("primeroESO");
        asignatura1.setId("1");
        asignatura1.setNombre("Programacion");
        asignatura1.setIdCurso("primeroESO");

        Docencia auladocencia = new Docencia();
        auladocencia.setId("1");
        auladocencia.setCapacidad("20");
        auladocencia.setPlanta("3");
        auladocencia.setSillas(20);
        auladocencia.setTipoPizarra("Tiza");

        Ordenadores aulaordenadores = new Ordenadores();
        aulaordenadores.setId("2");
        aulaordenadores.setCapacidad("35");
        aulaordenadores.setPlanta("2");
        aulaordenadores.setOrdenadores(35);
        aulaordenadores.setTipoOrdenadores("ofimatica");

        Alumno alumno1 = new Alumno();
        alumno1.setId("1");
        alumno1.setNombre("PEPE");
        alumno1.setApellidos("Perez");
        alumno1.setDni("6666666666F");
        alumno1.setDireccion("Avila");
        alumno1.setEmail("alumno1@españa.es");
        alumno1.setMadreDNI("999999999G");
        alumno1.setPadreDNI("777777777V");

        Matricula matricula = new Matricula();
        matricula.setId("1");
        matricula.setCurso(primeroESO);

        Profesores profesor1 = new Profesores();
        profesor1.setId("1");
        profesor1.setNombre("Manolo");
        profesor1.setApellidos("Cospedal");
        profesor1.setDni("2222222222K");
        profesor1.setDireccion("Madrid");
        profesor1.setTituloAcademico("Primaria");
        profesor1.setFechaAlta("20-12-2025");

    }
}