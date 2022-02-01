package Tarea1.a6;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarea1.a6.Banco b1 = new Tarea1.a6.Banco("Caja Sol");
        Tarea1.a6.Banco b2 = new Tarea1.a6.Banco("Caixa");

        b1.modificarCapital(10);

        b1.mostrarInformacion();
        b2.mostrarInformacion();

        CuentaCorriente c1 = new CuentaCorriente("Pedro","78987656H",b1);

        CuentaCorriente c2 = new CuentaCorriente("Jose","99077656H");

        c1.mostrarInformacion();

        c1.cambiarBanco(b2);

        c1.mostrarInformacion();

        c2.mostrarInformacion();

    }
}
