package T8b;

import java.util.Scanner;

public class Ejercicio4 {
    //Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y cuántos son negativos.

    public static void main(String[] args) {

        int num, cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();
        cont = 0;

        for (int i = 1; i <= 11; i++) {


            if (num>0){

                System.out.println("El Numero es Positivo");
                System.out.print("Introduzca un número : ");
                num = teclado.nextInt();

            }else {

                System.out.println("El Numero es Negativo");
                System.out.print("Introduzca un número : ");
                num = teclado.nextInt();

            }

        }

    }

}
