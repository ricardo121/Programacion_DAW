package Examen_U3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

    public static boolean esPuntoDeSilla(int x[][], int i, int j){

        boolean resultado = false;


        for (int n = 0; n < x.length; n++) {

            for (int m = 0; m < x[0].length; m++) {




            }

        }


        return resultado;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca numero de filas: ");
        int filas = teclado.nextInt();

        System.out.print("Introduzca numero de columnas: ");
        int columnas = teclado.nextInt();

        int[][] datos = new int[filas][columnas];


        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < datos[0].length; j++) {


                datos[i][j]=(int) (Math.random() * 1003 + 11);

            }

        }



        for (int[] dato : datos) {
            System.out.println(Arrays.toString(dato));
        }



        System.out.print("Introduzca numero de columnas: "+ esPuntoDeSilla(datos,filas,columnas));

    }


}
