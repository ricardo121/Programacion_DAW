package T1;
import java.util.Scanner;

public class Ejercicio10 {
    //Escribir una función que decida si dos números enteros positivos son amigos. Dos números son amigos si la suma de los divisores propios
    //(distinto de él mismo) del primer número es igual al segundo número, y viceversa. Ejemplos: (220 - 284), (1184 - 1210)


    public static int numerosAmigos(int num) {

        int suma = 0;

        for (int i = 1; i < num ; i++) {

            if (num % i == 0){

                //  System.out.println(" " + i);
                suma = suma + i;

            }

        }
        return suma;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduzca un numero: ");
        int num2 = teclado.nextInt();

        System.out.println("Divisores de: " + num1);
        System.out.println("Suma: " + numerosAmigos(num1));

        System.out.println("Divisores de: " + num2);
        System.out.println("Suma: " + numerosAmigos(num2));

    }

}