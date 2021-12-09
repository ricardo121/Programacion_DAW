package T3;

import java.util.Scanner;

public class Ejercicio2 {
    //Escribir una aplicación que solicite al usuario cuántos números desea introducir. A continuación, se introducirá por teclado esa cantidad
    //de números enteros, y por último, los mostrará en el orden inverso al introducido.


    public static void main(String[] args) {

        int[] datos;

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Cuantos numeros desea introducir: " );
        int num = teclado.nextInt();


        datos = new int [num];


        for (int i = 0; i < num; i++){

            System.out.print( "Deme el dato "+i+": " );
            datos[i] = i;
            System.out.println( "" );

        }


        for (int i = num -1; i >= 0 ; i--){

            System.out.println( "El dato "+ i +" vale " + datos[i] );

        }


    }

}
