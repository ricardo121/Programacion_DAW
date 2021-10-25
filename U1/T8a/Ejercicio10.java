package T8a;

import java.util.Scanner;

public class Ejercicio10 {
    //Implementar una aplicación que pida un número al usuario entre el 1 y el 10, y calcule su tabla de multiplicar.
    //El código debe asegurarse de que el número introducido está entre 1 y 10, y si no es así, volver a pedirlo hasta que lo cumpla.

    public static void main(String[] args) {

        int num, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        while (num < 1 || num > 10){

            System.out.print("Introduce un numero entre 1- 10: ");
            num = teclado.nextInt();

        }

        for (int i = 1 ; i<=10; i++) {

            resultado= num*i ;
            System.out.println(num+" * "+i+" = "+resultado);

        }

    }
}
