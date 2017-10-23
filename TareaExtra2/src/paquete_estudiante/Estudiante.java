/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_estudiante;

import paquete_academico.Asignatura;
import paquete_academico.Universidad;

/**
 *
 * @author LISBER
 */
public class Estudiante {

    private String nombres;
    private String apellidos;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;
    private Universidad universidad;

    public String obtener_nombres() {
        return nombres;
    }

    public void establecer_nombres(String n) {
        nombres = n;
    }

    public String obtener_apellidos() {
        return apellidos;
    }

    public void establecer_apellidos(String a) {
        apellidos = a;
    }

    public Asignatura obtener_asignatura_1() {
        return asignatura_1;
    }

    public void establecer_asignatura_1(Asignatura a1) {
        asignatura_1 = a1;
    }

    public Asignatura obtener_asignatura_2() {
        return asignatura_2;
    }

    public void establecer_asignatura_2(Asignatura a2) {
        asignatura_2 = a2;
    }

    public Universidad obtener_universidad() {
        return universidad;
    }

    public void establecer_universidad(Universidad u) {
        universidad = u;
    }

    @Override
    public String toString() {

        String cadena = String.format("Datos del Estudiante: \n"
                + "Nombres: %s\n"
                + "Apellidos: %s\n"
                + "Universidad: %s(%s)-%s\n"
                + "Tienes las siguientes asignaturas: \n"
                + "\tAsignatura 1: %s\n"
                + "\tAsignatura 2: %s",
                obtener_nombres(), obtener_apellidos(),
                obtener_universidad().obtener_nombre(), obtener_universidad().obtener_siglas(),
                obtener_universidad().obtener_pais().obtener_nombre(), obtener_asignatura_1(),
                obtener_asignatura_2());

        return cadena;

    }

}
