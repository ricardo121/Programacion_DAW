package Tarea1.a3;

import Tarea1.a2.CuentaCorriente;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Tarea1.a3.CuentaCorriente c1 = new Tarea1.a3.CuentaCorriente("ricardo","66984567J");
        
        c1.mostrarInformacion();
    }

}
