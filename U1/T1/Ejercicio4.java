package T1;

import java.util.Scanner;

public class Ejercicio4 {
    //Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609 m).

    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número de millas y se hara la conversion a metros: " );
        int millas = teclado.nextInt();

        System.out.print( "La equivalencia en metros de "+millas+" millas es: " );
        System.out.println( 1609* millas+ " m");
    }

}
