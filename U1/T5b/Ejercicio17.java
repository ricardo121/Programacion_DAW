package T5b;

import java.util.Scanner;

public class Ejercicio17 {
    //Escribe un programa que diga cuál es la primera cifra de un número entero introducido por teclado. Se permiten números de hasta 5 cifras.


    public static void main(String[] args) {

        int num, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        resultado = num%10;

        //if ()

        System.out.print("La ultima cifra del numero introducido es: "+resultado);

// Completar
    }

}
