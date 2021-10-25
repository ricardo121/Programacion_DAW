package T8a;

import java.util.Scanner;

public class Ejercicio7 {
    //Diseñar un programa que muestre el producto de los 10 primeros números impares.

    public static void main( String args[] ) {

        double resultado = 1;

        for ( int i = 1 ; i< 20 ; i +=2 ) {

            resultado = resultado * i;
        }

        System.out.println("El producto de los 10 primeros numeros impares es :" + resultado );
    }


}
