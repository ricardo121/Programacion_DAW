package T3;

import java.util.Scanner;

public class Ejercicio4 {
    //Crea un programa que pida al usuario una longitud en millas
    // (por ejemplo, 3) y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).

    public static void main( String args[] ) {

        float x  , z ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número de millas y se hara la conversion a metros: " );
        x = teclado.nextFloat();
        z = (float) (1609*x);

        System.out.print( "La equivalencia en metros de "+x+" millas es: " );
        System.out.println( z + " m");
    }

}
