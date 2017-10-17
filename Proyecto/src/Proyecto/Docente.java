/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proyecto;

/**
 *
 * @author LISBER
 */
public class Docente {

    private String nombres;
    private String apellidos;
    private Titulo titulo_tercer_nivel;
    private Titulo titulo_cuarto_nivel;
    private Asignatura asignatura_1;
    private Asignatura asignatura_2;

    public String obtener_nombre() {
        return nombres;
    }

    public void establecer_nombre(String nombre) {
        nombres = nombre;
    }

    public String obtener_apellido() {
        return apellidos;
    }

    public void establecer_apellido(String apellido) {
        apellidos = apellido;
    }

    public Titulo obtener_titulo_tercer_nivel() {
        return titulo_tercer_nivel;
    }

    public void establecer_titulo_tercer_nivel(Titulo titulo_tercer) {
        titulo_tercer_nivel = titulo_tercer;
    }

    public Titulo obtener_titulo_cuarto_nivel() {
        return titulo_cuarto_nivel;
    }

    public void establecer_titulo_cuarto_nivel(Titulo titulo_cuarto) {
        titulo_cuarto_nivel = titulo_cuarto;
    }

    public Asignatura obtener_Asignatura_1() {
        return asignatura_1;
    }

    public void establecer_asignatura_1(Asignatura asignatura1) {
        asignatura_1 = asignatura1;
    }

    public Asignatura obtener_asignatura_2() {
        return asignatura_2;
    }

    public void establecer_asignatura_2(Asignatura asignatura2) {
        asignatura_2 = asignatura2;
    }

}
