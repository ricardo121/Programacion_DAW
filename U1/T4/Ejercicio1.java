package T4;

import java.util.Scanner;

public class Ejercicio1 {
//El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
// Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
// Es decir, que muestre el valor máximo de una variable de tipo short, y muestre también qué ocurre si sumamos 1 a esa variable.

    public static void main( String args[] ) {

        short x  , z ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextShort();
        z = (short) (x+1);

        System.out.println( "Numero maximo de una variable tipo short: "+ x );
        System.out.println( "Numero maximo + 1: "+ z );
    }

}
