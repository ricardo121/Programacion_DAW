package T5b;

import java.util.Scanner;

public class Ejercicio11 {
    //Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas que se imparten en el curso.
    // Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
    // Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
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
