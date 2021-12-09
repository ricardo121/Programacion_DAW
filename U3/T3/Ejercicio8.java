package T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    //Crear una tabla bidimensional de tamaño 5x5 y rellenarla de la siguiente forma: la posición [n,m] debe contener n+m.
    //Después, se debe mostrar su contenido.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[][] datos = new int[5][5];

        for (int n = 0; n < 5; n++) {

            for (int m = 0; m < 5; m++) {

                datos[n][m] = n + m;

            }

        }

        System.out.println(Arrays.deepToString(datos));

    }
}
