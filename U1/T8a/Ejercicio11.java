package T8a;

import java.util.Scanner;

public class Ejercicio11 {
    //Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.

    public static void main(String[] args) {

        int num, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        while (num < 0 || num >= 10){

            System.out.print("Introduce un numero entre 1- 10: ");
            num = teclado.nextInt();

        }

        for (int i = 1 ; i<=10; i++) {

            resultado= num*i ;
            System.out.println(num+" * "+i+" = "+resultado);

        }


        //Completar

    }

}
