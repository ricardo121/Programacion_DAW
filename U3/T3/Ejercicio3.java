package T3;

import java.util.Scanner;

public class Ejercicio3 {
    //Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números. Realizar la media de los números positivos,
    //la media de los negativos, y contar el número de ceros introducidos.

    public static void main(String[] args) {

        int[] datos;

        Scanner teclado = new Scanner(System.in);

        System.out.print( "Cuantos numeros desea introducir: " );
        int num = teclado.nextInt();


        datos = new int [num];


        for (int i = 0; i < num; i++){

            System.out.print( "Deme el dato "+i+": " );
            datos[i] = teclado.nextInt();
            System.out.println( "" );

        }

        int suma1 = 0 ;
        int suma2 = 0 ;

        int media1 = 0 ;
        int media2 = 0 ;

        int cont = 0;
        int cont1 = 0;
        int cont2 = 0;

        for (int i = 0; i < num; i++){

            if (datos[i] > 0){
                suma1 += datos[i];
                cont1++;

            }else if(datos[i] < 0) {
                suma2 += datos[i];
                cont2++;
            }else{
                cont++;
            }

            //System.out.println( "Deme el dato "+i+": " + datos[i]);

        }

        media1 = suma1 / cont1 ;
        media2 = suma2 / (-1 * cont2) ;

        System.out.println( "Media de los numero positivos: " + media1  );
        System.out.println( "Media de los numero negativos: " + media2 );
        System.out.print( "Numero de Ceros introducidos: " + cont );

    }

}
