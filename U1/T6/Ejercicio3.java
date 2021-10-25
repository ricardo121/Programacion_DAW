package T6;

import java.lang.reflect.Parameter;
import java.util.Scanner;

public class Ejercicio3 {
    //Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese número es par o el valor 0 si no es par.
    //Hazlo primero con un "if" y luego con un "operador condicional".

    public static void main( String args[] ) {

        int x , par  ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextInt();

        if (x % 2 == 0  ) {
            par = 1;
            System.out.println( par );
        }
        else {
            par = 0;
            System.out.println( par );
        }

        // Ejercicio con operador condicional
        par = x % 2 == 0 ?  1 : 0;

        System.out.print( "Vale... " );
        System.out.println( par );
    }
}
