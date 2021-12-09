package T2;

import java.util.Scanner;

public class Ejercicio2 {
    //Introducir por teclado una frase palabra a palabra, y mostrar la frase completa separando las palabras introducidas con espacios en blanco.
    //Terminar de leer la frase cuando la palabra introducida sea "fin" escrita con cualquier combinación de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String palabra = teclado.nextLine();
        String frase;

    while (palabra.equalsIgnoreCase("fin"))

        System.out.print("Introduzca una palabra: ");
        //String palabra = teclado.nextLine();
        //String frase = palabra + "";

    }

}
