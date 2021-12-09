package Entregable_1920;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    //Implementa la función aleatorioDeArray con la cabecera que se muestra a
    //continuación:
    //public static int aleatorioDeArray(int[] a)
    //Esta función debe devolver un número del array escogido al azar entre todos
    //los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
    //podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorio-
    //DeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
    //prueba.


    public static int aleatorioDeArray(int[] a) {

        int resultado;

        int longitud = a.length;

        int numero = (int)(Math.random()*(longitud-1)+0);


            resultado = a[numero];


        return resultado;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int t[] = {17,2,5,10,20};

        System.out.println("Array Original:  "+ Arrays.toString(t));

        System.out.print("Numero aleatorio dentro del Array:  "+ aleatorioDeArray(t));


    }

}
