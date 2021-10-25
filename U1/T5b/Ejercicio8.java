package T5b;

import java.util.Scanner;

public class Ejercicio8 {
    //Realiza un programa que resuelva una ecuación de segundo grado (del tipo ax2 + bx + c = 0).

    public static void main(String[] args) {

        int a, b, c, x;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0 : ");
        System.out.println("Por favor, introduzca el valor de a: ");
        a= teclado.nextInt();
        System.out.println("Por favor, introduzca el valor de a: ");
        b= teclado.nextInt();
        System.out.println("Por favor, introduzca el valor de a: ");
        c= teclado.nextInt();
        x=-(b/a);


        if (a==0) {
            System.out.print("Esa ecuación no tiene solución real");
        }
        else {
            System.out.print("x: " +x);
        }

    }
}
