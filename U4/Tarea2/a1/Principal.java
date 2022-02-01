package Tarea2.a1;

import Tarea1.a10.Hora;

import java.util.Arrays;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Lista l1 = new Lista();

        Lista l2 = new Lista();


        l1.insertarP(10);
        l1.insertarP(20);
        l1.insertarP(30);

        //l1.insertarEspecifico(6,8);

        l2.insertarP(10);
        l2.insertarP(22);
        l2.insertarP(33);


        /*l1.insertarP(40);
        l1.insertarP(50);
        l1.insertarP(60);
        l1.insertarP(70);
        l1.insertarP(80);
        l1.insertarP(90);
        l1.insertarP(91);
        l1.insertarP(92);
*/


        //l1.insertarP(20);

        /*
        l1.insertarF(10);
        l1.insertarF(31);
        l1.insertarF(32);
        l1.insertarF(24);
        l1.insertarF(26);
        l1.insertarF(29);
        l1.insertarF(22);
        l1.insertarF(40);
        l1.insertarF(41);

        l1.insertarF(60);
        l1.insertarF(70);

        l1.insertarF(80);
        l1.insertarF(90);

*/



        l1.verLista();

        l2.verLista();



        l1.unirListas(l2);


        System.out.println("Numero de elementos en la Lista: " + l1.numLista());

        l1.verLista();

        l1.eliminarEspecifico(4);


        l1.verLista();



        System.out.println("Numero en la posicion indicada: " + l1.obtenerEspecifico(0));

        System.out.println("Numero en la posicion indicada: " + l1.buscarNumero(10));

    }

}
