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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Docente docente_1 = new Docente();

        docente_1.establecer_nombre("Luis V");
        docente_1.establecer_apellido("Perez J");

        Asignatura asignatura_1 = new Asignatura();
        Asignatura asignatura_2 = new Asignatura();

        asignatura_1.establecer_nombre("Matematicas");
        asignatura_1.establecer_creditos(8);
        docente_1.establecer_asignatura_1(asignatura_1);

        asignatura_2.establecer_nombre("Fisica");
        asignatura_2.establecer_creditos(6);
        docente_1.establecer_asignatura_2(asignatura_2);

        Titulo titulo_1 = new Titulo();
        titulo_1.establecer_nombre("Licenciado de Fisico Matematico");
        titulo_1.establecer_nombre_universidad("Universidad Politecnica");
        docente_1.establecer_titulo_tercer_nivel(titulo_1);

        Titulo titulo_2 = new Titulo();
        titulo_2.establecer_nombre("Magister en Docencia Matematica");
        titulo_2.establecer_nombre_universidad("Universidad Valenciana");
        docente_1.establecer_titulo_cuarto_nivel(titulo_2);

        System.out.println("Datos del docente 1" + "\n"
                + "Nombres : " + docente_1.obtener_nombre() + "\n"
                + "Apellidos : " + docente_1.obtener_apellido() + "\n"
                + "Tiene a su cargo la asignatura:\nAsignatura 1: " + docente_1.obtener_Asignatura_1().obtener_nombre() + " con número de créditos: " + docente_1.obtener_Asignatura_1().obtener_creditos() + "\n"
                + "Asignatura 2: " + docente_1.obtener_asignatura_2().obtener_nombre() + " con número de créditos: " + docente_1.obtener_asignatura_2().obtener_creditos() + "\n"
                + "El docente tiene los siguientes titulos: \nTitulo de tercer nivel:\t" + docente_1.obtener_titulo_tercer_nivel().obtener_nombre() + " - " + docente_1.obtener_titulo_tercer_nivel().obtener_universidad() + "\n"
                + "Titulo de cuarto nivel:\t" + docente_1.obtener_titulo_cuarto_nivel().obtener_nombre() + " - " + docente_1.obtener_titulo_cuarto_nivel().obtener_universidad());

        Docente docente_2 = new Docente();

        docente_2.establecer_nombre("Ana M");
        docente_2.establecer_apellido("Velez P");

        asignatura_1.establecer_nombre("Sociales");
        asignatura_1.establecer_creditos(9);
        docente_2.establecer_asignatura_1(asignatura_1);

        asignatura_2.establecer_nombre("Literatura");
        asignatura_2.establecer_creditos(10);
        docente_2.establecer_asignatura_2(asignatura_2);

        titulo_1.establecer_nombre("Licenciado en Ciencias Sociales");
        titulo_1.establecer_nombre_universidad("Universidad Salesiana ");
        docente_2.establecer_titulo_tercer_nivel(titulo_1);

        titulo_2.establecer_nombre("Magister en Docencia Social");
        titulo_2.establecer_nombre_universidad("Universidad Cataluña");
        docente_2.establecer_titulo_cuarto_nivel(titulo_2);

        System.out.println("\nDatos del docente 2" + "\n"
                + "Nombres : " + docente_2.obtener_nombre() + "\n"
                + "Apellidos : " + docente_2.obtener_apellido() + "\n"
                + "Tiene a su cargo la asignatura:\nAsignatura 1: " + docente_2.obtener_Asignatura_1().obtener_nombre() + "con número de créditos: " + docente_2.obtener_Asignatura_1().obtener_creditos() + "\n"
                + "Asignatura 2: " + docente_2.obtener_asignatura_2().obtener_nombre() + " con número de créditos: " + docente_2.obtener_asignatura_2().obtener_creditos() + "\n"
                + "El docente tiene los siguientes titulos:\nTitulo de tercer nivel:\t" + docente_2.obtener_titulo_tercer_nivel().obtener_nombre() + " - " + docente_2.obtener_titulo_tercer_nivel().obtener_universidad() + "\n"
                + "Titulo de cuarto nivel:\t " + docente_2.obtener_titulo_cuarto_nivel().obtener_nombre() + " - " + docente_2.obtener_titulo_cuarto_nivel().obtener_universidad() + "\n");

    }
}
