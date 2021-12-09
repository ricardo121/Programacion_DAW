package T2;

import java.util.Scanner;

public class Ejercicio3 {
    //Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String frase = teclado.nextLine();

        int longitud = frase.length();

        String mitad = frase.substring(longitud/2,longitud/2+1);
        String espacio = " ";

            if (mitad.equalsIgnoreCase(espacio)){
                System.out.print("Es un espacio");
            }else{
                System.out.print("No es un espacio");
            }

    }

}