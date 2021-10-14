package T8a;

import java.util.Scanner;

public class Ejercicio4 {
    //Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.

    public static void main(String[] args) {

        int num ;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un número : ");
        num = teclado.nextInt();


        for (int i = 1; i < num+1; i++) {
            System.out.println(i);
        }


    }

}
