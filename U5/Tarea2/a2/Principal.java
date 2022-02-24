package Tarea2.a2;

import Tarea2.a1.Pila;
import Tarea2.a1.PilaTabla;

import java.util.Scanner;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Cliente[] tablaCliente = new Cliente[5];

        tablaCliente[0]  = new Cliente("767","ricardo",23,56);

        tablaCliente[1] = new Cliente("578","pedro",15,560);

        tablaCliente[2]  = new Cliente("67","ricardo",43,56);

        tablaCliente[3] = new Cliente("6808","pedro",25,560);

        tablaCliente[4]  = new Cliente("367","ricardo",53,56);


        Arrays.sort(tablaCliente);
        System.out.println("DNI: " + Arrays.toString(tablaCliente));

        Arrays.sort(tablaCliente, new ComparaEdades());
        System.out.println("DNI: " + Arrays.toString(tablaCliente));

        Arrays.sort(tablaCliente, new ComparaNombres());
        System.out.println("DNI: " + Arrays.toString(tablaCliente));

    }

}
