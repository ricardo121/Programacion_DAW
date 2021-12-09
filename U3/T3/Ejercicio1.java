package T3;

import java.util.Scanner;

public class Ejercicio1 {
    //Diseñar un programa que solicite al usuario 5 números decimales. A continuación, debe mostrar los números en el
    //mismo orden en que se han introducido.

    public static void main(String[] args) {

        double[] datos;

        Scanner teclado = new Scanner(System.in);


        datos = new double [5];


        for (int i = 0; i < 5; i++)
        {
            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextDouble();
        }


        for (int i = 0; i < 5; i++)
        {
            System.out.println( "El dato "+ i +" vale " + datos[i] );
        }


    }

}
