package T2;

import java.util.Scanner;

public class Ejercicio2 {
    //Crea un programa que pida al usuario su año de nacimiento y el año actual
    // (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.

    public static void main( String args[] ) {

        short x  , y  , z ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca su año de nacimiento: " );
        x = teclado.nextShort();
        System.out.print( "Introduzca año actual: " );
        y = teclado.nextShort();

        z = (short)(y-x);
        System.out.print( "Su edad es: " );
        System.out.println( z);
    }

}
