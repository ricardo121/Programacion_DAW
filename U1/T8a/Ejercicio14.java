package T8a;

import java.util.Scanner;

public class Ejercicio14 {
    //Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n=4:

    public static void main(String[] args) {

        int num ;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.println(" ");

            for (int j = 0; j < num-i; j++) {

                System.out.print("*");

            }

        }

    }

}
