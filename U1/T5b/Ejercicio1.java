package T5b;

import java.util.Scanner;

public class Ejercicio1 {
    //Escribe un programa que pida por teclado un día de la semana y que diga qué asignatura toca a primera hora ese día.

    public static void main(String[] args) {

        int x;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        x = teclado.nextInt();


        if (x >0) {
            System.out.println(x + " Es Mayor");
        } else {
            System.out.println(" ");
        }

    }

}
