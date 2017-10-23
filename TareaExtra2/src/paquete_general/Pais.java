/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_general;

/**
 *
 * @author LISBER
 */
public class Pais {

    private String nombre;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    @Override
    public String toString() {

        String cadena = String.format(" - país %s",
                obtener_nombre());

        return cadena;
    }
}
