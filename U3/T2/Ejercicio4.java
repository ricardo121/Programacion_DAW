package T2;

import java.util.Scanner;

public class Ejercicio4 {
    //Diseñar una actividad que pida al usuario que introduzca una frase por teclado e indique cuántos espacios en blanco tiene.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String frase = teclado.nextLine();

        int longitud = frase.length();
        int cont = 0;

        char espacio = ' ';

        for (int i = 0; i < longitud; i++) {


            if (frase.charAt(i) == espacio){

                cont++;
            }

        }

        System.out.println("En esta frase hay " + cont + " espacios en blanco ");


    }

}
