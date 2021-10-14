package T8a;

import java.util.Scanner;

public class Ejercicio2 {
    //Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los alumnos.
    //Se introducirán las edades de los alumnos hasta que una de ellas sea negativa. La aplicación mostrará la suma de las edades, la media, de
    //cuántos alumnos hemos introducido su edad, y cuántos alumnos son mayores de edad.

    public static void main(String[] args) {

        int edad ,suma ,media ,mayores ,cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un número : ");
        edad = teclado.nextInt();
        suma = 0;
        cont=0;
        mayores=0;

        while (edad!=0){

            cont++;
            suma+= edad;

            media= suma /cont;

            if (edad>=18){
                mayores++;
            }

            System.out.print("Introduzca un número : ");
            edad = teclado.nextInt();

        }

        System.out.print("La Suma de los Alumnos es: ");
        System.out.println(suma);
        System.out.print("La Media de los Alumnos es: ");
        System.out.println(suma/cont);
        System.out.print("El numero de los Alumnos es: ");
        System.out.println(cont);
        System.out.print("El numero de los Alumnos Mayores de Edad es: ");
        System.out.println(mayores);

        System.out.println("Terminado!");

    }
}
