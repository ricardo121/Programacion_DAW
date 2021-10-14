package T8a;

import java.util.Scanner;

public class Ejercicio5 {
    //Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación, solicitará por teclado un valor que debe estar
    //dentro del rango. Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

    public static void main(String[] args) {

        int n, contador;
        contador = 0;
        n = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu numero: ");
        n = teclado.nextInt();
        do {
            contador++;
            System.out.println(contador);
        }

        while (n != contador) ;
    }

}
