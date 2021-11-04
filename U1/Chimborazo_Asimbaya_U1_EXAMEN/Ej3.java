package Examen_U1;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String args[]) {

        int numero ,resultado ;
        int falta ,falta1 ,numeroInvertido ,resto ;
        int cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");

        numero = teclado.nextInt();


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


        resultado=0;
        falta=numeroInvertido;

        resto=0;
        cont=0;

        int aleatorios = 0;

        int total = 0;

        while(falta!=0)
        {
                cont++;
                int suma = 0;
                resto = falta % 10;

                aleatorios = (int) (Math.random()*10000+1000);
                System.out.println("La clave criptográfica generada para " + resto + " es: " + aleatorios );
                falta1 = aleatorios;

                while(falta1!=0)
                {
                resto = falta1 % 10;
                suma = suma + resto;
                falta1 = falta1 / 10;
                }

                System.out.println("La suma de las cifras totales para "+ cont + " es: " + suma );
                resultado = resultado * 10 + resto;
                falta = falta / 10;

                total = total + suma ;


        }
        System.out.println("El número resultante es: "+ total);

    }
}
