package Entregable_U1;

import java.util.Scanner;

public class Ejercicio2 {


    public static void main(String args[]) {

        long numero,posicion,resultado1,resultado2;
        long falta,numeroInvertido,resto;
        int cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        numero = teclado.nextLong();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        posicion = teclado.nextLong();


        while(numero<=0);
        falta=numero;
        numeroInvertido=0;
        resto=0;
        cont=0;


        while(falta!=0)
        {
            resto = falta % 10;
            numeroInvertido = numeroInvertido * 10 + resto;
            falta = falta / 10;
        }


        resultado1=0;
        resultado2=0;
        falta=numeroInvertido;

        resto=0;
        cont=0;

        while(falta!=0)
        {
            cont++;
            if (posicion<cont) {

                resto = falta % 10;
                resultado1 = resultado1 * 10 + resto;
                falta = falta / 10;

            }else{
                resto = falta % 10;
                resultado2 = resultado2 * 10 + resto;
                falta = falta / 10;
            }
        }

        System.out.println("Los números partidos son el "+resultado2  +" y el "+resultado1);


    }
}
