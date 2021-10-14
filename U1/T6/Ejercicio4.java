package T6;

import java.util.Scanner;

public class Ejercicio4 {
    //Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga el valor del menor de esos dos números.
    //Hazlo primero con un "if" y luego con un "operador condicional".

    public static void main( String args[] ) {

        int x , y , menor  ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextInt();
        System.out.print( "Introduzca un número : " );
        y = teclado.nextInt();

        if (x < y  ) {
            menor = x;
            System.out.println( menor );
        }
        else {
            menor = y;
            System.out.println( menor );
        }

        // Ejercicio con operador condicional
        menor = x < y   ?  x : y;

        System.out.print( "El Menor de los dos numero es: " );
        System.out.println( menor );
    }

}
