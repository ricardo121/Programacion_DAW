package Tarea1.a8;

import Tarea1.a7.Emisora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);

        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        Bombilla b3 = new Bombilla();

        b1.estadoBombilla();
        b2.estadoBombilla();
        b3.estadoBombilla();

        b1.encender();
        b2.apagar();
        b3.encender();

        b1.estadoBombilla();
        b2.estadoBombilla();
        b3.estadoBombilla();

    }

}
