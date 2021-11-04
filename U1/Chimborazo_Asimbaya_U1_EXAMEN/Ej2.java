package Examen_U1;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String args[]) {

        long numero,posicion,resultado1,resultado2;
        long falta,numeroInvertido,resto;
        int cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número entero positivo: ");
        numero = teclado.nextLong();


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
        int digitos_si=0;
        int digitos_no=0;

        while(falta!=0 && cont<=10)
        {

            resto = falta % 10;

            for (int i = 0; i < cont; i++) {


            if (cont==resto){
                resultado1 = resultado1 * 10 + resto;
                falta = falta / 10;
                cont++;
            }else{
                resultado2 = resultado2 * 10 + resto;
                falta = falta / 10;
                cont++;
            }
            System.out.println(" "+ cont);
            }
        }



        System.out.println("Los números partidos son el "+resultado1  +" y el "+resultado2);

    }

}
