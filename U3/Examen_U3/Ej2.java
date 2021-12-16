package Examen_U3;

import java.util.Arrays;

public class Ej2 {

    public static void main(String[] args) {

        int[][] datos = new int[2][10];

        int[][] resultado = new int[datos.length][datos[0].length];

        int cont = 0;


        for (int j = 0; j < datos[0].length; j++) {
            datos[0][j] = j ;
            datos[1][j] = (int) (Math.random() * 89 + 12);
        }


        for (int j = 0; j < datos[0].length; j++) {
            resultado[0][j] = datos[0][j] ;
        }


        for (int j = 0; j < datos[0].length; j++) {

            if (datos[1][j] % 2 == 0) {

                resultado[1][cont] = datos[1][j] ;
                cont++;
            }

        }


        for (int j = 0; j < datos[0].length; j++) {

            if (datos[1][j] % 2 == 0) {

            }else {
                resultado[1][cont] = datos[1][j] ;
                cont++;
            }

        }


        System.out.println("Array Original: ");

        for (int[] dato : datos) {
            System.out.println(Arrays.toString(dato));
        }


        System.out.println("Array Resultado: ");

        for (int[] result : resultado) {
            System.out.println(Arrays.toString(result));
        }

    }
}
