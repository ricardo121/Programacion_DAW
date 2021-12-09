package Entregable_1920;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    //Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
    //lo que se especifica en los comentarios:
    //
    //public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
    //                                 // que contienen el 7 (por ej. 7, 27, 782)
    //                                 // que se encuentren en otro array que se
    //                                 // pasa como parámetro. El tamaño del array
    //                                 // que se devuelve será menor o igual al
    //                                // que se pasa como parámetro.
    //
    //Utiliza esta función en un programa para comprobar que funcionan bien. Para
    //que el ejercicio resulte más fácil, las repeticiones de números que contienen
    //7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
    //el array devuelto también estará repetido 3 veces. Si no existe ningún número
    //que contiene 7 en el array x, se devuelve un array con el número -1 como único
    //elemento.


    public static int[] filtraCon7(int x[]) {

        int numero,posicion;
        int falta,numeroInvertido,resto;

        int longitud = x.length;

        int resultado[] = new int [longitud];


        for (int i = 0; i < longitud; i++){

            while(x[i]<=0);
            falta=x[i];
            numeroInvertido=0;
            resto=0;


            while(falta!=0)
            {
                resto = falta % 10;

                if (resto==7){
                    resultado[i]=x[i];
                }

                //numeroInvertido = numeroInvertido * 10 + resto;
                falta = falta / 10;
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


        return resultado2;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int t[] = {17,2,5,10,20,7,50,13,20,56789};

        System.out.println("Array Original:  "+ Arrays.toString(t));

        System.out.print("Array con solo los Numeros que tienen un 7:  "+ Arrays.toString(filtraCon7(t)));


    }

}
