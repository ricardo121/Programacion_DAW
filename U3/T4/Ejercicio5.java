package T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    //Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno con números aleatorios entre 200 y 300.
    //A continuación, el programa debe mostrar los números de la diagonal que va desde la esquinas superior izquierda a la esquina inferior derecha,
    //así como el máximo, el mínimo y la media de los números que hay en esa diagonal.


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] datos = new int[10][10];

        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                datos[n][m] = (int)(Math.random()*300+200);

            }

        }

        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                System.out.print(datos[n][m] + "  ");

            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");

        int suma = 0;
        int cont = 0;
        int maximo = 0;
        int minimo = 0;

        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                if (n==m) {

                    System.out.print(datos[n][m] + "  ");

                    suma += datos[n][m];

                    cont++;

                } else {
                    System.out.print("     ");
                }

            }
            System.out.println("");

        }

        int media = suma / cont;


        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                if (n==m) {

                    if (maximo < datos[n][m]){

                        maximo = datos[n][m];

                    }

                }
            }
        }


        minimo = maximo;

        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                if (n==m) {

                    if (minimo > datos[n][m]){

                        minimo = datos[n][m];

                    }

                }

            }
        }


        System.out.println("Media: " + media);

        System.out.println("Maximo: " + maximo);

        System.out.println("Minimo: " + minimo);


    }
}
