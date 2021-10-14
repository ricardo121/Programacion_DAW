package T1;

import java.util.Scanner;

public class Ejercicio5 {
    //Crea un programa que pida al usuario una temperatura en grados centígrados y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número de grados centigrados y se hara la conversion a Fahrenheit: " );
        int grados = teclado.nextInt();

        System.out.print( "El Equivalente en Fahrenheit es  : " );
        System.out.print( 9*grados/5+32  );
        System.out.print( " F"  );
    }
}
