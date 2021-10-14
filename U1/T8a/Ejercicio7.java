package T8a;

import java.util.Scanner;

public class Ejercicio7 {
    //Diseñar un programa que muestre el producto de los 10 primeros números impares.

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Múltiplos de 7 menores que 100 : ");


        for (int i = 7; i <= 100; i++) {
            if (i%7==0) {
                System.out.println(i);
            }
        }

    }


}
