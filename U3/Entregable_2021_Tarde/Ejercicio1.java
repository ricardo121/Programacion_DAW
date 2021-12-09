package Entregable_2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
//Crea la función filtraPrimos que:
//
//Recibe un array de enteros
//Devuelve un array de enteros con todos los primos que se encuentran en el array origen
//
//Obviamente el tamaño del array  que se devuelve será de una longitud menor o igual al que se pasa como parámetro.
//Para facilitar el ejercicio aunque un número primo se repita lo añadiremos al vector. Si no existe ningún número primo en el vector original,
//se devuelve un array con el número -1 como único elemento.

    public static int [] filtraPrimos(int n[]) {

       boolean primo = true;
       int longitud = n.length;

        int resultado[] = new int [longitud];


        for (int i = 0; i < longitud; i++){

            for (int j = 2; j < n[i]; j++) {

                if (n[i] % j == 0) {
                    primo = false;
                    break;
                }

                resultado[i]= n[i];

            }

        }

        int longitud2 = resultado.length;

        int cont = 0;

        for (int i = 0; i < longitud2; i++){

            if (resultado[i]!=0){
                cont++;
            }

        }

        int resultado2[] = new int [cont];

        cont = 0;

        for (int i = 0; i < longitud2; i++){

            if (resultado[i]!=0){
                resultado2[cont]= resultado[i];
                cont++;
            }


        }

        //System.out.println("Contador:  "+ cont);

        return resultado2;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int t[] = {17,2,5,10,20,7,50,13,20};

        System.out.println("Array Original:  "+ Arrays.toString(t));

        System.out.println("------------------------------------------------------");
        System.out.print("Array con solo los Numeros Primos:  "+ Arrays.toString(filtraPrimos(t)));


    }
}
