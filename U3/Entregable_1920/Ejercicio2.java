package Entregable_1920;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {


        Scanner teclado = new Scanner(System.in);


        int[][] datos = new int[4][5];

        int resultadoFilas = 0;

        int resultadoColumnas = 0;


        for (int n = 0; n < datos.length-1; n++) {

            for (int m = 0; m < datos[0].length-1; m++) {

                datos[n][m]= (int) (Math.random() * 9 + 1);

            }

        }

        System.out.println(Arrays.deepToString(datos));



        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < datos[0].length; j++) {

                System.out.print(datos[i][j]+ " ");

            }
            System.out.println("");

        }

        System.out.println("---------------------------------------- ");

        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < datos[0].length; j++) {

                resultadoFilas = resultadoFilas + datos[i][j];

                if (j==4){

                    datos[i][j]= resultadoFilas;
                    resultadoFilas = 0;

                }

            }

        }



        for (int j = 0; j <datos[0].length-1 ; j++) {
            for (int i = 0; i < datos.length-1; i++) {

                resultadoColumnas = resultadoColumnas + datos[i][j];


            }

            datos[datos.length-1][j]= resultadoColumnas;
            resultadoColumnas = 0;
        }




        for (int i = 0; i < datos.length; i++) {
            for (int j = 4; j < datos[0].length; j++) {

                resultadoColumnas = resultadoColumnas + datos[i][j];

                if (i==3){

                    datos[i][j]= resultadoColumnas;
                    resultadoColumnas = 0;

                }

            }
        }


        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < datos[0].length; j++) {

                if (i<3 && j<4) {
                    System.out.print(datos[i][j] + "  ");
                }else{
                    System.out.print(datos[i][j] + " ");
                }

            }
            System.out.println("");

        }

        System.out.println("Longitud 1:     "+ datos.length);
        System.out.print("Longitud 2:     "+ datos[0].length);
    }

}
