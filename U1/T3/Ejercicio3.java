package T3;

import java.util.Scanner;

public class Ejercicio3 {
    //Crea un programa que calcule y muestre la división de dos números reales de doble precisión introducidos por el usuario.

    public static void main( String args[] ) {

        double x  , y  , z ;

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca el primer número: " );
        x = teclado.nextDouble();
        System.out.print( "Introduzca el segundo número: " );
        y = teclado.nextDouble();

        z = (x/y);
        System.out.print( "La division de los dos numeros es: " );
        System.out.println(z);
    }

}
