package T3;

import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio6 {
    //Implementar una función sinRepetidos() con el prototipo:
    //
    //int[] sinRepetidos(int t[])
    //
    //que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado los datos repetidos.


    public static int[] sinRepetidos(int t[]) {

         int longitud = t.length;
         //int cont = 1;


        for (int i = 0; i < longitud; i++) {

            for (int j = i+1; j < longitud; j++) {

                if (t[i] == t[j]){
                    t[i] = t[longitud-1];
                    longitud--;

                }

            }

        }

        int resultado[] = Arrays.copyOf(t,longitud);
        return resultado;

    }


    public static void main(String[] args) {

        int[] datos;

        Scanner teclado = new Scanner(System.in);

        datos = new int [5];
        int longitud = datos.length;

        for (int i = 0; i < longitud; i++)
        {
            datos[i] = teclado.nextInt();
        }

        System.out.println(Arrays.toString(datos));
        System.out.println(Arrays.toString(sinRepetidos(datos)));

    }

}
