package Tarea1.a1;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        CuentaCorriente c1 = new CuentaCorriente("Ricardo","77668899M");

        c1.mostrarInformacion();

        c1.ingresarDinero(20);


        c1.mostrarInformacion();


        c1.sacarDinero(71);

        //c1.mostrarInformacion();
    }

}
