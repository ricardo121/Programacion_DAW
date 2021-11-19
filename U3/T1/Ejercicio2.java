package T1;
import java.util.Scanner;

public class Ejercicio2 {
    //Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.

    public static void numeros(int num1, int num2) {

        for (int i = num1+1; i < num2; i++) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduzca otro numero: ");
        int num2 = teclado.nextInt();
        numeros(num1,num2);

    }
}
