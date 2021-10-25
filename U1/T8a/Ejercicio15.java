package T8a;

import java.util.Scanner;

public class Ejercicio15 {
    //Realizar un programa que nos pida un número n, y nos diga cuantos números hay entre 1 y n que sean primos. Un número primo es aquel que
    //sólo es divisible por 1 y por él mismo. Ejemplo: Para n=8:

    public static void main(String[] args) {

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();

        for (int i = 1; i < num; i++) {

            boolean primo = true;

            if (num%num==0 && num%1==0 ){

                System.out.println(i+"--> Primo");

            }else {
                System.out.println(i + "--> No Primo");
            }

        }

    }

    //Completar

}
