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
public class Equipo {

    private String nombre;
    private String siglas;
    private int anio_fundacion;
    private Jugador[] jugadores; 
    private Tecnico[] tecnicos; 

    public Equipo(String n, String s, int a, Jugador[] j, Tecnico[] t) {
        nombre = n;
        siglas = s;
        anio_fundacion = a;
        jugadores = j;
        tecnicos = t;
    }

    public String obtener_nombre() {
        return nombre;
    }

    public void establecer_nombre(String n) {
        nombre = n;
    }

    public String obtener_siglas() {
        return siglas;
    }

    public void establecer_siglas(String s) {
        siglas = s;
    }

    public int obtener_anio_fundacion() {
        return anio_fundacion;
    }

    public void establecer_Anio_fundacion(int a) {
        anio_fundacion = a;
    }

    public Jugador[] obtener_jugadores() {
        return jugadores;
    }

    public void establecer_jugadores(Jugador[] j) {
        jugadores = j;
    }

    public Tecnico[] obtener_tecnicos() {
        return tecnicos;
    }

    public void establecer_tecnicos(Tecnico[] t) {
        tecnicos = t;
    }

    public double obtener_promedio_edad_jugadores() {
        double edades = 0;
        Jugador[] arregloJugadores = obtener_jugadores();
        for (int i = 0; i < arregloJugadores.length; i++) {

            edades += arregloJugadores[i].obtener_edad();
        }
        return edades / arregloJugadores.length;
    }

    public double obtener_promedio_edad_tecnicos() {
        double edades = 0;
        Tecnico[] arregloTecnicos = obtener_tecnicos();
        for (int i = 0; i < arregloTecnicos.length; i++) {

            edades += arregloTecnicos[i].obtener_edad();
        }
        return edades / arregloTecnicos.length;
    }

    public String ConverTecnicos() {
        String ctecnico = "";
        Tecnico[] arregloTecnicos = obtener_tecnicos();

        for (int i = 0; i < tecnicos.length; i++) {
            ctecnico += String.format("\t%s - %s - %d años\n",
                    arregloTecnicos[i].obtener_nombre(),
                    arregloTecnicos[i].obtener_funcion(),
                    arregloTecnicos[i].obtener_edad());
        }
        return ctecnico;

    }

    public String ConverJugadores() {
        String cjugador = "";
        Jugador[] arregloJugadores = obtener_jugadores();

        for (int i = 0; i < tecnicos.length; i++) {
            cjugador += String.format("\t%s - %s - %d años\n",
                    arregloJugadores[i].obtener_nombre(),
                    arregloJugadores[i].obtener_posicion(),
                    arregloJugadores[i].obtener_edad());
        }
        return cjugador;

    }

    @Override
    public String toString() {
        String cadena = String.format("Equipo \"%s\"\n"
                + "Sus técnicos son:\n"
                + "%s"
                + "Sus jugadores son:\n"
                + "%s"
                + "Promedio de edad de:\n"
                + "\tTécnicos: %.2f años\n"
                + "\tJugadores: %.2f años",
                obtener_nombre(),
                ConverTecnicos(),
                ConverJugadores(),
                obtener_promedio_edad_tecnicos(),
                obtener_promedio_edad_jugadores()
        );

        return cadena;
    }

}
