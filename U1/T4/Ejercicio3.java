package T4;

import java.util.Scanner;

public class Ejercicio3 {
    //Modificar el ejercicio anterior para que muestre la parte entera de la media de tres notas decimales.
    public static void main( String args[] ) {

        double x  , y  , z, suma , media ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca primera nota: " );
        x = teclado.nextDouble();
        System.out.print( "Introduzca segunda nota: " );
        y = teclado.nextDouble();
        System.out.print( "Introduzca tercera nota: " );
        z = teclado.nextDouble();

        suma = (double)(x+y+z);
        media = suma/3;
        System.out.print( "La media de las dos notas es: " );
        System.out.println( media);
    }
}
