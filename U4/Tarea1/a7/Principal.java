package Tarea1.a7;

import Tarea1.a6.CuentaCorriente;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Emisora e1 = new Emisora();
        Emisora e2 = new Emisora();

        e1.display();

        e1.subida();
        e1.subida();

        e1.display();


        e2.display();

        e2.bajada();

        e2.display();


    }

}
