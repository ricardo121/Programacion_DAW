package T5b;

import java.util.Scanner;

public class Ejercicio6 {
    //Realiza un programa que calcule la media de tres notas que se solicitarán al usuario.
    public static void main(String[] args) {

        int x, y, z, resultado;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        x = teclado.nextInt();
        System.out.print("Introduzca un número : ");
        y = teclado.nextInt();
        System.out.print("Introduzca un número : ");
        z = teclado.nextInt();

        resultado= (x+y+z)/3;
        System.out.println("Media de los tres numeros solicitados: "+ resultado);

        }

}
