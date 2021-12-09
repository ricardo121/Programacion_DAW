package Entregable_2021_Tarde;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        int[][] datos = new int[num][num];
        String letras = "abcdefgh";

        for (int i = 0; i < num; i++) {

            for (int j = 0; j < datos[i].length; j++) {

                //datos[i][j] = letras.charAt(j + String.valueOf(datos[], j, datos.length));

            }

        }


        System.out.println(Arrays.deepToString(datos));
    }
}
