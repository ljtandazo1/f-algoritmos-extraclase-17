/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_academico;

import paquete_general.Pais;

/**
 *
 * @author LISBER
 */
public class Universidad {

    private String nombre;
    private String siglas;
    private Pais pais;

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_ombre(String n) {
        nombre = n;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_siglas(String s) {
        siglas = s;
    }

    public Pais obtener_pais() {
        return pais;
    }

    public void establecer_pais(Pais p) {
        pais = p;
    }

    @Override
    public String toString() {

        String cadena = String.format("%s"
                + "(%s)" + " - %s",
                obtener_nombre(), obtener_siglas(), obtener_pais().obtener_nombre());

        return cadena;

    }

}
