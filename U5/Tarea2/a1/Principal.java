package Tarea2.a1;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Pila p1 = new PilaTabla();

        PilaTabla p2 = new PilaTabla();
        p1.apilar(10);

        p2.apilar(10);
        p2.apilar(20);
        p2.apilar(30);
        p2.apilar(40);
        p2.apilar(50);
        p2.apilar(60);

        System.out.println(p1.toString());


        System.out.println(p2.toString());
        p2.mostrar();



    }

}
