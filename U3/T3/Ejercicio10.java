package T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    //Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional que debe rellenar de la siguiente forma:
    //se leerá por teclado una serie de números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares.
    //La función tiene que devolver la cantidad de impares desechados.


    public static int rellenaPares(int tabla[]) {

        int longitud = tabla.length;
        int cont = 0;
        int [] pares = new int[longitud];
        int impares = 0;

        for (int i = 0; i < longitud; i++) {

                if (tabla[i] % 2 == 0) {
                    pares[cont]= tabla[i];
                    cont++;
                }

        }

        impares = longitud-cont;

        return impares;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int[] combinacion = new int[6];
        int cont = 0;


        for (int i = 0; i <combinacion.length; i++) {

            combinacion[i] = i;

        }

        System.out.println(Arrays.toString(combinacion));

        System.out.print( "Cantidad de Impares desechados: " + rellenaPares(combinacion) );

    }
}
