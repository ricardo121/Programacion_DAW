package Entregable_2122;

import Tarea1.a1.Hora;
import Tarea1.a1.Hora12;
import Tarea1.a1.HoraExacta;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        Pelicula p1 = new Pelicula("el zorro", 1998, "pepe",30,"Juana Producer","mexico");
        Multimedia m1 = new Pelicula("el zorro 2", 1998, "Pedro",30,"Feid Producer","Ecuador");


        p1.play();
        p1.pause();
        p1.stop();
        p1.dar_por_finalizado();

        System.out.println(p1.toString());


        Serie s1 = new Serie("Flash",2018,"Roberto",1);

        s1.add_capitulo("sfd1");
        s1.add_capitulo("sfd2");
        s1.add_capitulo("sfd3");

        s1.play();
        s1.pause();
        s1.stop();
        s1.dar_por_finalizado();

        System.out.println(s1.toString());


        Libro l1 = new Libro("Harry Potter",1995,"Luis","El jueves","stt1234",30);

        l1.dar_por_finalizado();
        System.out.println(l1.toString());
        System.out.println("Contador multimedia " + Multimedia.cont_ident);

        Catalogo c1 = new Catalogo(m1);


    }

}
