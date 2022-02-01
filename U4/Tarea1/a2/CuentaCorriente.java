package Tarea1.a2;

import java.util.Scanner;

public class CuentaCorriente {

    double saldo;
    double limite;
    String nombre;
    String dni;


    CuentaCorriente( String nombre, String dni){

        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;
        limite = -50;

    }

    CuentaCorriente( double saldo){

        this.nombre = " ";
        dni = " ";
        this.saldo = saldo;
        limite = 0;

    }


    CuentaCorriente( double saldo, double limite, String dni){

        this.nombre = " ";
        this.dni = dni;
        this.saldo = saldo;
        this.limite = limite;

    }


    void mostrarInformacion(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);
        System.out.println("//////////");
    }

}
