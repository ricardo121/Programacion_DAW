package T4;

import java.util.Scanner;

public class Ejercicio4 {
    //Sería interesante disponer de un programa que pida como entrada un número decimal
    // y lo muestre redondeando al entero más próximo. ej: 2,3 -> 2  4,8 -> 5
    public static void main( String args[] ) {

        double numero;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un numero decimal: " );
        numero = teclado.nextDouble();

        System.out.print( "Numero Redondeado: " );
        System.out.println( Math.round(numero));
    }
}
