package Tarea1.a1;

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



    public boolean sacarDinero(int cant){

        boolean operacionPosible;

         if ( limite <= saldo - cant ){

             operacionPosible = true ;
             saldo -= cant ;

         }else {

             System.out.println("No hay dinero suficiente");
             operacionPosible = false ;

         }

         return operacionPosible;

    }


    void ingresarDinero(int cant){

        saldo += cant ;

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
