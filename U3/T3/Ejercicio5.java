package T3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {
    // Leer una serie de 6 enteros que se almacenarán en una tabla que hay que ordenar y mostrar. Hacer lo mismo con otra serie de 6 enteros.
    // A continuación, fusionar las dos tablas en una tercera, de forma que los 12 números sigan ordenados. Fusionar significa copiar en el orden
    // correcto para que los datos resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.


    public static void main(String[] args) {

        int[] datos1;
        int[] datos2;

        Scanner teclado = new Scanner(System.in);


        datos1 = new int[6];
        datos2 = new int[6];

        int[] datos3 = new int[datos1.length+ datos2.length];

        int cont = 0;

        for (int i = 0; i < datos1.length; i++) {

            datos1[i] = (int) (Math.random() * 10 + 1);

        }


        for (int i = 0; i < datos2.length; i++) {

            datos2[i] = (int) (Math.random() * 10 + 1);

        }


        Arrays.sort(datos1);
        Arrays.sort(datos2);

        System.out.println(Arrays.toString(datos1));
        System.out.println(Arrays.toString(datos2));


        int contador1 = 0;
        int contador2 = 0;

            for (int i = 0; i < datos3.length; i++){


                if (datos1[cont] > datos2[cont]) {

                    datos3[i] = datos2[cont];

                    if (datos2[i]==datos2[i]){

                    }


                } else {

                    datos3[i] = datos1[cont];

                }

                cont++;
            }


        System.out.println(Arrays.toString(datos3));

    }
}
