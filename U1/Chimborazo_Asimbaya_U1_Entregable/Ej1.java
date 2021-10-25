package Entregable_U1;

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

                if (i == j && j<=altura/2 || i == altura + 1 - j && j>altura/2 || j==1 ||j ==altura ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }


            for (int j = 1; j <= 4; j++) {

                    System.out.print(" ");

            }

            for (int j = 1; j <= altura; j++) {

                if (i == j && j<=altura/2 || i == altura + 1 - j && j>altura/2 || j==(altura/2)+1 && i>altura/2 ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

}
