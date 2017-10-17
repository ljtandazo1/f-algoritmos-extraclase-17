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
public class Titulo {

    private String nombre;
    private String nombre_universidad;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String nombres) {
        nombre = nombres;
    }

    public String obtener_universidad() {
        return nombre_universidad;
    }

    public void establecer_nombre_universidad(String nombre_u) {
        nombre_universidad = nombre_u;
    }

}
