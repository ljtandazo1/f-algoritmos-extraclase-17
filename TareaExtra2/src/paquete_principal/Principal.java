/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete_principal;

import paquete_academico.Asignatura;
import paquete_academico.Carrera;
import paquete_academico.Docente;
import paquete_academico.Universidad;
import paquete_estudiante.Estudiante;
import paquete_general.Pais;

/**
 *
 * @author LISBER
 */
public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        //Creacion de Objetos tipo Pais
        Pais p = new Pais();
        p.establecer_nombre("Ecuador");

        Pais p1 = new Pais();
        p1.establecer_nombre("Colombia");

        Pais p2 = new Pais();
        p2.establecer_nombre("Perú");

        Pais p3 = new Pais();
        p3.establecer_nombre("Venezuela");

        //Creacion de Objetos tipo Docente
        Docente d = new Docente();
        d.establecer_nombres("Mario");
        d.establecer_apellidos("Alcivar");
        d.establecer_pais(p1);

        Docente d1 = new Docente();
        d1.establecer_nombres("Maria");
        d1.establecer_apellidos("Ruiz");
        d1.establecer_pais(p2);

        Docente d2 = new Docente();
        d2.establecer_nombres("Luis");
        d2.establecer_apellidos("Armigos");
        d2.establecer_pais(p3);

        //Creacion de Objetos tipo Universidad
        //CASO 1
        Universidad u = new Universidad();
        u.establecer_ombre("Universidad Técnica Particular de Loja");
        u.establecer_siglas("UTPL");
        u.establecer_pais(p);

        Carrera c = new Carrera();
        c.establecer_nombre("Sistemas");
        c.establecer_modalidad("presencial");

        Asignatura a1 = new Asignatura();
        a1.establecer_nombre("Matemáticas");
        a1.establecer_creditos(10);
        a1.establecer_carrera(c);
        a1.establecer_docente(d);

        Asignatura a2 = new Asignatura();
        a2.establecer_nombre("Física");
        a2.establecer_creditos(8);
        a2.establecer_carrera(c);
        a2.establecer_docente(d1);

        Estudiante e = new Estudiante();
        e.establecer_nombres("Lisber");
        e.establecer_apellidos("Tandazo");
        e.establecer_asignatura_1(a1);
        e.establecer_asignatura_2(a2);
        e.establecer_universidad(u);

        //MOSTRAR EN PANTALLA CASO 1
        System.out.println("Caso 1: \n");
        System.out.println(e);

        //CASO 2
        Universidad u1 = new Universidad();
        u1.establecer_ombre("Universidad Técnica Equinoccial");
        u1.establecer_siglas("UTE");
        u1.establecer_pais(p);

        Carrera c1 = new Carrera();
        c1.establecer_nombre("Ingeniería Química");
        c1.establecer_modalidad("distancia");

        Asignatura a3 = new Asignatura();
        a3.establecer_nombre("Biología");
        a3.establecer_creditos(9);
        a3.establecer_carrera(c1);
        a3.establecer_docente(d2);

        Asignatura a4 = new Asignatura();
        a4.establecer_nombre("Física");
        a4.establecer_creditos(7);
        a4.establecer_carrera(c1);
        a4.establecer_docente(d1);

        Estudiante e1 = new Estudiante();
        e1.establecer_nombres("José");
        e1.establecer_apellidos("Abad");
        e1.establecer_asignatura_1(a3);
        e1.establecer_asignatura_2(a4);
        e1.establecer_universidad(u1);

        //MOSTRAR EN PANTALLA CASO 2
        System.out.println("\nCaso 2: \n");
        System.out.println(e1);

    }

}
