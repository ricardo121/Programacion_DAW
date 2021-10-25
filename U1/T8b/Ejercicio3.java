package T8b;

import java.util.Scanner;

public class Ejercicio3 {
    //Escribe un programa que muestre los n primeros términos de la serie de Fibonacci. El primer término de la serie de Fibonacci es 0,
    //el segundo es 1 y el resto se calcula sumando los dos anteriores, por lo que tendríamos que
    //los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144... El número n se debe introducir por teclado.

    public static void main(String[] args) {

        int num,  num1 = 0, num2 = 1, suma = 1;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduzca un numero: ");
        num = teclado.nextInt();

        // Muestro el valor inicial
        System.out.println(num1);

        for (int i = 1; i < num; i++) {

            // muestro la suma
            System.out.println(suma);

            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;

        }

    }

}
