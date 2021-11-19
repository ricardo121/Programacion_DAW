package T1;
import java.util.Scanner;

public class Ejercicio7 {
    //Diseñar una función que nos diga si un número es primo.

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

        if (numero_primo(num)){
            System.out.print("El numero es primo" );
        }else{
            System.out.print("El numero no es primo" );
        }

    }
}
