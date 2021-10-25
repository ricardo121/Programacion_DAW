package T8a;

import java.util.Scanner;

public class Ejercicio5 {
    //Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación, solicitará por teclado un valor que debe estar
    //dentro del rango. Si no es asi, volverá a solicitar un número, y así repetidas veces hasta que el valor esté dentro del rango.

    public static void main(String[] args) {

        int num, max, min;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce valor minimo: ");
        min = teclado.nextInt();
        System.out.print("Introduce valor maximo: ");
        max = teclado.nextInt();
        System.out.print("Introduce numero que este dentro del rango: ");
        num = teclado.nextInt();

        do {
            System.out.print("Introduce numero que este dentro del rango: ");
            num = teclado.nextInt();
        }

        while (num < min || num > max);
    }

}
