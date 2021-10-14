package T5b;

import java.util.Scanner;

public class Ejercicio12 {
    //Escribe un programa que ordene tres números enteros introducidos por teclado.
    public static void main(String[] args) {

        int num1, num2, num3, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca un número : ");
        num2 = teclado.nextInt();
        System.out.print("Introduzca un número : ");
        num3 = teclado.nextInt();


        System.out.println("Numeros ordenado de Menor a Mayor: ");

        if (num1<num2 && num1<num3 && num2<num3){
            System.out.println("- "+ num3);
            System.out.println("- "+ num2);
            System.out.println("- "+ num1);

        }else if (num1<num2 && num1<num3 && num2>num3){
            System.out.println("- "+ num2);
            System.out.println("- "+ num3);
            System.out.println("- "+ num1);
        }else if (num2<num3 && num2<num1 && num3>num1){
            System.out.println("- "+ num3);
            System.out.println("- "+ num1);
            System.out.println("- "+ num2);
        }else if (num2<num3 && num2<num1 && num3<num1){
            System.out.println("- "+ num1);
            System.out.println("- "+ num3);
            System.out.println("- "+ num2);
        }else if (num3<num2 && num3<num1 && num1>num2){
            System.out.println("- "+ num1);
            System.out.println("- "+ num2);
            System.out.println("- "+ num3);
        }else if (num3<num2 && num3<num1 && num1<num2){
            System.out.println("- "+ num2);
            System.out.println("- "+ num1);
            System.out.println("- "+ num3);
        }

    }
}
