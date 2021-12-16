package Examen_U3;

import java.util.Scanner;

public class Ej4 {

    public static String convierteEnPalabras(int n) {

        String palabra = " ";

        int numero, posicion, resultado;
        int falta, numeroInvertido, resto;
        int cont;

        while (n <= 0) ;
        falta = n;
        numeroInvertido = 0;
        resto = 0;
        cont = 0;


        while (falta != 0) {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }


        falta = numeroInvertido;

        resto = 0;

        while (falta != 0) {


            resto = falta % 10;

            if (resto == 1) {
                palabra = palabra + "uno, ";
            } else if (resto == 2) {
                palabra = palabra + "dos, ";
            } else if (resto == 3) {
                palabra = palabra + "tres, ";
            } else if (resto == 4) {
                palabra = palabra + "cuatro, ";
            } else if (resto == 5) {
                palabra = palabra + "cinco, ";
            } else if (resto == 6) {
                palabra = palabra + "seis, ";
            } else if (resto == 7) {
                palabra = palabra + "siete, ";
            } else if (resto == 8) {
                palabra = palabra + "ocho, ";
            } else if (resto == 9) {
                palabra = palabra + "nueve, ";
            } else if (resto == 0) {
                palabra = palabra + "cero, ";
            }

            //resultado = resultado * 10 + resto;
            falta = falta / 10;

        }

        int longitud = palabra.length();

        String palabra_final = palabra.substring(0,longitud-2);

        return palabra_final;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        System.out.print("Resultado en String: " + convierteEnPalabras(num));

    }

}
