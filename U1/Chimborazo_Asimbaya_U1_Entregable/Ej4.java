package Entregable_U1;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String args[]) {

        int numero,posicion,resultado1,resultado2;
        int falta,numeroInvertido,resto;
        int cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número de 6 cifras: ");
        numero = teclado.nextInt();

        System.out.print("Introduzca la posición a partir de la cual quiere partir el número: ");
        posicion = teclado.nextInt();


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
            if (3<cont) {

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
