package Examen_U1;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca altura: ");
        int altura = teclado.nextInt();

        while (altura % 2 == 0 || altura < 3) {
            System.out.print("Altura erronea: ");
            altura = teclado.nextInt();
        }

        for (int i = 1; i <= altura; i++) {

            //Asteriscos


            for (int j = 1; j <= altura; j++) {

                if ((j == altura / 2 - i) || (j == altura / 2 + i) || i == altura/2+1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            for (int j = 1; j <= 2; j++) {

                System.out.print("-");

            }

            for (int j = 1; j <= altura; j++) {

                if (i == 1 && j < altura ||i == altura && j < altura || i == altura/2+1 && j < altura || j == 1 || j == altura && i < altura && i > 1 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
