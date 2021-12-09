package Entregable_2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    //Hacer una algoritmo que solicite al usuario una cifra N y rellene un array bidimensional de N filas y N columnas con número aleatorios entre 100 y 200.
    //
    //Mostrar dicho array y a continuación rotarlo 90 grados:
    //
    //Ejemplo:
    //
    //Introduce la dimensión del Array: 5


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        int[][] datos = new int[num][num];

        for (int n = 0; n < num; n++) {

            for (int m = 0; m < num; m++) {

                datos[n][m] = (int) (Math.random() * 300 + 200);

            }

        }


        for (int n = 0; n < num; n++) {

            for (int m = 0; m < num; m++) {

                System.out.print(datos[n][m]+ " ");

            }
            System.out.println("");
        }

        System.out.println(Arrays.deepToString(datos));


        for (int m = 0; m < num; m++) {

            for (int n = num-1; n >= 0; n--) {

                System.out.print(datos[n][m]+ " ");

            }
            System.out.println("");

        }


        System.out.println(Arrays.deepToString(datos));

    }
}