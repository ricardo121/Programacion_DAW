package Examen_U3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej3 {

    public static String[] invertir(String cadena){

        String [] resultado = new String[cadena.length()];

        int cont = 0;


        for (int i = cadena.length()-1; i >= 0; i--) {

            resultado[cont]=cadena.substring(i,i+1);
            cont++;
        }

        return resultado;

    }


    public static String[] desplazarVocales(String cadena){

        String [] resultado2 = new String[cadena.length()];

        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.substring(i,i+1).equalsIgnoreCase("a")){
                resultado2[cont]="e";
                cont++;
            }else if (cadena.substring(i,i+1).equalsIgnoreCase("e")){
                resultado2[cont]="i";
                cont++;
            }else if (cadena.substring(i,i+1).equalsIgnoreCase("i")){
                resultado2[cont]="o";
                cont++;
            }else if (cadena.substring(i,i+1).equalsIgnoreCase("o")){
                resultado2[cont]="u";
                cont++;
            }else if (cadena.substring(i,i+1).equalsIgnoreCase("u")){
                resultado2[cont]="a";
                cont++;
            }else {
                resultado2[cont]=cadena.substring(i,i+1);
                cont++;
            }

        }


        return resultado2;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        String frase = teclado.nextLine();


        System.out.println(Arrays.toString(invertir(frase)));

        System.out.println(Arrays.toString(desplazarVocales(frase)));


    }

}
