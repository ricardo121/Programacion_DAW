package Entregable_1920;

import java.util.Arrays;
import java.util.Scanner;
public class Ejercicio4 {

    //Define la función convierteArrayEnString con la siguiente cabecera:
    //public static String convierteArrayEnString(int[] a)
    //Esta función toma como parámetro un array que contiene números y devuelve
    //una cadena de caracteres con esos números. Por ejemplo, si a = { }, con-
    //vierteArrayEnString(a) devuelve “”; si a = { 8 }, convierteArrayEnString(a)
    //devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve
    //“62501”.


    public static String convierteArrayEnString(int[] a) {

        String resultado = "";

        int longitud = a.length;


        for (int i = 0; i < longitud; i++) {

            resultado = resultado + String.valueOf(a[i]);

        }


        return resultado;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int t[] = {4,6,7,30,50};

        System.out.println("Array Original:  "+ Arrays.toString(t));

        System.out.print("String que contiene los valores del Array  "+ convierteArrayEnString(t));


    }


}
