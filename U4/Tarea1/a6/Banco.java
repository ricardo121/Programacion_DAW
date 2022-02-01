package Tarea1.a6;

import java.util.Scanner;

public class Banco {

    private String nombre;
    public double capital;
    public String direccion;


    Banco( String nombre){

        this.nombre = nombre;
        this.capital = 500;
        this.direccion = "";

    }

    void modificarCapital(int cant){

        capital = cant ;

    }


    void mostrarInformacion(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre: " + nombre);
        System.out.println("capital: " + capital);
        System.out.println("Direccion: " + direccion);
        System.out.println("\n");
    }


}
