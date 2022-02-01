package Tarea1.a2;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarea1.a2.CuentaCorriente c1 = new CuentaCorriente("ricardo","66984567J");

        Tarea1.a2.CuentaCorriente c2 = new CuentaCorriente(400);

        Tarea1.a2.CuentaCorriente c3 = new CuentaCorriente(500,-100,"79889970T");

        c1.mostrarInformacion();
        c2.mostrarInformacion();
        c3.mostrarInformacion();

    }

}
