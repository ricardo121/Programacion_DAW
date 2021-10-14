package T7;

import java.util.Scanner;

public class Ejercicio2 {

    /* Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable booleana "jasp" el valor:

    verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan los 28000 (euros).
    falso. En caso contrario.

    Escribe el código necesario para inicializar "jasp" en una línea.*/


    public static void main( String args[] ) {

        Scanner teclado = new Scanner(System.in);
        System.out.print( "Introduzca edad : " );
        int edad = teclado.nextInt();
        System.out.print( "Introduzca nivel de estudios : " );
        int nivel_de_estudios = teclado.nextInt();
        System.out.print( "Introduzca ingresos : " );
        int ingresos = teclado.nextInt();

        boolean jasp;

        // Ejercicio con operador condicional

        jasp = edad <= 28 && nivel_de_estudios > 3 && ingresos > 28000 ? true : false;

        System.out.print( "Variable jasp: " );
        System.out.println( jasp );
    }

}
