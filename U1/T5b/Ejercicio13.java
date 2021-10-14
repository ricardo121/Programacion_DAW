package T5b;

import java.util.Scanner;

public class Ejercicio13 {
    //Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
    public static void main(String[] args) {

        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();
        if (num%2==0 || num%5==0){
            System.out.print("Es divisible entre 2 o 5 ");
        }


//completar


    }
}
