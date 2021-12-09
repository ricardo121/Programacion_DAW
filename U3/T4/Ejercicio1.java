package T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    //Escribe un programa que rellene un array de 100 elementos con números en-teros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
    //A continuaciónel programa mostrará el array y preguntará si el usuario quiere destacar elmáximo o el mínimo. Seguidamente se volverá a mostrar
    //el array escribiendoel número destacado entre dobles asteriscos.

    public static void main(String[] args) {

        int[] datos;

        Scanner teclado = new Scanner(System.in);

        datos = new int [100];


        for (int i = 0; i < datos.length; i++) {

            datos[i] = (int)(Math.random()*500+0);
        }

        System.out.println(Arrays.toString(datos));

        int maximo = 0;

        for (int i = 0; i < datos.length; i++) {

            if (datos[i] > maximo){
                maximo = datos[i];
            }

        }

        int minimo = maximo;

        for (int i = 0; i < datos.length; i++) {

            if (datos[i] < minimo){
                minimo = datos[i];
            }

        }

        System.out.print( "¿Qué quiere destacar? (1 – mínimo, 2 – máximo): " );
        int num = teclado.nextInt();

        if (num == 1){

            for (int i = 0; i < datos.length; i++) {

                if (datos[i] == minimo){
                    System.out.print( "**" );
                    System.out.print( datos[i] );
                    System.out.print( "**" );
                }else{
                    System.out.print( datos[i] );
                }

                System.out.print( "-" );

            }

        }else if (num == 2){

            for (int i = 0; i < datos.length; i++) {

                if (datos[i] == maximo){
                    System.out.print( "**" );
                    System.out.print( datos[i] );
                    System.out.print( "**" );
                }else{

                    System.out.print( datos[i] );
                }

                System.out.print( "-" );

            }

        }

        //System.out.println("El maximo es: "+ maximo);
        //System.out.println("El minimo es: "+ minimo);
    }
}
