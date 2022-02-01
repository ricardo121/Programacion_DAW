package Tarea1.a5;

import Tarea1.a4.CuentaCorriente;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarea1.a5.Texto c1 = new Tarea1.a5.Texto(10);

        c1.addStringF("hola");

        c1.addStringP("Na");

        c1.addChartF('f');

        c1.addChartP('R');

        c1.mostrarInformacion();

    }

}
