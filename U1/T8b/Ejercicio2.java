package T8b;

import java.util.Scanner;


public class Ejercicio2 {
    //Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros números enteros a
    //partir de uno que se introduce por teclado.

    public static void main(String[] args) {

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        for (int i = 0; i < 5; i++) {

            System.out.println(" ");

            for (int j = 1; j < 4; j++) {

                if (j==1) {
                    System.out.print((num+i));
                    System.out.print(" ");
                }else if (j==2){
                    System.out.print((num+i) * num);
                    System.out.print(" ");
                }else if (j==3){
                    System.out.print((num+i) * num * num);
                    System.out.print(" ");
                }

            }

        }
    }

}
