package T1;
import java.util.Scanner;

public class Ejercicio12 {
    //Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 0 es 1.


    public static int factorial(int num) {

        int resultado = 1;

        for (int i = 1; i <= num; i++) {

            resultado = resultado * i ;

        }

        return resultado;

    }


    //Calcular el factorial de n recursivamente:

    public static int Rfactorial(int num) {

        if (num == 1) {

            return 1;
        }

            return num * Rfactorial(num-1);

    }



    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        System.out.println("Factorial del numero " + num +" es: " + factorial(num));
        System.out.println("-------------------------------------------------------");

        System.out.println("Factorial del numero " + num +" es: " + Rfactorial(num));

    }

}
