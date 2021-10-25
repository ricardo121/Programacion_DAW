package T8a;

import java.util.Scanner;

public class Ejercicio12 {
    //Pedir 5 calificaciones de alumnos. El programa debe decir, al final, si hay algún suspenso o no lo hay. Nota: cuidado, si hay 2 suspensos,
    //no debe decirlo dos veces.

    public static void main(String[] args) {

        int calificacion, cont;
        Scanner teclado = new Scanner(System.in);
        cont = 0;

        for (int i = 0; i < 5; i++) {

            System.out.print("Introduzca calificacion: ");
            calificacion = teclado.nextInt();

            if (calificacion < 5){
                cont++;
            }

            //System.out.println("contador: "+cont);

        }

        if (cont > 0){
            System.out.print("Hay algun suspenso");
        }else{
            System.out.print("No hay ningun suspenso");
        }

    }

}
