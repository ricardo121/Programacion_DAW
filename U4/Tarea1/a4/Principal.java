package Tarea1.a4;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarea1.a4.CuentaCorriente c1 = new Tarea1.a4.CuentaCorriente("ricardo","66984567J");


        System.out.println("Nombre Banco: " + CuentaCorriente.nombreBanco);

        c1.cambiarNombre("Caixa");

        System.out.println("Nombre Banco: " + CuentaCorriente.nombreBanco);


    }

}
