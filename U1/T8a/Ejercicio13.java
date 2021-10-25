package T8a;

import java.util.Scanner;

public class Ejercicio13 {
    //Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos.

    public static void main(String[] args) {

        int calificacion, cont;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca calificacion: ");
        calificacion = teclado.nextInt();
        cont = 0;

        for (int i = 1; i < 6; i++) {

            if (calificacion < 5){
                cont++;
            }

            System.out.print("Introduzca calificacion: ");
            calificacion = teclado.nextInt();

        }



        //Completar

       /* if (cont<=1){
            System.out.print("Hay algun suspenso");
        }else{
            System.out.print("No hay ningun suspenso");
        }*/

    }

}
