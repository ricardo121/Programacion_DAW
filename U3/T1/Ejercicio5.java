package T1;
import java.util.Scanner;

public class Ejercicio5 {
    //Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números. Piensa un poco, no hagas
    //el algoritmo de comparación de los 3 números desde cero.

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

        System.out.print("Introduzca otro numero: ");
        int num3 = teclado.nextInt();

        if (num3 > numeros(num1,num2) ){
            System.out.print("El mayor de los tres es el: "+ num3 );
        }else{
            System.out.print("El mayor de los tres es el: "+ numeros(num1,num2));
        }


    }
}
