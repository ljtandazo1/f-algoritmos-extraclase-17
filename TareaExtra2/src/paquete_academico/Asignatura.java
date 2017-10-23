/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

/**
 *
 * @author LISBER
 */
public class Asignatura {

    private String nombre;
    private int creditos;
    private Carrera carrera;
    private Docente docente;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public void establecer_creditos(int c) {
        creditos = c;
    }

    public Carrera obtener_carrera() {
        return carrera;
    }

    public void establecer_carrera(Carrera c) {
        carrera = c;
    }

    public Docente obtener_docente() {
        return docente;
    }

    public void establecer_docente(Docente d) {
        docente = d;
    }

    @Override
    public String toString() {

        String cadena = String.format(
                "%s" + "(%d créditos)" + "%s"
                + "%s", obtener_nombre(), obtener_creditos(), obtener_carrera(),
                obtener_docente());

        return cadena;

    }

}
