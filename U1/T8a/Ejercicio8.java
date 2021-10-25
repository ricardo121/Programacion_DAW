package T8a;

import java.util.Scanner;

public class Ejercicio8 {
    //Pedir un número y calcular su factorial.

    public static void main(String[] args) {

        int num, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();
        resultado = 1;


        for (int i = num ; i>=1; i--) {

            resultado = resultado * i;

        }

        System.out.print("Factorial de " +num+ " : " +resultado);

    }

}
