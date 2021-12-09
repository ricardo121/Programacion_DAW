package Entregable_2122;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int num1 = teclado.nextInt();

        System.out.print("Introduce el número de columnas: ");

        int num2 = teclado.nextInt();
        int [][] datos = new int[num1][num2];

        int [] pares = new int[datos.length];

        int [] impares = new int[datos.length];

        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < datos[0].length; j++) {

                datos[i][j] = (int) (Math.random() * 78 + 14);

            }

        }

        for (int[] resultado : datos) {
            System.out.println(Arrays.toString(resultado));
        }

        //////////////////////////

        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < datos[0].length; j++) {

                if ( i == 0  && j == 0 || i % 2 == 0  && j % 2 == 0  ) {

                    pares[i] = datos[i][j];

                }else {
                    impares[i] = datos[i][j];
                }

            }
        }

        //System.out.println(Arrays.deepToString(datos));

        System.out.println(Arrays.toString(pares));

        System.out.println(Arrays.toString(impares));

    }

}
