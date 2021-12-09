package T1;
import java.util.Scanner;

public class Ejercicio4 {
    //Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.

    public static int numeros(int num1, int num2) {

        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Introduzca otro numero: ");
        int num2 = teclado.nextInt();

        System.out.print("El mayor de los dos es el: "+ numeros(num1,num2));


    }
}
