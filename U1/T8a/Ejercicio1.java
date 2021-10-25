package T8a;

import java.util.Scanner;

public class Ejercicio1 {
    //Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su cuadrado.
    //El proceso terminará cuando el número introducido por teclado sea 0.
    public static void main(String[] args) {

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        while (num!=0){

            if (num%2==0) {
                System.out.println("Es Par");
            } else {
                System.out.println("Es Impar");
            }

            if (num>0){
                System.out.println("Es Positivo");
            }else {
                System.out.println("Es Negativo");
            }

            System.out.println( Math.pow(num,2) );
            System.out.println(" ");

            System.out.print("Introduzca un número : ");
            num = teclado.nextInt();

        }

        System.out.println("Terminado!");

    }

}