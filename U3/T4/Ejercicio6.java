package T4;

import java.util.Scanner;

public class Ejercicio6 {
    //Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
    //A continuación, el programa deberá dar la posición tanto del máximo como del mínimo.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] datos = new int[10][10];

        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                datos[n][m] = (int) (Math.random() * 300 + 200);

            }

        }

        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                System.out.print(datos[n][m] + "  ");

            }
            System.out.println("");
        }

        System.out.println("-------------------------------------------------");

        int maximo = 0;
        int minimo = 0;


        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                    if (maximo < datos[n][m]){

                        maximo = datos[n][m];

                    }

            }
        }


        minimo = maximo;

        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                    if (minimo > datos[n][m]){

                        minimo = datos[n][m];

                    }

            }
        }


        for (int n = 0; n < 10; n++) {

            for (int m = 0; m < 10; m++) {

                if (minimo == datos[n][m]){

                    System.out.println("la posicion del numero minimo es :" + n + " " + m +  "  "+ minimo);

                }else  if (maximo == datos[n][m]){

                    System.out.println("la posicion del numero maximo es :" + n + " " + m + "  "+ maximo);

                }

            }
        }


    }
}