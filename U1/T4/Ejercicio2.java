package T4;

import java.util.Scanner;

public class Ejercicio2 {
    //Necesitamos una aplicación que calcule la media aritmética de dos notas enteras.
    //Hay que tener en cuenta que la media puede contener decimales.

    public static void main( String args[] ) {

        double x  , y  , suma, media ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca primera nota: " );
        x = teclado.nextDouble();
        System.out.print( "Introduzca segunda nota: " );
        y = teclado.nextDouble();

        suma = (double)(x+y);
        media = suma/2;
        System.out.print( "La media de las dos notas es: " );
        System.out.println( media);
    }
    
}
