package T5;

import java.util.Scanner;

public class Ejercicio4 {
    //Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.

    public static void main(String[] args) {

        int x, y ;
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca un número : " );
        x = teclado.nextInt();
        System.out.print( "Introduzca un número : " );
        y = teclado.nextInt();


        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println( x + " Es par" );
            System.out.println( y + " Es par" );
        }
        else if (x % 2 == 0 && y % 2 != 0){
            System.out.println( x + " Es par" );
            System.out.println( y + " Es impar" );
        }
        else if (x % 2 != 0 && y % 2 == 0){
            System.out.println( x + " Es impar" );
            System.out.println( y + " Es par" );
        }
        else{
            System.out.println( x + " Es impar" );
            System.out.println( y + " Es impar" );
        }

    }

}
