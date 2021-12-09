package Entregable_2122;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {


    public static String[][] insertarFilaEnMatriz(String[][] matriz, String[] fila, int pos) {

        String[][] resultado = new String[matriz.length + 1][matriz[0].length];

        int cont= 0;

        for (int i = 0; i < pos; i++) {

            for (int j = 0; j < resultado[0].length; j++) {


                resultado[i][j] = matriz[i][j];
            }
        }

        for (int i = pos; i < pos+1; i++) {

            for (int j = 0; j < resultado[0].length; j++) {


                resultado[i][j] = fila[j];
            }
        }

        for (int i = pos+1; i < resultado.length; i++) {

            for (int j = 0; j < resultado[0].length; j++) {


                resultado[i][j] =  matriz[i-1][j];
            }
        }

        return resultado;

    }

        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[][] datos = new String[4][5];

        //String[] fila = new String[datos[0].length];

        String[] fila = {"a","b","c","d","e"};

        System.out.println("Introduzca Posicion: ");
        int posicion = teclado.nextInt();

        int letra = 0;


        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < datos[0].length; j++) {


                letra = (int) (Math.random() * 2 + 1);

                if (letra == 1) {
                    datos[i][j] = "a";
                } else if (letra == 2) {
                    datos[i][j] = "b";
                }


            }

        }



        System.out.println("Matriz: ");

        for (String[] resultado : datos) {
            System.out.println(Arrays.toString(resultado));
        }

        System.out.println("Fila: ");

        System.out.println(Arrays.toString(fila));

        System.out.println("");

        System.out.println("El resultado de insertarFilaEnMatriz será: ");

        for (String[] resultadofinal : insertarFilaEnMatriz(datos,fila,posicion)) {
            System.out.println(Arrays.toString(resultadofinal));
        }
    }
}
