package Tarea2.a2;

import Tarea2.a1.Lista;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        PilaTabla p1 = new PilaTabla();

        p1.Apilar(10);
        p1.Apilar(11);
        p1.Apilar(12);
        p1.Apilar(13);


        p1.verPila();

        p1.desapilar();


        p1.verPila();

        p1.cima();

    }

}
