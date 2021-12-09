package Entregable_2122;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

    public static String palabraAhorcado(String cadena_a_adivinar, String resultado_parcial, char letra){

        String resultado = resultado_parcial;

        int longitud = cadena_a_adivinar.length();

        for (int i = 0; i < longitud ; i++) {

            //resultado.charAt(i) = letra;

            if (cadena_a_adivinar.charAt(i)==letra){
                //resultado_parcial.charAt(i)=letra;
            }



        }

        return resultado_parcial;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String adivinar = "normal";

        String resultado = "";


        for (int i = 0; i < adivinar.length(); i++) {
            resultado = resultado + "-";
        }


        System.out.println("resultado Parcial:  "+ resultado);

        System.out.println("Dame una Caracter: ");
        String letra1 = teclado.next();


       // Character letra = teclado.next();

        while (!adivinar.equalsIgnoreCase(resultado)){

                resultado = palabraAhorcado(adivinar,resultado,letra1.charAt(0));


        }

    }
}
