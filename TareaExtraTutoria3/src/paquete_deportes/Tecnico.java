/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_deportes;

/**
 *
 * @author LISBER
 */
public class Tecnico {

    private String nombre;
    private String funcion;
    private int edad;

    public Tecnico(String n, String f, int e) {
        nombre = n;
        funcion = f;
        edad = e;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_funcion() {
        return funcion;
    }

    public void establecer_funcion(String f) {
        funcion = f;
    }

    public int obtener_edad() {
        return edad;
    }

    public void establecer_edad(int e) {
        edad = e;
    }

    @Override
    public String toString() {
        String cadena = String.format("\t%s - %s - %d años\n", obtener_nombre(), obtener_funcion(), obtener_edad());
        return cadena;
    }

}
