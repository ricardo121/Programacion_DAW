package T2;

import java.util.Scanner;

public class Ejercicio1 {
    //Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca una palabra: ");
        String palabra1 = teclado.nextLine();

        System.out.print("Introduzca una palabra: ");
        String palabra2 = teclado.nextLine();

        int x = palabra1.length();
        int y = palabra2.length();


        if (x > y){
            System.out.println( "La palabra mas corta es: " + palabra2  );
        }else{
            System.out.println( "La palabra mas corta es: " + palabra1 );
        }


    }

}
