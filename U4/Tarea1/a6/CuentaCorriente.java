package Tarea1.a6;

import java.util.Scanner;

public class CuentaCorriente {


    private double saldo;
    private double limite;
    public String nombre;
    protected String dni;

    Banco banco;

    CuentaCorriente( String nombre, String dni, Banco banco){

        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;
        limite = -50;
        this.banco = banco;

    }


    CuentaCorriente( String nombre, String dni ){

        this.nombre = nombre;
        this.dni = dni;
        saldo = 0;
        limite = 0;

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

    void cambiarBanco(Banco banco){

        this.banco = banco ;

    }

    void mostrarInformacion(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        if (banco != null) {
            banco.mostrarInformacion();
        }

        System.out.println("\n");
    }

}
