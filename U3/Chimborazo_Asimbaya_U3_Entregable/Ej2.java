package Entregable_2122;

import java.util.Scanner;
import java.util.Arrays;

public class Ej2 {


    public static int[] insertarEnVector(int[] v1, int [] v2, int pos){

        int longitud1= v1.length;
        int longitud2= v2.length;

        int cont = 0;

        int[] resultado = new int[longitud1+longitud2];

        if (pos<0){

             resultado = Arrays.copyOf(v1, longitud1);
        }else if (pos>longitud1){
            resultado = Arrays.copyOf(v2, longitud2);
        }else {
            for (int i = 0; i < pos; i++) {
                resultado[i]= v1[i];
            }
            cont=pos;
            for (int i = 0; i <v2.length; i++) {
                resultado[cont]= v2[i];
                cont++;
            }

            for (int i = pos; i <v1.length; i++) {
                resultado[cont]= v1[i];
                cont++;
            }
        }


    return resultado;

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String adivinar = "normal";


        int [] v1 = {2,4,6,8,10};

        int [] v2 = {1,3,5,7,9};

        System.out.println("Introduzca Posicion: ");
        int posicion = teclado.nextInt();


        System.out.println(Arrays.toString(v1));

        System.out.println(Arrays.toString(v2));

        System.out.println(" ");

        System.out.println("El resultado de insertarEnVector será: ");

        System.out.println(Arrays.toString(insertarEnVector(v1,v2,posicion)));

    }


}
