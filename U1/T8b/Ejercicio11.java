package T8b;

import java.util.Scanner;

public class Ejercicio11 {
    //Realiza un programa que pinte una X hecha de asteriscos. El programa debe pedir la altura. Se debe comprobar que la
    //altura sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de error.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la pirámide: ");
        int altura = sc.nextInt();
        if (altura%2!=0 && altura>2) {

            System.out.println();
            for (int i = 1; i <= altura; i++) {

                //Asteriscos
                for (int j = 1; j <= altura; j++) {
                    if (i == j || i == altura + 1 - j) {
                        System.out.print("*");
                    } else {
                        System.out.print("-");
                    }

                }
                System.out.println();
            }
        }else{
            System.out.println("ERROR: No ha introducido un numero impar");
        }
    }

}
