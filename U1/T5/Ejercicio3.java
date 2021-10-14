package T5;

import java.util.Scanner;

public class Ejercicio3 {
    //Crea un programa que diga si el número introducido por el usuario es impar o no lo es.

    public static void main(String[] args) {

        int x ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextInt();


        if (x % 2 == 0) {
            System.out.println( x );
            System.out.print( "Es par" );
        }
        else {
            System.out.println( x );
            System.out.print( "Es impar" );
        }
    }

}
