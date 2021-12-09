package T4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {
    //Un restaurante nos ha encargado una aplicación para colocar a los clientes en sus mesas. En una mesa se pueden sentar de 0
    // (mesa vacía) a 4 comensales(mesa llena).
    //
    //Cuando llega un cliente se le pregunta cuántos son. De momento el programa no está preparado para colocar a grupos mayores a 4, por tanto,
    //si un cliente dice por ejemplo que son un grupo de 6, el programa dará el mensaje“Lo siento, no admitimos grupos de 6, haga grupos de 4 personas
    //como máximo e intente de nuevo”. Para el grupo que llega, se busca siempre la primera mesa libre (con 0 personas).
    //
    //Si no quedan mesas libres, se busca donde haya un hueco para todo el grupo, por ejemplo si el grupo es dedos personas, se podrá colocar donde haya
    //una o dos personas. Inicialmente,las mesas se cargan con valores aleatorios entre 0 y 4.
    //
    //Cada vez que se sientan nuevos clientes se debe mostrar el estado de las mesas. Los grupos no se pueden romper aunque haya huecos sueltos
    //suficientes. El funcionamiento del programa se ilustra a continuación:


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        int num = teclado.nextInt();

        while (num > 4 ) {

            System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
            System.out.println("Introduzca un numero: ");
            num = teclado.nextInt();

        }

        int[] mesas = new int[10];

        int[] ocupaciones = new int[10];

        for (int i = 0; i < mesas.length; i++) {

            mesas[i] = i;
        }


        for (int i = 0; i < mesas.length; i++) {

                ocupaciones[i] = (int)(Math.random()*4+1);

        }

        System.out.println(Arrays.toString(mesas));
        System.out.println(Arrays.toString(ocupaciones));



        for (int i = 0; i < mesas.length; i++) {
            if(mesas[i] == 0){

                ocupaciones[i] = num;
            }

            //ocupaciones[i] = 0;
        }



        System.out.println(Arrays.toString(mesas));
        System.out.println(Arrays.toString(ocupaciones));

        if (num == -1) {

            System.out.println("Gracias. Hasta Pronto");

        }


    }

}
