package T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    //Escribe un programa que pida 8 palabras y las almacene en un array. Acontinuación, las palabras correspondientes a colores se deben almacenar
    //alcomienzo y las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares como quieras. Los colores que conoce el programa deben
    //estar en otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.


    public static void main(String[] args) {

        String[] datos;

        Scanner teclado = new Scanner(System.in);

        datos = new String[8];

        String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro","blanco","morado"};

        for (int i = 0; i < datos.length; i++) {

            datos[i] = teclado.next();
        }


        System.out.println(Arrays.toString(datos));

        int cont1 = 0;

        String[] resultadoColores = new String[8];
        String[] resultadoFinal = new String[8];


        for (int i = 0; i < datos.length; i++) {

            for (int j = 0; j < colores.length; j++) {

                if (datos[i].equalsIgnoreCase(colores[j])){
                    resultadoColores[cont1] = colores[j];

                    //System.out.println( "numero: "+ colores[j] );

                    cont1++;
                }

            }

        }


        int longitud = datos.length;

        for (int i = 0; i < longitud; i++) {


            for (int j = 0; j < colores.length; j++) {

                if (datos[i].equalsIgnoreCase(colores[j] ) && i>0){

                    datos[i] = datos[longitud-1];
                    longitud--;
                    i--;

                } else if (datos[i].equalsIgnoreCase(colores[j]) && i == 0){
                    datos[i] = datos[longitud-1];
                    longitud--;
                    i=0;
                }

            }

        }


        String resultadoResto[] = Arrays.copyOf(datos,longitud);


        for (int i = 0; i < cont1; i++) {
            resultadoFinal[i] = resultadoColores[i];

        }

        int contadorFinal = 0;

        for (int i = cont1; i < resultadoFinal.length; i++) {

                resultadoFinal[i] = resultadoResto[contadorFinal];
                contadorFinal++;

        }

        System.out.println(Arrays.toString(datos));
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");
        System.out.println(Arrays.toString(resultadoResto));
        System.out.println("-----------------------------------");
        System.out.println(Arrays.toString(resultadoColores));
        System.out.println("-----------------------------------");
        System.out.println("-----------------------------------");

        System.out.println(Arrays.toString(resultadoFinal));


    }

}