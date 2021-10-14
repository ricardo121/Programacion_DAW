package T7;

import java.util.Scanner;

public class Ejercicio3 {
    //Realiza un programa que genere una letra minúscula de forma aleatoria. Investiga el uso de la función Math.random().
    //Investiga también sobre el sistema de codificación ASCII y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca numero : " );
        int edad = teclado.nextInt();
        System.out.print( "Introduzca nivel de estudios : " );
        int nivel_de_estudios = teclado.nextInt();
        System.out.print( "Introduzca ingresos : " );
        int ingresos = teclado.nextInt();

        boolean jasp;

        // Ejercicio con operador condicional

        jasp = edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000 ? true : false;

        System.out.print( "Variable jasp: " );
        System.out.println( jasp );
    }

}
