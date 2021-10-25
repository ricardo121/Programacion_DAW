package T5b;

import java.util.Scanner;

public class Ejercicio15 {
    //Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos está siendo infiel. El programa irá haciendo preguntas que el
    //usuario contestará con verdadero o falso. Cada pregunta contestada como verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman
    //puntos. A continuación se listan las preguntas del test.

    public static void main(String[] args) {

        boolean pregunta;
        int contador;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el numero de horas semanales : ");
        pregunta = teclado.nextBoolean();
        contador = 0;

        if (pregunta==true) {
            contador++;
        }

        pregunta = teclado.nextBoolean();

        if (pregunta==true) {
            contador++;
        }


        System.out.print("Calificacion: "+contador);

    }
}
