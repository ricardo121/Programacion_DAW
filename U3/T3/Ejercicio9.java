package T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio9 {
    //Definir una función que tome como parámetros dos tablas, la primera con 6 números de una apuesta de la primitiva, y la segunda con los 6 números
    //de la combinación ganadora. La función devolverá el número de aciertos.


    public static int primitiva(int combi1[], int combi2[]) {

        int longitud = combi2.length;
        int cont = 0;

        for (int i = 0; i < longitud; i++) {


            if (combi1[i] == combi2[i]) {
                cont++;
            }


        }

        return cont;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);


        int[] combinacion = new int[6];
        int cont = 0;


        for (int i = 0; i <combinacion.length; i++) {

            combinacion[i] = (int)(Math.random()*5+1);

        }

        System.out.println(Arrays.toString(combinacion));

        int [] resultadoGanador = new int[6];


            for (int i = 0; i < resultadoGanador.length; i++){

                resultadoGanador[i] = i;

            }


        System.out.println(Arrays.toString(resultadoGanador));

        System.out.print( "El numero de aciertos es :" + primitiva(combinacion,resultadoGanador) );

    }

}
