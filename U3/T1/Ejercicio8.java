package T1;
import java.util.Scanner;

public class Ejercicio8 {
    //Escribir una función a la que se le pase un número entero y devuelva el número de divisores primos que tiene.

    public static boolean numero_primo(int num) {

        boolean primo= true;

        for (int i = 2; i < num ; i++) {

            if (num % i == 0){
                primo= false;
                break;
            }

        }

        return primo;
    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();
        int cont = 0;


        for (int i = 1; i < num ; i++) {

            if (num % i == 0){

                if (numero_primo(i) && i > 1){
                    cont++;

                }

            }

        }

        System.out.print("Los divisores primos del numero "+ num + " son: " + cont);

    }

}