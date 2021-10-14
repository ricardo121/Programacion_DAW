package T5b;

import java.util.Scanner;

public class Ejercicio18 {
    //Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos primeros
    //controles. Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media.
    //En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto,
    //por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto,
    //la nota será un 5; en caso contrario, se  mantiene la nota media anterior.


    public static void main(String[] args) {

        int nota1, nota2, media, resultado;
        String recuperacion;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca nota del primer control: ");
        nota1 = teclado.nextInt();
        System.out.print("Introduzca nota del segundo control: ");
        nota2 = teclado.nextInt();

        media = (nota1 + nota2) / 2;
        resultado = media;


        if (media>4){
            System.out.println("Media: " + resultado + "  Alumno Aprobado");
        }else{
            //System.out.println("Media: " + resultado + "  Alumno Suspendido");
            System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto): ");
            recuperacion = teclado.next();

            if (recuperacion.equalsIgnoreCase("apto")){
                resultado =  5;
                System.out.println("Media: " + resultado + "  Alumno Apronado en la recuperacion");
            }else if (recuperacion.equalsIgnoreCase("no"+" "+"apto")){
                System.out.println("Media: " + resultado + "  Alumno Suspendido en la recuperacion");
            }

        }

// Completar
    }
}
