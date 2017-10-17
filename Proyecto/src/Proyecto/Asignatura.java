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
public class Asignatura {

    private String nombre;
    private int creditos;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombres) {
        nombre = nombres;
    }

    public int obtener_creditos() {
        return creditos;
    }

    public void establecer_creditos(int credito) {
        creditos = credito;
    }
}
